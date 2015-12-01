function deleteTriagemSintaxe(id, pageBack) {
	window.location = "/TriagemSintaxe/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemSintaxe(id) {
	$("#id").val(id);
	
		$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemSintaxe_" + id + "_id_triagem").val()]});
		$("#txtTriagemformAdd").val(JSON.stringify($("#tableTriagemformAdd").bootstrapTable('getSelections')));
	
		$("#tableProvaSintaxeformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaSintaxeformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemSintaxe_" + id + "_id_prova_sintaxe").val()]});
		$("#txtProvaSintaxeformAdd").val(JSON.stringify($("#tableProvaSintaxeformAdd").bootstrapTable('getSelections')));
	$("#frase").val($("#TriagemSintaxe_" + id + "_frase").val());
	$("#frase_formulada").val($("#TriagemSintaxe_" + id + "_frase_formulada").val());
	$("#utilizou_artigos").val($("#TriagemSintaxe_" + id + "_utilizou_artigos").val());
	$("#utilizou_elem_ligacao").val($("#TriagemSintaxe_" + id + "_utilizou_elem_ligacao").val());
	$("#utilizou_adjetivos").val($("#TriagemSintaxe_" + id + "_utilizou_adjetivos").val());
	$("#pontuacao").val($("#TriagemSintaxe_" + id + "_pontuacao").val());
	
	
	$("#formAddTriagemSintaxe").modal();

	return true;
}

function addTriagemSintaxe() {
	$("#id").val("");
	$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemformAdd").val("");
	$("#tableProvaSintaxeformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaSintaxeformAdd").val("");
	$("#frase").val("");
	$("#frase_formulada").val("");
	$("#utilizou_artigos").val("");
	$("#utilizou_elem_ligacao").val("");
	$("#utilizou_adjetivos").val("");
	$("#pontuacao").val("");
	
	
	$("#formAddTriagemSintaxe").modal();

	return true;
}