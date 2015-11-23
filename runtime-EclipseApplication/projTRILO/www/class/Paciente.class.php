<?php
	

	class Paciente
	{
		private $id;
		private $foto;
		private $nome;
		private $nome_mae;
		private $telefone;
		private $data_nasc;
		private $qtde_semanas_nasc;
		private $problema_parto;
		private $parto_normal;
		private $gemeos;
		private $inflamacao_ouvido;
		private $problemas_respiratorios;
		private $teve_desnutricao;
		private $anemia;
		private $problema_familia_ling;
		private $data_cadastro;
		

		public function __construct()
		{
			$this->foto = "";
			$this->nome = "";
			$this->nome_mae = "";
			$this->telefone = "";
			$this->data_nasc = "";
			$this->qtde_semanas_nasc = "";
			$this->problema_parto = "";
			$this->parto_normal = "";
			$this->gemeos = "";
			$this->inflamacao_ouvido = "";
			$this->problemas_respiratorios = "";
			$this->teve_desnutricao = "";
			$this->anemia = "";
			$this->problema_familia_ling = "";
			$this->data_cadastro = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getFoto()
		{
			return $this->foto;
		}

		public function setFoto($foto)
		{
			$this->foto = $foto;
		}
	
		public function getNome()
		{
			return $this->nome;
		}

		public function setNome($nome)
		{
			$this->nome = $nome;
		}
	
		public function getNome_mae()
		{
			return $this->nome_mae;
		}

		public function setNome_mae($nome_mae)
		{
			$this->nome_mae = $nome_mae;
		}
	
		public function getTelefone()
		{
			return $this->telefone;
		}

		public function setTelefone($telefone)
		{
			$this->telefone = $telefone;
		}
	
		public function getData_nasc()
		{
			return $this->data_nasc;
		}

		public function setData_nasc($data_nasc)
		{
			$this->data_nasc = $data_nasc;
		}
	
		public function getQtde_semanas_nasc()
		{
			return $this->qtde_semanas_nasc;
		}

		public function setQtde_semanas_nasc($qtde_semanas_nasc)
		{
			$this->qtde_semanas_nasc = $qtde_semanas_nasc;
		}
	
		public function getProblema_parto()
		{
			return $this->problema_parto;
		}

		public function setProblema_parto($problema_parto)
		{
			$this->problema_parto = $problema_parto;
		}
	
		public function getParto_normal()
		{
			return $this->parto_normal;
		}

		public function setParto_normal($parto_normal)
		{
			$this->parto_normal = $parto_normal;
		}
	
		public function getGemeos()
		{
			return $this->gemeos;
		}

		public function setGemeos($gemeos)
		{
			$this->gemeos = $gemeos;
		}
	
		public function getInflamacao_ouvido()
		{
			return $this->inflamacao_ouvido;
		}

		public function setInflamacao_ouvido($inflamacao_ouvido)
		{
			$this->inflamacao_ouvido = $inflamacao_ouvido;
		}
	
		public function getProblemas_respiratorios()
		{
			return $this->problemas_respiratorios;
		}

		public function setProblemas_respiratorios($problemas_respiratorios)
		{
			$this->problemas_respiratorios = $problemas_respiratorios;
		}
	
		public function getTeve_desnutricao()
		{
			return $this->teve_desnutricao;
		}

		public function setTeve_desnutricao($teve_desnutricao)
		{
			$this->teve_desnutricao = $teve_desnutricao;
		}
	
		public function getAnemia()
		{
			return $this->anemia;
		}

		public function setAnemia($anemia)
		{
			$this->anemia = $anemia;
		}
	
		public function getProblema_familia_ling()
		{
			return $this->problema_familia_ling;
		}

		public function setProblema_familia_ling($problema_familia_ling)
		{
			$this->problema_familia_ling = $problema_familia_ling;
		}
	
		public function getData_cadastro()
		{
			return $this->data_cadastro;
		}

		public function setData_cadastro($data_cadastro)
		{
			$this->data_cadastro = $data_cadastro;
		}
	
	}

?>