<?php
	include_once "../class/Triagem.class.php";
	include_once "../class/TriagemDB.class.php";

	$Triagem = new Triagem();
	$TriagemDB = new TriagemDB();

	$json = json_decode($_POST['txtPaciente'], true);
		
		$id_paciente = new Paciente();
		$id_paciente->setId($json[0]["id"]);
		$Triagem->setId_paciente($id_paciente);
	$Triagem->setPontuacao($_POST["pontuacao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Triagem->setId($_POST["id"]);
		$result = $TriagemDB->update($Triagem);
	} else {
		$result = $TriagemDB->add($Triagem);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>