<?php
	include_once "../class/TriagemNomeacao.class.php";
	include_once "../class/TriagemNomeacaoDB.class.php";
	
	$TriagemNomeacao = new TriagemNomeacao();
	$TriagemNomeacaoDB = new TriagemNomeacaoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemNomeacao->setId($_GET["id"]);
		$result = $TriagemNomeacaoDB->destroy($TriagemNomeacao);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>