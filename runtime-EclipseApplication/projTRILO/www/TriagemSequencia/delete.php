<?php
	include_once "../class/TriagemSequencia.class.php";
	include_once "../class/TriagemSequenciaDB.class.php";
	
	$TriagemSequencia = new TriagemSequencia();
	$TriagemSequenciaDB = new TriagemSequenciaDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemSequencia->setId($_GET["id"]);
		$result = $TriagemSequenciaDB->destroy($TriagemSequencia);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>