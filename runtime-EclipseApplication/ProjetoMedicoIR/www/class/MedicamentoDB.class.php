<?php

include_once "Medicamento.class.php";
include_once "Medico.class.php";

class MedicamentoDB
{
	private $dbconn;
	private $host = "localhost";
	private $port = "5432";
	private $dbname = "ProjetoMedicoIR";
	private $user = "postgres";
	private $password = "teste";

	public function __construct()
	{
		$this->dbconn = pg_connect("host= " . $this->host . " port=" . $this->port . " dbname=" . $this->dbname . " user=" . $this->user . " password=" . $this->password);
	}

	public function add($Medicamento)
	{
		$query = pg_query("INSERT INTO medicamento(
				nome,
				fabricante,
				composicao,
				generico,
				custo,
				medico,created_at,
				update_at
			) VALUES(
				'" . $Medicamento->getNome() . "',
				'" . $Medicamento->getFabricante() . "',
				'" . $Medicamento->getComposicao() . "',
				'" . ($Medicamento->getGenerico() ? "true" : "false") . "',
				'" . $Medicamento->getCusto() . "',
				" . $Medicamento->getMedico()->getId() . ",
				now(),
				now()
			) RETURNING id;
		");
		
		$result = (pg_affected_rows($query) > 0);
		$id = pg_fetch_assoc($query);
		$id = $id['id'];
		
		

		return $result;
	}

	public function update($Medicamento)
	{
		$query = pg_query("UPDATE medicamento SET
				nome = '" . $Medicamento->getNome() . "',
				fabricante = '" . $Medicamento->getFabricante() . "',
				composicao = '" . $Medicamento->getComposicao() . "',
				generico = '" . ($Medicamento->getGenerico() ? "true" : "false") . "',
				custo = '" . $Medicamento->getCusto() . "',
				medico = " . $Medicamento->getMedico()->getId() . ",
				update_at = now()
			WHERE id = " . $Medicamento->getId()
		);

		$result = (pg_affected_rows($query) > 0);
		
		

		return $result;
	}

	public function destroy($Medicamento)
	{
		$result = true;
		

		$query = pg_query("DELETE FROM medicamento WHERE id = " . $Medicamento->getId());

		$result = $result && (pg_affected_rows($query) > 0);
		
		return $result;
	}

	public function getAll()
	{
		$result = array();

		$query = pg_query("SELECT
				medicamento.id AS medicamento_id,
				medicamento.nome AS medicamento_nome,medicamento.fabricante AS medicamento_fabricante,medicamento.composicao AS medicamento_composicao,medicamento.generico AS medicamento_generico,medicamento.custo AS medicamento_custo,
					medico.id AS medico_id, medico.nome AS medico_nome,medico.crm AS medico_crm,
				
				medicamento.created_at,
				medicamento.update_at
			FROM medicamento
			INNER JOIN medico ON medico.id = medicamento.medico
			ORDER BY medicamento.id
		");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Medicamento = new Medicamento();

				$Medicamento->setId($row["medicamento_id"]);
			
				$Medicamento->setNome($row["medicamento_nome"]);
			
				$Medicamento->setFabricante($row["medicamento_fabricante"]);
			
				$Medicamento->setComposicao($row["medicamento_composicao"]);
			
				$Medicamento->setGenerico($row["medicamento_generico"]);
			
				$Medicamento->setCusto($row["medicamento_custo"]);
			
				$Medico = new Medico();
				$Medico->setId($row["medico_id"]);
				$Medico->setNome($row["medico_nome"]);
				$Medico->setCrm($row["medico_crm"]);
				
				$Medicamento->setMedico($Medico);
			
				$result[] = $Medicamento;
			}
		}

		return $result;
	}

	public function get($Medicamento)
	{
		$result = array();

		$where = "";

	
		if (strlen($Medicamento->getNome()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medicamento.nome = '" . $Medicamento->getNome() . "'";
			
		}
	
		if (strlen($Medicamento->getFabricante()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medicamento.fabricante = '" . $Medicamento->getFabricante() . "'";
			
		}
	
		if (strlen($Medicamento->getComposicao()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medicamento.composicao = '" . $Medicamento->getComposicao() . "'";
			
		}
	
		if (strlen($Medicamento->getGenerico()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medicamento.generico = '" . $Medicamento->getGenerico() . "'";
			
		}
	
		if (strlen($Medicamento->getCusto()) > 0) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			$where .= "medicamento.custo = '" . $Medicamento->getCusto() . "'";
			
		}
	
		if (
			(is_array($Medicamento->getMedico()) && count($Medicamento->getMedico()) > 0)
			|| (is_object($Medicamento->getMedico()) && $Medicamento->getMedico()->getId() > 0)
		) {
			if (strlen($where) > 0) {
				$where .= " AND ";
			} else {
				$where = "WHERE ";
			}

			if (is_array($Medicamento->getMedico())) {
					$first = true;
					$where .= "(";
					foreach ($Medicamento->getMedico() as $medico) {
						if ( ! $first) {
							$where .= " OR ";
						}

						$where .= "medicamento.medico = " . $medico->getId();
						
						$first = false;
					}
					$where .= ")";
				} else {
					$where .= "medicamento.medico = " . $Medicamento->getMedico()->getId();
				}
			
		}
	
		$query = pg_query("SELECT
				medicamento.id AS medicamento_id,
				medicamento.nome AS medicamento_nome,medicamento.fabricante AS medicamento_fabricante,medicamento.composicao AS medicamento_composicao,medicamento.generico AS medicamento_generico,medicamento.custo AS medicamento_custo,
					medico.id AS medico_id, medico.nome AS medico_nome,medico.crm AS medico_crm,
				
				medicamento.created_at,
				medicamento.update_at
			FROM medicamento
			INNER JOIN medico ON medico.id = medicamento.medico
		" . $where . "ORDER BY medicamento.id");

		if ($query) {
			while ($row = pg_fetch_assoc($query)) {
				$Medicamento = new Medicamento();

				$Medicamento->setId($row["medicamento_id"]);
			
				$Medicamento->setNome($row["medicamento_nome"]);
			
				$Medicamento->setFabricante($row["medicamento_fabricante"]);
			
				$Medicamento->setComposicao($row["medicamento_composicao"]);
			
				$Medicamento->setGenerico($row["medicamento_generico"]);
			
				$Medicamento->setCusto($row["medicamento_custo"]);
			
				$Medico = new Medico();
				$Medico->setId($row["medico_id"]);
				$Medico->setNome($row["medico_nome"]);
				$Medico->setCrm($row["medico_crm"]);
				
				$Medicamento->setMedico($Medico);
			
				$result[] = $Medicamento;
			}
		}

		return $result;
	}
}

?>