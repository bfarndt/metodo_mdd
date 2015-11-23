function deleteProvaSequencia(id, pageBack) {
	window.location = "/ProvaSequencia/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaSequencia(id) {
	$("#id").val(id);
	
		$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaSequencia_" + id + "_id_prova").val()]});
		$("#txtProvaformAdd").val(JSON.stringify($("#tableProvaformAdd").bootstrapTable('getSelections')));
	$("#pontuacao_maxima").val($("#ProvaSequencia_" + id + "_pontuacao_maxima").val());
	
	
	$("#formAddProvaSequencia").modal();

	return true;
}

function addProvaSequencia() {
	$("#id").val("");
	$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaformAdd").val("");
	$("#pontuacao_maxima").val("");
	
	
	$("#formAddProvaSequencia").modal();

	return true;
}