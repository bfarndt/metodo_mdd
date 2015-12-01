<?php
	include_once "Triagem.class.php";include_once "ProvaNomeacao.class.php";

	class TriagemNomeacao
	{
		private $id;
		private $id_triagem;
		private $id_prova_nomeacao;
		private $nomeacao;
		private $pontuacao;
		

		public function __construct()
		{
			$this->id_triagem = new Triagem();
			$this->id_prova_nomeacao = new ProvaNomeacao();
			$this->nomeacao = "";
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
	
		public function getId_prova_nomeacao()
		{
			return $this->id_prova_nomeacao;
		}

		public function setId_prova_nomeacao($id_prova_nomeacao)
		{
			$this->id_prova_nomeacao = $id_prova_nomeacao;
		}
	
		public function getNomeacao()
		{
			return $this->nomeacao;
		}

		public function setNomeacao($nomeacao)
		{
			$this->nomeacao = $nomeacao;
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