
	<?php
		include_once "class/Medico.class.php";
		include_once "class/MedicoDB.class.php";

		$Medico = new Medico();

	
		
		
			$nome = "";
			if (isSet($_GET['nome'])) {
				$nome = $_GET["nome"];
				$Medico->setNome($nome);
			}
		
	
		
		
			$crm = "";
			if (isSet($_GET['crm'])) {
				$crm = $_GET["crm"];
				$Medico->setCrm($crm);
			}
		
	

		$MedicoDB = new MedicoDB();
		$rows = $MedicoDB->get($Medico);
	?>
	<div class="panel panel-default">
		<div class="panel-heading">Filtro</div>
		<div class="panel-body">
			<form class="bs-example bs-example-form" data-example-id="simple-input-groups">
				
					<div class="input-group">
						
							<span class="input-group-addon">nome</span>
							<input type="text" name="nome" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $nome; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
							<span class="input-group-addon">crm</span>
							<input type="text" name="crm" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $crm; ?>">
						
						
						
						
						
					</div>
					<br>
				
				<div class="btn-group btn-group" role="group" aria-label="...">
					<button type="submit" class="btn btn-primary">Filtrar</button>
					
						<button type="button" class="btn btn-success" onclick="javascript: addMedico();">Adicionar</button>
					
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
						
							
							
								<th>nome</th>
							
						
							
							
								<th>crm</th>
							
						
						
							<th width="100px">&nbsp;</th>
						
					</tr>
				</thead>
				<tbody>
					<?php
						
							
						
							
						
						foreach ($rows as $row) {
							?>
							<tr>
								<td><?php echo $row->getId(); ?></td>
								
									
									
										<td><?php echo $row->getNome(); ?></td>
										
										<input type="hidden" id="Medico_<?php echo $row->getId(); ?>_nome" name="Medico_<?php echo $row->getId(); ?>_nome" value="<?php echo $row->getNome(); ?>">
									
									
								
									
									
										<td><?php echo $row->getCrm(); ?></td>
										
										<input type="hidden" id="Medico_<?php echo $row->getId(); ?>_crm" name="Medico_<?php echo $row->getId(); ?>_crm" value="<?php echo $row->getCrm(); ?>">
									
									
								
								
									<td>
										
											<button type="button" class="btn btn-default" aria-label="Editar" onclick="javascript: updateMedico(<?php echo $row->getId(); ?>);">
												<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											</button>
										
										
											<button type="button" class="btn btn-default" aria-label="Apagar" onclick="javascript: deleteMedico(<?php echo $row->getId(); ?>, 'PageMedico');">
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
						
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	
		<form action="/Medico/save.php" method="post" role="form" data-toggle="validator">
			<div class="modal fade" id="formAddMedico" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">Novo Medico</h4>
						</div>
						<div class="modal-body">
							<input type="hidden" name="pageBack" value="PageMedico">
							<input type="hidden" name="id" id="id" value="">
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">nome</span>
											<input type="text" name="nome" id="nome" class="form-control" placeholder="" aria-describedby="basic-addon1" required>
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">crm</span>
											<input type="text" name="crm" id="crm" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
									</div>
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
		
		<script type="text/javascript">
			$(function() {
    			$('.currency_field').maskMoney({
    				prefix:'R$ ',
    				allowNegative: true,
    				thousands:'.',
    				decimal:',',
    				affixesStay: false
    			});
  			});
		</script>
	
