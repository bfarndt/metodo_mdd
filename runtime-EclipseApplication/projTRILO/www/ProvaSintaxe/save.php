<?php
	include_once "../class/ProvaSintaxe.class.php";
	include_once "../class/ProvaSintaxeDB.class.php";

	$ProvaSintaxe = new ProvaSintaxe();
	$ProvaSintaxeDB = new ProvaSintaxeDB();

	$json = json_decode($_POST['txtProva'], true);
		
		$id_prova = new Prova();
		$id_prova->setId($json[0]["id"]);
		$ProvaSintaxe->setId_prova($id_prova);
	$ProvaSintaxe->setImagem($_POST["imagem"]);
		
	$ProvaSintaxe->setNome($_POST["nome"]);
		
	$ProvaSintaxe->setPontuacao_maxima($_POST["pontuacao_maxima"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaSintaxe->setId($_POST["id"]);
		$result = $ProvaSintaxeDB->update($ProvaSintaxe);
	} else {
		$result = $ProvaSintaxeDB->add($ProvaSintaxe);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>