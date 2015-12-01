<?php
	include_once "Medico.class.php";

	class Medicamento
	{
		private $id;
		private $nome;
		private $fabricante;
		private $composicao;
		private $generico;
		private $custo;
		private $medico;
		

		public function __construct()
		{
			$this->nome = "";
			$this->fabricante = "";
			$this->composicao = "";
			$this->generico = "";
			$this->custo = "";
			$this->medico = new Medico();
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getNome()
		{
			return $this->nome;
		}

		public function setNome($nome)
		{
			$this->nome = $nome;
		}
	
		public function getFabricante()
		{
			return $this->fabricante;
		}

		public function setFabricante($fabricante)
		{
			$this->fabricante = $fabricante;
		}
	
		public function getComposicao()
		{
			return $this->composicao;
		}

		public function setComposicao($composicao)
		{
			$this->composicao = $composicao;
		}
	
		public function getGenerico()
		{
			return $this->generico;
		}

		public function setGenerico($generico)
		{
			$this->generico = $generico;
		}
	
		public function getCusto()
		{
			return $this->custo;
		}
		
		public function getCustoFormated()
		{
			return 'R$ ' . number_format($this->custo, 2, ',', '.');
		}

		public function setCusto($custo)
		{
			if (stripos($custo, 'r$') !== false) {
				$custo = str_ireplace('r$', '', $custo);
				$custo = str_ireplace('.', '', $custo);
				$custo = str_ireplace(',', '.', $custo);
				$custo = trim($custo);
			}

			$this->custo = $custo;
		}
	
		public function getMedico()
		{
			return $this->medico;
		}

		public function setMedico($medico)
		{
			$this->medico = $medico;
		}
	
	}

?>