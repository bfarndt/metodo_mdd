<?php

include_once "TriagemNomeacaoErrosFonetica.class.php";
include_once "TriagemNomeacao.class.php";

class TriagemNomeacaoErrosFoneticaDB
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

	public function add($TriagemNomeacaoErrosFonetica)
	{
		$query = pg_query("INSERT INTO triagemnomeacaoerrosfonetica(
				id_triagem_nomeacao,
				fonema,
				tipo_troca,
				substituicao,created_at,
				update_at
			) VALUES(
				" . $TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()->getId() . ",
				
				'" . $TriagemNomeacaoErrosFonetica->getFonema() . "',
				'" . $TriagemNomeacaoErrosFonetica->getTipo_troca() . "',
				'" . $TriagemNomeacaoErrosFonetica->getSubstituicao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemNomeacaoErrosFonetica)
	{
		$query = pg_query("UPDATE triagemnomeacaoerrosfonetica SET
				id_triagem_nomeacao = " . $TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()->getId() . ",
				
				fonema = '" . $TriagemNomeacaoErrosFonetica->getFonema() . "',
				tipo_troca = '" . $TriagemNomeacaoErrosFonetica->getTipo_troca() . "',
				substituicao = '" . $TriagemNomeacaoErrosFonetica->getSubstituicao() . "',update_at = now()
			WHERE id = " . $TriagemNomeacaoErrosFonetica->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemNomeacaoErrosFonetica)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemnomeacaoerrosfonetica WHERE id = " . $TriagemNomeacaoErrosFonetica->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemnomeacaoerrosfonetica.id AS triagemnomeacaoerrosfonetica_id,
				
					triagemnomeacao.id AS triagemnomeacao_id, triagemnomeacao.id_triagem AS triagemnomeacao_id_triagem,triagemnomeacao.id_prova_nomeacao AS triagemnomeacao_id_prova_nomeacao,triagemnomeacao.nomeacao AS triagemnomeacao_nomeacao,triagemnomeacao.pontuacao AS triagemnomeacao_pontuacao,
				triagemnomeacaoerrosfonetica.fonema AS triagemnomeacaoerrosfonetica_fonema,triagemnomeacaoerrosfonetica.tipo_troca AS triagemnomeacaoerrosfonetica_tipo_troca,triagemnomeacaoerrosfonetica.substituicao AS triagemnomeacaoerrosfonetica_substituicao,
				triagemnomeacaoerrosfonetica.created_at,
				triagemnomeacaoerrosfonetica.update_at
			FROM triagemnomeacaoerrosfonetica
			INNER JOIN triagemnomeacao ON triagemnomeacao.id = triagemnomeacaoerrosfonetica.id_triagem_nomeacao
			ORDER BY triagemnomeacaoerrosfonetica.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemNomeacaoErrosFonetica = new TriagemNomeacaoErrosFonetica();

				$TriagemNomeacaoErrosFonetica->setId($row["triagemnomeacaoerrosfonetica_id"]);
			
				$TriagemNomeacao = new TriagemNomeacao();
				$TriagemNomeacao->setId($row["triagemnomeacao_id"]);
				$TriagemNomeacao->setId_triagem($row["triagemnomeacao_id_triagem"]);
				$TriagemNomeacao->setId_prova_nomeacao($row["triagemnomeacao_id_prova_nomeacao"]);
				$TriagemNomeacao->setNomeacao($row["triagemnomeacao_nomeacao"]);
				$TriagemNomeacao->setPontuacao($row["triagemnomeacao_pontuacao"]);
				
				$TriagemNomeacaoErrosFonetica->setId_triagem_nomeacao($TriagemNomeacao);
			
				$TriagemNomeacaoErrosFonetica->setFonema($row["triagemnomeacaoerrosfonetica_fonema"]);
			
				$TriagemNomeacaoErrosFonetica->setTipo_troca($row["triagemnomeacaoerrosfonetica_tipo_troca"]);
			
				$TriagemNomeacaoErrosFonetica->setSubstituicao($row["triagemnomeacaoerrosfonetica_substituicao"]);
			
				$result[] = $TriagemNomeacaoErrosFonetica;
			}
		}

		return $result;
	}

	public function get($TriagemNomeacaoErrosFonetica)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()) && count($TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()) > 0)
			|| (is_object($TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()) && $TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao() as $id_triagem_nomeacao) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemnomeacaoerrosfonetica.id_triagem_nomeacao = " . $id_triagem_nomeacao->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemnomeacaoerrosfonetica.id_triagem_nomeacao = " . $TriagemNomeacaoErrosFonetica->getId_triagem_nomeacao()->getId();
				}
			
		}
	
		if (strlen($TriagemNomeacaoErrosFonetica->getFonema()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemnomeacaoerrosfonetica.fonema = '" . $TriagemNomeacaoErrosFonetica->getFonema() . "'";
			
		}
	
		if (strlen($TriagemNomeacaoErrosFonetica->getTipo_troca()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemnomeacaoerrosfonetica.tipo_troca = '" . $TriagemNomeacaoErrosFonetica->getTipo_troca() . "'";
			
		}
	
		if (strlen($TriagemNomeacaoErrosFonetica->getSubstituicao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemnomeacaoerrosfonetica.substituicao = '" . $TriagemNomeacaoErrosFonetica->getSubstituicao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemnomeacaoerrosfonetica.id AS triagemnomeacaoerrosfonetica_id,
				
					triagemnomeacao.id AS triagemnomeacao_id, triagemnomeacao.id_triagem AS triagemnomeacao_id_triagem,triagemnomeacao.id_prova_nomeacao AS triagemnomeacao_id_prova_nomeacao,triagemnomeacao.nomeacao AS triagemnomeacao_nomeacao,triagemnomeacao.pontuacao AS triagemnomeacao_pontuacao,
				triagemnomeacaoerrosfonetica.fonema AS triagemnomeacaoerrosfonetica_fonema,triagemnomeacaoerrosfonetica.tipo_troca AS triagemnomeacaoerrosfonetica_tipo_troca,triagemnomeacaoerrosfonetica.substituicao AS triagemnomeacaoerrosfonetica_substituicao,
				triagemnomeacaoerrosfonetica.created_at,
				triagemnomeacaoerrosfonetica.update_at
			FROM triagemnomeacaoerrosfonetica
			INNER JOIN triagemnomeacao ON triagemnomeacao.id = triagemnomeacaoerrosfonetica.id_triagem_nomeacao
		" . $where . "ORDER BY triagemnomeacaoerrosfonetica.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemNomeacaoErrosFonetica = new TriagemNomeacaoErrosFonetica();

				$TriagemNomeacaoErrosFonetica->setId($row["triagemnomeacaoerrosfonetica_id"]);
			
				$TriagemNomeacao = new TriagemNomeacao();
				$TriagemNomeacao->setId($row["triagemnomeacao_id"]);
				$TriagemNomeacao->setId_triagem($row["triagemnomeacao_id_triagem"]);
				$TriagemNomeacao->setId_prova_nomeacao($row["triagemnomeacao_id_prova_nomeacao"]);
				$TriagemNomeacao->setNomeacao($row["triagemnomeacao_nomeacao"]);
				$TriagemNomeacao->setPontuacao($row["triagemnomeacao_pontuacao"]);
				
				$TriagemNomeacaoErrosFonetica->setId_triagem_nomeacao($TriagemNomeacao);
			
				$TriagemNomeacaoErrosFonetica->setFonema($row["triagemnomeacaoerrosfonetica_fonema"]);
			
				$TriagemNomeacaoErrosFonetica->setTipo_troca($row["triagemnomeacaoerrosfonetica_tipo_troca"]);
			
				$TriagemNomeacaoErrosFonetica->setSubstituicao($row["triagemnomeacaoerrosfonetica_substituicao"]);
			
				$result[] = $TriagemNomeacaoErrosFonetica;
			}
		}

		return $result;
	}
}

?>