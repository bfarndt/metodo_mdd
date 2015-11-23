<?php
	include_once "../class/TriagemSequenciaNarrativa.class.php";
	include_once "../class/TriagemSequenciaNarrativaDB.class.php";
	
	$TriagemSequenciaNarrativa = new TriagemSequenciaNarrativa();
	$TriagemSequenciaNarrativaDB = new TriagemSequenciaNarrativaDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemSequenciaNarrativa->setId($_GET["id"]);
		$result = $TriagemSequenciaNarrativaDB->destroy($TriagemSequenciaNarrativa);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>