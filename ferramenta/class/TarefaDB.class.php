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

    public function update($Tarefa)
    {
        $query = pg_query("UPDATE tarefa SET
                nome = " . (strlen($Tarefa->getNome()) < 1 ? "NULL" : "'" . $Tarefa->getNome() . "'") . ",
                descricao = " . (strlen($Tarefa->getDescricao()) < 1 ? "NULL" : "'" . $Tarefa->getDescricao() . "'") . ",
                tempo_gasto = " . (strlen($Tarefa->getTempoGasto()) < 1 ? "NULL" : "'" . $Tarefa->getTempoGasto() . "'") . ",
                tempo_estimado = " . (strlen($Tarefa->getTempoEstimado()) < 1 ? "NULL" : "'" . $Tarefa->getTempoEstimado() . "'") . ",
                prazo = " . (strlen($Tarefa->getPrazo()) != 10 ? "NULL" : "'" . $Tarefa->getPrazo() . "'") . ",
                engloba_modelo = " . $Tarefa->getEnglobaModelo() . ",
                engloba_dsl = " . $Tarefa->getEnglobaDSL() . ",
                engloba_template = " . $Tarefa->getEnglobaTemplate() . ",
                col_kanban = '" . $Tarefa->getColKanban() . "'
            WHERE id = " . $Tarefa->getId());

        $result = (pg_affected_rows($query) > 0);

        $query = pg_query("DELETE FROM tarefa_passos WHERE tarefa_id = " . $Tarefa->getId());

        $result = $result && (pg_affected_rows($query) > 0);

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

        return $result;
    }

    public function updateColKanban($Tarefa)
    {
        $query = pg_query("UPDATE tarefa SET
                col_kanban = '" . $Tarefa->getColKanban() . "'
            WHERE id = " . $Tarefa->getId());

        $result = (pg_affected_rows($query) > 0);

        return $result;
    }

    public function updatePassoMetodo($Tarefa)
    {
        foreach ($Tarefa->getPassosMetodo() as $PassoMetodo) {
            $query = pg_query("UPDATE tarefa_passos SET
                    ja_realizada = '" . $PassoMetodo->getJaRealizada() . "'
                WHERE passos_metodo_id = " . $PassoMetodo->getId() . " AND tarefa_id = " . $Tarefa->getId());

            if (pg_affected_rows($query) < 1) {
                return false;
            }
        }

        return true;
    }

    public function destroy($Tarefa)
    {
        $result = true;

        $query = pg_query("DELETE FROM tarefa_passos WHERE tarefa_id = " . $Tarefa->getId());

        $result = $result && (pg_affected_rows($query) > 0);

        $query = pg_query("DELETE FROM tarefa WHERE id = " . $Tarefa->getId());

        $result = $result && (pg_affected_rows($query) > 0);

        return $result;
    }

    public function getAll()
    {
        $result = array();

        $query = pg_query("SELECT
                id, nome, descricao, tempo_gasto, tempo_estimado, prazo, engloba_modelo,
                engloba_dsl, engloba_template, col_kanban
            FROM tarefa
            ORDER BY tarefa.id
        ");

        if ($query) {
            while ($row = pg_fetch_assoc($query)) {
                $Tarefa = new Tarefa();

                $Tarefa->setId($row['id']);
                $Tarefa->setNome($row['nome']);
                $Tarefa->setDescricao($row['descricao']);
                $Tarefa->setTempoGasto($row['tempo_gasto']);
                $Tarefa->setTempoEstimado($row['tempo_estimado']);
                $Tarefa->setPrazo($row['prazo']);
                $Tarefa->setEnglobaModelo($row['engloba_modelo']);
                $Tarefa->setEnglobaDSL($row['engloba_dsl']);
                $Tarefa->setEnglobaTemplate($row['engloba_template']);
                $Tarefa->setColKanban($row['col_kanban']);

                $query_passos = pg_query("SELECT
                        passos_metodo.id, passos_metodo.nome, passos_metodo.tipo, tarefa_passos.ja_realizada
                    FROM tarefa_passos
                    INNER JOIN passos_metodo ON passos_metodo.id = tarefa_passos.passos_metodo_id
                    WHERE tarefa_passos.tarefa_id = " . $Tarefa->getId() . "
                    ORDER BY passos_metodo.id
                ");

                if ($query_passos) {
                    while ($row_passos = pg_fetch_assoc($query_passos)) {
                        $PassoMetodo = new PassoMetodo();

                        $PassoMetodo->setId($row_passos["id"]);
                        $PassoMetodo->setNome($row_passos["nome"]);
                        $PassoMetodo->setTipo($row_passos["tipo"]);
                        $PassoMetodo->setJaRealizada($row_passos["ja_realizada"] == "t");

                        $Tarefa->addPassoMetodo($PassoMetodo);
                    }
                }

                $result[] = $Tarefa;
            }
        }

        return $result;
    }

    public function getLastId()
    {
        $result = 0;

        $query = pg_query("SELECT last_value FROM tarefa_id_seq");

        if ($query) {
            $result = pg_fetch_assoc($query);
            $result = $result["last_value"];
        }

        return $result;
    }
}

?>