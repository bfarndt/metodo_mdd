<?php
    include_once "class/Tarefa.class.php";
    include_once "class/TarefaDB.class.php";

    $Tarefa = new Tarefa();
    $TarefaDB = new TarefaDB();

    $Tarefa->setNome($_POST['tarefaNome']);
    $Tarefa->setTempoGasto($_POST['tempoGasto']);
    $Tarefa->setTempoEstimado($_POST['tempoEstimado']);
    $Tarefa->setDescricao($_POST['tarefaDescricao']);
    $Tarefa->setPrazo($_POST['tarefaPrazo']);
    $Tarefa->setEnglobaModelo($_POST['tarefaEnglobaModelo']);
    $Tarefa->setEnglobaCriacao($_POST['tarefaEnglobaCriacao']);
    $Tarefa->setEnglobaDSL($_POST['tarefaEnglobaDSL']);
    $Tarefa->setEnglobaTemplate($_POST['tarefaEnglobaTemplate']);
    $Tarefa->setColKanban($_POST['tarefaColKanban']);

    $Tarefa = $TarefaDB->add($Tarefa);
    echo json_encode(array("id" => $Tarefa->getId()));
?>