<?php
	include_once "TriagemSequencia.class.php";

	class TriagemSequenciaNarrativa
	{
		private $id;
		private $id_triagem_sequencia;
		private $acao;
		

		public function __construct()
		{
			$this->id_triagem_sequencia = new TriagemSequencia();
			$this->acao = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_triagem_sequencia()
		{
			return $this->id_triagem_sequencia;
		}

		public function setId_triagem_sequencia($id_triagem_sequencia)
		{
			$this->id_triagem_sequencia = $id_triagem_sequencia;
		}
	
		public function getAcao()
		{
			return $this->acao;
		}

		public function setAcao($acao)
		{
			$this->acao = $acao;
		}
	
	}

?>