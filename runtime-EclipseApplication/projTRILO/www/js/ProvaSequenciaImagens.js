function deleteProvaSequenciaImagens(id, pageBack) {
	window.location = "/ProvaSequenciaImagens/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaSequenciaImagens(id) {
	$("#id").val(id);
	
		$("#tableProvaSequenciaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaSequenciaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaSequenciaImagens_" + id + "_id_prova_sequencia").val()]});
		$("#txtProvaSequenciaformAdd").val(JSON.stringify($("#tableProvaSequenciaformAdd").bootstrapTable('getSelections')));
	$("#imagem").val($("#ProvaSequenciaImagens_" + id + "_imagem").val());
	$("#ordem").val($("#ProvaSequenciaImagens_" + id + "_ordem").val());
	
	
	$("#formAddProvaSequenciaImagens").modal();

	return true;
}

function addProvaSequenciaImagens() {
	$("#id").val("");
	$("#tableProvaSequenciaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaSequenciaformAdd").val("");
	$("#imagem").val("");
	$("#ordem").val("");
	
	
	$("#formAddProvaSequenciaImagens").modal();

	return true;
}