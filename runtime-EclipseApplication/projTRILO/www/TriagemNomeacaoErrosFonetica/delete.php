<?php
	include_once "../class/TriagemNomeacaoErrosFonetica.class.php";
	include_once "../class/TriagemNomeacaoErrosFoneticaDB.class.php";
	
	$TriagemNomeacaoErrosFonetica = new TriagemNomeacaoErrosFonetica();
	$TriagemNomeacaoErrosFoneticaDB = new TriagemNomeacaoErrosFoneticaDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$TriagemNomeacaoErrosFonetica->setId($_GET["id"]);
		$result = $TriagemNomeacaoErrosFoneticaDB->destroy($TriagemNomeacaoErrosFonetica);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>