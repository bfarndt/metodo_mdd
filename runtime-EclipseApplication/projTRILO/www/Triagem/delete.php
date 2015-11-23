<?php
	include_once "../class/Triagem.class.php";
	include_once "../class/TriagemDB.class.php";
	
	$Triagem = new Triagem();
	$TriagemDB = new TriagemDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Triagem->setId($_GET["id"]);
		$result = $TriagemDB->destroy($Triagem);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>