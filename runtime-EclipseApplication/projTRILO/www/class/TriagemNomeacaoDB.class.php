<?php

include_once "TriagemNomeacao.class.php";
include_once "Triagem.class.php";include_once "ProvaNomeacao.class.php";

class TriagemNomeacaoDB
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

	public function add($TriagemNomeacao)
	{
		$query = pg_query("INSERT INTO triagemnomeacao(
				id_triagem,
				id_prova_nomeacao,
				nomeacao,
				pontuacao,created_at,
				update_at
			) VALUES(
				" . $TriagemNomeacao->getId_triagem()->getId() . ",
				
				" . $TriagemNomeacao->getId_prova_nomeacao()->getId() . ",
				
				'" . $TriagemNomeacao->getNomeacao() . "',
				'" . $TriagemNomeacao->getPontuacao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemNomeacao)
	{
		$query = pg_query("UPDATE triagemnomeacao SET
				id_triagem = " . $TriagemNomeacao->getId_triagem()->getId() . ",
				
				id_prova_nomeacao = " . $TriagemNomeacao->getId_prova_nomeacao()->getId() . ",
				
				nomeacao = '" . $TriagemNomeacao->getNomeacao() . "',
				pontuacao = '" . $TriagemNomeacao->getPontuacao() . "',update_at = now()
			WHERE id = " . $TriagemNomeacao->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemNomeacao)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemnomeacao WHERE id = " . $TriagemNomeacao->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemnomeacao.id AS triagemnomeacao_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provanomeacao.id AS provanomeacao_id, provanomeacao.id_prova AS provanomeacao_id_prova,provanomeacao.transcricao AS provanomeacao_transcricao,provanomeacao.imagem AS provanomeacao_imagem,provanomeacao.nome AS provanomeacao_nome,provanomeacao.pontuacao_maxima AS provanomeacao_pontuacao_maxima,
				triagemnomeacao.nomeacao AS triagemnomeacao_nomeacao,triagemnomeacao.pontuacao AS triagemnomeacao_pontuacao,
				triagemnomeacao.created_at,
				triagemnomeacao.update_at
			FROM triagemnomeacao
			INNER JOIN triagem ON triagem.id = triagemnomeacao.id_triagemINNER JOIN provanomeacao ON provanomeacao.id = triagemnomeacao.id_prova_nomeacao
			ORDER BY triagemnomeacao.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemNomeacao = new TriagemNomeacao();

				$TriagemNomeacao->setId($row["triagemnomeacao_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemNomeacao->setId_triagem($Triagem);
			
				$ProvaNomeacao = new ProvaNomeacao();
				$ProvaNomeacao->setId($row["provanomeacao_id"]);
				$ProvaNomeacao->setId_prova($row["provanomeacao_id_prova"]);
				$ProvaNomeacao->setTranscricao($row["provanomeacao_transcricao"]);
				$ProvaNomeacao->setImagem($row["provanomeacao_imagem"]);
				$ProvaNomeacao->setNome($row["provanomeacao_nome"]);
				$ProvaNomeacao->setPontuacao_maxima($row["provanomeacao_pontuacao_maxima"]);
				
				$TriagemNomeacao->setId_prova_nomeacao($ProvaNomeacao);
			
				$TriagemNomeacao->setNomeacao($row["triagemnomeacao_nomeacao"]);
			
				$TriagemNomeacao->setPontuacao($row["triagemnomeacao_pontuacao"]);
			
				$result[] = $TriagemNomeacao;
			}
		}

		return $result;
	}

	public function get($TriagemNomeacao)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemNomeacao->getId_triagem()) && count($TriagemNomeacao->getId_triagem()) > 0)
			|| (is_object($TriagemNomeacao->getId_triagem()) && $TriagemNomeacao->getId_triagem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemNomeacao->getId_triagem())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemNomeacao->getId_triagem() as $id_triagem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemnomeacao.id_triagem = " . $id_triagem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemnomeacao.id_triagem = " . $TriagemNomeacao->getId_triagem()->getId();
				}
			
		}
	
		if (
			(is_array($TriagemNomeacao->getId_prova_nomeacao()) && count($TriagemNomeacao->getId_prova_nomeacao()) > 0)
			|| (is_object($TriagemNomeacao->getId_prova_nomeacao()) && $TriagemNomeacao->getId_prova_nomeacao()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemNomeacao->getId_prova_nomeacao())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemNomeacao->getId_prova_nomeacao() as $id_prova_nomeacao) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemnomeacao.id_prova_nomeacao = " . $id_prova_nomeacao->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemnomeacao.id_prova_nomeacao = " . $TriagemNomeacao->getId_prova_nomeacao()->getId();
				}
			
		}
	
		if (strlen($TriagemNomeacao->getNomeacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemnomeacao.nomeacao = '" . $TriagemNomeacao->getNomeacao() . "'";
			
		}
	
		if (strlen($TriagemNomeacao->getPontuacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemnomeacao.pontuacao = '" . $TriagemNomeacao->getPontuacao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemnomeacao.id AS triagemnomeacao_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provanomeacao.id AS provanomeacao_id, provanomeacao.id_prova AS provanomeacao_id_prova,provanomeacao.transcricao AS provanomeacao_transcricao,provanomeacao.imagem AS provanomeacao_imagem,provanomeacao.nome AS provanomeacao_nome,provanomeacao.pontuacao_maxima AS provanomeacao_pontuacao_maxima,
				triagemnomeacao.nomeacao AS triagemnomeacao_nomeacao,triagemnomeacao.pontuacao AS triagemnomeacao_pontuacao,
				triagemnomeacao.created_at,
				triagemnomeacao.update_at
			FROM triagemnomeacao
			INNER JOIN triagem ON triagem.id = triagemnomeacao.id_triagemINNER JOIN provanomeacao ON provanomeacao.id = triagemnomeacao.id_prova_nomeacao
		" . $where . "ORDER BY triagemnomeacao.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemNomeacao = new TriagemNomeacao();

				$TriagemNomeacao->setId($row["triagemnomeacao_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemNomeacao->setId_triagem($Triagem);
			
				$ProvaNomeacao = new ProvaNomeacao();
				$ProvaNomeacao->setId($row["provanomeacao_id"]);
				$ProvaNomeacao->setId_prova($row["provanomeacao_id_prova"]);
				$ProvaNomeacao->setTranscricao($row["provanomeacao_transcricao"]);
				$ProvaNomeacao->setImagem($row["provanomeacao_imagem"]);
				$ProvaNomeacao->setNome($row["provanomeacao_nome"]);
				$ProvaNomeacao->setPontuacao_maxima($row["provanomeacao_pontuacao_maxima"]);
				
				$TriagemNomeacao->setId_prova_nomeacao($ProvaNomeacao);
			
				$TriagemNomeacao->setNomeacao($row["triagemnomeacao_nomeacao"]);
			
				$TriagemNomeacao->setPontuacao($row["triagemnomeacao_pontuacao"]);
			
				$result[] = $TriagemNomeacao;
			}
		}

		return $result;
	}
}

?>