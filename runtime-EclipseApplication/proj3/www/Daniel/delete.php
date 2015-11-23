<?php
	include_once "../class/Daniel.class.php";
	include_once "../class/DanielDB.class.php";
	
	$Daniel = new Daniel();
	$DanielDB = new DanielDB();
	
	$result = false;
	
	if (isSet($_GET['id']) && $_GET['id'] > 0) {
		$Daniel->setId($_GET["id"]);
		$result = $DanielDB->destroy($Daniel);
	}
	
	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_GET["pageBack"] . '.php?error=1">');
	}
?>