
	<?php
		include_once "class/Medicamento.class.php";
		include_once "class/MedicamentoDB.class.php";

		$Medicamento = new Medicamento();

	
		
		
			$nome = "";
			if (isSet($_GET['nome'])) {
				$nome = $_GET["nome"];
				$Medicamento->setNome($nome);
			}
		
	
		
		
			$fabricante = "";
			if (isSet($_GET['fabricante'])) {
				$fabricante = $_GET["fabricante"];
				$Medicamento->setFabricante($fabricante);
			}
		
	
		
		
			$composicao = "";
			if (isSet($_GET['composicao'])) {
				$composicao = $_GET["composicao"];
				$Medicamento->setComposicao($composicao);
			}
		
	
		
		
			$generico = "";
			if (isSet($_GET['generico'])) {
				$generico = $_GET["generico"];
				$Medicamento->setGenerico($generico);
			}
		
	
		
		
			$custo = "";
			if (isSet($_GET['custo'])) {
				$custo = $_GET["custo"];
				$Medicamento->setCusto($custo);
			}
		
	
		
			$medico = array();
			if (isSet($_GET['txtMedico'])) {
				$json = json_decode($_GET['txtMedico'], true);
				if (is_array($json)) {
					foreach ($json as $entity) {
						$Medico = new Medico();
						$Medico->setId($entity["id"]);
						$Medicamento->addMedico($Medico);
					}
				}
			}
		
		
	

		$MedicamentoDB = new MedicamentoDB();
		$rows = $MedicamentoDB->get($Medicamento);
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
						
							<span class="input-group-addon">fabricante</span>
							<input type="text" name="fabricante" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $fabricante; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
							<span class="input-group-addon">composicao</span>
							<input type="text" name="composicao" class="form-control" placeholder="" aria-describedby="basic-addon1" value="<?php echo $composicao; ?>">
						
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
						
						
							<span class="input-group-addon">generico</span>
							<input type="checkbox" name="generico" class="form-control" placeholder="" aria-describedby="basic-addon1">
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
							<span class="input-group-addon">custo (R$)</span>
							<input type="text" name="custo" class="form-control currency_field" placeholder="" aria-describedby="basic-addon1" value="<?php echo $custo; ?>">
						
						
						
						
					</div>
					<br>
				
					<div class="input-group">
						
						
						
						
						
							
							
							<span class="input-group-addon">medico</span>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#selectMedicoformSearch">Escolher</button>
<input type="hidden" name="txtMedico" id="txtMedicoformSearch" value="">

<div class="modal fade" id="selectMedicoformSearch" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">medico</h4>
			</div>
			<div class="modal-body">
				<table id="tableMedicoformSearch" class="table table-striped" data-toggle="table" data-sort-name="id" data-sort-order="inc" data-pagination="true" data-page-size="10" data-click-to-select="true">
					<thead>
						<tr>
							<th data-field="selecao" data-checkbox="true"></th>
							<th data-field="id" data-sortable="true">ID</th>
							
								<th data-field="nome" data-sortable="true">nome</th>
							
								<th data-field="crm" data-sortable="true">crm</th>
							
						</tr>
					</thead>
					<tbody>
						<?php
							include_once "class/MedicoDB.class.php";

							$MedicoDB = new MedicoDB();
							$rowsMedico = $MedicoDB->getAll();
							foreach ($rowsMedico as $rowMedico) {
								?>
								<tr>
									<td></td>
									<td><?php echo $rowMedico->getId(); ?></td>
									
										<td><?php echo $rowMedico->getNome(); ?></td>
									
										<td><?php echo $rowMedico->getCrm(); ?></td>
									
								</tr>
						<?php } ?>
					</tbody>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" id="buttonMedicoformSearch" class="btn btn-primary">Selecionar</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function() {
		$("#buttonMedicoformSearch").click(function() {
			$("#txtMedicoformSearch").val(JSON.stringify($("#tableMedicoformSearch").bootstrapTable('getSelections')));
			$("#selectMedicoformSearch").modal('hide');
		});
	});
