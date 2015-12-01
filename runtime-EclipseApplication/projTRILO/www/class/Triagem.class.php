<?php
	include_once "Paciente.class.php";

	class Triagem
	{
		private $id;
		private $id_paciente;
		private $pontuacao;
		

		public function __construct()
		{
			$this->id_paciente = new Paciente();
			$this->pontuacao = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_paciente()
		{
			return $this->id_paciente;
		}

		public function setId_paciente($id_paciente)
		{
			$this->id_paciente = $id_paciente;
		}
	
		public function getPontuacao()
		{
			return $this->pontuacao;
		}

		public function setPontuacao($pontuacao)
		{
			$this->pontuacao = $pontuacao;
		}
	
	}

?>