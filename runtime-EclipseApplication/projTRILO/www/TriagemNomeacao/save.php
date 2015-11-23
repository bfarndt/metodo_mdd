<?php
	include_once "../class/TriagemNomeacao.class.php";
	include_once "../class/TriagemNomeacaoDB.class.php";

	$TriagemNomeacao = new TriagemNomeacao();
	$TriagemNomeacaoDB = new TriagemNomeacaoDB();

	$json = json_decode($_POST['txtTriagem'], true);
		
		$id_triagem = new Triagem();
		$id_triagem->setId($json[0]["id"]);
		$TriagemNomeacao->setId_triagem($id_triagem);
	$json = json_decode($_POST['txtProvaNomeacao'], true);
		
		$id_prova_nomeacao = new ProvaNomeacao();
		$id_prova_nomeacao->setId($json[0]["id"]);
		$TriagemNomeacao->setId_prova_nomeacao($id_prova_nomeacao);
	$TriagemNomeacao->setNomeacao($_POST["nomeacao"]);
		
	$TriagemNomeacao->setPontuacao($_POST["pontuacao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemNomeacao->setId($_POST["id"]);
		$result = $TriagemNomeacaoDB->update($TriagemNomeacao);
	} else {
		$result = $TriagemNomeacaoDB->add($TriagemNomeacao);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>