<?php
	include_once "../class/Usuario.class.php";
	include_once "../class/UsuarioDB.class.php";
	
	$Usuario = new Usuario();
	$UsuarioDB = new UsuarioDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Usuario->setId($_GET["id"]);
		$result = $UsuarioDB->destroy($Usuario);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>