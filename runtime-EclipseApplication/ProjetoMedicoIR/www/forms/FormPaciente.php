
	<?php
		include_once "class/Paciente.class.php";
		include_once "class/PacienteDB.class.php";

		$Paciente = new Paciente();

	
		
		
			$nome = "";
			if (isSet($_GET['nome'])) {
				$nome = $_GET["nome"];
				$Paciente->setNome($nome);
			}
		
	
		
		
			$cpf = "";
			if (isSet($_GET['cpf'])) {
				$cpf = $_GET["cpf"];
				$Paciente->setCpf($cpf);
			}
		
	
		
		
			$data_nasc = "";
			if (isSet($_GET['data_nasc'])) {
				$data_nasc = $_GET["data_nasc"];
				$Paciente->setData_nasc($data_nasc);
			}
		
	
		
		
			$endereco = "";
			if (isSet($_GET['endereco'])) {
				$endereco = $_GET["endereco"];
				$Paciente->setEndereco($endereco);
			}
		
	
		
		
			$cidade = "";
			if (isSet($_GET['cidade'])) {
				$cidade = $_GET["cidade"];
				$Paciente->setCidade($cidade);
			}
		
	
		
		
			$estado = "";
			if (isSet($_GET['estado'])) {
				$estado = $_GET["estado"];
				$Paciente->setEstado($estado);
			}
		
	

		$PacienteDB = new PacienteDB();
		$rows = $PacienteDB->get($Paciente);
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
						
							<span class="input-group-addon">cpf</span>
							<input type="text" name="cpf" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $cpf; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
						
							<span class="input-group-addon">data_nasc</span>
							<input type="text" name="data_nasc" class="form-control datepicker" placeholder="" aria-describedby="basic-addon1" value="<?php echo $data_nasc; ?>">
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
							<span class="input-group-addon">endereco</span>
							<input type="text" name="endereco" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $endereco; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
							<span class="input-group-addon">cidade</span>
							<input type="text" name="cidade" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $cidade; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
							<span class="input-group-addon">estado</span>
							<input type="text" name="estado" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $estado; ?>">
						
						
						
						
						
					</div>
					<br>
				
				<div class="btn-group btn-group" role="group" aria-label="...">
					<button type="submit" class="btn btn-primary">Filtrar</button>
					
						<button type="button" class="btn btn-success" onclick="javascript: addPaciente();">Adicionar</button>
					
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
							
						
							
							
								<th>cpf</th>
							
						
							
							
								<th>data_nasc</th>
							
						
							
							
								<th>endereco</th>
							
						
							
							
								<th>cidade</th>
							
						
							
							
								<th>estado</th>
							
						
						
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
										
										<input type="hidden" id="Paciente_<?php echo $row->getId(); ?>_nome" name="Paciente_<?php echo $row->getId(); ?>_nome" value="<?php echo $row->getNome(); ?>">
									
									
								
									
									
										<td><?php echo $row->getCpf(); ?></td>
										
										<input type="hidden" id="Paciente_<?php echo $row->getId(); ?>_cpf" name="Paciente_<?php echo $row->getId(); ?>_cpf" value="<?php echo $row->getCpf(); ?>">
									
									
								
									
									
										<td><?php echo $row->getData_nasc(); ?></td>
										
										<input type="hidden" id="Paciente_<?php echo $row->getId(); ?>_data_nasc" name="Paciente_<?php echo $row->getId(); ?>_data_nasc" value="<?php echo $row->getData_nasc(); ?>">
									
									
								
									
									
										<td><?php echo $row->getEndereco(); ?></td>
										
										<input type="hidden" id="Paciente_<?php echo $row->getId(); ?>_endereco" name="Paciente_<?php echo $row->getId(); ?>_endereco" value="<?php echo $row->getEndereco(); ?>">
									
									
								
									
									
										<td><?php echo $row->getCidade(); ?></td>
										
										<input type="hidden" id="Paciente_<?php echo $row->getId(); ?>_cidade" name="Paciente_<?php echo $row->getId(); ?>_cidade" value="<?php echo $row->getCidade(); ?>">
									
									
								
									
									
										<td><?php echo $row->getEstado(); ?></td>
										
										<input type="hidden" id="Paciente_<?php echo $row->getId(); ?>_estado" name="Paciente_<?php echo $row->getId(); ?>_estado" value="<?php echo $row->getEstado(); ?>">
									
									
								
								
									<td>
										
											<button type="button" class="btn btn-default" aria-label="Editar" onclick="javascript: updatePaciente(<?php echo $row->getId(); ?>);">
												<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											</button>
										
										
											<button type="button" class="btn btn-default" aria-label="Apagar" onclick="javascript: deletePaciente(<?php echo $row->getId(); ?>, 'PagePaciente');">
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
						
							<td></td>
						
							<td></td>
						
							<td></td>
						
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	
		<form action="/Paciente/save.php" method="post" role="form" data-toggle="validator">
			<div class="modal fade" id="formAddPaciente" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">Novo Paciente</h4>
						</div>
						<div class="modal-body">
							<input type="hidden" name="pageBack" value="PagePaciente">
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
										
											<span class="input-group-addon">cpf</span>
											<input type="text" name="cpf" id="cpf" class="form-control" placeholder="" aria-describedby="basic-addon1" required>
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
										
										
											<span class="input-group-addon">data_nasc</span>
											<input type="text" name="data_nasc" id="data_nasc" class="form-control datepicker" placeholder="" aria-describedby="basic-addon1">
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">endereco</span>
											<input type="text" name="endereco" id="endereco" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">cidade</span>
											<input type="text" name="cidade" id="cidade" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">estado</span>
											<input type="text" name="estado" id="estado" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
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
	
