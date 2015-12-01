function deleteTriagemAbsurdo(id, pageBack) {
	window.location = "/TriagemAbsurdo/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagemAbsurdo(id) {
	$("#id").val(id);
	
		$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemAbsurdo_" + id + "_id_triagem").val()]});
		$("#txtTriagemformAdd").val(JSON.stringify($("#tableTriagemformAdd").bootstrapTable('getSelections')));
	
		$("#tableProvaAbsurdoformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaAbsurdoformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#TriagemAbsurdo_" + id + "_id_prova_absurdo").val()]});
		$("#txtProvaAbsurdoformAdd").val(JSON.stringify($("#tableProvaAbsurdoformAdd").bootstrapTable('getSelections')));
	$("#identificou").val($("#TriagemAbsurdo_" + id + "_identificou").val());
	$("#pontuacao").val($("#TriagemAbsurdo_" + id + "_pontuacao").val());
	
	
	$("#formAddTriagemAbsurdo").modal();

	return true;
}

function addTriagemAbsurdo() {
	$("#id").val("");
	$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemformAdd").val("");
	$("#tableProvaAbsurdoformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaAbsurdoformAdd").val("");
	$("#identificou").val("");
	$("#pontuacao").val("");
	
	
	$("#formAddTriagemAbsurdo").modal();

	return true;
}