<?php
	

	class Daniel
	{
		private $id;
		private $cpf;
		private $endereco;
		

		public function __construct()
		{
			$this->cpf = "";
			$this->endereco = "";
			
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
	
	}

?>