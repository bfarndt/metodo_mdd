<?php
	include_once "../class/Daniel.class.php";
	include_once "../class/DanielDB.class.php";

	$Daniel = new Daniel();
	$DanielDB = new DanielDB();

	$Daniel->setCpf($_POST["cpf"]);
	$Daniel->setEndereco($_POST["endereco"]);
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Daniel->setId($_POST["id"]);
		$result = $DanielDB->update($Daniel);
	} else {
		$result = $DanielDB->add($Daniel);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>