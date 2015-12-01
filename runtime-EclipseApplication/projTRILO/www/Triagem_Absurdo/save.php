<?php
	include_once "../class/Triagem_Absurdo.class.php";
	include_once "../class/Triagem_AbsurdoDB.class.php";

	$Triagem_Absurdo = new Triagem_Absurdo();
	$Triagem_AbsurdoDB = new Triagem_AbsurdoDB();

	$json = json_decode($_POST['txtTriagem'], true);
		
		$id_triagem = new Triagem();
		$id_triagem->setId($json[0]["id"]);
		$Triagem_Absurdo->setId_triagem($id_triagem);
	$json = json_decode($_POST['txtProvaAbsurdo'], true);
		
		$id_prova_absurdo = new ProvaAbsurdo();
		$id_prova_absurdo->setId($json[0]["id"]);
		$Triagem_Absurdo->setId_prova_absurdo($id_prova_absurdo);
	$Triagem_Absurdo->setIdentificou($_POST["identificou"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Triagem_Absurdo->setId($_POST["id"]);
		$result = $Triagem_AbsurdoDB->update($Triagem_Absurdo);
	} else {
		$result = $Triagem_AbsurdoDB->add($Triagem_Absurdo);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>