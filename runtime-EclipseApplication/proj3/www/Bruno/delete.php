<?php
	include_once "../class/Bruno.class.php";
	include_once "../class/BrunoDB.class.php";
	
	$Bruno = new Bruno();
	$BrunoDB = new BrunoDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Bruno->setId($_GET["id"]);
		$result = $BrunoDB->destroy($Bruno);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>