<?php
	include_once "TriagemNomeacao.class.php";

	class TriagemNomeacaoErrosFonetica
	{
		private $id;
		private $id_triagem_nomeacao;
		private $fonema;
		private $tipo_troca;
		private $substituicao;
		

		public function __construct()
		{
			$this->id_triagem_nomeacao = new TriagemNomeacao();
			$this->fonema = "";
			$this->tipo_troca = "";
			$this->substituicao = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_triagem_nomeacao()
		{
			return $this->id_triagem_nomeacao;
		}

		public function setId_triagem_nomeacao($id_triagem_nomeacao)
		{
			$this->id_triagem_nomeacao = $id_triagem_nomeacao;
		}
	
		public function getFonema()
		{
			return $this->fonema;
		}

		public function setFonema($fonema)
		{
			$this->fonema = $fonema;
		}
	
		public function getTipo_troca()
		{
			return $this->tipo_troca;
		}

		public function setTipo_troca($tipo_troca)
		{
			$this->tipo_troca = $tipo_troca;
		}
	
		public function getSubstituicao()
		{
			return $this->substituicao;
		}

		public function setSubstituicao($substituicao)
		{
			$this->substituicao = $substituicao;
		}
	
	}

?>