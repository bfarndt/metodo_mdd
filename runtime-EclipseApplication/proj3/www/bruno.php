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
    
	<!-- Entitys JS -->

	<script src="js/Bruno.js"></script>

    
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
	            
	            	<li><a href="/pageDaniel.php">
	            		
	            		pageDaniel
	            	</a></li>
	            
	            	<li class="active"><a href="/bruno.php">
	            		Bruno
	            		
	            	</a></li>
	            
	            	<li><a href="/brunoReport.php">
	            		Relatório Bruno
	            		
	            	</a></li>
	            
	          </ul>
	        </div><!--/.nav-collapse -->
	      </div>
	    </nav>
    

	<div class="container theme-showcase" role="main">
		<div class="page-header">
			<h1>
				Bruno
	            
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
		?>
		
			
				
	<?php
		include_once "class/Bruno.class.php";
		include_once "class/BrunoDB.class.php";

		$Bruno = new Bruno();

	
		
		
			$cpf = "";
			if (isSet($_GET['cpf'])) {
				$cpf = $_GET["cpf"];
				$Bruno->setCpf($cpf);
			}
		
	
		
		
			$endereco = "";
			if (isSet($_GET['endereco'])) {
				$endereco = $_GET["endereco"];
				$Bruno->setEndereco($endereco);
			}
		
	
		
		
			$nascimento = "";
			if (isSet($_GET['nascimento'])) {
				$nascimento = $_GET["nascimento"];
				$Bruno->setNascimento($nascimento);
			}
		
	
		
		
			$mensalidade = "";
			if (isSet($_GET['mensalidade'])) {
				$mensalidade = $_GET["mensalidade"];
				$Bruno->setMensalidade($mensalidade);
			}
		
	
		
			$orientador = array();
			if (isSet($_GET['txtDaniel'])) {
				$json = json_decode($_GET['txtDaniel'], true);
				if (is_array($json)) {
					foreach ($json as $entity) {
						$Daniel = new Daniel();
						$Daniel->setId($entity["id"]);
						$Bruno->addOrientador($Daniel);
					}
				}
			}
		
		
	

		$BrunoDB = new BrunoDB();
		$rows = $BrunoDB->get($Bruno);
	?>
	<div class="panel panel-default">
		<div class="panel-heading">Filtro</div>
		<div class="panel-body">
			<form class="bs-example bs-example-form" data-example-id="simple-input-groups">
				
					<div class="input-group">
						
							<span class="input-group-addon">cpf</span>
							<input type="text" name="cpf" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $cpf; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
							<span class="input-group-addon">endereco</span>
							<input type="text" name="endereco" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $endereco; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
						
							<span class="input-group-addon">nascimento</span>
							<input type="text" name="nascimento" class="form-control datepicker" placeholder="" aria-describedby="basic-addon1" value="<?php echo $nascimento; ?>">
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
							<span class="input-group-addon">mensalidade (R$)</span>
							<input type="text" name="mensalidade" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $mensalidade; ?>">
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
						
						
						
							
							
							<span class="input-group-addon">orientador</span>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#selectDanielformSearch">Escolher</button>
<input type="hidden" name="txtDaniel" id="txtDanielformSearch" value="">

<div class="modal fade" id="selectDanielformSearch" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">orientador</h4>
			</div>
			<div class="modal-body">
				<table id="tableDanielformSearch" class="table table-striped" data-toggle="table" data-sort-name="id" data-sort-order="inc" data-pagination="true" data-page-size="10" data-click-to-select="true">
					<thead>
						<tr>
							<th data-field="selecao" data-checkbox="true"></th>
							<th data-field="id" data-sortable="true">ID</th>
							
								<th data-field="cpf" data-sortable="true">cpf</th>
							
								<th data-field="endereco" data-sortable="true">endereco</th>
							
						</tr>
					</thead>
					<tbody>
						<?php
							include_once "class/DanielDB.class.php";

							$DanielDB = new DanielDB();
							$rowsDaniel = $DanielDB->getAll();
							foreach ($rowsDaniel as $rowDaniel) {
								?>
								<tr>
									<td></td>
									<td><?php echo $rowDaniel->getId(); ?></td>
									
										<td><?php echo $rowDaniel->getCpf(); ?></td>
									
										<td><?php echo $rowDaniel->getEndereco(); ?></td>
									
								</tr>
						<?php } ?>
					</tbody>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" id="buttonDanielformSearch" class="btn btn-primary">Selecionar</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function() {
		$("#buttonDanielformSearch").click(function() {
			$("#txtDanielformSearch").val(JSON.stringify($("#tableDanielformSearch").bootstrapTable('getSelections')));
			$("#selectDanielformSearch").modal('hide');
		});
	});
