<?php
	include_once "../class/Prova.class.php";
	include_once "../class/ProvaDB.class.php";

	$Prova = new Prova();
	$ProvaDB = new ProvaDB();

	$Prova->setPontuacao_maxima($_POST["pontuacao_maxima"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Prova->setId($_POST["id"]);
		$result = $ProvaDB->update($Prova);
	} else {
		$result = $ProvaDB->add($Prova);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>