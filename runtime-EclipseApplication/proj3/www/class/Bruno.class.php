<?php
	include_once "Daniel.class.php";

	class Bruno
	{
		private $id;
		private $cpf;
		private $endereco;
		private $nascimento;
		private $mensalidade;
		private $orientador;
		

		public function __construct()
		{
			$this->cpf = "";
			$this->endereco = "";
			$this->nascimento = "";
			$this->mensalidade = "";
			$this->orientador = array();
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getCpf()
		{
			return $this->cpf;
		}

		public function setCpf($cpf)
		{
			$this->cpf = $cpf;
		}
	
		public function getEndereco()
		{
			return $this->endereco;
		}

		public function setEndereco($endereco)
		{
			$this->endereco = $endereco;
		}
	
		public function getNascimento()
		{
			return $this->nascimento;
		}

		public function setNascimento($nascimento)
		{
			$this->nascimento = $nascimento;
		}
	
		public function getMensalidade()
		{
			return $this->mensalidade;
		}
		
		public function getMensalidadeFormated()
		{
			return 'R$ ' . number_format($this->mensalidade, 2, ',', '.');
		}

		public function setMensalidade($mensalidade)
		{
			if (stripos($mensalidade, 'r$') !== false) {
				$mensalidade = str_ireplace('r$', '', $mensalidade);
				$mensalidade = str_ireplace('.', '', $mensalidade);
				$mensalidade = str_ireplace(',', '.', $mensalidade);
				$mensalidade = trim($mensalidade);
			}

			$this->mensalidade = $mensalidade;
		}
	
		public function getOrientador()
		{
			return $this->orientador;
		}
		
		public function addOrientador($orientador)
		{
			$this->orientador[] = $orientador;
		}
		
		public function removeOrientador($orientador)
		{
			foreach ($this->orientador as $key => $value) {
				if ($value->getId() == $orientador->getId()) {
					unset($this->orientador[$key]);
				}
			}
		}
		
		public function removeAllOrientador()
		{
			$this->orientador = array();
		}
	
	}

?>