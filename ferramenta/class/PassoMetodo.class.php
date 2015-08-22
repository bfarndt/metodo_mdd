<?php

    class PassoMetodo
    {
        private $id;
        private $nome;
        private $tipo;
        private $ja_realizada;

        public function __construct()
        {
            $this->id = 0;
            $this->nome = "";
            $this->tipo = "";
            $this->ja_realizada = false;
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

        public function getTipo()
        {
            return $this->tipo;
        }

        public function setTipo($tipo)
        {
            $this->tipo = $tipo;
        }

        public function getJaRealizada()
        {
            return $this->ja_realizada;
        }

        public function setJaRealizada($ja_realizada)
        {
            $this->ja_realizada = $ja_realizada;
        }

    }

?>