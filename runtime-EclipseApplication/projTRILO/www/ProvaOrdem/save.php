<?php
	include_once "../class/ProvaOrdem.class.php";
	include_once "../class/ProvaOrdemDB.class.php";

	$ProvaOrdem = new ProvaOrdem();
	$ProvaOrdemDB = new ProvaOrdemDB();

	$json = json_decode($_POST['txtProva'], true);
		
		$id_prova = new Prova();
		$id_prova->setId($json[0]["id"]);
		$ProvaOrdem->setId_prova($id_prova);
	$ProvaOrdem->setOrdem($_POST["ordem"]);
		
	$ProvaOrdem->setPontuacao_maxima($_POST["pontuacao_maxima"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaOrdem->setId($_POST["id"]);
		$result = $ProvaOrdemDB->update($ProvaOrdem);
	} else {
		$result = $ProvaOrdemDB->add($ProvaOrdem);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>