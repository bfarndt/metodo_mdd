<?php

include_once "ProvaSequenciaImagens.class.php";
include_once "ProvaSequencia.class.php";

class ProvaSequenciaImagensDB
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

	public function add($ProvaSequenciaImagens)
	{
		$query = pg_query("INSERT INTO provasequenciaimagens(
				id_prova_sequencia,
				imagem,
				ordem,created_at,
				update_at
			) VALUES(
				" . $ProvaSequenciaImagens->getId_prova_sequencia()->getId() . ",
				
				'" . $ProvaSequenciaImagens->getImagem() . "',
				'" . $ProvaSequenciaImagens->getOrdem() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaSequenciaImagens)
	{
		$query = pg_query("UPDATE provasequenciaimagens SET
				id_prova_sequencia = " . $ProvaSequenciaImagens->getId_prova_sequencia()->getId() . ",
				
				imagem = '" . $ProvaSequenciaImagens->getImagem() . "',
				ordem = '" . $ProvaSequenciaImagens->getOrdem() . "',update_at = now()
			WHERE id = " . $ProvaSequenciaImagens->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaSequenciaImagens)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provasequenciaimagens WHERE id = " . $ProvaSequenciaImagens->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provasequenciaimagens.id AS provasequenciaimagens_id,
				
					provasequencia.id AS provasequencia_id, provasequencia.id_prova AS provasequencia_id_prova,provasequencia.pontuacao_maxima AS provasequencia_pontuacao_maxima,
				provasequenciaimagens.imagem AS provasequenciaimagens_imagem,provasequenciaimagens.ordem AS provasequenciaimagens_ordem,
				provasequenciaimagens.created_at,
				provasequenciaimagens.update_at
			FROM provasequenciaimagens
			INNER JOIN provasequencia ON provasequencia.id = provasequenciaimagens.id_prova_sequencia
			ORDER BY provasequenciaimagens.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaSequenciaImagens = new ProvaSequenciaImagens();

				$ProvaSequenciaImagens->setId($row["provasequenciaimagens_id"]);
			
				$ProvaSequencia = new ProvaSequencia();
				$ProvaSequencia->setId($row["provasequencia_id"]);
				$ProvaSequencia->setId_prova($row["provasequencia_id_prova"]);
				$ProvaSequencia->setPontuacao_maxima($row["provasequencia_pontuacao_maxima"]);
				
				$ProvaSequenciaImagens->setId_prova_sequencia($ProvaSequencia);
			
				$ProvaSequenciaImagens->setImagem($row["provasequenciaimagens_imagem"]);
			
				$ProvaSequenciaImagens->setOrdem($row["provasequenciaimagens_ordem"]);
			
				$result[] = $ProvaSequenciaImagens;
			}
		}

		return $result;
	}

	public function get($ProvaSequenciaImagens)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaSequenciaImagens->getId_prova_sequencia()) && count($ProvaSequenciaImagens->getId_prova_sequencia()) > 0)
			|| (is_object($ProvaSequenciaImagens->getId_prova_sequencia()) && $ProvaSequenciaImagens->getId_prova_sequencia()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaSequenciaImagens->getId_prova_sequencia())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaSequenciaImagens->getId_prova_sequencia() as $id_prova_sequencia) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provasequenciaimagens.id_prova_sequencia = " . $id_prova_sequencia->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provasequenciaimagens.id_prova_sequencia = " . $ProvaSequenciaImagens->getId_prova_sequencia()->getId();
				}
			
		}
	
		if (strlen($ProvaSequenciaImagens->getImagem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provasequenciaimagens.imagem = '" . $ProvaSequenciaImagens->getImagem() . "'";
			
		}
	
		if (strlen($ProvaSequenciaImagens->getOrdem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provasequenciaimagens.ordem = '" . $ProvaSequenciaImagens->getOrdem() . "'";
			
		}
	
		$query = pg_query("SELECT
				provasequenciaimagens.id AS provasequenciaimagens_id,
				
					provasequencia.id AS provasequencia_id, provasequencia.id_prova AS provasequencia_id_prova,provasequencia.pontuacao_maxima AS provasequencia_pontuacao_maxima,
				provasequenciaimagens.imagem AS provasequenciaimagens_imagem,provasequenciaimagens.ordem AS provasequenciaimagens_ordem,
				provasequenciaimagens.created_at,
				provasequenciaimagens.update_at
			FROM provasequenciaimagens
			INNER JOIN provasequencia ON provasequencia.id = provasequenciaimagens.id_prova_sequencia
		" . $where . "ORDER BY provasequenciaimagens.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaSequenciaImagens = new ProvaSequenciaImagens();

				$ProvaSequenciaImagens->setId($row["provasequenciaimagens_id"]);
			
				$ProvaSequencia = new ProvaSequencia();
				$ProvaSequencia->setId($row["provasequencia_id"]);
				$ProvaSequencia->setId_prova($row["provasequencia_id_prova"]);
				$ProvaSequencia->setPontuacao_maxima($row["provasequencia_pontuacao_maxima"]);
				
				$ProvaSequenciaImagens->setId_prova_sequencia($ProvaSequencia);
			
				$ProvaSequenciaImagens->setImagem($row["provasequenciaimagens_imagem"]);
			
				$ProvaSequenciaImagens->setOrdem($row["provasequenciaimagens_ordem"]);
			
				$result[] = $ProvaSequenciaImagens;
			}
		}

		return $result;
	}
}

?>