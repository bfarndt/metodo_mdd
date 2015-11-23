<?php
	include_once "../class/TriagemSequencia.class.php";
	include_once "../class/TriagemSequenciaDB.class.php";

	$TriagemSequencia = new TriagemSequencia();
	$TriagemSequenciaDB = new TriagemSequenciaDB();

	$json = json_decode($_POST['txtTriagem'], true);
		
		$id_triagem = new Triagem();
		$id_triagem->setId($json[0]["id"]);
		$TriagemSequencia->setId_triagem($id_triagem);
	$json = json_decode($_POST['txtProvaSequencia'], true);
		
		$id_prova_sequencia = new ProvaSequencia();
		$id_prova_sequencia->setId($json[0]["id"]);
		$TriagemSequencia->setId_prova_sequencia($id_prova_sequencia);
	$TriagemSequencia->setOrdenou_corretamente(isSet($_POST["ordenou_corretamente"]));
		
	$TriagemSequencia->setNarrou_sequencia(isSet($_POST["narrou_sequencia"]));
		
	$TriagemSequencia->setNarrativa_coerente(isSet($_POST["narrativa_coerente"]));
		
	$TriagemSequencia->setPrecisou_ajuda($_POST["precisou_ajuda"]);
		
	$TriagemSequencia->setPontuacao($_POST["pontuacao"]);
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$TriagemSequencia->setId($_POST["id"]);
		$result = $TriagemSequenciaDB->update($TriagemSequencia);
	} else {
		$result = $TriagemSequenciaDB->add($TriagemSequencia);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>