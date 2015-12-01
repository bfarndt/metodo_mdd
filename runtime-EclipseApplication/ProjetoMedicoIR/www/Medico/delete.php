<?php
	include_once "../class/Medico.class.php";
	include_once "../class/MedicoDB.class.php";
	
	$Medico = new Medico();
	$MedicoDB = new MedicoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Medico->setId($_GET["id"]);
		$result = $MedicoDB->destroy($Medico);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>