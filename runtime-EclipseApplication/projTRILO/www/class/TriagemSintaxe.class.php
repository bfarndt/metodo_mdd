<?php
	include_once "Triagem.class.php";include_once "ProvaSintaxe.class.php";

	class TriagemSintaxe
	{
		private $id;
		private $id_triagem;
		private $id_prova_sintaxe;
		private $frase;
		private $frase_formulada;
		private $utilizou_artigos;
		private $utilizou_elem_ligacao;
		private $utilizou_adjetivos;
		private $pontuacao;
		

		public function __construct()
		{
			$this->id_triagem = new Triagem();
			$this->id_prova_sintaxe = new ProvaSintaxe();
			$this->frase = "";
			$this->frase_formulada = "";
			$this->utilizou_artigos = "";
			$this->utilizou_elem_ligacao = "";
			$this->utilizou_adjetivos = "";
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

	
		public function getId_triagem()
		{
			return $this->id_triagem;
		}

		public function setId_triagem($id_triagem)
		{
			$this->id_triagem = $id_triagem;
		}
	
		public function getId_prova_sintaxe()
		{
			return $this->id_prova_sintaxe;
		}

		public function setId_prova_sintaxe($id_prova_sintaxe)
		{
			$this->id_prova_sintaxe = $id_prova_sintaxe;
		}
	
		public function getFrase()
		{
			return $this->frase;
		}

		public function setFrase($frase)
		{
			$this->frase = $frase;
		}
	
		public function getFrase_formulada()
		{
			return $this->frase_formulada;
		}

		public function setFrase_formulada($frase_formulada)
		{
			$this->frase_formulada = $frase_formulada;
		}
	
		public function getUtilizou_artigos()
		{
			return $this->utilizou_artigos;
		}

		public function setUtilizou_artigos($utilizou_artigos)
		{
			$this->utilizou_artigos = $utilizou_artigos;
		}
	
		public function getUtilizou_elem_ligacao()
		{
			return $this->utilizou_elem_ligacao;
		}

		public function setUtilizou_elem_ligacao($utilizou_elem_ligacao)
		{
			$this->utilizou_elem_ligacao = $utilizou_elem_ligacao;
		}
	
		public function getUtilizou_adjetivos()
		{
			return $this->utilizou_adjetivos;
		}

		public function setUtilizou_adjetivos($utilizou_adjetivos)
		{
			$this->utilizou_adjetivos = $utilizou_adjetivos;
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