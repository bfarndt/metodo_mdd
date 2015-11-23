<?php

include_once "DB.class.php";
include_once "Usuario.class.php";

class UsuarioDB extends DB
{

    public function login($Usuario)
    {
        $query = pg_query("SELECT id, nome, email
            FROM usuario
            WHERE email = '" . $Usuario->getEmail() . "'
                AND senha = '" . $Usuario->getSenha() . "'
                AND ativo
        ");

        if (pg_num_rows($query) > 0) {
            $row = pg_fetch_assoc($query);

            $Usuario->setId($row["id"]);
            $Usuario->setNome($row["nome"]);
        } else {
            return false;
        }

        return $Usuario;
    }

    public function getUsuarioById($id)
    {
        $Usuario = new Usuario();

        $query = pg_query("SELECT id, nome, email
            FROM usuario
            WHERE id = " . $id . "
                AND ativo
        ");

        if (pg_num_rows($query) > 0) {
            $row = pg_fetch_assoc($query);

            $Usuario->setId($row["id"]);
            $Usuario->setNome($row["nome"]);
            $Usuario->setEmail($row["email"]);
        } else {
            return false;
        }

        return $Usuario;
    }
}

?>