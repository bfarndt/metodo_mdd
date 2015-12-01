<?php
	

	class Medico
	{
		private $id;
		private $nome;
		private $crm;
		

		public function __construct()
		{
			$this->nome = "";
			$this->crm = "";
			
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
	
		public function getCrm()
		{
			return $this->crm;
		}

		public function setCrm($crm)
		{
			$this->crm = $crm;
		}
	
	}

?>