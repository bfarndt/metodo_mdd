<?php
    include_once "class/PassoMetodo.class.php";
    include_once "class/Tarefa.class.php";
    include_once "class/TarefaDB.class.php";

    $PassoMetodo = new PassoMetodo();
    $Tarefa = new Tarefa();
    $TarefaDB = new TarefaDB();

    $PassoMetodo->setId($_POST["passoId"]);
    $PassoMetodo->setJaRealizada($_POST["taskDone"]);

    $Tarefa->setId($_POST["tarefaId"]);
    $Tarefa->addPassoMetodo($PassoMetodo);

    $Tarefa = $TarefaDB->updatePassoMetodo($Tarefa);
?>