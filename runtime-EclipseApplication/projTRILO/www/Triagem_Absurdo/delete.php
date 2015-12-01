<?php
	include_once "../class/Triagem_Absurdo.class.php";
	include_once "../class/Triagem_AbsurdoDB.class.php";
	
	$Triagem_Absurdo = new Triagem_Absurdo();
	$Triagem_AbsurdoDB = new Triagem_AbsurdoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Triagem_Absurdo->setId($_GET["id"]);
		$result = $Triagem_AbsurdoDB->destroy($Triagem_Absurdo);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>