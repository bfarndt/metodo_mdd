<?php

include_once "Daniel.class.php";


class DanielDB
{
	private $dbconn;
	private $host = "localhost";
	private $port = "5432";
	private $dbname = "proj3";
	private $user = "postgres";
	private $password = "teste";

	public function __construct()
	{
		$this->dbconn = pg_connect("host= " . $this->host . " port=" . $this->port . " dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}

	public function add($Daniel)
	{
		$query = pg_query("INSERT INTO daniel(
				cpf,
				endereco,created_at,
				update_at
			) VALUES(
				'" . $Daniel->getCpf() . "',
				'" . $Daniel->getEndereco() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Daniel)
	{
		$query = pg_query("UPDATE daniel SET
				cpf = '" . $Daniel->getCpf() . "',
				endereco = '" . $Daniel->getEndereco() . "',update_at = now()
			WHERE id = " . $Daniel->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Daniel)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM daniel WHERE id = " . $Daniel->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				daniel.id AS daniel_id,
				daniel.cpf AS daniel_cpf,daniel.endereco AS daniel_endereco,
				created_at,
				update_at
			FROM daniel
			
			ORDER BY daniel.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Daniel = new Daniel();

				$Daniel->setId($row["daniel_id"]);
			
				$Daniel->setCpf($row["daniel_cpf"]);
			
				$Daniel->setEndereco($row["daniel_endereco"]);
			
				$result[] = $Daniel;
			}
		}

		return $result;
	}

	public function get($Daniel)
	{
		$result = array();

		$where = "";

	
		if (strlen($Daniel->getCpf()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "daniel.cpf = '" . $Daniel->getCpf() . "'";
			
		}
	
		if (strlen($Daniel->getEndereco()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "daniel.endereco = '" . $Daniel->getEndereco() . "'";
			
		}
	
		$query = pg_query("SELECT
				daniel.id AS daniel_id,
				daniel.cpf AS daniel_cpf,daniel.endereco AS daniel_endereco,
				created_at,
				update_at
			FROM daniel
			
		" . $where . "ORDER BY daniel.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Daniel = new Daniel();

				$Daniel->setId($row["daniel_id"]);
			
				$Daniel->setCpf($row["daniel_cpf"]);
			
				$Daniel->setEndereco($row["daniel_endereco"]);
			
				$result[] = $Daniel;
			}
		}

		return $result;
	}
}

?>