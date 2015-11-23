<?php
	include_once "Prova.class.php";

	class ProvaNomeacao
	{
		private $id;
		private $id_prova;
		private $transcricao;
		private $imagem;
		private $nome;
		private $pontuacao_maxima;
		

		public function __construct()
		{
			$this->id_prova = new Prova();
			$this->transcricao = "";
			$this->imagem = "";
			$this->nome = "";
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
	
		public function getTranscricao()
		{
			return $this->transcricao;
		}

		public function setTranscricao($transcricao)
		{
			$this->transcricao = $transcricao;
		}
	
		public function getImagem()
		{
			return $this->imagem;
		}

		public function setImagem($imagem)
		{
			$this->imagem = $imagem;
		}
	
		public function getNome()
		{
			return $this->nome;
		}

		public function setNome($nome)
		{
			$this->nome = $nome;
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