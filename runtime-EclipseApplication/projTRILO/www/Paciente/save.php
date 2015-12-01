<?php
	include_once "../class/Paciente.class.php";
	include_once "../class/PacienteDB.class.php";

	$Paciente = new Paciente();
	$PacienteDB = new PacienteDB();

	$Paciente->setFoto($_POST["foto"]);
		
	$Paciente->setNome($_POST["nome"]);
		
	$Paciente->setNome_mae($_POST["nome_mae"]);
		
	$Paciente->setTelefone($_POST["telefone"]);
		
	$Paciente->setData_nasc($_POST["data_nasc"]);
		
	$Paciente->setQtde_semanas_nasc($_POST["qtde_semanas_nasc"]);
		
	$Paciente->setProblema_parto($_POST["problema_parto"]);
		
	$Paciente->setParto_normal(isSet($_POST["parto_normal"]));
		
	$Paciente->setGemeos(isSet($_POST["gemeos"]));
		
	$Paciente->setInflamacao_ouvido(isSet($_POST["inflamacao_ouvido"]));
		
	$Paciente->setProblemas_respiratorios(isSet($_POST["problemas_respiratorios"]));
		
	$Paciente->setTeve_desnutricao(isSet($_POST["teve_desnutricao"]));
		
	$Paciente->setAnemia(isSet($_POST["anemia"]));
		
	$Paciente->setProblema_familia_ling($_POST["problema_familia_ling"]);
		
	$Paciente->setData_cadastro($_POST["data_cadastro"]);
		
	

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