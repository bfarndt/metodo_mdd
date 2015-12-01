<?php
	include_once "../class/TriagemOrdem.class.php";
	include_once "../class/TriagemOrdemDB.class.php";

	$TriagemOrdem = new TriagemOrdem();
	$TriagemOrdemDB = new TriagemOrdemDB();

	$json = json_decode($_POST['txtTriagem'], true);
		
		$id_triagem = new Triagem();
		$id_triagem->setId($json[0]["id"]);
		$TriagemOrdem->setId_triagem($id_triagem);
	$json = json_decode($_POST['txtProvaOrdem'], true);
		
		$id_prova_ordem = new ProvaOrdem();
		$id_prova_ordem->setId($json[0]["id"]);
		$TriagemOrdem->setId_prova_ordem($id_prova_ordem);
	$TriagemOrdem->setAcertou(isSet($_POST["acertou"]));
		
	$TriagemOrdem->setPontuacao($_POST["pontuacao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemOrdem->setId($_POST["id"]);
		$result = $TriagemOrdemDB->update($TriagemOrdem);
	} else {
		$result = $TriagemOrdemDB->add($TriagemOrdem);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>