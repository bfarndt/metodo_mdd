<?php
	include_once "ProvaSequencia.class.php";

	class ProvaSequenciaImagens
	{
		private $id;
		private $id_prova_sequencia;
		private $imagem;
		private $ordem;
		

		public function __construct()
		{
			$this->id_prova_sequencia = new ProvaSequencia();
			$this->imagem = "";
			$this->ordem = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_prova_sequencia()
		{
			return $this->id_prova_sequencia;
		}

		public function setId_prova_sequencia($id_prova_sequencia)
		{
			$this->id_prova_sequencia = $id_prova_sequencia;
		}
	
		public function getImagem()
		{
			return $this->imagem;
		}

		public function setImagem($imagem)
		{
			$this->imagem = $imagem;
		}
	
		public function getOrdem()
		{
			return $this->ordem;
		}

		public function setOrdem($ordem)
		{
			$this->ordem = $ordem;
		}
	
	}

?>