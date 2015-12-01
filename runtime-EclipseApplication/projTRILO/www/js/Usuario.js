function deleteUsuario(id, pageBack) {
	window.location = "/Usuario/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateUsuario(id) {
	$("#id").val(id);
	$("#nome").val($("#Usuario_" + id + "_nome").val());
	$("#email").val($("#Usuario_" + id + "_email").val());
	$("#email_relatorio").val($("#Usuario_" + id + "_email_relatorio").val());
	$("#senha").val($("#Usuario_" + id + "_senha").val());
	$("#crfa").val($("#Usuario_" + id + "_crfa").val());
	
	
	$("#formAddUsuario").modal();

	return true;
}

function addUsuario() {
	$("#id").val("");
	$("#nome").val("");
	$("#email").val("");
	$("#email_relatorio").val("");
	$("#senha").val("");
	$("#crfa").val("");
	
	
	$("#formAddUsuario").modal();

	return true;
}