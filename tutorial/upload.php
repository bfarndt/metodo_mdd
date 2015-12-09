<?php
    $uploads_dir = 'upload';
    foreach ($_FILES as $arquivo) {
        if ($arquivo['error'] == UPLOAD_ERR_OK) {
            $nomeArq = explode('.', $arquivo['name']);
            $extensaoArq = $nomeArq[count($nomeArq) - 1];
            unset($nomeArq[count($nomeArq) - 1]);
            $nomeArq = implode('.', $nomeArq);

            $extensaoArq = '.tarefa' . $_POST['tarefa'] . '.' . $extensaoArq;

            move_uploaded_file($arquivo['tmp_name'], $uploads_dir . '/' . $nomeArq . $extensaoArq);
        }
    }
    //echo json_encode(array("error" => "You are not allowed to upload such a file."));
    echo json_encode(array());
?>