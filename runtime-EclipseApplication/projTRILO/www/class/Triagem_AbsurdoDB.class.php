<?php

include_once "Triagem_Absurdo.class.php";
include_once "Triagem.class.php";include_once "ProvaAbsurdo.class.php";

class Triagem_AbsurdoDB
{
	private $dbconn;
	private $host = "localhost";
	private $port = "5432";
	private $dbname = "projTRILO";
	private $user = "postgres";
	private $password = "teste";

	public function __construct()
	{
		$this->dbconn = pg_connect("host= " . $this->host . " port=" . $this->port . " dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}

	public function add($Triagem_Absurdo)
	{
		$query = pg_query("INSERT INTO triagem_absurdo(
				id_triagem,
				id_prova_absurdo,
				identificou,created_at,
				update_at
			) VALUES(
				" . $Triagem_Absurdo->getId_triagem()->getId() . ",
				
				" . $Triagem_Absurdo->getId_prova_absurdo()->getId() . ",
				
				'" . $Triagem_Absurdo->getIdentificou() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Triagem_Absurdo)
	{
		$query = pg_query("UPDATE triagem_absurdo SET
				id_triagem = " . $Triagem_Absurdo->getId_triagem()->getId() . ",
				
				id_prova_absurdo = " . $Triagem_Absurdo->getId_prova_absurdo()->getId() . ",
				
				identificou = '" . $Triagem_Absurdo->getIdentificou() . "',update_at = now()
			WHERE id = " . $Triagem_Absurdo->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Triagem_Absurdo)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagem_absurdo WHERE id = " . $Triagem_Absurdo->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagem_absurdo.id AS triagem_absurdo_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,
				
					provaabsurdo.id AS provaabsurdo_id, provaabsurdo.id_prova AS provaabsurdo_id_prova,provaabsurdo.imagem AS provaabsurdo_imagem,
				triagem_absurdo.identificou AS triagem_absurdo_identificou,
				triagem_absurdo.created_at,
				triagem_absurdo.update_at
			FROM triagem_absurdo
			INNER JOIN triagem ON triagem.id = triagem_absurdo.id_triagemINNER JOIN provaabsurdo ON provaabsurdo.id = triagem_absurdo.id_prova_absurdo
			ORDER BY triagem_absurdo.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Triagem_Absurdo = new Triagem_Absurdo();

				$Triagem_Absurdo->setId($row["triagem_absurdo_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				
				$Triagem_Absurdo->setId_triagem($Triagem);
			
				$ProvaAbsurdo = new ProvaAbsurdo();
				$ProvaAbsurdo->setId($row["provaabsurdo_id"]);
				$ProvaAbsurdo->setId_prova($row["provaabsurdo_id_prova"]);
				$ProvaAbsurdo->setImagem($row["provaabsurdo_imagem"]);
				
				$Triagem_Absurdo->setId_prova_absurdo($ProvaAbsurdo);
			
				$Triagem_Absurdo->setIdentificou($row["triagem_absurdo_identificou"]);
			
				$result[] = $Triagem_Absurdo;
			}
		}

		return $result;
	}

	public function get($Triagem_Absurdo)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($Triagem_Absurdo->getId_triagem()) && count($Triagem_Absurdo->getId_triagem()) > 0)
			|| (is_object($Triagem_Absurdo->getId_triagem()) && $Triagem_Absurdo->getId_triagem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($Triagem_Absurdo->getId_triagem())) {
					$first = true;
					$where .= "(";
					foreach ($Triagem_Absurdo->getId_triagem() as $id_triagem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagem_absurdo.id_triagem = " . $id_triagem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagem_absurdo.id_triagem = " . $Triagem_Absurdo->getId_triagem()->getId();
				}
			
		}
	
		if (
			(is_array($Triagem_Absurdo->getId_prova_absurdo()) && count($Triagem_Absurdo->getId_prova_absurdo()) > 0)
			|| (is_object($Triagem_Absurdo->getId_prova_absurdo()) && $Triagem_Absurdo->getId_prova_absurdo()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($Triagem_Absurdo->getId_prova_absurdo())) {
					$first = true;
					$where .= "(";
					foreach ($Triagem_Absurdo->getId_prova_absurdo() as $id_prova_absurdo) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagem_absurdo.id_prova_absurdo = " . $id_prova_absurdo->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagem_absurdo.id_prova_absurdo = " . $Triagem_Absurdo->getId_prova_absurdo()->getId();
				}
			
		}
	
		if (strlen($Triagem_Absurdo->getIdentificou()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagem_absurdo.identificou = '" . $Triagem_Absurdo->getIdentificou() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagem_absurdo.id AS triagem_absurdo_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,
				
					provaabsurdo.id AS provaabsurdo_id, provaabsurdo.id_prova AS provaabsurdo_id_prova,provaabsurdo.imagem AS provaabsurdo_imagem,
				triagem_absurdo.identificou AS triagem_absurdo_identificou,
				triagem_absurdo.created_at,
				triagem_absurdo.update_at
			FROM triagem_absurdo
			INNER JOIN triagem ON triagem.id = triagem_absurdo.id_triagemINNER JOIN provaabsurdo ON provaabsurdo.id = triagem_absurdo.id_prova_absurdo
		" . $where . "ORDER BY triagem_absurdo.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Triagem_Absurdo = new Triagem_Absurdo();

				$Triagem_Absurdo->setId($row["triagem_absurdo_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				
				$Triagem_Absurdo->setId_triagem($Triagem);
			
				$ProvaAbsurdo = new ProvaAbsurdo();
				$ProvaAbsurdo->setId($row["provaabsurdo_id"]);
				$ProvaAbsurdo->setId_prova($row["provaabsurdo_id_prova"]);
				$ProvaAbsurdo->setImagem($row["provaabsurdo_imagem"]);
				
				$Triagem_Absurdo->setId_prova_absurdo($ProvaAbsurdo);
			
				$Triagem_Absurdo->setIdentificou($row["triagem_absurdo_identificou"]);
			
				$result[] = $Triagem_Absurdo;
			}
		}

		return $result;
	}
}

?>