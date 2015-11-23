<?php
	include_once "../class/ProvaSintaxe.class.php";
	include_once "../class/ProvaSintaxeDB.class.php";
	
	$ProvaSintaxe = new ProvaSintaxe();
	$ProvaSintaxeDB = new ProvaSintaxeDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaSintaxe->setId($_GET["id"]);
		$result = $ProvaSintaxeDB->destroy($ProvaSintaxe);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>