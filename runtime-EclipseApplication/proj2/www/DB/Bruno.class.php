<?php

class Bruno
{
	
		private $cpf;
	
		private $endereco;
	
	
		public function getCpf()
		{
			return $this->cpf;
		}
		
		public function setCpf($cpf)
		{
			$this->cpf = cpf;
		}
	
		public function getEndereco()
		{
			return $this->endereco;
		}
		
		public function setEndereco($endereco)
		{
			$this->endereco = endereco;
		}
	
}

?>