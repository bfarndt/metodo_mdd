<?php

include_once "TriagemSintaxe.class.php";
include_once "Triagem.class.php";include_once "ProvaSintaxe.class.php";

class TriagemSintaxeDB
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

	public function add($TriagemSintaxe)
	{
		$query = pg_query("INSERT INTO triagemsintaxe(
				id_triagem,
				id_prova_sintaxe,
				frase,
				frase_formulada,
				utilizou_artigos,
				utilizou_elem_ligacao,
				utilizou_adjetivos,
				pontuacao,created_at,
				update_at
			) VALUES(
				" . $TriagemSintaxe->getId_triagem()->getId() . ",
				
				" . $TriagemSintaxe->getId_prova_sintaxe()->getId() . ",
				
				'" . $TriagemSintaxe->getFrase() . "',
				'" . $TriagemSintaxe->getFrase_formulada() . "',
				'" . $TriagemSintaxe->getUtilizou_artigos() . "',
				'" . $TriagemSintaxe->getUtilizou_elem_ligacao() . "',
				'" . $TriagemSintaxe->getUtilizou_adjetivos() . "',
				'" . $TriagemSintaxe->getPontuacao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemSintaxe)
	{
		$query = pg_query("UPDATE triagemsintaxe SET
				id_triagem = " . $TriagemSintaxe->getId_triagem()->getId() . ",
				
				id_prova_sintaxe = " . $TriagemSintaxe->getId_prova_sintaxe()->getId() . ",
				
				frase = '" . $TriagemSintaxe->getFrase() . "',
				frase_formulada = '" . $TriagemSintaxe->getFrase_formulada() . "',
				utilizou_artigos = '" . $TriagemSintaxe->getUtilizou_artigos() . "',
				utilizou_elem_ligacao = '" . $TriagemSintaxe->getUtilizou_elem_ligacao() . "',
				utilizou_adjetivos = '" . $TriagemSintaxe->getUtilizou_adjetivos() . "',
				pontuacao = '" . $TriagemSintaxe->getPontuacao() . "',update_at = now()
			WHERE id = " . $TriagemSintaxe->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemSintaxe)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemsintaxe WHERE id = " . $TriagemSintaxe->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemsintaxe.id AS triagemsintaxe_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provasintaxe.id AS provasintaxe_id, provasintaxe.id_prova AS provasintaxe_id_prova,provasintaxe.imagem AS provasintaxe_imagem,provasintaxe.nome AS provasintaxe_nome,provasintaxe.pontuacao_maxima AS provasintaxe_pontuacao_maxima,
				triagemsintaxe.frase AS triagemsintaxe_frase,triagemsintaxe.frase_formulada AS triagemsintaxe_frase_formulada,triagemsintaxe.utilizou_artigos AS triagemsintaxe_utilizou_artigos,triagemsintaxe.utilizou_elem_ligacao AS triagemsintaxe_utilizou_elem_ligacao,triagemsintaxe.utilizou_adjetivos AS triagemsintaxe_utilizou_adjetivos,triagemsintaxe.pontuacao AS triagemsintaxe_pontuacao,
				triagemsintaxe.created_at,
				triagemsintaxe.update_at
			FROM triagemsintaxe
			INNER JOIN triagem ON triagem.id = triagemsintaxe.id_triagemINNER JOIN provasintaxe ON provasintaxe.id = triagemsintaxe.id_prova_sintaxe
			ORDER BY triagemsintaxe.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemSintaxe = new TriagemSintaxe();

				$TriagemSintaxe->setId($row["triagemsintaxe_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemSintaxe->setId_triagem($Triagem);
			
				$ProvaSintaxe = new ProvaSintaxe();
				$ProvaSintaxe->setId($row["provasintaxe_id"]);
				$ProvaSintaxe->setId_prova($row["provasintaxe_id_prova"]);
				$ProvaSintaxe->setImagem($row["provasintaxe_imagem"]);
				$ProvaSintaxe->setNome($row["provasintaxe_nome"]);
				$ProvaSintaxe->setPontuacao_maxima($row["provasintaxe_pontuacao_maxima"]);
				
				$TriagemSintaxe->setId_prova_sintaxe($ProvaSintaxe);
			
				$TriagemSintaxe->setFrase($row["triagemsintaxe_frase"]);
			
				$TriagemSintaxe->setFrase_formulada($row["triagemsintaxe_frase_formulada"]);
			
				$TriagemSintaxe->setUtilizou_artigos($row["triagemsintaxe_utilizou_artigos"]);
			
				$TriagemSintaxe->setUtilizou_elem_ligacao($row["triagemsintaxe_utilizou_elem_ligacao"]);
			
				$TriagemSintaxe->setUtilizou_adjetivos($row["triagemsintaxe_utilizou_adjetivos"]);
			
				$TriagemSintaxe->setPontuacao($row["triagemsintaxe_pontuacao"]);
			
				$result[] = $TriagemSintaxe;
			}
		}

		return $result;
	}

	public function get($TriagemSintaxe)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemSintaxe->getId_triagem()) && count($TriagemSintaxe->getId_triagem()) > 0)
			|| (is_object($TriagemSintaxe->getId_triagem()) && $TriagemSintaxe->getId_triagem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemSintaxe->getId_triagem())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemSintaxe->getId_triagem() as $id_triagem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemsintaxe.id_triagem = " . $id_triagem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemsintaxe.id_triagem = " . $TriagemSintaxe->getId_triagem()->getId();
				}
			
		}
	
		if (
			(is_array($TriagemSintaxe->getId_prova_sintaxe()) && count($TriagemSintaxe->getId_prova_sintaxe()) > 0)
			|| (is_object($TriagemSintaxe->getId_prova_sintaxe()) && $TriagemSintaxe->getId_prova_sintaxe()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemSintaxe->getId_prova_sintaxe())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemSintaxe->getId_prova_sintaxe() as $id_prova_sintaxe) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemsintaxe.id_prova_sintaxe = " . $id_prova_sintaxe->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemsintaxe.id_prova_sintaxe = " . $TriagemSintaxe->getId_prova_sintaxe()->getId();
				}
			
		}
	
		if (strlen($TriagemSintaxe->getFrase()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsintaxe.frase = '" . $TriagemSintaxe->getFrase() . "'";
			
		}
	
		if (strlen($TriagemSintaxe->getFrase_formulada()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsintaxe.frase_formulada = '" . $TriagemSintaxe->getFrase_formulada() . "'";
			
		}
	
		if (strlen($TriagemSintaxe->getUtilizou_artigos()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsintaxe.utilizou_artigos = '" . $TriagemSintaxe->getUtilizou_artigos() . "'";
			
		}
	
		if (strlen($TriagemSintaxe->getUtilizou_elem_ligacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsintaxe.utilizou_elem_ligacao = '" . $TriagemSintaxe->getUtilizou_elem_ligacao() . "'";
			
		}
	
		if (strlen($TriagemSintaxe->getUtilizou_adjetivos()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsintaxe.utilizou_adjetivos = '" . $TriagemSintaxe->getUtilizou_adjetivos() . "'";
			
		}
	
		if (strlen($TriagemSintaxe->getPontuacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsintaxe.pontuacao = '" . $TriagemSintaxe->getPontuacao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemsintaxe.id AS triagemsintaxe_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provasintaxe.id AS provasintaxe_id, provasintaxe.id_prova AS provasintaxe_id_prova,provasintaxe.imagem AS provasintaxe_imagem,provasintaxe.nome AS provasintaxe_nome,provasintaxe.pontuacao_maxima AS provasintaxe_pontuacao_maxima,
				triagemsintaxe.frase AS triagemsintaxe_frase,triagemsintaxe.frase_formulada AS triagemsintaxe_frase_formulada,triagemsintaxe.utilizou_artigos AS triagemsintaxe_utilizou_artigos,triagemsintaxe.utilizou_elem_ligacao AS triagemsintaxe_utilizou_elem_ligacao,triagemsintaxe.utilizou_adjetivos AS triagemsintaxe_utilizou_adjetivos,triagemsintaxe.pontuacao AS triagemsintaxe_pontuacao,
				triagemsintaxe.created_at,
				triagemsintaxe.update_at
			FROM triagemsintaxe
			INNER JOIN triagem ON triagem.id = triagemsintaxe.id_triagemINNER JOIN provasintaxe ON provasintaxe.id = triagemsintaxe.id_prova_sintaxe
		" . $where . "ORDER BY triagemsintaxe.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemSintaxe = new TriagemSintaxe();

				$TriagemSintaxe->setId($row["triagemsintaxe_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemSintaxe->setId_triagem($Triagem);
			
				$ProvaSintaxe = new ProvaSintaxe();
				$ProvaSintaxe->setId($row["provasintaxe_id"]);
				$ProvaSintaxe->setId_prova($row["provasintaxe_id_prova"]);
				$ProvaSintaxe->setImagem($row["provasintaxe_imagem"]);
				$ProvaSintaxe->setNome($row["provasintaxe_nome"]);
				$ProvaSintaxe->setPontuacao_maxima($row["provasintaxe_pontuacao_maxima"]);
				
				$TriagemSintaxe->setId_prova_sintaxe($ProvaSintaxe);
			
				$TriagemSintaxe->setFrase($row["triagemsintaxe_frase"]);
			
				$TriagemSintaxe->setFrase_formulada($row["triagemsintaxe_frase_formulada"]);
			
				$TriagemSintaxe->setUtilizou_artigos($row["triagemsintaxe_utilizou_artigos"]);
			
				$TriagemSintaxe->setUtilizou_elem_ligacao($row["triagemsintaxe_utilizou_elem_ligacao"]);
			
				$TriagemSintaxe->setUtilizou_adjetivos($row["triagemsintaxe_utilizou_adjetivos"]);
			
				$TriagemSintaxe->setPontuacao($row["triagemsintaxe_pontuacao"]);
			
				$result[] = $TriagemSintaxe;
			}
		}

		return $result;
	}
}

?>