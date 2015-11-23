<?php
	include_once "Prova.class.php";

	class ProvaSequencia
	{
		private $id;
		private $id_prova;
		private $pontuacao_maxima;
		

		public function __construct()
		{
			$this->id_prova = new Prova();
			$this->pontuacao_maxima = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_prova()
		{
			return $this->id_prova;
		}

		public function setId_prova($id_prova)
		{
			$this->id_prova = $id_prova;
		}
	
		public function getPontuacao_maxima()
		{
			return $this->pontuacao_maxima;
		}

		public function setPontuacao_maxima($pontuacao_maxima)
		{
			$this->pontuacao_maxima = $pontuacao_maxima;
		}
	
	}

?>