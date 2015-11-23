<?php

include_once "Triagem.class.php";
include_once "Paciente.class.php";

class TriagemDB
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

	public function add($Triagem)
	{
		$query = pg_query("INSERT INTO triagem(
				id_paciente,
				pontuacao,created_at,
				update_at
			) VALUES(
				" . $Triagem->getId_paciente()->getId() . ",
				
				'" . $Triagem->getPontuacao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Triagem)
	{
		$query = pg_query("UPDATE triagem SET
				id_paciente = " . $Triagem->getId_paciente()->getId() . ",
				
				pontuacao = '" . $Triagem->getPontuacao() . "',update_at = now()
			WHERE id = " . $Triagem->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Triagem)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagem WHERE id = " . $Triagem->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagem.id AS triagem_id,
				
					paciente.id AS paciente_id, paciente.foto AS paciente_foto,paciente.nome AS paciente_nome,paciente.nome_mae AS paciente_nome_mae,paciente.telefone AS paciente_telefone,paciente.data_nasc AS paciente_data_nasc,paciente.qtde_semanas_nasc AS paciente_qtde_semanas_nasc,paciente.problema_parto AS paciente_problema_parto,paciente.parto_normal AS paciente_parto_normal,paciente.gemeos AS paciente_gemeos,paciente.inflamacao_ouvido AS paciente_inflamacao_ouvido,paciente.problemas_respiratorios AS paciente_problemas_respiratorios,paciente.teve_desnutricao AS paciente_teve_desnutricao,paciente.anemia AS paciente_anemia,paciente.problema_familia_ling AS paciente_problema_familia_ling,paciente.data_cadastro AS paciente_data_cadastro,
				triagem.pontuacao AS triagem_pontuacao,
				triagem.created_at,
				triagem.update_at
			FROM triagem
			INNER JOIN paciente ON paciente.id = triagem.id_paciente
			ORDER BY triagem.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Triagem = new Triagem();

				$Triagem->setId($row["triagem_id"]);
			
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
				
				$Triagem->setId_paciente($Paciente);
			
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
			
				$result[] = $Triagem;
			}
		}

		return $result;
	}

	public function get($Triagem)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($Triagem->getId_paciente()) && count($Triagem->getId_paciente()) > 0)
			|| (is_object($Triagem->getId_paciente()) && $Triagem->getId_paciente()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($Triagem->getId_paciente())) {
					$first = true;
					$where .= "(";
					foreach ($Triagem->getId_paciente() as $id_paciente) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagem.id_paciente = " . $id_paciente->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagem.id_paciente = " . $Triagem->getId_paciente()->getId();
				}
			
		}
	
		if (strlen($Triagem->getPontuacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagem.pontuacao = '" . $Triagem->getPontuacao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagem.id AS triagem_id,
				
					paciente.id AS paciente_id, paciente.foto AS paciente_foto,paciente.nome AS paciente_nome,paciente.nome_mae AS paciente_nome_mae,paciente.telefone AS paciente_telefone,paciente.data_nasc AS paciente_data_nasc,paciente.qtde_semanas_nasc AS paciente_qtde_semanas_nasc,paciente.problema_parto AS paciente_problema_parto,paciente.parto_normal AS paciente_parto_normal,paciente.gemeos AS paciente_gemeos,paciente.inflamacao_ouvido AS paciente_inflamacao_ouvido,paciente.problemas_respiratorios AS paciente_problemas_respiratorios,paciente.teve_desnutricao AS paciente_teve_desnutricao,paciente.anemia AS paciente_anemia,paciente.problema_familia_ling AS paciente_problema_familia_ling,paciente.data_cadastro AS paciente_data_cadastro,
				triagem.pontuacao AS triagem_pontuacao,
				triagem.created_at,
				triagem.update_at
			FROM triagem
			INNER JOIN paciente ON paciente.id = triagem.id_paciente
		" . $where . "ORDER BY triagem.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Triagem = new Triagem();

				$Triagem->setId($row["triagem_id"]);
			
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
				
				$Triagem->setId_paciente($Paciente);
			
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
			
				$result[] = $Triagem;
			}
		}

		return $result;
	}
}

?>