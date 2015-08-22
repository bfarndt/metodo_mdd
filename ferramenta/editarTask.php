<?php
    include_once "class/Tarefa.class.php";
    include_once "class/TarefaDB.class.php";

    $Tarefa = new Tarefa();
    $TarefaDB = new TarefaDB();

    $Tarefa->setId($_POST['tarefaId']);

    if (isSet($_POST['tarefaNome'])) {
        $Tarefa->setNome($_POST['tarefaNome']);
    }

    if (isSet($_POST['tempoGasto'])) {
        $Tarefa->setTempoGasto($_POST['tempoGasto']);
    }

    if (isSet($_POST['tempoEstimado'])) {
        $Tarefa->setTempoEstimado($_POST['tempoEstimado']);
    }

    if (isSet($_POST['tarefaDescricao'])) {
        $Tarefa->setDescricao($_POST['tarefaDescricao']);
    }

    if (isSet($_POST['tarefaPrazo'])) {
        $Tarefa->setPrazo($_POST['tarefaPrazo']);
    }

    if (isSet($_POST['tarefaEnglobaModelo'])) {
        $Tarefa->setEnglobaModelo($_POST['tarefaEnglobaModelo']);
    }

    if (isSet($_POST['tarefaEnglobaDSL'])) {
        $Tarefa->setEnglobaDSL($_POST['tarefaEnglobaDSL']);
    }

    if (isSet($_POST['tarefaEnglobaTemplate'])) {
        $Tarefa->setEnglobaTemplate($_POST['tarefaEnglobaTemplate']);
    }

    if (isSet($_POST['tarefaColKanban'])) {
        $Tarefa->setColKanban($_POST['tarefaColKanban']);
    }

    $Tarefa = $TarefaDB->update($Tarefa);
?>