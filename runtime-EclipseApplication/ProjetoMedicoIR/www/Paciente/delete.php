<?php
	include_once "../class/Paciente.class.php";
	include_once "../class/PacienteDB.class.php";
	
	$Paciente = new Paciente();
	$PacienteDB = new PacienteDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Paciente->setId($_GET["id"]);
		$result = $PacienteDB->destroy($Paciente);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>