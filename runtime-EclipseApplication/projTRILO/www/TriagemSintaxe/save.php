<?php
	include_once "../class/TriagemSintaxe.class.php";
	include_once "../class/TriagemSintaxeDB.class.php";

	$TriagemSintaxe = new TriagemSintaxe();
	$TriagemSintaxeDB = new TriagemSintaxeDB();

	$json = json_decode($_POST['txtTriagem'], true);
		
		$id_triagem = new Triagem();
		$id_triagem->setId($json[0]["id"]);
		$TriagemSintaxe->setId_triagem($id_triagem);
	$json = json_decode($_POST['txtProvaSintaxe'], true);
		
		$id_prova_sintaxe = new ProvaSintaxe();
		$id_prova_sintaxe->setId($json[0]["id"]);
		$TriagemSintaxe->setId_prova_sintaxe($id_prova_sintaxe);
	$TriagemSintaxe->setFrase($_POST["frase"]);
		
	$TriagemSintaxe->setFrase_formulada($_POST["frase_formulada"]);
		
	$TriagemSintaxe->setUtilizou_artigos($_POST["utilizou_artigos"]);
		
	$TriagemSintaxe->setUtilizou_elem_ligacao($_POST["utilizou_elem_ligacao"]);
		
	$TriagemSintaxe->setUtilizou_adjetivos($_POST["utilizou_adjetivos"]);
		
	$TriagemSintaxe->setPontuacao($_POST["pontuacao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemSintaxe->setId($_POST["id"]);
		$result = $TriagemSintaxeDB->update($TriagemSintaxe);
	} else {
		$result = $TriagemSintaxeDB->add($TriagemSintaxe);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>