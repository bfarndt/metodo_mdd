<?php
	include_once "../class/Prova.class.php";
	include_once "../class/ProvaDB.class.php";
	
	$Prova = new Prova();
	$ProvaDB = new ProvaDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Prova->setId($_GET["id"]);
		$result = $ProvaDB->destroy($Prova);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>