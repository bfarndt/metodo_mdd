function deleteTriagemSequencia(id, pageBack) {
	window.location = "/TriagemSequencia/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemSequencia(id) {
	$("#id").val(id);
	
		$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemSequencia_" + id + "_id_triagem").val()]});
		$("#txtTriagemformAdd").val(JSON.stringify($("#tableTriagemformAdd").bootstrapTable('getSelections')));
	
		$("#tableProvaSequenciaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaSequenciaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemSequencia_" + id + "_id_prova_sequencia").val()]});
		$("#txtProvaSequenciaformAdd").val(JSON.stringify($("#tableProvaSequenciaformAdd").bootstrapTable('getSelections')));
	$("#ordenou_corretamente").val($("#TriagemSequencia_" + id + "_ordenou_corretamente").val());
	$("#narrou_sequencia").val($("#TriagemSequencia_" + id + "_narrou_sequencia").val());
	$("#narrativa_coerente").val($("#TriagemSequencia_" + id + "_narrativa_coerente").val());
	$("#precisou_ajuda").val($("#TriagemSequencia_" + id + "_precisou_ajuda").val());
	$("#pontuacao").val($("#TriagemSequencia_" + id + "_pontuacao").val());
	
	
	$("#formAddTriagemSequencia").modal();

	return true;
}

function addTriagemSequencia() {
	$("#id").val("");
	$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemformAdd").val("");
	$("#tableProvaSequenciaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaSequenciaformAdd").val("");
	$("#ordenou_corretamente").val("");
	$("#narrou_sequencia").val("");
	$("#narrativa_coerente").val("");
	$("#precisou_ajuda").val("");
	$("#pontuacao").val("");
	
	
	$("#formAddTriagemSequencia").modal();

	return true;
}