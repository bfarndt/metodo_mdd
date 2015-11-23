<?php
	include_once "../class/ProvaNomeacao.class.php";
	include_once "../class/ProvaNomeacaoDB.class.php";
	
	$ProvaNomeacao = new ProvaNomeacao();
	$ProvaNomeacaoDB = new ProvaNomeacaoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaNomeacao->setId($_GET["id"]);
		$result = $ProvaNomeacaoDB->destroy($ProvaNomeacao);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>