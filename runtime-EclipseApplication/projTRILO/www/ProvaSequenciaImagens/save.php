<?php
	include_once "../class/ProvaSequenciaImagens.class.php";
	include_once "../class/ProvaSequenciaImagensDB.class.php";

	$ProvaSequenciaImagens = new ProvaSequenciaImagens();
	$ProvaSequenciaImagensDB = new ProvaSequenciaImagensDB();

	$json = json_decode($_POST['txtProvaSequencia'], true);
		
		$id_prova_sequencia = new ProvaSequencia();
		$id_prova_sequencia->setId($json[0]["id"]);
		$ProvaSequenciaImagens->setId_prova_sequencia($id_prova_sequencia);
	$ProvaSequenciaImagens->setImagem($_POST["imagem"]);
		
	$ProvaSequenciaImagens->setOrdem($_POST["ordem"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaSequenciaImagens->setId($_POST["id"]);
		$result = $ProvaSequenciaImagensDB->update($ProvaSequenciaImagens);
	} else {
		$result = $ProvaSequenciaImagensDB->add($ProvaSequenciaImagens);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>