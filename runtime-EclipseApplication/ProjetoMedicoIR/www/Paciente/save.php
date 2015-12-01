<?php
	include_once "../class/Paciente.class.php";
	include_once "../class/PacienteDB.class.php";

	$Paciente = new Paciente();
	$PacienteDB = new PacienteDB();

	$Paciente->setNome($_POST["nome"]);
		
	$Paciente->setCpf($_POST["cpf"]);
		
	$Paciente->setData_nasc($_POST["data_nasc"]);
		
	$Paciente->setEndereco($_POST["endereco"]);
		
	$Paciente->setCidade($_POST["cidade"]);
		
	$Paciente->setEstado($_POST["estado"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Paciente->setId($_POST["id"]);
		$result = $PacienteDB->update($Paciente);
	} else {
		$result = $PacienteDB->add($Paciente);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>