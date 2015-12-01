function deleteTriagemNomeacaoErrosFonetica(id, pageBack) {
	window.location = "/TriagemNomeacaoErrosFonetica/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemNomeacaoErrosFonetica(id) {
	$("#id").val(id);
	
		$("#tableTriagemNomeacaoformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemNomeacaoformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemNomeacaoErrosFonetica_" + id + "_id_triagem_nomeacao").val()]});
		$("#txtTriagemNomeacaoformAdd").val(JSON.stringify($("#tableTriagemNomeacaoformAdd").bootstrapTable('getSelections')));
	$("#fonema").val($("#TriagemNomeacaoErrosFonetica_" + id + "_fonema").val());
	$("#tipo_troca").val($("#TriagemNomeacaoErrosFonetica_" + id + "_tipo_troca").val());
	$("#substituicao").val($("#TriagemNomeacaoErrosFonetica_" + id + "_substituicao").val());
	
	
	$("#formAddTriagemNomeacaoErrosFonetica").modal();

	return true;
}

function addTriagemNomeacaoErrosFonetica() {
	$("#id").val("");
	$("#tableTriagemNomeacaoformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemNomeacaoformAdd").val("");
	$("#fonema").val("");
	$("#tipo_troca").val("");
	$("#substituicao").val("");
	
	
	$("#formAddTriagemNomeacaoErrosFonetica").modal();

	return true;
}