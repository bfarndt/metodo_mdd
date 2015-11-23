<?php
	include_once "../class/ProvaNomeacao.class.php";
	include_once "../class/ProvaNomeacaoDB.class.php";

	$ProvaNomeacao = new ProvaNomeacao();
	$ProvaNomeacaoDB = new ProvaNomeacaoDB();

	$json = json_decode($_POST['txtProva'], true);
		
		$id_prova = new Prova();
		$id_prova->setId($json[0]["id"]);
		$ProvaNomeacao->setId_prova($id_prova);
	$ProvaNomeacao->setTranscricao($_POST["transcricao"]);
		
	$ProvaNomeacao->setImagem($_POST["imagem"]);
		
	$ProvaNomeacao->setNome($_POST["nome"]);
		
	$ProvaNomeacao->setPontuacao_maxima($_POST["pontuacao_maxima"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$ProvaNomeacao->setId($_POST["id"]);
		$result = $ProvaNomeacaoDB->update($ProvaNomeacao);
	} else {
		$result = $ProvaNomeacaoDB->add($ProvaNomeacao);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>