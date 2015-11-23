function deleteTriagemNomeacao(id, pageBack) {
	window.location = "/TriagemNomeacao/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemNomeacao(id) {
	$("#id").val(id);
	
		$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemNomeacao_" + id + "_id_triagem").val()]});
		$("#txtTriagemformAdd").val(JSON.stringify($("#tableTriagemformAdd").bootstrapTable('getSelections')));
	
		$("#tableProvaNomeacaoformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaNomeacaoformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemNomeacao_" + id + "_id_prova_nomeacao").val()]});
		$("#txtProvaNomeacaoformAdd").val(JSON.stringify($("#tableProvaNomeacaoformAdd").bootstrapTable('getSelections')));
	$("#nomeacao").val($("#TriagemNomeacao_" + id + "_nomeacao").val());
	$("#pontuacao").val($("#TriagemNomeacao_" + id + "_pontuacao").val());
	
	
	$("#formAddTriagemNomeacao").modal();

	return true;
}

function addTriagemNomeacao() {
	$("#id").val("");
	$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemformAdd").val("");
	$("#tableProvaNomeacaoformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaNomeacaoformAdd").val("");
	$("#nomeacao").val("");
	$("#pontuacao").val("");
	
	
	$("#formAddTriagemNomeacao").modal();

	return true;
}