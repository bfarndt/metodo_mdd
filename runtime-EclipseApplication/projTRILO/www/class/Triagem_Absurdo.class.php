<?php
	include_once "Triagem.class.php";include_once "ProvaAbsurdo.class.php";

	class Triagem_Absurdo
	{
		private $id;
		private $id_triagem;
		private $id_prova_absurdo;
		private $identificou;
		

		public function __construct()
		{
			$this->id_triagem = new Triagem();
			$this->id_prova_absurdo = new ProvaAbsurdo();
			$this->identificou = "";
			
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
	
		public function getId_prova_absurdo()
		{
			return $this->id_prova_absurdo;
		}

		public function setId_prova_absurdo($id_prova_absurdo)
		{
			$this->id_prova_absurdo = $id_prova_absurdo;
		}
	
		public function getIdentificou()
		{
			return $this->identificou;
		}

		public function setIdentificou($identificou)
		{
			$this->identificou = $identificou;
		}
	
	}

?>