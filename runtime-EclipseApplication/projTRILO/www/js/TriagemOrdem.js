function deleteTriagemOrdem(id, pageBack) {
	window.location = "/TriagemOrdem/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemOrdem(id) {
	$("#id").val(id);
	
		$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemOrdem_" + id + "_id_triagem").val()]});
		$("#txtTriagemformAdd").val(JSON.stringify($("#tableTriagemformAdd").bootstrapTable('getSelections')));
	
		$("#tableProvaOrdemformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaOrdemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemOrdem_" + id + "_id_prova_ordem").val()]});
		$("#txtProvaOrdemformAdd").val(JSON.stringify($("#tableProvaOrdemformAdd").bootstrapTable('getSelections')));
	$("#acertou").val($("#TriagemOrdem_" + id + "_acertou").val());
	$("#pontuacao").val($("#TriagemOrdem_" + id + "_pontuacao").val());
	
	
	$("#formAddTriagemOrdem").modal();

	return true;
}

function addTriagemOrdem() {
	$("#id").val("");
	$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemformAdd").val("");
	$("#tableProvaOrdemformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaOrdemformAdd").val("");
	$("#acertou").val("");
	$("#pontuacao").val("");
	
	
	$("#formAddTriagemOrdem").modal();

	return true;
}