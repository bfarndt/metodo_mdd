function deleteProva(id, pageBack) {
	window.location = "/Prova/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateProva(id) {
	$("#id").val(id);
	$("#pontuacao_maxima").val($("#Prova_" + id + "_pontuacao_maxima").val());
	
	
	$("#formAddProva").modal();

	return true;
}

function addProva() {
	$("#id").val("");
	$("#pontuacao_maxima").val("");
	
	
	$("#formAddProva").modal();

	return true;
}