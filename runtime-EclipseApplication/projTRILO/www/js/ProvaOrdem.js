function deleteProvaOrdem(id, pageBack) {
	window.location = "/ProvaOrdem/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaOrdem(id) {
	$("#id").val(id);
	
		$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaOrdem_" + id + "_id_prova").val()]});
		$("#txtProvaformAdd").val(JSON.stringify($("#tableProvaformAdd").bootstrapTable('getSelections')));
	$("#ordem").val($("#ProvaOrdem_" + id + "_ordem").val());
	$("#pontuacao_maxima").val($("#ProvaOrdem_" + id + "_pontuacao_maxima").val());
	
	
	$("#formAddProvaOrdem").modal();

	return true;
}

function addProvaOrdem() {
	$("#id").val("");
	$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaformAdd").val("");
	$("#ordem").val("");
	$("#pontuacao_maxima").val("");
	
	
	$("#formAddProvaOrdem").modal();

	return true;
}