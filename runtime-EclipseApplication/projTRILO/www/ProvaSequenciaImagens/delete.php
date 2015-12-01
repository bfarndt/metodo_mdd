<?php
	include_once "../class/ProvaSequenciaImagens.class.php";
	include_once "../class/ProvaSequenciaImagensDB.class.php";
	
	$ProvaSequenciaImagens = new ProvaSequenciaImagens();
	$ProvaSequenciaImagensDB = new ProvaSequenciaImagensDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaSequenciaImagens->setId($_GET["id"]);
		$result = $ProvaSequenciaImagensDB->destroy($ProvaSequenciaImagens);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>