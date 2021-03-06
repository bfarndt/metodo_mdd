<?php
	include_once "../class/Bruno.class.php";
	include_once "../class/BrunoDB.class.php";

	$Bruno = new Bruno();
	$BrunoDB = new BrunoDB();

	$Bruno->setCpf($_POST["cpf"]);
	$Bruno->setEndereco($_POST["endereco"]);
	$Bruno->setNascimento($_POST["nascimento"]);
	$Bruno->setMensalidade($_POST["mensalidade"]);
	
		$orientador = array();
		if (isSet($_POST['txtDaniel'])) {
			$json = json_decode($_POST['txtDaniel'], true);
			if (is_array($json)) {
				foreach ($json as $entity) {
					$orientador = new Daniel();
					$orientador->setId($entity["id"]);
					$Bruno->addOrientador($orientador);
				}
			}
		}
	

	if (isSet($_POST['id']) && $_POST['id'] > 0) {
		$Bruno->setId($_POST["id"]);
		$result = $BrunoDB->update($Bruno);
	} else {
		$result = $BrunoDB->add($Bruno);
	}

	if ($result) {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?success=1">');
	} else {
		die('<META http-equiv="refresh" content="1;URL=/' . $_POST["pageBack"] . '.php?error=1">');
	}
?>