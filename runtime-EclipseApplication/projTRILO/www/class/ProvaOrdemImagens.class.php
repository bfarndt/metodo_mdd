<?php
	include_once "ProvaOrdem.class.php";

	class ProvaOrdemImagens
	{
		private $id;
		private $id_prova_ordem;
		private $imagem;
		private $correta;
		

		public function __construct()
		{
			$this->id_prova_ordem = new ProvaOrdem();
			$this->imagem = "";
			$this->correta = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_prova_ordem()
		{
			return $this->id_prova_ordem;
		}

		public function setId_prova_ordem($id_prova_ordem)
		{
			$this->id_prova_ordem = $id_prova_ordem;
		}
	
		public function getImagem()
		{
			return $this->imagem;
		}

		public function setImagem($imagem)
		{
			$this->imagem = $imagem;
		}
	
		public function getCorreta()
		{
			return $this->correta;
		}

		public function setCorreta($correta)
		{
			$this->correta = $correta;
		}
	
	}

?>