<?php
	include_once "../class/TriagemNomeacaoErrosFonetica.class.php";
	include_once "../class/TriagemNomeacaoErrosFoneticaDB.class.php";

	$TriagemNomeacaoErrosFonetica = new TriagemNomeacaoErrosFonetica();
	$TriagemNomeacaoErrosFoneticaDB = new TriagemNomeacaoErrosFoneticaDB();

	$json = json_decode($_POST['txtTriagemNomeacao'], true);
		
		$id_triagem_nomeacao = new TriagemNomeacao();
		$id_triagem_nomeacao->setId($json[0]["id"]);
		$TriagemNomeacaoErrosFonetica->setId_triagem_nomeacao($id_triagem_nomeacao);
	$TriagemNomeacaoErrosFonetica->setFonema($_POST["fonema"]);
		
	$TriagemNomeacaoErrosFonetica->setTipo_troca($_POST["tipo_troca"]);
		
	$TriagemNomeacaoErrosFonetica->setSubstituicao($_POST["substituicao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemNomeacaoErrosFonetica->setId($_POST["id"]);
		$result = $TriagemNomeacaoErrosFoneticaDB->update($TriagemNomeacaoErrosFonetica);
	} else {
		$result = $TriagemNomeacaoErrosFoneticaDB->add($TriagemNomeacaoErrosFonetica);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>