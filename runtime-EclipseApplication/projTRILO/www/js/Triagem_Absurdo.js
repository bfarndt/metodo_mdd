function deleteTriagem_Absurdo(id, pageBack) {
	window.location = "/Triagem_Absurdo/delete.php?id=" + id + "&pageBack=" + pageBack;
}

function updateTriagem_Absurdo(id) {
	$("#id").val(id);
	
		$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#tableTriagemformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#Triagem_Absurdo_" + id + "_id_triagem").val()]});
		$("#txtTriagemformAdd").val(JSON.stringify($("#tableTriagemformAdd").bootstrapTable('getSelections')));
	
		$("#tableProvaAbsurdoformAdd").bootstrapTable('uncheckAll');
		$("#tableProvaAbsurdoformAdd").bootstrapTable('checkBy', {field:'id', values:[$("#Triagem_Absurdo_" + id + "_id_prova_absurdo").val()]});
		$("#txtProvaAbsurdoformAdd").val(JSON.stringify($("#tableProvaAbsurdoformAdd").bootstrapTable('getSelections')));
	$("#identificou").val($("#Triagem_Absurdo_" + id + "_identificou").val());
	
	
	$("#formAddTriagem_Absurdo").modal();

	return true;
}

function addTriagem_Absurdo() {
	$("#id").val("");
	$("#tableTriagemformAdd").bootstrapTable('uncheckAll');
		$("#txtTriagemformAdd").val("");
	$("#tableProvaAbsurdoformAdd").bootstrapTable('uncheckAll');
		$("#txtProvaAbsurdoformAdd").val("");
	$("#identificou").val("");
	
	
	$("#formAddTriagem_Absurdo").modal();

	return true;
}