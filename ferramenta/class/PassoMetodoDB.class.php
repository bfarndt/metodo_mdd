<?php

include_once "DB.class.php";
include_once "PassoMetodo.class.php";

class PassoMetodoDB extends DB
{

    public function getAll()
    {
        $result = array();

        $query = pg_query("SELECT id, nome, tipo
            FROM passos_metodo
            ORDER BY passos_metodo.id
        ");

        if ($query) {
            while ($row = pg_fetch_assoc($query)) {
                $PassoMetodo = new PassoMetodo();

                $PassoMetodo->setId($row["id"]);
                $PassoMetodo->setNome($row["nome"]);
                $PassoMetodo->setTipo($row["tipo"]);

                $result[] = $PassoMetodo;
            }
        }

        return $result;
    }

    public function get($PassoMetodo)
    {
        $result = array();

        $where = "";

        if ($PassoMetodo->getId() > 0) {
            if (strlen($where) > 0) {
                $where .= " AND ";
            } else {
                $where = "WHERE ";
            }

            $where .= "passos_metodo.id = " . $PassoMetodo->getId();

        }

        if (strlen($PassoMetodo->getNome()) > 0) {
            if (strlen($where) > 0) {
                $where .= " AND ";
            } else {
                $where = "WHERE ";
            }

            $where .= "passos_metodo.nome = '" . $PassoMetodo->getNome() . "'";

        }

        if (strlen($PassoMetodo->getTipo()) > 0) {
            if (strlen($where) > 0) {
                $where .= " AND ";
            } else {
                $where = "WHERE ";
            }

            $where .= "passos_metodo.tipo = '" . $PassoMetodo->getTipo() . "'";

        }

        $query = pg_query("SELECT id, nome, tipo
            FROM passos_metodo

        " . $where . "ORDER BY passos_metodo.id");

        if ($query) {
            while ($row = pg_fetch_assoc($query)) {
                $PassoMetodo = new PassoMetodo();

                $PassoMetodo->setId($row["id"]);
                $PassoMetodo->setNome($row["nome"]);
                $PassoMetodo->setTipo($row["tipo"]);

                $result[] = $PassoMetodo;
            }
        }

        return $result;
    }
}

?>