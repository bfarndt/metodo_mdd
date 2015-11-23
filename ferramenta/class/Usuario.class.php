<?php
    if ( ! isSet($_SESSION))
    {
        session_start();
    }

    class Usuario
    {
        private $id;
        private $nome;
        private $email;
        private $senha;

        public function __construct()
        {
            $this->id = 0;
            $this->nome = "";
            $this->email = "";
            $this->senha = false;
        }

        public function getUsuarioSession()
        {
            if (isSet($_SESSION["user_kanban_id"])) {
                $this->setId($_SESSION["user_kanban_id"]);
            }

            return $this;
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

        public function getEmail()
        {
            return $this->email;
        }

        public function setEmail($email)
        {
            $this->email = $email;
        }

        public function getSenha()
        {
            return $this->senha;
        }

        public function setSenha($senha)
        {
            $this->senha = md5($senha);
        }

    }

?>