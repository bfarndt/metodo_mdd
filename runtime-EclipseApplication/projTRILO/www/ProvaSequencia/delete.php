<?php
	include_once "../class/ProvaSequencia.class.php";
	include_once "../class/ProvaSequenciaDB.class.php";
	
	$ProvaSequencia = new ProvaSequencia();
	$ProvaSequenciaDB = new ProvaSequenciaDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaSequencia->setId($_GET["id"]);
		$result = $ProvaSequenciaDB->destroy($ProvaSequencia);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>