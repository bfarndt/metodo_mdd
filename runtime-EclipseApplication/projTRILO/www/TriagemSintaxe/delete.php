<?php
	include_once "../class/TriagemSintaxe.class.php";
	include_once "../class/TriagemSintaxeDB.class.php";
	
	$TriagemSintaxe = new TriagemSintaxe();
	$TriagemSintaxeDB = new TriagemSintaxeDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemSintaxe->setId($_GET["id"]);
		$result = $TriagemSintaxeDB->destroy($TriagemSintaxe);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>