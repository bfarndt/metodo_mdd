<?php
	include_once "../class/Medicamento.class.php";
	include_once "../class/MedicamentoDB.class.php";
	
	$Medicamento = new Medicamento();
	$MedicamentoDB = new MedicamentoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Medicamento->setId($_GET["id"]);
		$result = $MedicamentoDB->destroy($Medicamento);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>