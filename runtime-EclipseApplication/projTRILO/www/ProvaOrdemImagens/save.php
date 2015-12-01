<?php
	include_once "../class/ProvaOrdemImagens.class.php";
	include_once "../class/ProvaOrdemImagensDB.class.php";

	$ProvaOrdemImagens = new ProvaOrdemImagens();
	$ProvaOrdemImagensDB = new ProvaOrdemImagensDB();

	$json = json_decode($_POST['txtProvaOrdem'], true);
		
		$id_prova_ordem = new ProvaOrdem();
		$id_prova_ordem->setId($json[0]["id"]);
		$ProvaOrdemImagens->setId_prova_ordem($id_prova_ordem);
	$ProvaOrdemImagens->setImagem($_POST["imagem"]);
		
	$ProvaOrdemImagens->setCorreta(isSet($_POST["correta"]));
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaOrdemImagens->setId($_POST["id"]);
		$result = $ProvaOrdemImagensDB->update($ProvaOrdemImagens);
	} else {
		$result = $ProvaOrdemImagensDB->add($ProvaOrdemImagens);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>