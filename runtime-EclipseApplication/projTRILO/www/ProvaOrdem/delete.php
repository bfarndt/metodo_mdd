<?php
	include_once "../class/ProvaOrdem.class.php";
	include_once "../class/ProvaOrdemDB.class.php";
	
	$ProvaOrdem = new ProvaOrdem();
	$ProvaOrdemDB = new ProvaOrdemDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaOrdem->setId($_GET["id"]);
		$result = $ProvaOrdemDB->destroy($ProvaOrdem);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>