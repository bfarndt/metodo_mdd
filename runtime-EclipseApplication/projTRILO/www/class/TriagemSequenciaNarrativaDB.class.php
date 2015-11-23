<?php

include_once "TriagemSequenciaNarrativa.class.php";
include_once "TriagemSequencia.class.php";

class TriagemSequenciaNarrativaDB
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

	public function add($TriagemSequenciaNarrativa)
	{
		$query = pg_query("INSERT INTO triagemsequencianarrativa(
				id_triagem_sequencia,
				acao,created_at,
				update_at
			) VALUES(
				" . $TriagemSequenciaNarrativa->getId_triagem_sequencia()->getId() . ",
				
				'" . $TriagemSequenciaNarrativa->getAcao() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($TriagemSequenciaNarrativa)
	{
		$query = pg_query("UPDATE triagemsequencianarrativa SET
				id_triagem_sequencia = " . $TriagemSequenciaNarrativa->getId_triagem_sequencia()->getId() . ",
				
				acao = '" . $TriagemSequenciaNarrativa->getAcao() . "',update_at = now()
			WHERE id = " . $TriagemSequenciaNarrativa->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($TriagemSequenciaNarrativa)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM triagemsequencianarrativa WHERE id = " . $TriagemSequenciaNarrativa->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				triagemsequencianarrativa.id AS triagemsequencianarrativa_id,
				
					triagemsequencia.id AS triagemsequencia_id, triagemsequencia.id_triagem AS triagemsequencia_id_triagem,triagemsequencia.id_prova_sequencia AS triagemsequencia_id_prova_sequencia,triagemsequencia.ordenou_corretamente AS triagemsequencia_ordenou_corretamente,triagemsequencia.narrou_sequencia AS triagemsequencia_narrou_sequencia,triagemsequencia.narrativa_coerente AS triagemsequencia_narrativa_coerente,triagemsequencia.pontuacao AS triagemsequencia_pontuacao,
				triagemsequencianarrativa.acao AS triagemsequencianarrativa_acao,
				triagemsequencianarrativa.created_at,
				triagemsequencianarrativa.update_at
			FROM triagemsequencianarrativa
			INNER JOIN triagemsequencia ON triagemsequencia.id = triagemsequencianarrativa.id_triagem_sequencia
			ORDER BY triagemsequencianarrativa.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemSequenciaNarrativa = new TriagemSequenciaNarrativa();

				$TriagemSequenciaNarrativa->setId($row["triagemsequencianarrativa_id"]);
			
				$TriagemSequencia = new TriagemSequencia();
				$TriagemSequencia->setId($row["triagemsequencia_id"]);
				$TriagemSequencia->setId_triagem($row["triagemsequencia_id_triagem"]);
				$TriagemSequencia->setId_prova_sequencia($row["triagemsequencia_id_prova_sequencia"]);
				$TriagemSequencia->setOrdenou_corretamente($row["triagemsequencia_ordenou_corretamente"]);
				$TriagemSequencia->setNarrou_sequencia($row["triagemsequencia_narrou_sequencia"]);
				$TriagemSequencia->setNarrativa_coerente($row["triagemsequencia_narrativa_coerente"]);
				$TriagemSequencia->setPontuacao($row["triagemsequencia_pontuacao"]);
				
				$TriagemSequenciaNarrativa->setId_triagem_sequencia($TriagemSequencia);
			
				$TriagemSequenciaNarrativa->setAcao($row["triagemsequencianarrativa_acao"]);
			
				$result[] = $TriagemSequenciaNarrativa;
			}
		}

		return $result;
	}

	public function get($TriagemSequenciaNarrativa)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($TriagemSequenciaNarrativa->getId_triagem_sequencia()) && count($TriagemSequenciaNarrativa->getId_triagem_sequencia()) > 0)
			|| (is_object($TriagemSequenciaNarrativa->getId_triagem_sequencia()) && $TriagemSequenciaNarrativa->getId_triagem_sequencia()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($TriagemSequenciaNarrativa->getId_triagem_sequencia())) {
					$first = true;
					$where .= "(";
					foreach ($TriagemSequenciaNarrativa->getId_triagem_sequencia() as $id_triagem_sequencia) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "triagemsequencianarrativa.id_triagem_sequencia = " . $id_triagem_sequencia->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "triagemsequencianarrativa.id_triagem_sequencia = " . $TriagemSequenciaNarrativa->getId_triagem_sequencia()->getId();
				}
			
		}
	
		if (strlen($TriagemSequenciaNarrativa->getAcao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "triagemsequencianarrativa.acao = '" . $TriagemSequenciaNarrativa->getAcao() . "'";
			
		}
	
		$query = pg_query("SELECT
				triagemsequencianarrativa.id AS triagemsequencianarrativa_id,
				
					triagemsequencia.id AS triagemsequencia_id, triagemsequencia.id_triagem AS triagemsequencia_id_triagem,triagemsequencia.id_prova_sequencia AS triagemsequencia_id_prova_sequencia,triagemsequencia.ordenou_corretamente AS triagemsequencia_ordenou_corretamente,triagemsequencia.narrou_sequencia AS triagemsequencia_narrou_sequencia,triagemsequencia.narrativa_coerente AS triagemsequencia_narrativa_coerente,triagemsequencia.pontuacao AS triagemsequencia_pontuacao,
				triagemsequencianarrativa.acao AS triagemsequencianarrativa_acao,
				triagemsequencianarrativa.created_at,
				triagemsequencianarrativa.update_at
			FROM triagemsequencianarrativa
			INNER JOIN triagemsequencia ON triagemsequencia.id = triagemsequencianarrativa.id_triagem_sequencia
		" . $where . "ORDER BY triagemsequencianarrativa.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$TriagemSequenciaNarrativa = new TriagemSequenciaNarrativa();

				$TriagemSequenciaNarrativa->setId($row["triagemsequencianarrativa_id"]);
			
				$TriagemSequencia = new TriagemSequencia();
				$TriagemSequencia->setId($row["triagemsequencia_id"]);
				$TriagemSequencia->setId_triagem($row["triagemsequencia_id_triagem"]);
				$TriagemSequencia->setId_prova_sequencia($row["triagemsequencia_id_prova_sequencia"]);
				$TriagemSequencia->setOrdenou_corretamente($row["triagemsequencia_ordenou_corretamente"]);
				$TriagemSequencia->setNarrou_sequencia($row["triagemsequencia_narrou_sequencia"]);
				$TriagemSequencia->setNarrativa_coerente($row["triagemsequencia_narrativa_coerente"]);
				$TriagemSequencia->setPontuacao($row["triagemsequencia_pontuacao"]);
				
				$TriagemSequenciaNarrativa->setId_triagem_sequencia($TriagemSequencia);
			
				$TriagemSequenciaNarrativa->setAcao($row["triagemsequencianarrativa_acao"]);
			
				$result[] = $TriagemSequenciaNarrativa;
			}
		}

		return $result;
	}
}

?>