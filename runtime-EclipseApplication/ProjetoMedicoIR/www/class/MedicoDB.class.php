<?php

include_once "Medico.class.php";


class MedicoDB
{
	private $dbconn;
	private $host = "localhost";
	private $port = "5432";
	private $dbname = "ProjetoMedicoIR";
	private $user = "postgres";
	private $password = "teste";

	public function __construct()
	{
		$this->dbconn = pg_connect("host= " . $this->host . " port=" . $this->port . " dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}

	public function add($Medico)
	{
		$query = pg_query("INSERT INTO medico(
				nome,
				crm,created_at,
				update_at
			) VALUES(
				'" . $Medico->getNome() . "',
				'" . $Medico->getCrm() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Medico)
	{
		$query = pg_query("UPDATE medico SET
				nome = '" . $Medico->getNome() . "',
				crm = '" . $Medico->getCrm() . "',update_at = now()
			WHERE id = " . $Medico->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Medico)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM medico WHERE id = " . $Medico->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				medico.id AS medico_id,
				medico.nome AS medico_nome,medico.crm AS medico_crm,
				medico.created_at,
				medico.update_at
			FROM medico
			
			ORDER BY medico.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Medico = new Medico();

				$Medico->setId($row["medico_id"]);
			
				$Medico->setNome($row["medico_nome"]);
			
				$Medico->setCrm($row["medico_crm"]);
			
				$result[] = $Medico;
			}
		}

		return $result;
	}

	public function get($Medico)
	{
		$result = array();

		$where = "";

	
		if (strlen($Medico->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medico.nome = '" . $Medico->getNome() . "'";
			
		}
	
		if (strlen($Medico->getCrm()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medico.crm = '" . $Medico->getCrm() . "'";
			
		}
	
		$query = pg_query("SELECT
				medico.id AS medico_id,
				medico.nome AS medico_nome,medico.crm AS medico_crm,
				medico.created_at,
				medico.update_at
			FROM medico
			
		" . $where . "ORDER BY medico.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Medico = new Medico();

				$Medico->setId($row["medico_id"]);
			
				$Medico->setNome($row["medico_nome"]);
			
				$Medico->setCrm($row["medico_crm"]);
			
				$result[] = $Medico;
			}
		}

		return $result;
	}
}

?>