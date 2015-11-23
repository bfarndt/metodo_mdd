<?php

include_once "Paciente.class.php";


class PacienteDB
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

	public function add($Paciente)
	{
		$query = pg_query("INSERT INTO paciente(
				foto,
				nome,
				nome_mae,
				telefone,
				data_nasc,
				qtde_semanas_nasc,
				problema_parto,
				parto_normal,
				gemeos,
				inflamacao_ouvido,
				problemas_respiratorios,
				teve_desnutricao,
				anemia,
				problema_familia_ling,
				data_cadastro,created_at,
				update_at
			) VALUES(
				'" . $Paciente->getFoto() . "',
				'" . $Paciente->getNome() . "',
				'" . $Paciente->getNome_mae() . "',
				'" . $Paciente->getTelefone() . "',
				'" . $Paciente->getData_nasc() . "',
				'" . $Paciente->getQtde_semanas_nasc() . "',
				'" . $Paciente->getProblema_parto() . "',
				'" . ($Paciente->getParto_normal() ? "true" : "false") . "',
				'" . ($Paciente->getGemeos() ? "true" : "false") . "',
				'" . ($Paciente->getInflamacao_ouvido() ? "true" : "false") . "',
				'" . ($Paciente->getProblemas_respiratorios() ? "true" : "false") . "',
				'" . ($Paciente->getTeve_desnutricao() ? "true" : "false") . "',
				'" . ($Paciente->getAnemia() ? "true" : "false") . "',
				'" . $Paciente->getProblema_familia_ling() . "',
				'" . $Paciente->getData_cadastro() . "',now(),
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
				foto = '" . $Paciente->getFoto() . "',
				nome = '" . $Paciente->getNome() . "',
				nome_mae = '" . $Paciente->getNome_mae() . "',
				telefone = '" . $Paciente->getTelefone() . "',
				data_nasc = '" . $Paciente->getData_nasc() . "',
				qtde_semanas_nasc = '" . $Paciente->getQtde_semanas_nasc() . "',
				problema_parto = '" . $Paciente->getProblema_parto() . "',
				parto_normal = '" . ($Paciente->getParto_normal() ? "true" : "false") . "',
				gemeos = '" . ($Paciente->getGemeos() ? "true" : "false") . "',
				inflamacao_ouvido = '" . ($Paciente->getInflamacao_ouvido() ? "true" : "false") . "',
				problemas_respiratorios = '" . ($Paciente->getProblemas_respiratorios() ? "true" : "false") . "',
				teve_desnutricao = '" . ($Paciente->getTeve_desnutricao() ? "true" : "false") . "',
				anemia = '" . ($Paciente->getAnemia() ? "true" : "false") . "',
				problema_familia_ling = '" . $Paciente->getProblema_familia_ling() . "',
				data_cadastro = '" . $Paciente->getData_cadastro() . "',update_at = now()
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
				paciente.foto AS paciente_foto,paciente.nome AS paciente_nome,paciente.nome_mae AS paciente_nome_mae,paciente.telefone AS paciente_telefone,paciente.data_nasc AS paciente_data_nasc,paciente.qtde_semanas_nasc AS paciente_qtde_semanas_nasc,paciente.problema_parto AS paciente_problema_parto,paciente.parto_normal AS paciente_parto_normal,paciente.gemeos AS paciente_gemeos,paciente.inflamacao_ouvido AS paciente_inflamacao_ouvido,paciente.problemas_respiratorios AS paciente_problemas_respiratorios,paciente.teve_desnutricao AS paciente_teve_desnutricao,paciente.anemia AS paciente_anemia,paciente.problema_familia_ling AS paciente_problema_familia_ling,paciente.data_cadastro AS paciente_data_cadastro,
				paciente.created_at,
				paciente.update_at
			FROM paciente
			
			ORDER BY paciente.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Paciente = new Paciente();

				$Paciente->setId($row["paciente_id"]);
			
				$Paciente->setFoto($row["paciente_foto"]);
			
				$Paciente->setNome($row["paciente_nome"]);
			
				$Paciente->setNome_mae($row["paciente_nome_mae"]);
			
				$Paciente->setTelefone($row["paciente_telefone"]);
			
				$Paciente->setData_nasc($row["paciente_data_nasc"]);
			
				$Paciente->setQtde_semanas_nasc($row["paciente_qtde_semanas_nasc"]);
			
				$Paciente->setProblema_parto($row["paciente_problema_parto"]);
			
				$Paciente->setParto_normal($row["paciente_parto_normal"]);
			
				$Paciente->setGemeos($row["paciente_gemeos"]);
			
				$Paciente->setInflamacao_ouvido($row["paciente_inflamacao_ouvido"]);
			
				$Paciente->setProblemas_respiratorios($row["paciente_problemas_respiratorios"]);
			
				$Paciente->setTeve_desnutricao($row["paciente_teve_desnutricao"]);
			
				$Paciente->setAnemia($row["paciente_anemia"]);
			
				$Paciente->setProblema_familia_ling($row["paciente_problema_familia_ling"]);
			
				$Paciente->setData_cadastro($row["paciente_data_cadastro"]);
			
				$result[] = $Paciente;
			}
		}

		return $result;
	}

	public function get($Paciente)
	{
		$result = array();

		$where = "";

	
		if (strlen($Paciente->getFoto()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.foto = '" . $Paciente->getFoto() . "'";
			
		}
	
		if (strlen($Paciente->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.nome = '" . $Paciente->getNome() . "'";
			
		}
	
		if (strlen($Paciente->getNome_mae()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.nome_mae = '" . $Paciente->getNome_mae() . "'";
			
		}
	
		if (strlen($Paciente->getTelefone()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.telefone = '" . $Paciente->getTelefone() . "'";
			
		}
	
		if (strlen($Paciente->getData_nasc()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.data_nasc = '" . $Paciente->getData_nasc() . "'";
			
		}
	
		if (strlen($Paciente->getQtde_semanas_nasc()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.qtde_semanas_nasc = '" . $Paciente->getQtde_semanas_nasc() . "'";
			
		}
	
		if (strlen($Paciente->getProblema_parto()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.problema_parto = '" . $Paciente->getProblema_parto() . "'";
			
		}
	
		if (strlen($Paciente->getParto_normal()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.parto_normal = '" . $Paciente->getParto_normal() . "'";
			
		}
	
		if (strlen($Paciente->getGemeos()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.gemeos = '" . $Paciente->getGemeos() . "'";
			
		}
	
		if (strlen($Paciente->getInflamacao_ouvido()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.inflamacao_ouvido = '" . $Paciente->getInflamacao_ouvido() . "'";
			
		}
	
		if (strlen($Paciente->getProblemas_respiratorios()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.problemas_respiratorios = '" . $Paciente->getProblemas_respiratorios() . "'";
			
		}
	
		if (strlen($Paciente->getTeve_desnutricao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.teve_desnutricao = '" . $Paciente->getTeve_desnutricao() . "'";
			
		}
	
		if (strlen($Paciente->getAnemia()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.anemia = '" . $Paciente->getAnemia() . "'";
			
		}
	
		if (strlen($Paciente->getProblema_familia_ling()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.problema_familia_ling = '" . $Paciente->getProblema_familia_ling() . "'";
			
		}
	
		if (strlen($Paciente->getData_cadastro()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "paciente.data_cadastro = '" . $Paciente->getData_cadastro() . "'";
			
		}
	
		$query = pg_query("SELECT
				paciente.id AS paciente_id,
				paciente.foto AS paciente_foto,paciente.nome AS paciente_nome,paciente.nome_mae AS paciente_nome_mae,paciente.telefone AS paciente_telefone,paciente.data_nasc AS paciente_data_nasc,paciente.qtde_semanas_nasc AS paciente_qtde_semanas_nasc,paciente.problema_parto AS paciente_problema_parto,paciente.parto_normal AS paciente_parto_normal,paciente.gemeos AS paciente_gemeos,paciente.inflamacao_ouvido AS paciente_inflamacao_ouvido,paciente.problemas_respiratorios AS paciente_problemas_respiratorios,paciente.teve_desnutricao AS paciente_teve_desnutricao,paciente.anemia AS paciente_anemia,paciente.problema_familia_ling AS paciente_problema_familia_ling,paciente.data_cadastro AS paciente_data_cadastro,
				paciente.created_at,
				paciente.update_at
			FROM paciente
			
		" . $where . "ORDER BY paciente.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Paciente = new Paciente();

				$Paciente->setId($row["paciente_id"]);
			
				$Paciente->setFoto($row["paciente_foto"]);
			
				$Paciente->setNome($row["paciente_nome"]);
			
				$Paciente->setNome_mae($row["paciente_nome_mae"]);
			
				$Paciente->setTelefone($row["paciente_telefone"]);
			
				$Paciente->setData_nasc($row["paciente_data_nasc"]);
			
				$Paciente->setQtde_semanas_nasc($row["paciente_qtde_semanas_nasc"]);
			
				$Paciente->setProblema_parto($row["paciente_problema_parto"]);
			
				$Paciente->setParto_normal($row["paciente_parto_normal"]);
			
				$Paciente->setGemeos($row["paciente_gemeos"]);
			
				$Paciente->setInflamacao_ouvido($row["paciente_inflamacao_ouvido"]);
			
				$Paciente->setProblemas_respiratorios($row["paciente_problemas_respiratorios"]);
			
				$Paciente->setTeve_desnutricao($row["paciente_teve_desnutricao"]);
			
				$Paciente->setAnemia($row["paciente_anemia"]);
			
				$Paciente->setProblema_familia_ling($row["paciente_problema_familia_ling"]);
			
				$Paciente->setData_cadastro($row["paciente_data_cadastro"]);
			
				$result[] = $Paciente;
			}
		}

		return $result;
	}
}

?>