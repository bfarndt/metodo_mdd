<?php

include_once "ProvaAbsurdo.class.php";
include_once "Prova.class.php";

class ProvaAbsurdoDB
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

	public function add($ProvaAbsurdo)
	{
		$query = pg_query("INSERT INTO provaabsurdo(
				id_prova,
				imagem,
				pontuacao_maxima,created_at,
				update_at
			) VALUES(
				" . $ProvaAbsurdo->getId_prova()->getId() . ",
				
				'" . $ProvaAbsurdo->getImagem() . "',
				'" . $ProvaAbsurdo->getPontuacao_maxima() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaAbsurdo)
	{
		$query = pg_query("UPDATE provaabsurdo SET
				id_prova = " . $ProvaAbsurdo->getId_prova()->getId() . ",
				
				imagem = '" . $ProvaAbsurdo->getImagem() . "',
				pontuacao_maxima = '" . $ProvaAbsurdo->getPontuacao_maxima() . "',update_at = now()
			WHERE id = " . $ProvaAbsurdo->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaAbsurdo)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provaabsurdo WHERE id = " . $ProvaAbsurdo->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provaabsurdo.id AS provaabsurdo_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provaabsurdo.imagem AS provaabsurdo_imagem,provaabsurdo.pontuacao_maxima AS provaabsurdo_pontuacao_maxima,
				provaabsurdo.created_at,
				provaabsurdo.update_at
			FROM provaabsurdo
			INNER JOIN prova ON prova.id = provaabsurdo.id_prova
			ORDER BY provaabsurdo.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaAbsurdo = new ProvaAbsurdo();

				$ProvaAbsurdo->setId($row["provaabsurdo_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaAbsurdo->setId_prova($Prova);
			
				$ProvaAbsurdo->setImagem($row["provaabsurdo_imagem"]);
			
				$ProvaAbsurdo->setPontuacao_maxima($row["provaabsurdo_pontuacao_maxima"]);
			
				$result[] = $ProvaAbsurdo;
			}
		}

		return $result;
	}

	public function get($ProvaAbsurdo)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaAbsurdo->getId_prova()) && count($ProvaAbsurdo->getId_prova()) > 0)
			|| (is_object($ProvaAbsurdo->getId_prova()) && $ProvaAbsurdo->getId_prova()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaAbsurdo->getId_prova())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaAbsurdo->getId_prova() as $id_prova) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provaabsurdo.id_prova = " . $id_prova->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provaabsurdo.id_prova = " . $ProvaAbsurdo->getId_prova()->getId();
				}
			
		}
	
		if (strlen($ProvaAbsurdo->getImagem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provaabsurdo.imagem = '" . $ProvaAbsurdo->getImagem() . "'";
			
		}
	
		if (strlen($ProvaAbsurdo->getPontuacao_maxima()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provaabsurdo.pontuacao_maxima = '" . $ProvaAbsurdo->getPontuacao_maxima() . "'";
			
		}
	
		$query = pg_query("SELECT
				provaabsurdo.id AS provaabsurdo_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provaabsurdo.imagem AS provaabsurdo_imagem,provaabsurdo.pontuacao_maxima AS provaabsurdo_pontuacao_maxima,
				provaabsurdo.created_at,
				provaabsurdo.update_at
			FROM provaabsurdo
			INNER JOIN prova ON prova.id = provaabsurdo.id_prova
		" . $where . "ORDER BY provaabsurdo.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaAbsurdo = new ProvaAbsurdo();

				$ProvaAbsurdo->setId($row["provaabsurdo_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaAbsurdo->setId_prova($Prova);
			
				$ProvaAbsurdo->setImagem($row["provaabsurdo_imagem"]);
			
				$ProvaAbsurdo->setPontuacao_maxima($row["provaabsurdo_pontuacao_maxima"]);
			
				$result[] = $ProvaAbsurdo;
			}
		}

		return $result;
	}
}

?>