<?php

include_once "TriagemOrdem.class.php";
include_once "Triagem.class.php";include_once "ProvaOrdem.class.php";

class TriagemOrdemDB
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

	public function add($TriagemOrdem)
	{
		$query = pg_query("INSERT INTO triagemordem(
				id_triagem,
				id_prova_ordem,
				acertou,
				pontuacao,created_at,
				update_at
			) VALUES(
				" . $TriagemOrdem->getId_triagem()->getId() . ",
				
				" . $TriagemOrdem->getId_prova_ordem()->getId() . ",
				
				'" . ($TriagemOrdem->getAcertou() ? "true" : "false") . "',
				'" . $TriagemOrdem->getPontuacao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemOrdem)
	{
		$query = pg_query("UPDATE triagemordem SET
				id_triagem = " . $TriagemOrdem->getId_triagem()->getId() . ",
				
				id_prova_ordem = " . $TriagemOrdem->getId_prova_ordem()->getId() . ",
				
				acertou = '" . ($TriagemOrdem->getAcertou() ? "true" : "false") . "',
				pontuacao = '" . $TriagemOrdem->getPontuacao() . "',update_at = now()
			WHERE id = " . $TriagemOrdem->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemOrdem)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemordem WHERE id = " . $TriagemOrdem->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemordem.id AS triagemordem_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provaordem.id AS provaordem_id, provaordem.id_prova AS provaordem_id_prova,provaordem.ordem AS provaordem_ordem,provaordem.pontuacao_maxima AS provaordem_pontuacao_maxima,
				triagemordem.acertou AS triagemordem_acertou,triagemordem.pontuacao AS triagemordem_pontuacao,
				triagemordem.created_at,
				triagemordem.update_at
			FROM triagemordem
			INNER JOIN triagem ON triagem.id = triagemordem.id_triagemINNER JOIN provaordem ON provaordem.id = triagemordem.id_prova_ordem
			ORDER BY triagemordem.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemOrdem = new TriagemOrdem();

				$TriagemOrdem->setId($row["triagemordem_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemOrdem->setId_triagem($Triagem);
			
				$ProvaOrdem = new ProvaOrdem();
				$ProvaOrdem->setId($row["provaordem_id"]);
				$ProvaOrdem->setId_prova($row["provaordem_id_prova"]);
				$ProvaOrdem->setOrdem($row["provaordem_ordem"]);
				$ProvaOrdem->setPontuacao_maxima($row["provaordem_pontuacao_maxima"]);
				
				$TriagemOrdem->setId_prova_ordem($ProvaOrdem);
			
				$TriagemOrdem->setAcertou($row["triagemordem_acertou"]);
			
				$TriagemOrdem->setPontuacao($row["triagemordem_pontuacao"]);
			
				$result[] = $TriagemOrdem;
			}
		}

		return $result;
	}

	public function get($TriagemOrdem)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemOrdem->getId_triagem()) && count($TriagemOrdem->getId_triagem()) > 0)
			|| (is_object($TriagemOrdem->getId_triagem()) && $TriagemOrdem->getId_triagem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemOrdem->getId_triagem())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemOrdem->getId_triagem() as $id_triagem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemordem.id_triagem = " . $id_triagem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemordem.id_triagem = " . $TriagemOrdem->getId_triagem()->getId();
				}
			
		}
	
		if (
			(is_array($TriagemOrdem->getId_prova_ordem()) && count($TriagemOrdem->getId_prova_ordem()) > 0)
			|| (is_object($TriagemOrdem->getId_prova_ordem()) && $TriagemOrdem->getId_prova_ordem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemOrdem->getId_prova_ordem())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemOrdem->getId_prova_ordem() as $id_prova_ordem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemordem.id_prova_ordem = " . $id_prova_ordem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemordem.id_prova_ordem = " . $TriagemOrdem->getId_prova_ordem()->getId();
				}
			
		}
	
		if (strlen($TriagemOrdem->getAcertou()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemordem.acertou = '" . $TriagemOrdem->getAcertou() . "'";
			
		}
	
		if (strlen($TriagemOrdem->getPontuacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemordem.pontuacao = '" . $TriagemOrdem->getPontuacao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemordem.id AS triagemordem_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provaordem.id AS provaordem_id, provaordem.id_prova AS provaordem_id_prova,provaordem.ordem AS provaordem_ordem,provaordem.pontuacao_maxima AS provaordem_pontuacao_maxima,
				triagemordem.acertou AS triagemordem_acertou,triagemordem.pontuacao AS triagemordem_pontuacao,
				triagemordem.created_at,
				triagemordem.update_at
			FROM triagemordem
			INNER JOIN triagem ON triagem.id = triagemordem.id_triagemINNER JOIN provaordem ON provaordem.id = triagemordem.id_prova_ordem
		" . $where . "ORDER BY triagemordem.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemOrdem = new TriagemOrdem();

				$TriagemOrdem->setId($row["triagemordem_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemOrdem->setId_triagem($Triagem);
			
				$ProvaOrdem = new ProvaOrdem();
				$ProvaOrdem->setId($row["provaordem_id"]);
				$ProvaOrdem->setId_prova($row["provaordem_id_prova"]);
				$ProvaOrdem->setOrdem($row["provaordem_ordem"]);
				$ProvaOrdem->setPontuacao_maxima($row["provaordem_pontuacao_maxima"]);
				
				$TriagemOrdem->setId_prova_ordem($ProvaOrdem);
			
				$TriagemOrdem->setAcertou($row["triagemordem_acertou"]);
			
				$TriagemOrdem->setPontuacao($row["triagemordem_pontuacao"]);
			
				$result[] = $TriagemOrdem;
			}
		}

		return $result;
	}
}

?>