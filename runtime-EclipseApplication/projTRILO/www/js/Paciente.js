function deletePaciente(id, pageBack) {
	window.location = "/Paciente/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updatePaciente(id) {
	$("#id").val(id);
	$("#foto").val($("#Paciente_" + id + "_foto").val());
	$("#nome").val($("#Paciente_" + id + "_nome").val());
	$("#nome_mae").val($("#Paciente_" + id + "_nome_mae").val());
	$("#telefone").val($("#Paciente_" + id + "_telefone").val());
	$("#data_nasc").val($("#Paciente_" + id + "_data_nasc").val());
	$("#qtde_semanas_nasc").val($("#Paciente_" + id + "_qtde_semanas_nasc").val());
	$("#problema_parto").val($("#Paciente_" + id + "_problema_parto").val());
	$("#parto_normal").val($("#Paciente_" + id + "_parto_normal").val());
	$("#gemeos").val($("#Paciente_" + id + "_gemeos").val());
	$("#inflamacao_ouvido").val($("#Paciente_" + id + "_inflamacao_ouvido").val());
	$("#problemas_respiratorios").val($("#Paciente_" + id + "_problemas_respiratorios").val());
	$("#teve_desnutricao").val($("#Paciente_" + id + "_teve_desnutricao").val());
	$("#anemia").val($("#Paciente_" + id + "_anemia").val());
	$("#problema_familia_ling").val($("#Paciente_" + id + "_problema_familia_ling").val());
	$("#data_cadastro").val($("#Paciente_" + id + "_data_cadastro").val());
	
	
	$("#formAddPaciente").modal();

	return true;
}

function addPaciente() {
	$("#id").val("");
	$("#foto").val("");
	$("#nome").val("");
	$("#nome_mae").val("");
	$("#telefone").val("");
	$("#data_nasc").val("");
	$("#qtde_semanas_nasc").val("");
	$("#problema_parto").val("");
	$("#parto_normal").val("");
	$("#gemeos").val("");
	$("#inflamacao_ouvido").val("");
	$("#problemas_respiratorios").val("");
	$("#teve_desnutricao").val("");
	$("#anemia").val("");
	$("#problema_familia_ling").val("");
	$("#data_cadastro").val("");
	
	
	$("#formAddPaciente").modal();

	return true;
}