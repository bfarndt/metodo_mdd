<?php
	include_once "../class/Medico.class.php";
	include_once "../class/MedicoDB.class.php";

	$Medico = new Medico();
	$MedicoDB = new MedicoDB();

	$Medico->setNome($_POST["nome"]);
		
	$Medico->setCrm($_POST["crm"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Medico->setId($_POST["id"]);
		$result = $MedicoDB->update($Medico);
	} else {
		$result = $MedicoDB->add($Medico);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>