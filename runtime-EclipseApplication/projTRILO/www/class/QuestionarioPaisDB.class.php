<?php

include_once "QuestionarioPais.class.php";
include_once "Paciente.class.php";

class QuestionarioPaisDB
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

	public function add($QuestionarioPais)
	{
		$query = pg_query("INSERT INTO questionariopais(
				id_paciente,
				troca_sons,
				troca_sons_mesma_idade,
				forma_frases,
				forma_frases_qtde_palavras,
				perguntas_pronomes,
				frase_utiliza_artigos,
				frase_correta_tempo_verbal,
				compreende_palavras_frases,
				escolhe_corretamente_palavras,
				conta_historia_coerencia,
				faz_pergunta_coerente,created_at,
				update_at
			) VALUES(
				" . $QuestionarioPais->getId_paciente()->getId() . ",
				
				'" . ($QuestionarioPais->getTroca_sons() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getTroca_sons_mesma_idade() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getForma_frases() ? "true" : "false") . "',
				'" . $QuestionarioPais->getForma_frases_qtde_palavras() . "',
				'" . ($QuestionarioPais->getPerguntas_pronomes() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getFrase_utiliza_artigos() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getFrase_correta_tempo_verbal() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getCompreende_palavras_frases() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getEscolhe_corretamente_palavras() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getConta_historia_coerencia() ? "true" : "false") . "',
				'" . ($QuestionarioPais->getFaz_pergunta_coerente() ? "true" : "false") . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($QuestionarioPais)
	{
		$query = pg_query("UPDATE questionariopais SET
				id_paciente = " . $QuestionarioPais->getId_paciente()->getId() . ",
				
				troca_sons = '" . ($QuestionarioPais->getTroca_sons() ? "true" : "false") . "',
				troca_sons_mesma_idade = '" . ($QuestionarioPais->getTroca_sons_mesma_idade() ? "true" : "false") . "',
				forma_frases = '" . ($QuestionarioPais->getForma_frases() ? "true" : "false") . "',
				forma_frases_qtde_palavras = '" . $QuestionarioPais->getForma_frases_qtde_palavras() . "',
				perguntas_pronomes = '" . ($QuestionarioPais->getPerguntas_pronomes() ? "true" : "false") . "',
				frase_utiliza_artigos = '" . ($QuestionarioPais->getFrase_utiliza_artigos() ? "true" : "false") . "',
				frase_correta_tempo_verbal = '" . ($QuestionarioPais->getFrase_correta_tempo_verbal() ? "true" : "false") . "',
				compreende_palavras_frases = '" . ($QuestionarioPais->getCompreende_palavras_frases() ? "true" : "false") . "',
				escolhe_corretamente_palavras = '" . ($QuestionarioPais->getEscolhe_corretamente_palavras() ? "true" : "false") . "',
				conta_historia_coerencia = '" . ($QuestionarioPais->getConta_historia_coerencia() ? "true" : "false") . "',
				faz_pergunta_coerente = '" . ($QuestionarioPais->getFaz_pergunta_coerente() ? "true" : "false") . "',update_at = now()
			WHERE id = " . $QuestionarioPais->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($QuestionarioPais)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM questionariopais WHERE id = " . $QuestionarioPais->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				questionariopais.id AS questionariopais_id,
				
					paciente.id AS paciente_id, paciente.foto AS paciente_foto,paciente.nome AS paciente_nome,paciente.nome_mae AS paciente_nome_mae,paciente.telefone AS paciente_telefone,paciente.data_nasc AS paciente_data_nasc,paciente.qtde_semanas_nasc AS paciente_qtde_semanas_nasc,paciente.problema_parto AS paciente_problema_parto,paciente.parto_normal AS paciente_parto_normal,paciente.gemeos AS paciente_gemeos,paciente.inflamacao_ouvido AS paciente_inflamacao_ouvido,paciente.problemas_respiratorios AS paciente_problemas_respiratorios,paciente.teve_desnutricao AS paciente_teve_desnutricao,paciente.anemia AS paciente_anemia,paciente.problema_familia_ling AS paciente_problema_familia_ling,paciente.data_cadastro AS paciente_data_cadastro,
				questionariopais.troca_sons AS questionariopais_troca_sons,questionariopais.troca_sons_mesma_idade AS questionariopais_troca_sons_mesma_idade,questionariopais.forma_frases AS questionariopais_forma_frases,questionariopais.forma_frases_qtde_palavras AS questionariopais_forma_frases_qtde_palavras,questionariopais.perguntas_pronomes AS questionariopais_perguntas_pronomes,questionariopais.frase_utiliza_artigos AS questionariopais_frase_utiliza_artigos,questionariopais.frase_correta_tempo_verbal AS questionariopais_frase_correta_tempo_verbal,questionariopais.compreende_palavras_frases AS questionariopais_compreende_palavras_frases,questionariopais.escolhe_corretamente_palavras AS questionariopais_escolhe_corretamente_palavras,questionariopais.conta_historia_coerencia AS questionariopais_conta_historia_coerencia,questionariopais.faz_pergunta_coerente AS questionariopais_faz_pergunta_coerente,
				questionariopais.created_at,
				questionariopais.update_at
			FROM questionariopais
			INNER JOIN paciente ON paciente.id = questionariopais.id_paciente
			ORDER BY questionariopais.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$QuestionarioPais = new QuestionarioPais();

				$QuestionarioPais->setId($row["questionariopais_id"]);
			
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
				
				$QuestionarioPais->setId_paciente($Paciente);
			
				$QuestionarioPais->setTroca_sons($row["questionariopais_troca_sons"]);
			
				$QuestionarioPais->setTroca_sons_mesma_idade($row["questionariopais_troca_sons_mesma_idade"]);
			
				$QuestionarioPais->setForma_frases($row["questionariopais_forma_frases"]);
			
				$QuestionarioPais->setForma_frases_qtde_palavras($row["questionariopais_forma_frases_qtde_palavras"]);
			
				$QuestionarioPais->setPerguntas_pronomes($row["questionariopais_perguntas_pronomes"]);
			
				$QuestionarioPais->setFrase_utiliza_artigos($row["questionariopais_frase_utiliza_artigos"]);
			
				$QuestionarioPais->setFrase_correta_tempo_verbal($row["questionariopais_frase_correta_tempo_verbal"]);
			
				$QuestionarioPais->setCompreende_palavras_frases($row["questionariopais_compreende_palavras_frases"]);
			
				$QuestionarioPais->setEscolhe_corretamente_palavras($row["questionariopais_escolhe_corretamente_palavras"]);
			
				$QuestionarioPais->setConta_historia_coerencia($row["questionariopais_conta_historia_coerencia"]);
			
				$QuestionarioPais->setFaz_pergunta_coerente($row["questionariopais_faz_pergunta_coerente"]);
			
				$result[] = $QuestionarioPais;
			}
		}

		return $result;
	}

	public function get($QuestionarioPais)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($QuestionarioPais->getId_paciente()) && count($QuestionarioPais->getId_paciente()) > 0)
			|| (is_object($QuestionarioPais->getId_paciente()) && $QuestionarioPais->getId_paciente()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($QuestionarioPais->getId_paciente())) {
					$first = true;
					$where .= "(";
					foreach ($QuestionarioPais->getId_paciente() as $id_paciente) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "questionariopais.id_paciente = " . $id_paciente->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "questionariopais.id_paciente = " . $QuestionarioPais->getId_paciente()->getId();
				}
			
		}
	
		if (strlen($QuestionarioPais->getTroca_sons()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.troca_sons = '" . $QuestionarioPais->getTroca_sons() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getTroca_sons_mesma_idade()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.troca_sons_mesma_idade = '" . $QuestionarioPais->getTroca_sons_mesma_idade() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getForma_frases()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.forma_frases = '" . $QuestionarioPais->getForma_frases() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getForma_frases_qtde_palavras()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.forma_frases_qtde_palavras = '" . $QuestionarioPais->getForma_frases_qtde_palavras() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getPerguntas_pronomes()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.perguntas_pronomes = '" . $QuestionarioPais->getPerguntas_pronomes() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getFrase_utiliza_artigos()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.frase_utiliza_artigos = '" . $QuestionarioPais->getFrase_utiliza_artigos() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getFrase_correta_tempo_verbal()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.frase_correta_tempo_verbal = '" . $QuestionarioPais->getFrase_correta_tempo_verbal() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getCompreende_palavras_frases()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.compreende_palavras_frases = '" . $QuestionarioPais->getCompreende_palavras_frases() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getEscolhe_corretamente_palavras()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.escolhe_corretamente_palavras = '" . $QuestionarioPais->getEscolhe_corretamente_palavras() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getConta_historia_coerencia()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.conta_historia_coerencia = '" . $QuestionarioPais->getConta_historia_coerencia() . "'";
			
		}
	
		if (strlen($QuestionarioPais->getFaz_pergunta_coerente()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "questionariopais.faz_pergunta_coerente = '" . $QuestionarioPais->getFaz_pergunta_coerente() . "'";
			
		}
	
		$query = pg_query("SELECT
				questionariopais.id AS questionariopais_id,
				
					paciente.id AS paciente_id, paciente.foto AS paciente_foto,paciente.nome AS paciente_nome,paciente.nome_mae AS paciente_nome_mae,paciente.telefone AS paciente_telefone,paciente.data_nasc AS paciente_data_nasc,paciente.qtde_semanas_nasc AS paciente_qtde_semanas_nasc,paciente.problema_parto AS paciente_problema_parto,paciente.parto_normal AS paciente_parto_normal,paciente.gemeos AS paciente_gemeos,paciente.inflamacao_ouvido AS paciente_inflamacao_ouvido,paciente.problemas_respiratorios AS paciente_problemas_respiratorios,paciente.teve_desnutricao AS paciente_teve_desnutricao,paciente.anemia AS paciente_anemia,paciente.problema_familia_ling AS paciente_problema_familia_ling,paciente.data_cadastro AS paciente_data_cadastro,
				questionariopais.troca_sons AS questionariopais_troca_sons,questionariopais.troca_sons_mesma_idade AS questionariopais_troca_sons_mesma_idade,questionariopais.forma_frases AS questionariopais_forma_frases,questionariopais.forma_frases_qtde_palavras AS questionariopais_forma_frases_qtde_palavras,questionariopais.perguntas_pronomes AS questionariopais_perguntas_pronomes,questionariopais.frase_utiliza_artigos AS questionariopais_frase_utiliza_artigos,questionariopais.frase_correta_tempo_verbal AS questionariopais_frase_correta_tempo_verbal,questionariopais.compreende_palavras_frases AS questionariopais_compreende_palavras_frases,questionariopais.escolhe_corretamente_palavras AS questionariopais_escolhe_corretamente_palavras,questionariopais.conta_historia_coerencia AS questionariopais_conta_historia_coerencia,questionariopais.faz_pergunta_coerente AS questionariopais_faz_pergunta_coerente,
				questionariopais.created_at,
				questionariopais.update_at
			FROM questionariopais
			INNER JOIN paciente ON paciente.id = questionariopais.id_paciente
		" . $where . "ORDER BY questionariopais.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$QuestionarioPais = new QuestionarioPais();

				$QuestionarioPais->setId($row["questionariopais_id"]);
			
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
				
				$QuestionarioPais->setId_paciente($Paciente);
			
				$QuestionarioPais->setTroca_sons($row["questionariopais_troca_sons"]);
			
				$QuestionarioPais->setTroca_sons_mesma_idade($row["questionariopais_troca_sons_mesma_idade"]);
			
				$QuestionarioPais->setForma_frases($row["questionariopais_forma_frases"]);
			
				$QuestionarioPais->setForma_frases_qtde_palavras($row["questionariopais_forma_frases_qtde_palavras"]);
			
				$QuestionarioPais->setPerguntas_pronomes($row["questionariopais_perguntas_pronomes"]);
			
				$QuestionarioPais->setFrase_utiliza_artigos($row["questionariopais_frase_utiliza_artigos"]);
			
				$QuestionarioPais->setFrase_correta_tempo_verbal($row["questionariopais_frase_correta_tempo_verbal"]);
			
				$QuestionarioPais->setCompreende_palavras_frases($row["questionariopais_compreende_palavras_frases"]);
			
				$QuestionarioPais->setEscolhe_corretamente_palavras($row["questionariopais_escolhe_corretamente_palavras"]);
			
				$QuestionarioPais->setConta_historia_coerencia($row["questionariopais_conta_historia_coerencia"]);
			
				$QuestionarioPais->setFaz_pergunta_coerente($row["questionariopais_faz_pergunta_coerente"]);
			
				$result[] = $QuestionarioPais;
			}
		}

		return $result;
	}
}

?>