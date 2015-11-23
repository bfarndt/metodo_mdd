<?php

include_once "TriagemAbsurdo.class.php";
include_once "Triagem.class.php";include_once "ProvaAbsurdo.class.php";

class TriagemAbsurdoDB
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

	public function add($TriagemAbsurdo)
	{
		$query = pg_query("INSERT INTO triagemabsurdo(
				id_triagem,
				id_prova_absurdo,
				identificou,
				pontuacao,created_at,
				update_at
			) VALUES(
				" . $TriagemAbsurdo->getId_triagem()->getId() . ",
				
				" . $TriagemAbsurdo->getId_prova_absurdo()->getId() . ",
				
				'" . $TriagemAbsurdo->getIdentificou() . "',
				'" . $TriagemAbsurdo->getPontuacao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemAbsurdo)
	{
		$query = pg_query("UPDATE triagemabsurdo SET
				id_triagem = " . $TriagemAbsurdo->getId_triagem()->getId() . ",
				
				id_prova_absurdo = " . $TriagemAbsurdo->getId_prova_absurdo()->getId() . ",
				
				identificou = '" . $TriagemAbsurdo->getIdentificou() . "',
				pontuacao = '" . $TriagemAbsurdo->getPontuacao() . "',update_at = now()
			WHERE id = " . $TriagemAbsurdo->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemAbsurdo)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemabsurdo WHERE id = " . $TriagemAbsurdo->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemabsurdo.id AS triagemabsurdo_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provaabsurdo.id AS provaabsurdo_id, provaabsurdo.id_prova AS provaabsurdo_id_prova,provaabsurdo.imagem AS provaabsurdo_imagem,provaabsurdo.pontuacao_maxima AS provaabsurdo_pontuacao_maxima,
				triagemabsurdo.identificou AS triagemabsurdo_identificou,triagemabsurdo.pontuacao AS triagemabsurdo_pontuacao,
				triagemabsurdo.created_at,
				triagemabsurdo.update_at
			FROM triagemabsurdo
			INNER JOIN triagem ON triagem.id = triagemabsurdo.id_triagemINNER JOIN provaabsurdo ON provaabsurdo.id = triagemabsurdo.id_prova_absurdo
			ORDER BY triagemabsurdo.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemAbsurdo = new TriagemAbsurdo();

				$TriagemAbsurdo->setId($row["triagemabsurdo_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemAbsurdo->setId_triagem($Triagem);
			
				$ProvaAbsurdo = new ProvaAbsurdo();
				$ProvaAbsurdo->setId($row["provaabsurdo_id"]);
				$ProvaAbsurdo->setId_prova($row["provaabsurdo_id_prova"]);
				$ProvaAbsurdo->setImagem($row["provaabsurdo_imagem"]);
				$ProvaAbsurdo->setPontuacao_maxima($row["provaabsurdo_pontuacao_maxima"]);
				
				$TriagemAbsurdo->setId_prova_absurdo($ProvaAbsurdo);
			
				$TriagemAbsurdo->setIdentificou($row["triagemabsurdo_identificou"]);
			
				$TriagemAbsurdo->setPontuacao($row["triagemabsurdo_pontuacao"]);
			
				$result[] = $TriagemAbsurdo;
			}
		}

		return $result;
	}

	public function get($TriagemAbsurdo)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemAbsurdo->getId_triagem()) && count($TriagemAbsurdo->getId_triagem()) > 0)
			|| (is_object($TriagemAbsurdo->getId_triagem()) && $TriagemAbsurdo->getId_triagem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemAbsurdo->getId_triagem())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemAbsurdo->getId_triagem() as $id_triagem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemabsurdo.id_triagem = " . $id_triagem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemabsurdo.id_triagem = " . $TriagemAbsurdo->getId_triagem()->getId();
				}
			
		}
	
		if (
			(is_array($TriagemAbsurdo->getId_prova_absurdo()) && count($TriagemAbsurdo->getId_prova_absurdo()) > 0)
			|| (is_object($TriagemAbsurdo->getId_prova_absurdo()) && $TriagemAbsurdo->getId_prova_absurdo()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemAbsurdo->getId_prova_absurdo())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemAbsurdo->getId_prova_absurdo() as $id_prova_absurdo) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemabsurdo.id_prova_absurdo = " . $id_prova_absurdo->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemabsurdo.id_prova_absurdo = " . $TriagemAbsurdo->getId_prova_absurdo()->getId();
				}
			
		}
	
		if (strlen($TriagemAbsurdo->getIdentificou()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemabsurdo.identificou = '" . $TriagemAbsurdo->getIdentificou() . "'";
			
		}
	
		if (strlen($TriagemAbsurdo->getPontuacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemabsurdo.pontuacao = '" . $TriagemAbsurdo->getPontuacao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemabsurdo.id AS triagemabsurdo_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provaabsurdo.id AS provaabsurdo_id, provaabsurdo.id_prova AS provaabsurdo_id_prova,provaabsurdo.imagem AS provaabsurdo_imagem,provaabsurdo.pontuacao_maxima AS provaabsurdo_pontuacao_maxima,
				triagemabsurdo.identificou AS triagemabsurdo_identificou,triagemabsurdo.pontuacao AS triagemabsurdo_pontuacao,
				triagemabsurdo.created_at,
				triagemabsurdo.update_at
			FROM triagemabsurdo
			INNER JOIN triagem ON triagem.id = triagemabsurdo.id_triagemINNER JOIN provaabsurdo ON provaabsurdo.id = triagemabsurdo.id_prova_absurdo
		" . $where . "ORDER BY triagemabsurdo.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemAbsurdo = new TriagemAbsurdo();

				$TriagemAbsurdo->setId($row["triagemabsurdo_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemAbsurdo->setId_triagem($Triagem);
			
				$ProvaAbsurdo = new ProvaAbsurdo();
				$ProvaAbsurdo->setId($row["provaabsurdo_id"]);
				$ProvaAbsurdo->setId_prova($row["provaabsurdo_id_prova"]);
				$ProvaAbsurdo->setImagem($row["provaabsurdo_imagem"]);
				$ProvaAbsurdo->setPontuacao_maxima($row["provaabsurdo_pontuacao_maxima"]);
				
				$TriagemAbsurdo->setId_prova_absurdo($ProvaAbsurdo);
			
				$TriagemAbsurdo->setIdentificou($row["triagemabsurdo_identificou"]);
			
				$TriagemAbsurdo->setPontuacao($row["triagemabsurdo_pontuacao"]);
			
				$result[] = $TriagemAbsurdo;
			}
		}

		return $result;
	}
}

?>