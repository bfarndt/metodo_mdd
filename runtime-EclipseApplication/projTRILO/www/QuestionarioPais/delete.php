<?php
	include_once "../class/QuestionarioPais.class.php";
	include_once "../class/QuestionarioPaisDB.class.php";
	
	$QuestionarioPais = new QuestionarioPais();
	$QuestionarioPaisDB = new QuestionarioPaisDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$QuestionarioPais->setId($_GET["id"]);
		$result = $QuestionarioPaisDB->destroy($QuestionarioPais);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>