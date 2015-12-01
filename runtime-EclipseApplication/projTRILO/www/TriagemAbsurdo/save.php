<?php
	include_once "../class/TriagemAbsurdo.class.php";
	include_once "../class/TriagemAbsurdoDB.class.php";

	$TriagemAbsurdo = new TriagemAbsurdo();
	$TriagemAbsurdoDB = new TriagemAbsurdoDB();

	$json = json_decode($_POST['txtTriagem'], true);
		
		$id_triagem = new Triagem();
		$id_triagem->setId($json[0]["id"]);
		$TriagemAbsurdo->setId_triagem($id_triagem);
	$json = json_decode($_POST['txtProvaAbsurdo'], true);
		
		$id_prova_absurdo = new ProvaAbsurdo();
		$id_prova_absurdo->setId($json[0]["id"]);
		$TriagemAbsurdo->setId_prova_absurdo($id_prova_absurdo);
	$TriagemAbsurdo->setIdentificou($_POST["identificou"]);
		
	$TriagemAbsurdo->setPontuacao($_POST["pontuacao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemAbsurdo->setId($_POST["id"]);
		$result = $TriagemAbsurdoDB->update($TriagemAbsurdo);
	} else {
		$result = $TriagemAbsurdoDB->add($TriagemAbsurdo);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>