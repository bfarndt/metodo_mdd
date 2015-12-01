<?php
	include_once "../class/TriagemOrdem.class.php";
	include_once "../class/TriagemOrdemDB.class.php";
	
	$TriagemOrdem = new TriagemOrdem();
	$TriagemOrdemDB = new TriagemOrdemDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemOrdem->setId($_GET["id"]);
		$result = $TriagemOrdemDB->destroy($TriagemOrdem);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>