<?php
	

	class Prova
	{
		private $id;
		private $pontuacao_maxima;
		

		public function __construct()
		{
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