<?php

    include_once "PassoMetodo.class.php";
    include_once "Usuario.class.php";

    class Tarefa
    {
        private $id;
        private $nome;
        private $descricao;
        private $tempo_gasto;
        private $tempo_estimado;
        private $prazo;
        private $engloba_modelo;
        private $engloba_criacao;
        private $engloba_dsl;
        private $engloba_template;
        private $col_kanban;
        private $PassosMetodo;
        private $Usuario;

        public function __construct()
        {
            $this->id = 0;
            $this->nome = "";
            $this->descricao = "";
            $this->tempo_gasto = "";
            $this->tempo_estimado = "";
            $this->prazo = "";
            $this->engloba_modelo = false;
            $this->engloba_criacao = false;
            $this->engloba_dsl = false;
            $this->engloba_template = false;
            $this->col_kanban = "";
            $this->PassosMetodo = array();
            $this->Usuario = new Usuario();
            $this->Usuario = $this->Usuario->getUsuarioSession();
        }

        public function getId()
        {
            return $this->id;
        }

        public function setId($id)
        {
            $this->id = $id;
        }

        public function getNome()
        {
            return $this->nome;
        }

        public function setNome($nome)
        {
            $this->nome = $nome;
        }

        public function getDescricao()
        {
            return $this->descricao;
        }

        public function setDescricao($descricao)
        {
            $this->descricao = $descricao;
        }

        public function getTempoGasto()
        {
            return $this->tempo_gasto;
        }

        public function setTempoGasto($tempo_gasto)
        {
            $this->tempo_gasto = $tempo_gasto;
        }

        public function getTempoEstimado()
        {
            return $this->tempo_estimado;
        }

        public function setTempoEstimado($tempo_estimado)
        {
            $this->tempo_estimado = $tempo_estimado;
        }

        public function getPrazo()
        {
            return $this->prazo;
        }

        public function setPrazo($prazo)
        {
            if (strlen($prazo) != 10) {
                $prazo = '';
            }

            $this->prazo = $prazo;
        }

        public function getEnglobaModelo()
        {
            return $this->engloba_modelo;
        }

        public function setEnglobaModelo($engloba_modelo)
        {
            $this->engloba_modelo = $engloba_modelo;
        }

        public function getEnglobaCriacao()
        {
            return $this->engloba_criacao;
        }

        public function setEnglobaCriacao($engloba_criacao)
        {
            $this->engloba_criacao = $engloba_criacao;
        }

        public function getEnglobaDSL()
        {
            return $this->engloba_dsl;
        }

        public function setEnglobaDSL($engloba_dsl)
        {
            $this->engloba_dsl = $engloba_dsl;
        }

        public function getEnglobaTemplate()
        {
            return $this->engloba_template;
        }

        public function setEnglobaTemplate($engloba_template)
        {
            $this->engloba_template = $engloba_template;
        }

        public function getColKanban()
        {
            return $this->col_kanban;
        }

        public function setColKanban($col_kanban)
        {
            $this->col_kanban = $col_kanban;
        }

        public function getPassosMetodo()
        {
            return $this->PassosMetodo;
        }

        public function addPassoMetodo($PassoMetodo)
        {
            $this->PassosMetodo[] = $PassoMetodo;
        }

        public function clearPassosMetodo()
        {
            $this->PassosMetodo = array();
        }

        public function getUsuario()
        {
            return $this->Usuario;
        }

    }

?>