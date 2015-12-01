<?php

include_once "ProvaNomeacao.class.php";
include_once "Prova.class.php";

class ProvaNomeacaoDB
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

	public function add($ProvaNomeacao)
	{
		$query = pg_query("INSERT INTO provanomeacao(
				id_prova,
				transcricao,
				imagem,
				nome,
				pontuacao_maxima,created_at,
				update_at
			) VALUES(
				" . $ProvaNomeacao->getId_prova()->getId() . ",
				
				'" . $ProvaNomeacao->getTranscricao() . "',
				'" . $ProvaNomeacao->getImagem() . "',
				'" . $ProvaNomeacao->getNome() . "',
				'" . $ProvaNomeacao->getPontuacao_maxima() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaNomeacao)
	{
		$query = pg_query("UPDATE provanomeacao SET
				id_prova = " . $ProvaNomeacao->getId_prova()->getId() . ",
				
				transcricao = '" . $ProvaNomeacao->getTranscricao() . "',
				imagem = '" . $ProvaNomeacao->getImagem() . "',
				nome = '" . $ProvaNomeacao->getNome() . "',
				pontuacao_maxima = '" . $ProvaNomeacao->getPontuacao_maxima() . "',update_at = now()
			WHERE id = " . $ProvaNomeacao->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaNomeacao)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provanomeacao WHERE id = " . $ProvaNomeacao->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provanomeacao.id AS provanomeacao_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provanomeacao.transcricao AS provanomeacao_transcricao,provanomeacao.imagem AS provanomeacao_imagem,provanomeacao.nome AS provanomeacao_nome,provanomeacao.pontuacao_maxima AS provanomeacao_pontuacao_maxima,
				provanomeacao.created_at,
				provanomeacao.update_at
			FROM provanomeacao
			INNER JOIN prova ON prova.id = provanomeacao.id_prova
			ORDER BY provanomeacao.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaNomeacao = new ProvaNomeacao();

				$ProvaNomeacao->setId($row["provanomeacao_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaNomeacao->setId_prova($Prova);
			
				$ProvaNomeacao->setTranscricao($row["provanomeacao_transcricao"]);
			
				$ProvaNomeacao->setImagem($row["provanomeacao_imagem"]);
			
				$ProvaNomeacao->setNome($row["provanomeacao_nome"]);
			
				$ProvaNomeacao->setPontuacao_maxima($row["provanomeacao_pontuacao_maxima"]);
			
				$result[] = $ProvaNomeacao;
			}
		}

		return $result;
	}

	public function get($ProvaNomeacao)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaNomeacao->getId_prova()) && count($ProvaNomeacao->getId_prova()) > 0)
			|| (is_object($ProvaNomeacao->getId_prova()) && $ProvaNomeacao->getId_prova()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaNomeacao->getId_prova())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaNomeacao->getId_prova() as $id_prova) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provanomeacao.id_prova = " . $id_prova->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provanomeacao.id_prova = " . $ProvaNomeacao->getId_prova()->getId();
				}
			
		}
	
		if (strlen($ProvaNomeacao->getTranscricao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provanomeacao.transcricao = '" . $ProvaNomeacao->getTranscricao() . "'";
			
		}
	
		if (strlen($ProvaNomeacao->getImagem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provanomeacao.imagem = '" . $ProvaNomeacao->getImagem() . "'";
			
		}
	
		if (strlen($ProvaNomeacao->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provanomeacao.nome = '" . $ProvaNomeacao->getNome() . "'";
			
		}
	
		if (strlen($ProvaNomeacao->getPontuacao_maxima()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provanomeacao.pontuacao_maxima = '" . $ProvaNomeacao->getPontuacao_maxima() . "'";
			
		}
	
		$query = pg_query("SELECT
				provanomeacao.id AS provanomeacao_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provanomeacao.transcricao AS provanomeacao_transcricao,provanomeacao.imagem AS provanomeacao_imagem,provanomeacao.nome AS provanomeacao_nome,provanomeacao.pontuacao_maxima AS provanomeacao_pontuacao_maxima,
				provanomeacao.created_at,
				provanomeacao.update_at
			FROM provanomeacao
			INNER JOIN prova ON prova.id = provanomeacao.id_prova
		" . $where . "ORDER BY provanomeacao.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaNomeacao = new ProvaNomeacao();

				$ProvaNomeacao->setId($row["provanomeacao_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaNomeacao->setId_prova($Prova);
			
				$ProvaNomeacao->setTranscricao($row["provanomeacao_transcricao"]);
			
				$ProvaNomeacao->setImagem($row["provanomeacao_imagem"]);
			
				$ProvaNomeacao->setNome($row["provanomeacao_nome"]);
			
				$ProvaNomeacao->setPontuacao_maxima($row["provanomeacao_pontuacao_maxima"]);
			
				$result[] = $ProvaNomeacao;
			}
		}

		return $result;
	}
}

?>