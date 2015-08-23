<?php
    session_start();

    if ( ! isSet($_SESSION["user_kanban_id"])) {
        ?><META http-equiv="refresh" content="0;URL=login.php"><?php
    }

    include_once "class/PassoMetodoDB.class.php";
    include_once "class/TarefaDB.class.php";
    include_once "class/UsuarioDB.class.php";

    $TarefaDB = new TarefaDB();
    $tarefas = $TarefaDB->getAll();

    $PassoMetodoDB = new PassoMetodoDB();
    $passos_metodo = $PassoMetodoDB->getAll();

    $UsuarioDB = new UsuarioDB();
    $Usuario = $UsuarioDB->getUsuarioById($_SESSION["user_kanban_id"]);

    if ($Usuario === false) {
        ?><META http-equiv="refresh" content="0;URL=login.php"><?php
    }
?>
<!DOCTYPE html>
<html>
    <head>
        <title>Ferramenta</title>

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

        <!-- Quadro Kanban -->
        <link rel="stylesheet" type="text/css" href="css/task.css">

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>

        <!--  JS para a criacao do quadro kanban e as tasks-->
        <script type="text/javascript">
            var idTask = <?php echo $TarefaDB->getLastId() + 1; ?>;
        </script>
        <script src="js/task.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body role="document">
        <div class="container theme-showcase" role="main">
            <div class="panel panel-default">
                <div id="dvKanbanColTitle" class="panel-heading">
                    <div class="row">
                        <div class="col-lg-3">
                            <div class="input-group">
                                <h3 class="panel-title">
                                    To-do <span id="btnAddToDo" class="glyphicon glyphicon-plus" style="cursor: pointer;" aria-hidden="true" data-toggle="modal" data-target="#dvAddTarefaDialog"></span>
                                </h3>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="input-group">
                                <h3 class="panel-title">
                                    Do today <span id="btnAddDoToday" class="glyphicon glyphicon-plus" style="cursor: pointer;" aria-hidden="true" data-toggle="modal" data-target="#dvAddTarefaDialog"></span>
                                </h3>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <div class="input-group">
                                <h3 class="panel-title">
                                    In progress <span id="btnAddInProgress" class="glyphicon glyphicon-plus" style="cursor: pointer;" aria-hidden="true" data-toggle="modal" data-target="#dvAddTarefaDialog"></span>
                                </h3>
                            </div>
                        </div>
                        <div class="col-lg-2">
                            <div class="input-group">
                                <h3 class="panel-title">
                                    Done <span id="btnAddDone" class="glyphicon glyphicon-plus" style="cursor: pointer;" aria-hidden="true" data-toggle="modal" data-target="#dvAddTarefaDialog"></span>
                                </h3>
                            </div>
                        </div>
                        <div class="col-lg-1">
                            <div class="input-group" style="float: right;">
                                <h3 class="panel-title">
                                    <label id="lblUserName"><?php echo $Usuario->getNome(); ?></label> <span id="btnUserMenu" class="glyphicon glyphicon-off" style="cursor: pointer;" aria-hidden="true"></span>
                                </h3>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="panel-body">
                    <div  class="row">
                        <?php
                            $cols_kanban = array("colToDo", "colDoToday", "colInProgress", "colDone");

                            foreach ($cols_kanban as $col_kanban) {
                                ?>
                                <div id="<?php echo $col_kanban; ?>" class="col_kanban col-lg-3">
                                    <?php
                                        foreach ($tarefas as $key => $Tarefa) {
                                            if ($Tarefa->getColKanban() == $col_kanban) {
                                                ?>
                                                <div id="dvTask<?php echo $Tarefa->getId(); ?>" class="panel panel-primary" data-tarefa="<?php echo $Tarefa->getId(); ?>">
                                                    <div class="panel-heading">
                                                        <div class="row panel-title">
                                                            <div class="col-lg-1">
                                                                <span class="glyphicon glyphicon-trash btnDestroyTask" style="cursor: pointer;" aria-hidden="true" data-tarefa="<?php echo $Tarefa->getId(); ?>"></span>
                                                            </div>
                                                            <div class="col-lg-1">
                                                                <span class="glyphicon glyphicon-pencil btnEditTask" style="cursor: pointer;" aria-hidden="true" data-tarefa="<?php echo $Tarefa->getId(); ?>"></span>
                                                            </div>
                                                            <div class="col-lg-1">
                                                                <span class="glyphicon glyphicon-minus btnDisplayTask" style="cursor: pointer;" aria-hidden="true" data-tarefa-div="dvTask<?php echo $Tarefa->getId(); ?>"></span>
                                                            </div>
                                                            <div class="col-lg-5">
                                                                <h3 id="lblBaseTarefaNome" class="panel-title"><?php echo $Tarefa->getNome(); ?></h3>
                                                                <input type="hidden" name="txtTaskId" id="txtTaskId" value="<?php echo $Tarefa->getId(); ?>">
                                                            </div>
                                                            <div id="dvBaseTarefaTempos" class="col-lg-4">
                                                                <span id="lblBaseTarefaTempoGasto"><?php
                                                                    echo $Tarefa->getTempoGasto();
                                                                ?></span> / <span id="lblBaseTarefaTempoEstimado"><?php
                                                                    echo $Tarefa->getTempoEstimado();
                                                                ?></span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="panel-body">
                                                        <ul class="list-group">
                                                            <li id="dvBaseTarefaDesc" class="list-group-item"<?php if (strlen($Tarefa->getDescricao()) < 1) { ?>style="display: none;"<?php } ?>>
                                                                <?php echo $Tarefa->getDescricao(); ?>
                                                            </li>
                                                            <li id="dvBaseTarefaPrazo" class="list-group-item"<?php if (strlen($Tarefa->getDescricao()) < 1) { ?>style="display: none;"<?php } ?>>
                                                                <strong>Prazo</strong>: <?php echo $Tarefa->getPrazo(); ?>
                                                            </li>
                                                            <li id="dvBaseTarefaBody" class="list-group-item">
                                                                <?php
                                                                    foreach ($Tarefa->getPassosMetodo() as $PassoMetodo) {
                                                                        ?>
                                                                        <div class="row sub_task_<?php echo $PassoMetodo->getTipo(); ?>">
                                                                            <div class="col-lg-1">
                                                                                <div class="input-group">
                                                                                    <?php
                                                                                        if ($PassoMetodo->getJaRealizada()) {
                                                                                            $taskDoneIcon = "check";
                                                                                            $taskDoneText = "task_done";
                                                                                        } else {
                                                                                            $taskDoneIcon = "unchecked";
                                                                                            $taskDoneText = "";
                                                                                        }
                                                                                    ?>
                                                                                    <span class="glyphicon glyphicon-<?php echo $taskDoneIcon; ?>" aria-hidden="true" data-tarefa="<?php echo $Tarefa->getId(); ?>" data-passo="<?php echo $PassoMetodo->getId(); ?>"></span>
                                                                                </div>
                                                                            </div>
                                                                            <div class="col-lg-11">
                                                                                <div class="input-group">
                                                                                    <label class="<?php echo $taskDoneText; ?>"><?php echo $PassoMetodo->getNome(); ?></label>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                        <?php
                                                                    }
                                                                ?>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                <?php
                                            }
                                        }
                                    ?>
                                </div>
                                <?php
                            }
                        ?>
                    </div>
                </div>
            </div>

            <div class="modal fade bs-example-modal-lg" id="dvAddTarefaDialog" tabindex="-1" role="dialog" aria-labelledby="lblAddTarefaDialogTitle">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="lblAddTarefaDialogTitle">Adicionar Tarefa</h4>
                        </div>
                        <div class="modal-body">
                            <form id="formAddTarefa">
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">Dados da Tarefa</h3>
                                    </div>
                                    <div class="panel-body">
                                        <div class="input-group">
                                            <span class="input-group-addon" id="lblNome">Nome</span>
                                            <input type="text" class="form-control"  id="txtNome" name="txtNome" aria-describedby="lblNome">
                                        </div>

                                        <div class="input-group">
                                            <span class="input-group-addon" id="lblDescricao">Descri&ccedil;&atilde;o</span>
                                            <input type="text" class="form-control"  id="txtDescricao" name="txtDescricao" aria-describedby="lblNome">
                                        </div>

                                        <div class="input-group">
                                            <span class="input-group-addon" id="lblTempoEstimado">Tempo Estimado</span>
                                            <input type="text" class="form-control"  id="txtTempoEstimado" name="txtTempoEstimado" aria-describedby="lblNome">
                                        </div>

                                        <div class="input-group">
                                            <span class="input-group-addon" id="lblTempoGasto">Tempo Gasto</span>
                                            <input type="text" class="form-control"  id="txtTempoGasto" name="txtTempoGasto" aria-describedby="lblNome">
                                        </div>

                                        <div class="input-group">
                                            <span class="input-group-addon" id="lblPrazo">Prazo para entrega</span>
                                            <input type="text" class="form-control datepicker"  id="txtPrazo" name="txtPrazo" aria-describedby="lblNome">
                                        </div>
                                    </div>
                                </div>

                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">M&eacute;todo</h3>
                                    </div>
                                    <div class="panel-body">
                                        <div id="dvInputModel" class="row">
                                            <div class="col-lg-9">
                                                <div class="input-group">
                                                    <label>A tarefa engloba a inclus&atilde;o/altera&ccedil;&atilde;o de elementos do modelo (exemplo: classes ou atributos)?</label>
                                                </div>
                                            </div>
                                            <div class="col-lg-1">
                                                <div class="input-group">
                                                    <input type="radio" id="rdbModelSim" name="rdbModel" value="Sim"> Sim
                                                </div>
                                            </div>
                                            <div class="col-lg-2">
                                                <div class="input-group">
                                                    <input type="radio" id="rdbModelNao" name="rdbModel" value="Nao"> N&atilde;o
                                                </div>
                                            </div>
                                        </div>

                                        <div id="dvInputDSL" class="row">
                                            <div class="col-lg-9">
                                                <div class="input-group">
                                                    <label>Existe alguma caracter&iacute;stica dos novos elementos que n&atilde;o &eacute; suportado pelo modelo (exemplo: novo tipo de atributo)?</label>
                                                </div>
                                            </div>
                                            <div class="col-lg-1">
                                                <div class="input-group">
                                                    <input type="radio" id="rdbDSLSim" name="rdbDSL" value="Sim"> Sim
                                                </div>
                                            </div>
                                            <div class="col-lg-2">
                                                <div class="input-group">
                                                    <input type="radio" id="rdbDSLNao" name="rdbDSL" value="Nao"> N&atilde;o
                                                </div>
                                            </div>
                                        </div>

                                        <div id="dvInputTemplate" class="row">
                                            <div class="col-lg-9">
                                                <div class="input-group">
                                                    <label>&Eacute; necess&aacute;rio a modifica&ccedil;&atilde;o de algum template?</label>
                                                </div>
                                            </div>
                                            <div class="col-lg-1">
                                                <div class="input-group">
                                                    <input type="radio" id="rdbTemplateSim" name="rdbTemplate" value="Sim"> Sim
                                                </div>
                                            </div>
                                            <div class="col-lg-2">
                                                <div class="input-group">
                                                    <input type="radio" id="rdbTemplateNao" name="rdbTemplate" value="Nao"> N&atilde;o
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                            <button type="button" id="btnAddTarefa" class="btn btn-primary">Adicionar Tarefa</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="dvErrorMessage" tabindex="-1" role="dialog" aria-labelledby="lblErrorMsgTitle">
                <div class="modal-dialog" role="document">
                    <div class="modal-content alert alert-danger">
                        <div class="modal-header alert_modal">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="lblErrorMsgTitle">Erro!</h4>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="input-group">
                                        <label>Status:</label>
                                    </div>
                                </div>
                                <div id="dvStatus" class="col-lg-8">
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-lg-4">
                                    <div class="input-group">
                                        <label>Tipo de erro HTTP:</label>
                                    </div>
                                </div>
                                <div id="dvTipoErroHTTP" class="col-lg-8">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="dvConfirmDeleteTask" tabindex="-1" role="dialog" aria-labelledby="lblConfirmTitle">
                <div class="modal-dialog" role="document">
                    <div class="modal-content alert alert-warning">
                        <div class="modal-header warning_modal_title">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="lblConfirmTitle"></h4>
                        </div>
                        <div class="modal-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <div id="lblConfirmDeleteTaskName" class="input-group">
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer warning_modal_footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Fechar</button>
                            <button type="button" id="btnDeleteTask" class="btn btn-warning">Deletar Tarefa</button>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="dvProgressBarDialog" tabindex="-1" role="dialog" aria-labelledby="lblProgressBarTitle">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="lblProgressBarTitle">Progress Bar</h4>
                        </div>
                        <div class="modal-body">
                            <div class="progress">
                                <div id="dvProgressBar" class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100" style="width: 0%;">
                                    0%
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div id="dvBaseTarefa" class="panel panel-primary">
                <div class="panel-heading">
                    <div class="row panel-title">
                        <div class="col-lg-1">
                            <span class="glyphicon glyphicon-trash btnDestroyTask" style="cursor: pointer;" aria-hidden="true"></span>
                        </div>
                        <div class="col-lg-1">
                            <span class="glyphicon glyphicon-pencil btnEditTask" style="cursor: pointer;" aria-hidden="true"></span>
                        </div>
                        <div class="col-lg-1">
                            <span class="glyphicon glyphicon-minus btnDisplayTask" style="cursor: pointer;" aria-hidden="true"></span>
                        </div>
                        <div class="col-lg-5">
                            <h3 id="lblBaseTarefaNome" class="panel-title"></h3>
                            <input type="hidden" name="txtTaskId" id="txtTaskId">
                        </div>
                        <div id="dvBaseTarefaTempos" class="col-lg-4">
                            <span id="lblBaseTarefaTempoGasto"></span> / <span id="lblBaseTarefaTempoEstimado"></span>
                        </div>
                    </div>
                </div>
                <div class="panel-body">
                    <ul class="list-group">
                        <li id="dvBaseTarefaDesc" class="list-group-item"></li>
                        <li id="dvBaseTarefaPrazo" class="list-group-item"></li>
                        <li id="dvBaseTarefaBody" class="list-group-item">
                            <?php
                                foreach ($passos_metodo as $PassoMetodo) {
                                    ?>
                                    <div class="row sub_task_<?php echo $PassoMetodo->getTipo(); ?>">
                                        <div class="col-lg-1">
                                            <div class="input-group">
                                                <input type="checkbox" value="<?php echo $PassoMetodo->getId(); ?>">
                                            </div>
                                        </div>
                                        <div class="col-lg-11">
                                            <div class="input-group">
                                                <label><?php echo $PassoMetodo->getNome(); ?></label>
                                            </div>
                                        </div>
                                    </div>
                                    <?php
                                }
                            ?>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <!-- Datepicker - Retirado de: http://websocialdev.com/calendario-input-date-com-datepicker-bootstrap/ -->
    <script src="js/bootstrap-datepicker.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Table - Retirado de: http://bootstrap-table.wenzhixin.net.cn/ -->
    <script src="js/bootstrap-table.js"></script>
</html>