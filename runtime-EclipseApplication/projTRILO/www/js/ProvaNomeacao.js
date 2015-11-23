function deleteProvaNomeacao(id, pageBack) {
	window.location = "/ProvaNomeacao/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaNomeacao(id) {
	$("#id").val(id);
	
		$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaNomeacao_" + id + "_id_prova").val()]});
		$("#txtProvaformAdd").val(JSON.stringify($("#tableProvaformAdd").bootstrapTable('getSelections')));
	$("#transcricao").val($("#ProvaNomeacao_" + id + "_transcricao").val());
	$("#imagem").val($("#ProvaNomeacao_" + id + "_imagem").val());
	$("#nome").val($("#ProvaNomeacao_" + id + "_nome").val());
	$("#pontuacao_maxima").val($("#ProvaNomeacao_" + id + "_pontuacao_maxima").val());
	
	
	$("#formAddProvaNomeacao").modal();

	return true;
}

function addProvaNomeacao() {
	$("#id").val("");
	$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaformAdd").val("");
	$("#transcricao").val("");
	$("#imagem").val("");
	$("#nome").val("");
	$("#pontuacao_maxima").val("");
	
	
	$("#formAddProvaNomeacao").modal();

	return true;
}