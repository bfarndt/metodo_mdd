<?php
	include_once "../class/ProvaOrdemImagens.class.php";
	include_once "../class/ProvaOrdemImagensDB.class.php";
	
	$ProvaOrdemImagens = new ProvaOrdemImagens();
	$ProvaOrdemImagensDB = new ProvaOrdemImagensDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaOrdemImagens->setId($_GET["id"]);
		$result = $ProvaOrdemImagensDB->destroy($ProvaOrdemImagens);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>