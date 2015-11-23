<?php
	include_once "../class/TriagemSequenciaNarrativa.class.php";
	include_once "../class/TriagemSequenciaNarrativaDB.class.php";

	$TriagemSequenciaNarrativa = new TriagemSequenciaNarrativa();
	$TriagemSequenciaNarrativaDB = new TriagemSequenciaNarrativaDB();

	$json = json_decode($_POST['txtTriagemSequencia'], true);
		
		$id_triagem_sequencia = new TriagemSequencia();
		$id_triagem_sequencia->setId($json[0]["id"]);
		$TriagemSequenciaNarrativa->setId_triagem_sequencia($id_triagem_sequencia);
	$TriagemSequenciaNarrativa->setAcao($_POST["acao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemSequenciaNarrativa->setId($_POST["id"]);
		$result = $TriagemSequenciaNarrativaDB->update($TriagemSequenciaNarrativa);
	} else {
		$result = $TriagemSequenciaNarrativaDB->add($TriagemSequenciaNarrativa);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>