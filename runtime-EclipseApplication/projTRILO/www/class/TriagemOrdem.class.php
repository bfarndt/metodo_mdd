<?php
	include_once "Triagem.class.php";include_once "ProvaOrdem.class.php";

	class TriagemOrdem
	{
		private $id;
		private $id_triagem;
		private $id_prova_ordem;
		private $acertou;
		private $pontuacao;
		

		public function __construct()
		{
			$this->id_triagem = new Triagem();
			$this->id_prova_ordem = new ProvaOrdem();
			$this->acertou = "";
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
	
		public function getId_prova_ordem()
		{
			return $this->id_prova_ordem;
		}

		public function setId_prova_ordem($id_prova_ordem)
		{
			$this->id_prova_ordem = $id_prova_ordem;
		}
	
		public function getAcertou()
		{
			return $this->acertou;
		}

		public function setAcertou($acertou)
		{
			$this->acertou = $acertou;
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