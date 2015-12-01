<?php
	

	class Paciente
	{
		private $id;
		private $nome;
		private $cpf;
		private $data_nasc;
		private $endereco;
		private $cidade;
		private $estado;
		

		public function __construct()
		{
			$this->nome = "";
			$this->cpf = "";
			$this->data_nasc = "";
			$this->endereco = "";
			$this->cidade = "";
			$this->estado = "";
			
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
	
		public function getCpf()
		{
			return $this->cpf;
		}

		public function setCpf($cpf)
		{
			$this->cpf = $cpf;
		}
	
		public function getData_nasc()
		{
			return $this->data_nasc;
		}

		public function setData_nasc($data_nasc)
		{
			$this->data_nasc = $data_nasc;
		}
	
		public function getEndereco()
		{
			return $this->endereco;
		}

		public function setEndereco($endereco)
		{
			$this->endereco = $endereco;
		}
	
		public function getCidade()
		{
			return $this->cidade;
		}

		public function setCidade($cidade)
		{
			$this->cidade = $cidade;
		}
	
		public function getEstado()
		{
			return $this->estado;
		}

		public function setEstado($estado)
		{
			$this->estado = $estado;
		}
	
	}

?>