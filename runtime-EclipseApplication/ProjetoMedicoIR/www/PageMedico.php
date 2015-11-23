<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Theme Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/theme.css" rel="stylesheet">
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
    
    <!-- JQuery Mask Money -->
    <script src="js/jquery.maskMoney.js" type="text/javascript"></script>
    
    <!-- JQuery Validator -->
    <script src="js/validator.js" type="text/javascript"></script>
    
	<!-- Entitys JS -->

	<script src="js/Medico.js"></script>

    
    <style type="text/css"></style>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body role="document">
  	
	    <nav class="navbar navbar-inverse navbar-fixed-top">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="/">Gerador JET com Bootstrap</a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            
	            	<li><a href="/index.php">
	            		Home
	            		
	            	</a></li>
	            
	            	<li class="active"><a href="/PageMedico.php">
	            		Cadastro de Médico
	            		
	            	</a></li>
	            
	            	<li><a href="/PagePaciente.php">
	            		Cadastro de Paciente
	            		
	            	</a></li>
	            
	            	<li><a href="/PageMedicamento.php">
	            		Cadastro de Medicamento
	            		
	            	</a></li>
	            
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </nav>
    

	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h1>
				Cadastro de Médico
	            
			</h1>
		</div>
		<?php
			if (isSet($_GET['success'])) {
			?>
				<div class="alert alert-success alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<strong>Sucesso!</strong> A a&ccedil;&atilde;o foi realizada com sucesso!
				</div>
			<?php
			} elseif (isSet($_GET['error'])) {
			?>
				<div class="alert alert-danger alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<strong>Erro!</strong> N&atilde;o foi poss&iacute;vel realizar a a&ccedil;&atilde;o solicitada!
				</div>
			<?php
			}

			
				include "forms/FormMedico.php";
			
		?>
	</div>
	
	
		<footer class="footer">
			<div class="container">
				<p class="text-muted">Place sticky footer content here.</p>
			</div>
		</footer>
	
    

    
    
    <!-- Datepicker - Retirado de: http://websocialdev.com/calendario-input-date-com-datepicker-bootstrap/ -->
	<script src="js/bootstrap-datepicker.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
    
    <script type="text/javascript">
    	$(document).ready(function () {
			$('.datepicker').datepicker({
				format: "yyyy-mm-dd"
			});
		});
    </script>
    
    <!-- Table - Retirado de: http://bootstrap-table.wenzhixin.net.cn/ -->
    <script src="js/bootstrap-table.js"></script>
  </body>
</html>