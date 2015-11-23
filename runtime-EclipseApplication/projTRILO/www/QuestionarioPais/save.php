<?php
	include_once "../class/QuestionarioPais.class.php";
	include_once "../class/QuestionarioPaisDB.class.php";

	$QuestionarioPais = new QuestionarioPais();
	$QuestionarioPaisDB = new QuestionarioPaisDB();

	$json = json_decode($_POST['txtPaciente'], true);
		
		$id_paciente = new Paciente();
		$id_paciente->setId($json[0]["id"]);
		$QuestionarioPais->setId_paciente($id_paciente);
	$QuestionarioPais->setTroca_sons(isSet($_POST["troca_sons"]));
		
	$QuestionarioPais->setTroca_sons_mesma_idade(isSet($_POST["troca_sons_mesma_idade"]));
		
	$QuestionarioPais->setForma_frases(isSet($_POST["forma_frases"]));
		
	$QuestionarioPais->setForma_frases_qtde_palavras($_POST["forma_frases_qtde_palavras"]);
		
	$QuestionarioPais->setPerguntas_pronomes(isSet($_POST["perguntas_pronomes"]));
		
	$QuestionarioPais->setFrase_utiliza_artigos(isSet($_POST["frase_utiliza_artigos"]));
		
	$QuestionarioPais->setFrase_correta_tempo_verbal(isSet($_POST["frase_correta_tempo_verbal"]));
		
	$QuestionarioPais->setCompreende_palavras_frases(isSet($_POST["compreende_palavras_frases"]));
		
	$QuestionarioPais->setEscolhe_corretamente_palavras(isSet($_POST["escolhe_corretamente_palavras"]));
		
	$QuestionarioPais->setConta_historia_coerencia(isSet($_POST["conta_historia_coerencia"]));
		
	$QuestionarioPais->setFaz_pergunta_coerente(isSet($_POST["faz_pergunta_coerente"]));
		
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$QuestionarioPais->setId($_POST["id"]);
		$result = $QuestionarioPaisDB->update($QuestionarioPais);
	} else {
		$result = $QuestionarioPaisDB->add($QuestionarioPais);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>