<?php
	include_once "Paciente.class.php";

	class QuestionarioPais
	{
		private $id;
		private $id_paciente;
		private $troca_sons;
		private $troca_sons_mesma_idade;
		private $forma_frases;
		private $forma_frases_qtde_palavras;
		private $perguntas_pronomes;
		private $frase_utiliza_artigos;
		private $frase_correta_tempo_verbal;
		private $compreende_palavras_frases;
		private $escolhe_corretamente_palavras;
		private $conta_historia_coerencia;
		private $faz_pergunta_coerente;
		

		public function __construct()
		{
			$this->id_paciente = new Paciente();
			$this->troca_sons = "";
			$this->troca_sons_mesma_idade = "";
			$this->forma_frases = "";
			$this->forma_frases_qtde_palavras = "";
			$this->perguntas_pronomes = "";
			$this->frase_utiliza_artigos = "";
			$this->frase_correta_tempo_verbal = "";
			$this->compreende_palavras_frases = "";
			$this->escolhe_corretamente_palavras = "";
			$this->conta_historia_coerencia = "";
			$this->faz_pergunta_coerente = "";
			
		}

		public function getId()
		{
			return $this->id;
		}

		public function setId($id)
		{
			$this->id = $id;
		}

	
		public function getId_paciente()
		{
			return $this->id_paciente;
		}

		public function setId_paciente($id_paciente)
		{
			$this->id_paciente = $id_paciente;
		}
	
		public function getTroca_sons()
		{
			return $this->troca_sons;
		}

		public function setTroca_sons($troca_sons)
		{
			$this->troca_sons = $troca_sons;
		}
	
		public function getTroca_sons_mesma_idade()
		{
			return $this->troca_sons_mesma_idade;
		}

		public function setTroca_sons_mesma_idade($troca_sons_mesma_idade)
		{
			$this->troca_sons_mesma_idade = $troca_sons_mesma_idade;
		}
	
		public function getForma_frases()
		{
			return $this->forma_frases;
		}

		public function setForma_frases($forma_frases)
		{
			$this->forma_frases = $forma_frases;
		}
	
		public function getForma_frases_qtde_palavras()
		{
			return $this->forma_frases_qtde_palavras;
		}

		public function setForma_frases_qtde_palavras($forma_frases_qtde_palavras)
		{
			$this->forma_frases_qtde_palavras = $forma_frases_qtde_palavras;
		}
	
		public function getPerguntas_pronomes()
		{
			return $this->perguntas_pronomes;
		}

		public function setPerguntas_pronomes($perguntas_pronomes)
		{
			$this->perguntas_pronomes = $perguntas_pronomes;
		}
	
		public function getFrase_utiliza_artigos()
		{
			return $this->frase_utiliza_artigos;
		}

		public function setFrase_utiliza_artigos($frase_utiliza_artigos)
		{
			$this->frase_utiliza_artigos = $frase_utiliza_artigos;
		}
	
		public function getFrase_correta_tempo_verbal()
		{
			return $this->frase_correta_tempo_verbal;
		}

		public function setFrase_correta_tempo_verbal($frase_correta_tempo_verbal)
		{
			$this->frase_correta_tempo_verbal = $frase_correta_tempo_verbal;
		}
	
		public function getCompreende_palavras_frases()
		{
			return $this->compreende_palavras_frases;
		}

		public function setCompreende_palavras_frases($compreende_palavras_frases)
		{
			$this->compreende_palavras_frases = $compreende_palavras_frases;
		}
	
		public function getEscolhe_corretamente_palavras()
		{
			return $this->escolhe_corretamente_palavras;
		}

		public function setEscolhe_corretamente_palavras($escolhe_corretamente_palavras)
		{
			$this->escolhe_corretamente_palavras = $escolhe_corretamente_palavras;
		}
	
		public function getConta_historia_coerencia()
		{
			return $this->conta_historia_coerencia;
		}

		public function setConta_historia_coerencia($conta_historia_coerencia)
		{
			$this->conta_historia_coerencia = $conta_historia_coerencia;
		}
	
		public function getFaz_pergunta_coerente()
		{
			return $this->faz_pergunta_coerente;
		}

		public function setFaz_pergunta_coerente($faz_pergunta_coerente)
		{
			$this->faz_pergunta_coerente = $faz_pergunta_coerente;
		}
	
	}

?>