</script>
						
					</div>
					<br>
				
				<div class="btn-group btn-group" role="group" aria-label="...">
					<button type="submit" class="btn btn-primary">Filtrar</button>
					
						<button type="button" class="btn btn-success" onclick="javascript: addBruno();">Adicionar</button>
					
				</div>
			</form>
		</div>
	</div>

	<div class="panel panel-default">
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>#</th>
						
							
							
								<th>cpf</th>
							
						
							
							
								<th>endereco</th>
							
						
							
							
								<th>nascimento</th>
							
						
							
							
								<th>mensalidade</th>
							
						
							
							
						
						
							<th width="100px">&nbsp;</th>
						
					</tr>
				</thead>
				<tbody>
					<?php
						
							
						
							
						
							
						
							
								$totalMensalidade = 0; 
							
						
							
						
						foreach ($rows as $row) {
							?>
							<tr>
								<td><?php echo $row->getId(); ?></td>
								
									
									
										<td><?php echo $row->getCpf(); ?></td>
										
										<input type="hidden" id="Bruno_<?php echo $row->getId(); ?>_cpf" name="Bruno_<?php echo $row->getId(); ?>_cpf" value="<?php echo $row->getCpf(); ?>">
									
									
								
									
									
										<td><?php echo $row->getEndereco(); ?></td>
										
										<input type="hidden" id="Bruno_<?php echo $row->getId(); ?>_endereco" name="Bruno_<?php echo $row->getId(); ?>_endereco" value="<?php echo $row->getEndereco(); ?>">
									
									
								
									
									
										<td><?php echo $row->getNascimento(); ?></td>
										
										<input type="hidden" id="Bruno_<?php echo $row->getId(); ?>_nascimento" name="Bruno_<?php echo $row->getId(); ?>_nascimento" value="<?php echo $row->getNascimento(); ?>">
									
									
								
									
									
										<td><?php echo $row->getMensalidadeFormated(); ?></td>
										
										<input type="hidden" id="Bruno_<?php echo $row->getId(); ?>_mensalidade" name="Bruno_<?php echo $row->getId(); ?>_mensalidade" value="<?php echo $row->getMensalidade(); ?>">
									
									
										<?php $totalMensalidade += $row->getMensalidade(); ?> 
									
								
									
									
									
								
								
									<td>
										
											<button type="button" class="btn btn-default" aria-label="Editar" onclick="javascript: updateBruno(<?php echo $row->getId(); ?>);">
												<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											</button>
										
										
											<button type="button" class="btn btn-default" aria-label="Apagar" onclick="javascript: deleteBruno(<?php echo $row->getId(); ?>, 'bruno');">
												<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
											</button>
										
									</td>
								
							</tr>
					<?php } ?>
				</tbody>
				<tfoot>
					<tr>
						<td>Total <?php echo count($rows); ?></td>
						
							<td></td>
						
							<td></td>
						
							<td></td>
						
							<td>
								<?php echo 'R$ ' . number_format($totalMensalidade, 2, ',', '.'); ?>
							</td>
						
							<td></td>
						
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	
		<form action="/Bruno/save.php" method="post">
			<div class="modal fade" id="formAddBruno" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">Novo Bruno</h4>
						</div>
						<div class="modal-body">
							<input type="hidden" name="pageBack" value="bruno">
							<input type="hidden" name="id" id="id" value="">
							
								<div class="input-group">
									
										<span class="input-group-addon">cpf</span>
										<input type="text" name="cpf" id="cpf" class="form-control" placeholder="" aria-describedby="basic-addon1">
									
									
									
									
									
								</div>
								<br>
							
								<div class="input-group">
									
										<span class="input-group-addon">endereco</span>
										<input type="text" name="endereco" id="endereco" class="form-control" placeholder="" aria-describedby="basic-addon1">
									
									
									
									
									
								</div>
								<br>
							
								<div class="input-group">
									
									
									
										<span class="input-group-addon">nascimento</span>
										<input type="text" name="nascimento" id="nascimento" class="form-control datepicker" placeholder="" aria-describedby="basic-addon1">
									
									
									
								</div>
								<br>
							
								<div class="input-group">
									
									
										<span class="input-group-addon">mensalidade (R$)</span>
										<input type="text" name="mensalidade" id="mensalidade" class="form-control" placeholder="" aria-describedby="basic-addon1">
									
									
									
									
								</div>
								<br>
							
								<div class="input-group">
									
									
									
									
									
										
										
										<span class="input-group-addon">orientador</span>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#selectDanielformAdd">Escolher</button>
<input type="hidden" name="txtDaniel" id="txtDanielformAdd" value="">

<div class="modal fade" id="selectDanielformAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">orientador</h4>
			</div>
			<div class="modal-body">
				<table id="tableDanielformAdd" class="table table-striped" data-toggle="table" data-sort-name="id" data-sort-order="inc" data-pagination="true" data-page-size="10" data-click-to-select="true">
					<thead>
						<tr>
							<th data-field="selecao" data-checkbox="true"></th>
							<th data-field="id" data-sortable="true">ID</th>
							
								<th data-field="cpf" data-sortable="true">cpf</th>
							
								<th data-field="endereco" data-sortable="true">endereco</th>
							
						</tr>
					</thead>
					<tbody>
						<?php
							include_once "class/DanielDB.class.php";

							$DanielDB = new DanielDB();
							$rowsDaniel = $DanielDB->getAll();
							foreach ($rowsDaniel as $rowDaniel) {
								?>
								<tr>
									<td></td>
									<td><?php echo $rowDaniel->getId(); ?></td>
									
										<td><?php echo $rowDaniel->getCpf(); ?></td>
									
										<td><?php echo $rowDaniel->getEndereco(); ?></td>
									
								</tr>
						<?php } ?>
					</tbody>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" id="buttonDanielformAdd" class="btn btn-primary">Selecionar</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function() {
		$("#buttonDanielformAdd").click(function() {
			$("#txtDanielformAdd").val(JSON.stringify($("#tableDanielformAdd").bootstrapTable('getSelections')));
			$("#selectDanielformAdd").modal('hide');
		});
	});
</script>
									
								</div>
								<br>
							
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
							<button type="submit" class="btn btn-primary">Salvar</button>
						</div>
					</div>
				</div>
			</div>
		</form>
	

			
			
			
		
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