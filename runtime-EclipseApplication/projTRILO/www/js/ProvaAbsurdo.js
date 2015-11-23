function deleteProvaAbsurdo(id, pageBack) {
	window.location = "/ProvaAbsurdo/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaAbsurdo(id) {
	$("#id").val(id);
	
		$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaAbsurdo_" + id + "_id_prova").val()]});
		$("#txtProvaformAdd").val(JSON.stringify($("#tableProvaformAdd").bootstrapTable('getSelections')));
	$("#imagem").val($("#ProvaAbsurdo_" + id + "_imagem").val());
	$("#pontuacao_maxima").val($("#ProvaAbsurdo_" + id + "_pontuacao_maxima").val());
	
	
	$("#formAddProvaAbsurdo").modal();

	return true;
}

function addProvaAbsurdo() {
	$("#id").val("");
	$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaformAdd").val("");
	$("#imagem").val("");
	$("#pontuacao_maxima").val("");
	
	
	$("#formAddProvaAbsurdo").modal();

	return true;
}