<?php

include_once "ProvaOrdem.class.php";
include_once "Prova.class.php";

class ProvaOrdemDB
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

	public function add($ProvaOrdem)
	{
		$query = pg_query("INSERT INTO provaordem(
				id_prova,
				ordem,
				pontuacao_maxima,created_at,
				update_at
			) VALUES(
				" . $ProvaOrdem->getId_prova()->getId() . ",
				
				'" . $ProvaOrdem->getOrdem() . "',
				'" . $ProvaOrdem->getPontuacao_maxima() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaOrdem)
	{
		$query = pg_query("UPDATE provaordem SET
				id_prova = " . $ProvaOrdem->getId_prova()->getId() . ",
				
				ordem = '" . $ProvaOrdem->getOrdem() . "',
				pontuacao_maxima = '" . $ProvaOrdem->getPontuacao_maxima() . "',update_at = now()
			WHERE id = " . $ProvaOrdem->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaOrdem)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provaordem WHERE id = " . $ProvaOrdem->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provaordem.id AS provaordem_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provaordem.ordem AS provaordem_ordem,provaordem.pontuacao_maxima AS provaordem_pontuacao_maxima,
				provaordem.created_at,
				provaordem.update_at
			FROM provaordem
			INNER JOIN prova ON prova.id = provaordem.id_prova
			ORDER BY provaordem.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaOrdem = new ProvaOrdem();

				$ProvaOrdem->setId($row["provaordem_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaOrdem->setId_prova($Prova);
			
				$ProvaOrdem->setOrdem($row["provaordem_ordem"]);
			
				$ProvaOrdem->setPontuacao_maxima($row["provaordem_pontuacao_maxima"]);
			
				$result[] = $ProvaOrdem;
			}
		}

		return $result;
	}

	public function get($ProvaOrdem)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaOrdem->getId_prova()) && count($ProvaOrdem->getId_prova()) > 0)
			|| (is_object($ProvaOrdem->getId_prova()) && $ProvaOrdem->getId_prova()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaOrdem->getId_prova())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaOrdem->getId_prova() as $id_prova) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provaordem.id_prova = " . $id_prova->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provaordem.id_prova = " . $ProvaOrdem->getId_prova()->getId();
				}
			
		}
	
		if (strlen($ProvaOrdem->getOrdem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provaordem.ordem = '" . $ProvaOrdem->getOrdem() . "'";
			
		}
	
		if (strlen($ProvaOrdem->getPontuacao_maxima()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provaordem.pontuacao_maxima = '" . $ProvaOrdem->getPontuacao_maxima() . "'";
			
		}
	
		$query = pg_query("SELECT
				provaordem.id AS provaordem_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provaordem.ordem AS provaordem_ordem,provaordem.pontuacao_maxima AS provaordem_pontuacao_maxima,
				provaordem.created_at,
				provaordem.update_at
			FROM provaordem
			INNER JOIN prova ON prova.id = provaordem.id_prova
		" . $where . "ORDER BY provaordem.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaOrdem = new ProvaOrdem();

				$ProvaOrdem->setId($row["provaordem_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaOrdem->setId_prova($Prova);
			
				$ProvaOrdem->setOrdem($row["provaordem_ordem"]);
			
				$ProvaOrdem->setPontuacao_maxima($row["provaordem_pontuacao_maxima"]);
			
				$result[] = $ProvaOrdem;
			}
		}

		return $result;
	}
}

?>