<?php
	

	class Usuario
	{
		private $id;
		private $nome;
		private $email;
		private $email_relatorio;
		private $senha;
		private $crfa;
		

		public function __construct()
		{
			$this->nome = "";
			$this->email = "";
			$this->email_relatorio = "";
			$this->senha = "";
			$this->crfa = "";
			
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
	
		public function getEmail()
		{
			return $this->email;
		}

		public function setEmail($email)
		{
			$this->email = $email;
		}
	
		public function getEmail_relatorio()
		{
			return $this->email_relatorio;
		}

		public function setEmail_relatorio($email_relatorio)
		{
			$this->email_relatorio = $email_relatorio;
		}
	
		public function getSenha()
		{
			return $this->senha;
		}

		public function setSenha($senha)
		{
			$this->senha = $senha;
		}
	
		public function getCrfa()
		{
			return $this->crfa;
		}

		public function setCrfa($crfa)
		{
			$this->crfa = $crfa;
		}
	
	}

?>