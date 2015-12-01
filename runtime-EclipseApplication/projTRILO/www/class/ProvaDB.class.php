<?php

include_once "Prova.class.php";


class ProvaDB
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

	public function add($Prova)
	{
		$query = pg_query("INSERT INTO prova(
				pontuacao_maxima,created_at,
				update_at
			) VALUES(
				'" . $Prova->getPontuacao_maxima() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Prova)
	{
		$query = pg_query("UPDATE prova SET
				pontuacao_maxima = '" . $Prova->getPontuacao_maxima() . "',update_at = now()
			WHERE id = " . $Prova->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Prova)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM prova WHERE id = " . $Prova->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				prova.id AS prova_id,
				prova.pontuacao_maxima AS prova_pontuacao_maxima,
				prova.created_at,
				prova.update_at
			FROM prova
			
			ORDER BY prova.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Prova = new Prova();

				$Prova->setId($row["prova_id"]);
			
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
			
				$result[] = $Prova;
			}
		}

		return $result;
	}

	public function get($Prova)
	{
		$result = array();

		$where = "";

	
		if (strlen($Prova->getPontuacao_maxima()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "prova.pontuacao_maxima = '" . $Prova->getPontuacao_maxima() . "'";
			
		}
	
		$query = pg_query("SELECT
				prova.id AS prova_id,
				prova.pontuacao_maxima AS prova_pontuacao_maxima,
				prova.created_at,
				prova.update_at
			FROM prova
			
		" . $where . "ORDER BY prova.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Prova = new Prova();

				$Prova->setId($row["prova_id"]);
			
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
			
				$result[] = $Prova;
			}
		}

		return $result;
	}
}

?>