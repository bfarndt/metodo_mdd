<?php
    include_once "class/Tarefa.class.php";
    include_once "class/TarefaDB.class.php";

    $Tarefa = new Tarefa();
    $TarefaDB = new TarefaDB();

    $Tarefa->setId($_POST['tarefaId']);
    $Tarefa->setColKanban($_POST['tarefaColKanban']);

    $Tarefa = $TarefaDB->updateColKanban($Tarefa);
?>