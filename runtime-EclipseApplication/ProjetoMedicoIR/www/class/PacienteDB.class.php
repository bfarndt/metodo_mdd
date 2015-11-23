<?php

include_once "Paciente.class.php";


class PacienteDB
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

	public function add($Paciente)
	{
		$query = pg_query("INSERT INTO paciente(
				nome,
				cpf,
				data_nasc,
				endereco,
				cidade,
				estado,created_at,
				update_at
			) VALUES(
				'" . $Paciente->getNome() . "',
				'" . $Paciente->getCpf() . "',
				'" . $Paciente->getData_nasc() . "',
				'" . $Paciente->getEndereco() . "',
				'" . $Paciente->getCidade() . "',
				'" . $Paciente->getEstado() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Paciente)
	{
		$query = pg_query("UPDATE paciente SET
				nome = '" . $Paciente->getNome() . "',
				cpf = '" . $Paciente->getCpf() . "',
				data_nasc = '" . $Paciente->getData_nasc() . "',
				endereco = '" . $Paciente->getEndereco() . "',
				cidade = '" . $Paciente->getCidade() . "',
				estado = '" . $Paciente->getEstado() . "',update_at = now()
			WHERE id = " . $Paciente->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Paciente)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM paciente WHERE id = " . $Paciente->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				paciente.id AS paciente_id,
				paciente.nome AS paciente_nome,paciente.cpf AS paciente_cpf,paciente.data_nasc AS paciente_data_nasc,paciente.endereco AS paciente_endereco,paciente.cidade AS paciente_cidade,paciente.estado AS paciente_estado,
				paciente.created_at,
				paciente.update_at
			FROM paciente
			
			ORDER BY paciente.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Paciente = new Paciente();

				$Paciente->setId($row["paciente_id"]);
			
				$Paciente->setNome($row["paciente_nome"]);
			
				$Paciente->setCpf($row["paciente_cpf"]);
			
				$Paciente->setData_nasc($row["paciente_data_nasc"]);
			
				$Paciente->setEndereco($row["paciente_endereco"]);
			
				$Paciente->setCidade($row["paciente_cidade"]);
			
				$Paciente->setEstado($row["paciente_estado"]);
			
				$result[] = $Paciente;
			}
		}

		return $result;
	}

	public function get($Paciente)
	{
		$result = array();

		$where = "";

	
		if (strlen($Paciente->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.nome = '" . $Paciente->getNome() . "'";
			
		}
	
		if (strlen($Paciente->getCpf()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.cpf = '" . $Paciente->getCpf() . "'";
			
		}
	
		if (strlen($Paciente->getData_nasc()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.data_nasc = '" . $Paciente->getData_nasc() . "'";
			
		}
	
		if (strlen($Paciente->getEndereco()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.endereco = '" . $Paciente->getEndereco() . "'";
			
		}
	
		if (strlen($Paciente->getCidade()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.cidade = '" . $Paciente->getCidade() . "'";
			
		}
	
		if (strlen($Paciente->getEstado()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.estado = '" . $Paciente->getEstado() . "'";
			
		}
	
		$query = pg_query("SELECT
				paciente.id AS paciente_id,
				paciente.nome AS paciente_nome,paciente.cpf AS paciente_cpf,paciente.data_nasc AS paciente_data_nasc,paciente.endereco AS paciente_endereco,paciente.cidade AS paciente_cidade,paciente.estado AS paciente_estado,
				paciente.created_at,
				paciente.update_at
			FROM paciente
			
		" . $where . "ORDER BY paciente.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Paciente = new Paciente();

				$Paciente->setId($row["paciente_id"]);
			
				$Paciente->setNome($row["paciente_nome"]);
			
				$Paciente->setCpf($row["paciente_cpf"]);
			
				$Paciente->setData_nasc($row["paciente_data_nasc"]);
			
				$Paciente->setEndereco($row["paciente_endereco"]);
			
				$Paciente->setCidade($row["paciente_cidade"]);
			
				$Paciente->setEstado($row["paciente_estado"]);
			
				$result[] = $Paciente;
			}
		}

		return $result;
	}
}

?>