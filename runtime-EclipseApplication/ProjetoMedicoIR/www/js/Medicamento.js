function deleteMedicamento(id, pageBack) {
	window.location = "/Medicamento/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateMedicamento(id) {
	$("#id").val(id);
	$("#nome").val($("#Medicamento_" + id + "_nome").val());
	$("#fabricante").val($("#Medicamento_" + id + "_fabricante").val());
	$("#composicao").val($("#Medicamento_" + id + "_composicao").val());
	$("#generico").val($("#Medicamento_" + id + "_generico").val());
	$("#custo").val($("#Medicamento_" + id + "_custo").val());
	
		$("#tableMedicoformAdd").bootstrapTable('uncheckAll');
		$("#tableMedicoformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#Medicamento_" + id + "_medico").val()]});
		$("#txtMedicoformAdd").val(JSON.stringify($("#tableMedicoformAdd").bootstrapTable('getSelections')));
	
	
	$("#formAddMedicamento").modal();

	return true;
}

function addMedicamento() {
	$("#id").val("");
	$("#nome").val("");
	$("#fabricante").val("");
	$("#composicao").val("");
	$("#generico").val("");
	$("#custo").val("");
	$("#tableMedicoformAdd").bootstrapTable('uncheckAll');
		$("#txtMedicoformAdd").val("");
	
	
	$("#formAddMedicamento").modal();

	return true;
}