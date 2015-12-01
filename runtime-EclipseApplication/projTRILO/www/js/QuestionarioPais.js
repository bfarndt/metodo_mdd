function deleteQuestionarioPais(id, pageBack) {
	window.location = "/QuestionarioPais/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateQuestionarioPais(id) {
	$("#id").val(id);
	
		$("#tablePacienteformAdd").bootstrapTable('uncheckAll');
		$("#tablePacienteformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#QuestionarioPais_" + id + "_id_paciente").val()]});
		$("#txtPacienteformAdd").val(JSON.stringify($("#tablePacienteformAdd").bootstrapTable('getSelections')));
	$("#troca_sons").val($("#QuestionarioPais_" + id + "_troca_sons").val());
	$("#troca_sons_mesma_idade").val($("#QuestionarioPais_" + id + "_troca_sons_mesma_idade").val());
	$("#forma_frases").val($("#QuestionarioPais_" + id + "_forma_frases").val());
	$("#forma_frases_qtde_palavras").val($("#QuestionarioPais_" + id + "_forma_frases_qtde_palavras").val());
	$("#perguntas_pronomes").val($("#QuestionarioPais_" + id + "_perguntas_pronomes").val());
	$("#frase_utiliza_artigos").val($("#QuestionarioPais_" + id + "_frase_utiliza_artigos").val());
	$("#frase_correta_tempo_verbal").val($("#QuestionarioPais_" + id + "_frase_correta_tempo_verbal").val());
	$("#compreende_palavras_frases").val($("#QuestionarioPais_" + id + "_compreende_palavras_frases").val());
	$("#escolhe_corretamente_palavras").val($("#QuestionarioPais_" + id + "_escolhe_corretamente_palavras").val());
	$("#conta_historia_coerencia").val($("#QuestionarioPais_" + id + "_conta_historia_coerencia").val());
	$("#faz_pergunta_coerente").val($("#QuestionarioPais_" + id + "_faz_pergunta_coerente").val());
	
	
	$("#formAddQuestionarioPais").modal();

	return true;
}

function addQuestionarioPais() {
	$("#id").val("");
	$("#tablePacienteformAdd").bootstrapTable('uncheckAll');
		$("#txtPacienteformAdd").val("");
	$("#troca_sons").val("");
	$("#troca_sons_mesma_idade").val("");
	$("#forma_frases").val("");
	$("#forma_frases_qtde_palavras").val("");
	$("#perguntas_pronomes").val("");
	$("#frase_utiliza_artigos").val("");
	$("#frase_correta_tempo_verbal").val("");
	$("#compreende_palavras_frases").val("");
	$("#escolhe_corretamente_palavras").val("");
	$("#conta_historia_coerencia").val("");
	$("#faz_pergunta_coerente").val("");
	
	
	$("#formAddQuestionarioPais").modal();

	return true;
}