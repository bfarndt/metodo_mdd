<?php
	include_once "../class/ProvaAbsurdo.class.php";
	include_once "../class/ProvaAbsurdoDB.class.php";
	
	$ProvaAbsurdo = new ProvaAbsurdo();
	$ProvaAbsurdoDB = new ProvaAbsurdoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$ProvaAbsurdo->setId($_GET["id"]);
		$result = $ProvaAbsurdoDB->destroy($ProvaAbsurdo);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>