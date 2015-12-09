<?php
    $adhocKey = "90f4519b5ad011c87d86d7a123fbb25c";
    $experimentoAdHoc = false;
    if (isSet($_GET['accessId']) && $_GET['accessId'] == $adhocKey) {
        $experimentoAdHoc = true;
    }
?>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Tutorial</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/sticky-footer-navbar.css" rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="js/ie-emulation-modes-warning.js"></script>

<!-- Datepicker -->
<link href="css/bootstrap-datepicker.css" rel="stylesheet">

<!-- Table plugin -->
<link href="css/bootstrap-table.css" rel="stylesheet">

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>

<!-- Bootstrap File Input - http://plugins.krajee.com/file-input/demo -->
<link href="css/fileinput.min.css" media="all" rel="stylesheet" type="text/css" />
<script src="js/canvas-to-blob.min.js" type="text/javascript"></script>
<script src="js/fileinput.min.js"></script>
<script src="js/fileinput_locale_pt-BR.js"></script>

<!-- Custom styles for this template -->
<link href="css/theme.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->

<script type="text/javascript">
    var tarefaId = 0;
</script>