<?php
	include_once "../class/ProvaSequencia.class.php";
	include_once "../class/ProvaSequenciaDB.class.php";

	$ProvaSequencia = new ProvaSequencia();
	$ProvaSequenciaDB = new ProvaSequenciaDB();

	$json = json_decode($_POST['txtProva'], true);
		
		$id_prova = new Prova();
		$id_prova->setId($json[0]["id"]);
		$ProvaSequencia->setId_prova($id_prova);
	$ProvaSequencia->setPontuacao_maxima($_POST["pontuacao_maxima"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaSequencia->setId($_POST["id"]);
		$result = $ProvaSequenciaDB->update($ProvaSequencia);
	} else {
		$result = $ProvaSequenciaDB->add($ProvaSequencia);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>