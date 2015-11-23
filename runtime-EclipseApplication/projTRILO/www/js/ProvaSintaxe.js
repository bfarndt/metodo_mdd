function deleteProvaSintaxe(id, pageBack) {
	window.location = "/ProvaSintaxe/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProvaSintaxe(id) {
	$("#id").val(id);
	
		$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#ProvaSintaxe_" + id + "_id_prova").val()]});
		$("#txtProvaformAdd").val(JSON.stringify($("#tableProvaformAdd").bootstrapTable('getSelections')));
	$("#imagem").val($("#ProvaSintaxe_" + id + "_imagem").val());
	$("#nome").val($("#ProvaSintaxe_" + id + "_nome").val());
	$("#pontuacao_maxima").val($("#ProvaSintaxe_" + id + "_pontuacao_maxima").val());
	
	
	$("#formAddProvaSintaxe").modal();

	return true;
}

function addProvaSintaxe() {
	$("#id").val("");
	$("#tableProvaformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaformAdd").val("");
	$("#imagem").val("");
	$("#nome").val("");
	$("#pontuacao_maxima").val("");
	
	
	$("#formAddProvaSintaxe").modal();

	return true;
}