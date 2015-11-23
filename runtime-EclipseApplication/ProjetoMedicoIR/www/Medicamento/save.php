<?php
	include_once "../class/Medicamento.class.php";
	include_once "../class/MedicamentoDB.class.php";

	$Medicamento = new Medicamento();
	$MedicamentoDB = new MedicamentoDB();

	$Medicamento->setNome($_POST["nome"]);
		
	$Medicamento->setFabricante($_POST["fabricante"]);
		
	$Medicamento->setComposicao($_POST["composicao"]);
		
	$Medicamento->setGenerico(isSet($_POST["generico"]));
		
	$Medicamento->setCusto($_POST["custo"]);
		
	$json = json_decode($_POST['txtMedico'], true);
		
		$medico = new Medico();
		$medico->setId($json[0]["id"]);
		$Medicamento->setMedico($medico);
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Medicamento->setId($_POST["id"]);
		$result = $MedicamentoDB->update($Medicamento);
	} else {
		$result = $MedicamentoDB->add($Medicamento);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>