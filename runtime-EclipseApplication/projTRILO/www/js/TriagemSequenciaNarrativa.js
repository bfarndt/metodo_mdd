function deleteTriagemSequenciaNarrativa(id, pageBack) {
	window.location = "/TriagemSequenciaNarrativa/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemSequenciaNarrativa(id) {
	$("#id").val(id);
	
		$("#tableTriagemSequenciaformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemSequenciaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemSequenciaNarrativa_" + id + "_id_triagem_sequencia").val()]});
		$("#txtTriagemSequenciaformAdd").val(JSON.stringify($("#tableTriagemSequenciaformAdd").bootstrapTable('getSelections')));
	$("#acao").val($("#TriagemSequenciaNarrativa_" + id + "_acao").val());
	
	
	$("#formAddTriagemSequenciaNarrativa").modal();

	return true;
}

function addTriagemSequenciaNarrativa() {
	$("#id").val("");
	$("#tableTriagemSequenciaformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemSequenciaformAdd").val("");
	$("#acao").val("");
	
	
	$("#formAddTriagemSequenciaNarrativa").modal();

	return true;
}