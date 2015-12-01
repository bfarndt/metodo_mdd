<?php

include_once "ProvaSequencia.class.php";
include_once "Prova.class.php";

class ProvaSequenciaDB
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

	public function add($ProvaSequencia)
	{
		$query = pg_query("INSERT INTO provasequencia(
				id_prova,
				pontuacao_maxima,created_at,
				update_at
			) VALUES(
				" . $ProvaSequencia->getId_prova()->getId() . ",
				
				'" . $ProvaSequencia->getPontuacao_maxima() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaSequencia)
	{
		$query = pg_query("UPDATE provasequencia SET
				id_prova = " . $ProvaSequencia->getId_prova()->getId() . ",
				
				pontuacao_maxima = '" . $ProvaSequencia->getPontuacao_maxima() . "',update_at = now()
			WHERE id = " . $ProvaSequencia->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaSequencia)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provasequencia WHERE id = " . $ProvaSequencia->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provasequencia.id AS provasequencia_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provasequencia.pontuacao_maxima AS provasequencia_pontuacao_maxima,
				provasequencia.created_at,
				provasequencia.update_at
			FROM provasequencia
			INNER JOIN prova ON prova.id = provasequencia.id_prova
			ORDER BY provasequencia.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaSequencia = new ProvaSequencia();

				$ProvaSequencia->setId($row["provasequencia_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaSequencia->setId_prova($Prova);
			
				$ProvaSequencia->setPontuacao_maxima($row["provasequencia_pontuacao_maxima"]);
			
				$result[] = $ProvaSequencia;
			}
		}

		return $result;
	}

	public function get($ProvaSequencia)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaSequencia->getId_prova()) && count($ProvaSequencia->getId_prova()) > 0)
			|| (is_object($ProvaSequencia->getId_prova()) && $ProvaSequencia->getId_prova()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaSequencia->getId_prova())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaSequencia->getId_prova() as $id_prova) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provasequencia.id_prova = " . $id_prova->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provasequencia.id_prova = " . $ProvaSequencia->getId_prova()->getId();
				}
			
		}
	
		if (strlen($ProvaSequencia->getPontuacao_maxima()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provasequencia.pontuacao_maxima = '" . $ProvaSequencia->getPontuacao_maxima() . "'";
			
		}
	
		$query = pg_query("SELECT
				provasequencia.id AS provasequencia_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provasequencia.pontuacao_maxima AS provasequencia_pontuacao_maxima,
				provasequencia.created_at,
				provasequencia.update_at
			FROM provasequencia
			INNER JOIN prova ON prova.id = provasequencia.id_prova
		" . $where . "ORDER BY provasequencia.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaSequencia = new ProvaSequencia();

				$ProvaSequencia->setId($row["provasequencia_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaSequencia->setId_prova($Prova);
			
				$ProvaSequencia->setPontuacao_maxima($row["provasequencia_pontuacao_maxima"]);
			
				$result[] = $ProvaSequencia;
			}
		}

		return $result;
	}
}

?>