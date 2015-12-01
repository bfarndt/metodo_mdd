function deleteTriagem(id, pageBack) {
	window.location = "/Triagem/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagem(id) {
	$("#id").val(id);
	
		$("#tablePacienteformAdd").bootstrapTable('uncheckAll');
		$("#tablePacienteformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#Triagem_" + id + "_id_paciente").val()]});
		$("#txtPacienteformAdd").val(JSON.stringify($("#tablePacienteformAdd").bootstrapTable('getSelections')));
	$("#pontuacao").val($("#Triagem_" + id + "_pontuacao").val());
	
	
	$("#formAddTriagem").modal();

	return true;
}

function addTriagem() {
	$("#id").val("");
	$("#tablePacienteformAdd").bootstrapTable('uncheckAll');
		$("#txtPacienteformAdd").val("");
	$("#pontuacao").val("");
	
	
	$("#formAddTriagem").modal();

	return true;
}