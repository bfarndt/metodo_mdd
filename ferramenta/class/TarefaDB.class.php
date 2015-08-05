<?php

include_once "DB.class.php";
include_once "Tarefa.class.php";
include_once "PassoMetodo.class.php";
include_once "PassoMetodoDB.class.php";

class TarefaDB extends DB
{

    private function addPassoMetodo($Tarefa, $PassosMetodo)
    {
        foreach ($PassosMetodo as $key => $PassoMetodo) {
            $query = pg_query("INSERT INTO tarefa_passos(
                    passos_metodo_id,
                    tarefa_id
                ) VALUES(
                    " . $PassoMetodo->getId() . ",
                    " . $Tarefa->getId() . "
                );
            ");

            if (pg_affected_rows($query) < 1) {
                return false;
            }
        }

        return true;
    }

    public function add($Tarefa)
    {
        $query = pg_query("INSERT INTO tarefa(
                nome, descricao, tempo_gasto, tempo_estimado, prazo, engloba_modelo, engloba_dsl, engloba_template, col_kanban
            ) VALUES (
                " . (strlen($Tarefa->getNome()) < 1 ? "NULL" : "'" . $Tarefa->getNome() . "'") . ",
                " . (strlen($Tarefa->getDescricao()) < 1 ? "NULL" : "'" . $Tarefa->getDescricao() . "'") . ",
                " . (strlen($Tarefa->getTempoGasto()) < 1 ? "NULL" : "'" . $Tarefa->getTempoGasto() . "'") . ",
                " . (strlen($Tarefa->getTempoEstimado()) < 1 ? "NULL" : "'" . $Tarefa->getTempoEstimado() . "'") . ",
                " . (strlen($Tarefa->getPrazo()) != 10 ? "NULL" : "'" . $Tarefa->getPrazo() . "'") . ",
                " . $Tarefa->getEnglobaModelo() . ",
                " . $Tarefa->getEnglobaDSL() . ",
                " . $Tarefa->getEnglobaTemplate() . ",
                '" . $Tarefa->getColKanban() . "'
            ) RETURNING id;
        ");

        if (pg_affected_rows($query) < 1) {
            return false;
        }

        $id = pg_fetch_assoc($query);
        $Tarefa->setId($id['id']);

        $PassoMetodo = new PassoMetodo();
        $PassoMetodoDB = new PassoMetodoDB();

        if ($Tarefa->getEnglobaModelo() == "true") {
            $PassoMetodo->setTipo("model");
            $PassosMetodo = $PassoMetodoDB->get($PassoMetodo);

            if ( ! $this->addPassoMetodo($Tarefa, $PassosMetodo)) {
                return false;
            }
        }

        if ($Tarefa->getEnglobaDSL() == "true") {
            $PassoMetodo->setTipo("dsl");
            $PassosMetodo = $PassoMetodoDB->get($PassoMetodo);

            if ( ! $this->addPassoMetodo($Tarefa, $PassosMetodo)) {
                return false;
            }
        }

        if ($Tarefa->getEnglobaTemplate() == "true") {
            $PassoMetodo->setTipo("template");
            $PassosMetodo = $PassoMetodoDB->get($PassoMetodo);

            if ( ! $this->addPassoMetodo($Tarefa, $PassosMetodo)) {
                return false;
            }
        }

        return $Tarefa;
    }
}

?>