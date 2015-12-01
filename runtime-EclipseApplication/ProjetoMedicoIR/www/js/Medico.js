function deleteMedico(id, pageBack) {
	window.location = "/Medico/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateMedico(id) {
	$("#id").val(id);
	$("#nome").val($("#Medico_" + id + "_nome").val());
	$("#crm").val($("#Medico_" + id + "_crm").val());
	
	
	$("#formAddMedico").modal();

	return true;
}

function addMedico() {
	$("#id").val("");
	$("#nome").val("");
	$("#crm").val("");
	
	
	$("#formAddMedico").modal();

	return true;
}