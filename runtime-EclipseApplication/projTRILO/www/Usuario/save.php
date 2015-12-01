<?php
	include_once "../class/Usuario.class.php";
	include_once "../class/UsuarioDB.class.php";

	$Usuario = new Usuario();
	$UsuarioDB = new UsuarioDB();

	$Usuario->setNome($_POST["nome"]);
		
	$Usuario->setEmail($_POST["email"]);
		
	$Usuario->setEmail_relatorio($_POST["email_relatorio"]);
		
	$Usuario->setSenha($_POST["senha"]);
		
	$Usuario->setCrfa($_POST["crfa"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Usuario->setId($_POST["id"]);
		$result = $UsuarioDB->update($Usuario);
	} else {
		$result = $UsuarioDB->add($Usuario);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>