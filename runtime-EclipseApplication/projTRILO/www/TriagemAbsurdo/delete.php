<?php
	include_once "../class/TriagemAbsurdo.class.php";
	include_once "../class/TriagemAbsurdoDB.class.php";
	
	$TriagemAbsurdo = new TriagemAbsurdo();
	$TriagemAbsurdoDB = new TriagemAbsurdoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemAbsurdo->setId($_GET["id"]);
		$result = $TriagemAbsurdoDB->destroy($TriagemAbsurdo);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>