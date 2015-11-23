<?php
	include_once "Triagem.class.php";include_once "ProvaSequencia.class.php";

	class TriagemSequencia
	{
		private $id;
		private $id_triagem;
		private $id_prova_sequencia;
		private $ordenou_corretamente;
		private $narrou_sequencia;
		private $narrativa_coerente;
		private $precisou_ajuda;
		private $pontuacao;
		

		public function __construct()
		{
			$this->id_triagem = new Triagem();
			$this->id_prova_sequencia = new ProvaSequencia();
			$this->ordenou_corretamente = "";
			$this->narrou_sequencia = "";
			$this->narrativa_coerente = "";
			$this->precisou_ajuda = "";
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
	
		public function getId_prova_sequencia()
		{
			return $this->id_prova_sequencia;
		}

		public function setId_prova_sequencia($id_prova_sequencia)
		{
			$this->id_prova_sequencia = $id_prova_sequencia;
		}
	
		public function getOrdenou_corretamente()
		{
			return $this->ordenou_corretamente;
		}

		public function setOrdenou_corretamente($ordenou_corretamente)
		{
			$this->ordenou_corretamente = $ordenou_corretamente;
		}
	
		public function getNarrou_sequencia()
		{
			return $this->narrou_sequencia;
		}

		public function setNarrou_sequencia($narrou_sequencia)
		{
			$this->narrou_sequencia = $narrou_sequencia;
		}
	
		public function getNarrativa_coerente()
		{
			return $this->narrativa_coerente;
		}

		public function setNarrativa_coerente($narrativa_coerente)
		{
			$this->narrativa_coerente = $narrativa_coerente;
		}
	
		public function getPrecisou_ajuda()
		{
			return $this->precisou_ajuda;
		}

		public function setPrecisou_ajuda($precisou_ajuda)
		{
			$this->precisou_ajuda = $precisou_ajuda;
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