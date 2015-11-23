<?php

include_once "TriagemSequencia.class.php";
include_once "Triagem.class.php";include_once "ProvaSequencia.class.php";

class TriagemSequenciaDB
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

	public function add($TriagemSequencia)
	{
		$query = pg_query("INSERT INTO triagemsequencia(
				id_triagem,
				id_prova_sequencia,
				ordenou_corretamente,
				narrou_sequencia,
				narrativa_coerente,
				precisou_ajuda,
				pontuacao,created_at,
				update_at
			) VALUES(
				" . $TriagemSequencia->getId_triagem()->getId() . ",
				
				" . $TriagemSequencia->getId_prova_sequencia()->getId() . ",
				
				'" . ($TriagemSequencia->getOrdenou_corretamente() ? "true" : "false") . "',
				'" . ($TriagemSequencia->getNarrou_sequencia() ? "true" : "false") . "',
				'" . ($TriagemSequencia->getNarrativa_coerente() ? "true" : "false") . "',
				'" . $TriagemSequencia->getPrecisou_ajuda() . "',
				'" . $TriagemSequencia->getPontuacao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemSequencia)
	{
		$query = pg_query("UPDATE triagemsequencia SET
				id_triagem = " . $TriagemSequencia->getId_triagem()->getId() . ",
				
				id_prova_sequencia = " . $TriagemSequencia->getId_prova_sequencia()->getId() . ",
				
				ordenou_corretamente = '" . ($TriagemSequencia->getOrdenou_corretamente() ? "true" : "false") . "',
				narrou_sequencia = '" . ($TriagemSequencia->getNarrou_sequencia() ? "true" : "false") . "',
				narrativa_coerente = '" . ($TriagemSequencia->getNarrativa_coerente() ? "true" : "false") . "',
				precisou_ajuda = '" . $TriagemSequencia->getPrecisou_ajuda() . "',
				pontuacao = '" . $TriagemSequencia->getPontuacao() . "',update_at = now()
			WHERE id = " . $TriagemSequencia->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemSequencia)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemsequencia WHERE id = " . $TriagemSequencia->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemsequencia.id AS triagemsequencia_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provasequencia.id AS provasequencia_id, provasequencia.id_prova AS provasequencia_id_prova,provasequencia.pontuacao_maxima AS provasequencia_pontuacao_maxima,
				triagemsequencia.ordenou_corretamente AS triagemsequencia_ordenou_corretamente,triagemsequencia.narrou_sequencia AS triagemsequencia_narrou_sequencia,triagemsequencia.narrativa_coerente AS triagemsequencia_narrativa_coerente,triagemsequencia.precisou_ajuda AS triagemsequencia_precisou_ajuda,triagemsequencia.pontuacao AS triagemsequencia_pontuacao,
				triagemsequencia.created_at,
				triagemsequencia.update_at
			FROM triagemsequencia
			INNER JOIN triagem ON triagem.id = triagemsequencia.id_triagemINNER JOIN provasequencia ON provasequencia.id = triagemsequencia.id_prova_sequencia
			ORDER BY triagemsequencia.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemSequencia = new TriagemSequencia();

				$TriagemSequencia->setId($row["triagemsequencia_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemSequencia->setId_triagem($Triagem);
			
				$ProvaSequencia = new ProvaSequencia();
				$ProvaSequencia->setId($row["provasequencia_id"]);
				$ProvaSequencia->setId_prova($row["provasequencia_id_prova"]);
				$ProvaSequencia->setPontuacao_maxima($row["provasequencia_pontuacao_maxima"]);
				
				$TriagemSequencia->setId_prova_sequencia($ProvaSequencia);
			
				$TriagemSequencia->setOrdenou_corretamente($row["triagemsequencia_ordenou_corretamente"]);
			
				$TriagemSequencia->setNarrou_sequencia($row["triagemsequencia_narrou_sequencia"]);
			
				$TriagemSequencia->setNarrativa_coerente($row["triagemsequencia_narrativa_coerente"]);
			
				$TriagemSequencia->setPrecisou_ajuda($row["triagemsequencia_precisou_ajuda"]);
			
				$TriagemSequencia->setPontuacao($row["triagemsequencia_pontuacao"]);
			
				$result[] = $TriagemSequencia;
			}
		}

		return $result;
	}

	public function get($TriagemSequencia)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemSequencia->getId_triagem()) && count($TriagemSequencia->getId_triagem()) > 0)
			|| (is_object($TriagemSequencia->getId_triagem()) && $TriagemSequencia->getId_triagem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemSequencia->getId_triagem())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemSequencia->getId_triagem() as $id_triagem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemsequencia.id_triagem = " . $id_triagem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemsequencia.id_triagem = " . $TriagemSequencia->getId_triagem()->getId();
				}
			
		}
	
		if (
			(is_array($TriagemSequencia->getId_prova_sequencia()) && count($TriagemSequencia->getId_prova_sequencia()) > 0)
			|| (is_object($TriagemSequencia->getId_prova_sequencia()) && $TriagemSequencia->getId_prova_sequencia()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemSequencia->getId_prova_sequencia())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemSequencia->getId_prova_sequencia() as $id_prova_sequencia) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemsequencia.id_prova_sequencia = " . $id_prova_sequencia->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemsequencia.id_prova_sequencia = " . $TriagemSequencia->getId_prova_sequencia()->getId();
				}
			
		}
	
		if (strlen($TriagemSequencia->getOrdenou_corretamente()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsequencia.ordenou_corretamente = '" . $TriagemSequencia->getOrdenou_corretamente() . "'";
			
		}
	
		if (strlen($TriagemSequencia->getNarrou_sequencia()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsequencia.narrou_sequencia = '" . $TriagemSequencia->getNarrou_sequencia() . "'";
			
		}
	
		if (strlen($TriagemSequencia->getNarrativa_coerente()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsequencia.narrativa_coerente = '" . $TriagemSequencia->getNarrativa_coerente() . "'";
			
		}
	
		if (strlen($TriagemSequencia->getPrecisou_ajuda()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsequencia.precisou_ajuda = '" . $TriagemSequencia->getPrecisou_ajuda() . "'";
			
		}
	
		if (strlen($TriagemSequencia->getPontuacao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsequencia.pontuacao = '" . $TriagemSequencia->getPontuacao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemsequencia.id AS triagemsequencia_id,
				
					triagem.id AS triagem_id, triagem.id_paciente AS triagem_id_paciente,triagem.pontuacao AS triagem_pontuacao,
				
					provasequencia.id AS provasequencia_id, provasequencia.id_prova AS provasequencia_id_prova,provasequencia.pontuacao_maxima AS provasequencia_pontuacao_maxima,
				triagemsequencia.ordenou_corretamente AS triagemsequencia_ordenou_corretamente,triagemsequencia.narrou_sequencia AS triagemsequencia_narrou_sequencia,triagemsequencia.narrativa_coerente AS triagemsequencia_narrativa_coerente,triagemsequencia.precisou_ajuda AS triagemsequencia_precisou_ajuda,triagemsequencia.pontuacao AS triagemsequencia_pontuacao,
				triagemsequencia.created_at,
				triagemsequencia.update_at
			FROM triagemsequencia
			INNER JOIN triagem ON triagem.id = triagemsequencia.id_triagemINNER JOIN provasequencia ON provasequencia.id = triagemsequencia.id_prova_sequencia
		" . $where . "ORDER BY triagemsequencia.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemSequencia = new TriagemSequencia();

				$TriagemSequencia->setId($row["triagemsequencia_id"]);
			
				$Triagem = new Triagem();
				$Triagem->setId($row["triagem_id"]);
				$Triagem->setId_paciente($row["triagem_id_paciente"]);
				$Triagem->setPontuacao($row["triagem_pontuacao"]);
				
				$TriagemSequencia->setId_triagem($Triagem);
			
				$ProvaSequencia = new ProvaSequencia();
				$ProvaSequencia->setId($row["provasequencia_id"]);
				$ProvaSequencia->setId_prova($row["provasequencia_id_prova"]);
				$ProvaSequencia->setPontuacao_maxima($row["provasequencia_pontuacao_maxima"]);
				
				$TriagemSequencia->setId_prova_sequencia($ProvaSequencia);
			
				$TriagemSequencia->setOrdenou_corretamente($row["triagemsequencia_ordenou_corretamente"]);
			
				$TriagemSequencia->setNarrou_sequencia($row["triagemsequencia_narrou_sequencia"]);
			
				$TriagemSequencia->setNarrativa_coerente($row["triagemsequencia_narrativa_coerente"]);
			
				$TriagemSequencia->setPrecisou_ajuda($row["triagemsequencia_precisou_ajuda"]);
			
				$TriagemSequencia->setPontuacao($row["triagemsequencia_pontuacao"]);
			
				$result[] = $TriagemSequencia;
			}
		}

		return $result;
	}
}

?>