<?php
    session_start();

    include_once "class/UsuarioDB.class.php";

    $Usuario = new Usuario();
    $UsuarioDB = new UsuarioDB();

    $Usuario->setEmail($_POST['txtEmail']);
    $Usuario->setSenha($_POST['txtSenha']);

    $Usuario = $UsuarioDB->login($Usuario);

    if ($Usuario === false) {
        ?><META http-equiv="refresh" content="0;URL=login.php"><?php
    } else {
        $_SESSION['user_kanban_id'] = $Usuario->getId();
    }
?>
<META http-equiv="refresh" content="0;URL=index.php">