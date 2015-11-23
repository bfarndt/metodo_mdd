<?php

include_once "ProvaSintaxe.class.php";
include_once "Prova.class.php";

class ProvaSintaxeDB
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

	public function add($ProvaSintaxe)
	{
		$query = pg_query("INSERT INTO provasintaxe(
				id_prova,
				imagem,
				nome,
				pontuacao_maxima,created_at,
				update_at
			) VALUES(
				" . $ProvaSintaxe->getId_prova()->getId() . ",
				
				'" . $ProvaSintaxe->getImagem() . "',
				'" . $ProvaSintaxe->getNome() . "',
				'" . $ProvaSintaxe->getPontuacao_maxima() . "',now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($ProvaSintaxe)
	{
		$query = pg_query("UPDATE provasintaxe SET
				id_prova = " . $ProvaSintaxe->getId_prova()->getId() . ",
				
				imagem = '" . $ProvaSintaxe->getImagem() . "',
				nome = '" . $ProvaSintaxe->getNome() . "',
				pontuacao_maxima = '" . $ProvaSintaxe->getPontuacao_maxima() . "',update_at = now()
			WHERE id = " . $ProvaSintaxe->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($ProvaSintaxe)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM provasintaxe WHERE id = " . $ProvaSintaxe->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				provasintaxe.id AS provasintaxe_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provasintaxe.imagem AS provasintaxe_imagem,provasintaxe.nome AS provasintaxe_nome,provasintaxe.pontuacao_maxima AS provasintaxe_pontuacao_maxima,
				provasintaxe.created_at,
				provasintaxe.update_at
			FROM provasintaxe
			INNER JOIN prova ON prova.id = provasintaxe.id_prova
			ORDER BY provasintaxe.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaSintaxe = new ProvaSintaxe();

				$ProvaSintaxe->setId($row["provasintaxe_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaSintaxe->setId_prova($Prova);
			
				$ProvaSintaxe->setImagem($row["provasintaxe_imagem"]);
			
				$ProvaSintaxe->setNome($row["provasintaxe_nome"]);
			
				$ProvaSintaxe->setPontuacao_maxima($row["provasintaxe_pontuacao_maxima"]);
			
				$result[] = $ProvaSintaxe;
			}
		}

		return $result;
	}

	public function get($ProvaSintaxe)
	{
		$result = array();

		$where = "";

	
		if (
			(is_array($ProvaSintaxe->getId_prova()) && count($ProvaSintaxe->getId_prova()) > 0)
			|| (is_object($ProvaSintaxe->getId_prova()) && $ProvaSintaxe->getId_prova()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($ProvaSintaxe->getId_prova())) {
					$first = true;
					$where .= "(";
					foreach ($ProvaSintaxe->getId_prova() as $id_prova) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "provasintaxe.id_prova = " . $id_prova->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "provasintaxe.id_prova = " . $ProvaSintaxe->getId_prova()->getId();
				}
			
		}
	
		if (strlen($ProvaSintaxe->getImagem()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provasintaxe.imagem = '" . $ProvaSintaxe->getImagem() . "'";
			
		}
	
		if (strlen($ProvaSintaxe->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provasintaxe.nome = '" . $ProvaSintaxe->getNome() . "'";
			
		}
	
		if (strlen($ProvaSintaxe->getPontuacao_maxima()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "provasintaxe.pontuacao_maxima = '" . $ProvaSintaxe->getPontuacao_maxima() . "'";
			
		}
	
		$query = pg_query("SELECT
				provasintaxe.id AS provasintaxe_id,
				
					prova.id AS prova_id, prova.pontuacao_maxima AS prova_pontuacao_maxima,
				provasintaxe.imagem AS provasintaxe_imagem,provasintaxe.nome AS provasintaxe_nome,provasintaxe.pontuacao_maxima AS provasintaxe_pontuacao_maxima,
				provasintaxe.created_at,
				provasintaxe.update_at
			FROM provasintaxe
			INNER JOIN prova ON prova.id = provasintaxe.id_prova
		" . $where . "ORDER BY provasintaxe.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$ProvaSintaxe = new ProvaSintaxe();

				$ProvaSintaxe->setId($row["provasintaxe_id"]);
			
				$Prova = new Prova();
				$Prova->setId($row["prova_id"]);
				$Prova->setPontuacao_maxima($row["prova_pontuacao_maxima"]);
				
				$ProvaSintaxe->setId_prova($Prova);
			
				$ProvaSintaxe->setImagem($row["provasintaxe_imagem"]);
			
				$ProvaSintaxe->setNome($row["provasintaxe_nome"]);
			
				$ProvaSintaxe->setPontuacao_maxima($row["provasintaxe_pontuacao_maxima"]);
			
				$result[] = $ProvaSintaxe;
			}
		}

		return $result;
	}
}

?>