</script>
						
					</div>
					<br>
				
				<div class="btn-group btn-group" role="group" aria-label="...">
					<button type="submit" class="btn btn-primary">Filtrar</button>
					
						<button type="button" class="btn btn-success" onclick="javascript: addMedicamento();">Adicionar</button>
					
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
							
						
							
							
								<th>fabricante</th>
							
						
							
							
								<th>composicao</th>
							
						
							
							
								<th>generico</th>
							
						
							
							
								<th>custo</th>
							
						
							
								
								
									<th>Medico - nome</th>
								
									<th>Medico - crm</th>
								
							
							
						
						
							<th width="100px">&nbsp;</th>
						
					</tr>
				</thead>
				<tbody>
					<?php
						
							
						
							
						
							
						
							
						
							
								$totalCusto = 0; 
							
						
							
						
						foreach ($rows as $row) {
							?>
							<tr>
								<td><?php echo $row->getId(); ?></td>
								
									
									
										<td><?php echo $row->getNome(); ?></td>
										
										<input type="hidden" id="Medicamento_<?php echo $row->getId(); ?>_nome" name="Medicamento_<?php echo $row->getId(); ?>_nome" value="<?php echo $row->getNome(); ?>">
									
									
								
									
									
										<td><?php echo $row->getFabricante(); ?></td>
										
										<input type="hidden" id="Medicamento_<?php echo $row->getId(); ?>_fabricante" name="Medicamento_<?php echo $row->getId(); ?>_fabricante" value="<?php echo $row->getFabricante(); ?>">
									
									
								
									
									
										<td><?php echo $row->getComposicao(); ?></td>
										
										<input type="hidden" id="Medicamento_<?php echo $row->getId(); ?>_composicao" name="Medicamento_<?php echo $row->getId(); ?>_composicao" value="<?php echo $row->getComposicao(); ?>">
									
									
								
									
									
										<td><?php echo $row->getGenerico(); ?></td>
										
										<input type="hidden" id="Medicamento_<?php echo $row->getId(); ?>_generico" name="Medicamento_<?php echo $row->getId(); ?>_generico" value="<?php echo $row->getGenerico(); ?>">
									
									
								
									
									
										<td><?php echo $row->getCustoFormated(); ?></td>
										
										<input type="hidden" id="Medicamento_<?php echo $row->getId(); ?>_custo" name="Medicamento_<?php echo $row->getId(); ?>_custo" value="<?php echo $row->getCusto(); ?>">
									
									
										<?php $totalCusto += $row->getCusto(); ?> 
									
								
									
										
										<input type="hidden" id="Medicamento_<?php echo $row->getId(); ?>_medico" name="Medicamento_<?php echo $row->getId(); ?>_medico" value="<?php echo $row->getMedico()->getId(); ?>">
										
											<td><?php echo $row->getMedico()->getNome(); ?></td>
										
											<td><?php echo $row->getMedico()->getCrm(); ?></td>
										
									
									
									
								
								
									<td>
										
											<button type="button" class="btn btn-default" aria-label="Editar" onclick="javascript: updateMedicamento(<?php echo $row->getId(); ?>);">
												<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
											</button>
										
										
											<button type="button" class="btn btn-default" aria-label="Apagar" onclick="javascript: deleteMedicamento(<?php echo $row->getId(); ?>, 'PageMedicamento');">
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
						
							<td>
								<?php echo 'R$ ' . number_format($totalCusto, 2, ',', '.'); ?>
							</td>
						
							<td></td>
						
					</tr>
				</tfoot>
			</table>
		</div>
	</div>
	
		<form action="/Medicamento/save.php" method="post" role="form" data-toggle="validator">
			<div class="modal fade" id="formAddMedicamento" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
							<h4 class="modal-title" id="myModalLabel">Novo Medicamento</h4>
						</div>
						<div class="modal-body">
							<input type="hidden" name="pageBack" value="PageMedicamento">
							<input type="hidden" name="id" id="id" value="">
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">nome</span>
											<input type="text" name="nome" id="nome" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">fabricante</span>
											<input type="text" name="fabricante" id="fabricante" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
											<span class="input-group-addon">composicao</span>
											<input type="text" name="composicao" id="composicao" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
										
										
										
											<span class="input-group-addon">generico</span>
											<input type="checkbox" name="generico" id="generico" class="form-control" placeholder="" aria-describedby="basic-addon1">
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
										
											<span class="input-group-addon">custo (R$)</span>
											<input type="text" name="custo" id="custo" class="form-control currency_field" placeholder="" aria-describedby="basic-addon1">
										
										
										
										
									</div>
								</div>
								<br>
							
								<div class="form-group">
									<div class="input-group">
										
										
										
										
										
											
											
											<span class="input-group-addon">medico</span>
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#selectMedicoformAdd">Escolher</button>
<input type="hidden" name="txtMedico" id="txtMedicoformAdd" value="">

<div class="modal fade" id="selectMedicoformAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">medico</h4>
			</div>
			<div class="modal-body">
				<table id="tableMedicoformAdd" class="table table-striped" data-toggle="table" data-sort-name="id" data-sort-order="inc" data-pagination="true" data-page-size="10" data-click-to-select="true">
					<thead>
						<tr>
							<th data-field="selecao" data-checkbox="true"></th>
							<th data-field="id" data-sortable="true">ID</th>
							
								<th data-field="nome" data-sortable="true">nome</th>
							
								<th data-field="crm" data-sortable="true">crm</th>
							
						</tr>
					</thead>
					<tbody>
						<?php
							include_once "class/MedicoDB.class.php";

							$MedicoDB = new MedicoDB();
							$rowsMedico = $MedicoDB->getAll();
							foreach ($rowsMedico as $rowMedico) {
								?>
								<tr>
									<td></td>
									<td><?php echo $rowMedico->getId(); ?></td>
									
										<td><?php echo $rowMedico->getNome(); ?></td>
									
										<td><?php echo $rowMedico->getCrm(); ?></td>
									
								</tr>
						<?php } ?>
					</tbody>
				</table>
			</div>
			<div class="modal-footer">
				<button type="button" id="buttonMedicoformAdd" class="btn btn-primary">Selecionar</button>
			</div>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function() {
		$("#buttonMedicoformAdd").click(function() {
			$("#txtMedicoformAdd").val(JSON.stringify($("#tableMedicoformAdd").bootstrapTable('getSelections')));
			$("#selectMedicoformAdd").modal('hide');
		});
	});
</script>
										
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
	
