<?php
	include_once "../class/ProvaAbsurdo.class.php";
	include_once "../class/ProvaAbsurdoDB.class.php";

	$ProvaAbsurdo = new ProvaAbsurdo();
	$ProvaAbsurdoDB = new ProvaAbsurdoDB();

	$json = json_decode($_POST['txtProva'], true);
		
		$id_prova = new Prova();
		$id_prova->setId($json[0]["id"]);
		$ProvaAbsurdo->setId_prova($id_prova);
	$ProvaAbsurdo->setImagem($_POST["imagem"]);
		
	$ProvaAbsurdo->setPontuacao_maxima($_POST["pontuacao_maxima"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaAbsurdo->setId($_POST["id"]);
		$result = $ProvaAbsurdoDB->update($ProvaAbsurdo);
	} else {
		$result = $ProvaAbsurdoDB->add($ProvaAbsurdo);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>