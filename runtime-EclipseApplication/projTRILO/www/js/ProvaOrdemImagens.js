function deleteProvaOrdemImagens(id, pageBack) {
	window.location = "/ProvaOrdemImagens/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaOrdemImagens(id) {
	$("#id").val(id);
	
		$("#tableProvaOrdemformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaOrdemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaOrdemImagens_" + id + "_id_prova_ordem").val()]});
		$("#txtProvaOrdemformAdd").val(JSON.stringify($("#tableProvaOrdemformAdd").bootstrapTable('getSelections')));
	$("#imagem").val($("#ProvaOrdemImagens_" + id + "_imagem").val());
	$("#correta").val($("#ProvaOrdemImagens_" + id + "_correta").val());
	
	
	$("#formAddProvaOrdemImagens").modal();

	return true;
}

function addProvaOrdemImagens() {
	$("#id").val("");
	$("#tableProvaOrdemformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaOrdemformAdd").val("");
	$("#imagem").val("");
	$("#correta").val("");
	
	
	$("#formAddProvaOrdemImagens").modal();

	return true;
}