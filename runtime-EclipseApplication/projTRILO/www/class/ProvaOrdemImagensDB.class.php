<?php

include_once "ProvaOrdemImagens.class.php";
include_once "ProvaOrdem.class.php";

class ProvaOrdemImagensDB
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

	public function add($ProvaOrdemImagens)
	{
		$query = pg_query("INSERT INTO provaordemimagens(
				id_prova_ordem,
				imagem,
				correta,created_at,
				update_at
			) VALUES(
				" . $ProvaOrdemImagens->getId_prova_ordem()->getId() . ",
				
				'" . $ProvaOrdemImagens->getImagem() . "',
				'" . ($ProvaOrdemImagens->getCorreta() ? "true" : "false") . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaOrdemImagens)
	{
		$query = pg_query("UPDATE provaordemimagens SET
				id_prova_ordem = " . $ProvaOrdemImagens->getId_prova_ordem()->getId() . ",
				
				imagem = '" . $ProvaOrdemImagens->getImagem() . "',
				correta = '" . ($ProvaOrdemImagens->getCorreta() ? "true" : "false") . "',update_at = now()
			WHERE id = " . $ProvaOrdemImagens->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaOrdemImagens)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provaordemimagens WHERE id = " . $ProvaOrdemImagens->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provaordemimagens.id AS provaordemimagens_id,
				
					provaordem.id AS provaordem_id, provaordem.id_prova AS provaordem_id_prova,provaordem.ordem AS provaordem_ordem,provaordem.pontuacao_maxima AS provaordem_pontuacao_maxima,
				provaordemimagens.imagem AS provaordemimagens_imagem,provaordemimagens.correta AS provaordemimagens_correta,
				provaordemimagens.created_at,
				provaordemimagens.update_at
			FROM provaordemimagens
			INNER JOIN provaordem ON provaordem.id = provaordemimagens.id_prova_ordem
			ORDER BY provaordemimagens.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaOrdemImagens = new ProvaOrdemImagens();

				$ProvaOrdemImagens->setId($row["provaordemimagens_id"]);
			
				$ProvaOrdem = new ProvaOrdem();
				$ProvaOrdem->setId($row["provaordem_id"]);
				$ProvaOrdem->setId_prova($row["provaordem_id_prova"]);
				$ProvaOrdem->setOrdem($row["provaordem_ordem"]);
				$ProvaOrdem->setPontuacao_maxima($row["provaordem_pontuacao_maxima"]);
				
				$ProvaOrdemImagens->setId_prova_ordem($ProvaOrdem);
			
				$ProvaOrdemImagens->setImagem($row["provaordemimagens_imagem"]);
			
				$ProvaOrdemImagens->setCorreta($row["provaordemimagens_correta"]);
			
				$result[] = $ProvaOrdemImagens;
			}
		}

		return $result;
	}

	public function get($ProvaOrdemImagens)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaOrdemImagens->getId_prova_ordem()) && count($ProvaOrdemImagens->getId_prova_ordem()) > 0)
			|| (is_object($ProvaOrdemImagens->getId_prova_ordem()) && $ProvaOrdemImagens->getId_prova_ordem()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaOrdemImagens->getId_prova_ordem())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaOrdemImagens->getId_prova_ordem() as $id_prova_ordem) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provaordemimagens.id_prova_ordem = " . $id_prova_ordem->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provaordemimagens.id_prova_ordem = " . $ProvaOrdemImagens->getId_prova_ordem()->getId();
				}
			
		}
	
		if (strlen($ProvaOrdemImagens->getImagem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provaordemimagens.imagem = '" . $ProvaOrdemImagens->getImagem() . "'";
			
		}
	
		if (strlen($ProvaOrdemImagens->getCorreta()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provaordemimagens.correta = '" . $ProvaOrdemImagens->getCorreta() . "'";
			
		}
	
		$query = pg_query("SELECT
				provaordemimagens.id AS provaordemimagens_id,
				
					provaordem.id AS provaordem_id, provaordem.id_prova AS provaordem_id_prova,provaordem.ordem AS provaordem_ordem,provaordem.pontuacao_maxima AS provaordem_pontuacao_maxima,
				provaordemimagens.imagem AS provaordemimagens_imagem,provaordemimagens.correta AS provaordemimagens_correta,
				provaordemimagens.created_at,
				provaordemimagens.update_at
			FROM provaordemimagens
			INNER JOIN provaordem ON provaordem.id = provaordemimagens.id_prova_ordem
		" . $where . "ORDER BY provaordemimagens.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaOrdemImagens = new ProvaOrdemImagens();

				$ProvaOrdemImagens->setId($row["provaordemimagens_id"]);
			
				$ProvaOrdem = new ProvaOrdem();
				$ProvaOrdem->setId($row["provaordem_id"]);
				$ProvaOrdem->setId_prova($row["provaordem_id_prova"]);
				$ProvaOrdem->setOrdem($row["provaordem_ordem"]);
				$ProvaOrdem->setPontuacao_maxima($row["provaordem_pontuacao_maxima"]);
				
				$ProvaOrdemImagens->setId_prova_ordem($ProvaOrdem);
			
				$ProvaOrdemImagens->setImagem($row["provaordemimagens_imagem"]);
			
				$ProvaOrdemImagens->setCorreta($row["provaordemimagens_correta"]);
			
				$result[] = $ProvaOrdemImagens;
			}
		}

		return $result;
	}
}

?>