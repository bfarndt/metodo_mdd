<!DOCTYPE html>
<html>
<head>
    <title>Ferramenta</title>

    <link rel="stylesheet" type="text/css" href="css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="css/jquery-ui.structure.min.css">
    <link rel="stylesheet" type="text/css" href="css/jquery-ui.theme.min.css">

    <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="js/jquery-ui.min.js"></script>
    <script type="text/javascript" src="js/datepicker-pt-BR.js"></script>
</head>
<body >
    <table id="tableKanban" border="1" style="width: 100%; height: 900px;">
        <thead>
            <tr>
                <th width="25%">To-do <span id="btnAddToDo" class="ui-icon ui-icon-circle-plus" style="cursor: pointer;"></span></th>
                <th width="25%">Do today <span id="btnAddDoToday" class="ui-icon ui-icon-circle-plus" style="cursor: pointer;"></span></th>
                <th width="25%">In progress <span id="btnAddInProgress" class="ui-icon ui-icon-circle-plus" style="cursor: pointer;"></span></th>
                <th width="25%">Done <span id="btnAddDone" class="ui-icon ui-icon-circle-plus" style="cursor: pointer;"></span></th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td id="colToDo" class="col_kanban"></td>
                <td id="colDoToday" class="col_kanban"></td>
                <td id="colInProgress" class="col_kanban"></td>
                <td id="colDone" class="col_kanban"></td>
            </tr>
        </tbody>
    </table>

    <div id="dvAddTarefaDialog" title="Adicionar nova Tarefa">
        <form id="formAddTarefa">
            <fieldset>
                <legend>Dados da Tarefa:</legend>

                <label for="txtNome">Nome:</label>
                <input type="text" id="txtNome" name="txtNome"> <br>

                <label for="txtDescricao">Descri&ccedil;&atilde;o:</label>
                <textarea id="txtDescricao" name="txtDescricao"></textarea> <br>

                <label for="txtTempoEstimado">Tempo Estimado:</label>
                <input type="text" id="txtTempoEstimado" name="txtTempoEstimado"> <br>

                <label for="txtTempoGasto">Tempo Gasto:</label>
                <input type="text" id="txtTempoGasto" name="txtTempoGasto"> <br>

                <label for="txtPrazo">Prazo para entrega:</label>
                <input type="text" id="txtPrazo" name="txtPrazo">
            </fieldset>
            <fieldset>
                <legend>M&eacute;todo:</legend>

                <div id="dvInputModel">
                    <label for="rdbModel">A tarefa engloba a inclus&atilde;o/altera&ccedil;&atilde;o de elementos do modelo (exemplo: classes ou atributos)?</label>
                    <input type="radio" id="rdbModelSim" name="rdbModel" value="Sim">Sim <input type="radio" id="rdbModelNao" name="rdbModel" value="Nao">N&atilde;o
                </div>

                <div id="dvInputDSL">
                    <label for="rdbDSL">Existe alguma caracter&iacute;stica dos novos elementos que n&atilde;o &eacute; suportado pelo modelo (exemplo: novo tipo de atributo)?</label>
                    <input type="radio" id="rdbDSLSim" name="rdbDSL" value="Sim">Sim <input type="radio" id="rdbDSLNao" name="rdbDSL" value="Nao">N&atilde;o
                </div>

                <div id="dvInputTemplate">
                    <label for="rdbTemplate">&Eacute; necess&aacute;rio a modifica&ccedil;&atilde;o de algum template?</label>
                    <input type="radio" id="rdbTemplateSim" name="rdbTemplate" value="Sim">Sim <input type="radio" id="rdbTemplateNao" name="rdbTemplate" value="Nao">N&atilde;o
                </div>

                <!-- Allow form submission with keyboard without duplicating the dialog button -->
                <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
            </fieldset>
        </form>
    </div>

    <div id="dvBaseTarefa">
        <div id="dvBaseTarefaNome"></div>
        <div id="dvBaseTarefaTempos"></div>
        <div id="dvBaseTarefaDesc"></div>
        <div id="dvBaseTarefaPrazo"></div>
        <div id="dvBaseTarefaBody">
            <table>
                <tbody>
                    <tr class="sub_task_dsl">
                        <td >
                            <input type="checkbox">
                        </td>
                        <td>
                            Fechar a inst&acirc;ncia atual do Eclipse.
                        </td>
                    </tr>
                    <tr class="sub_task_dsl">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Abrir o arquivo <strong>.xtex</strong> no projeto da DSL.
                        </td>
                    </tr>
                    <tr class="sub_task_dsl">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Modificar e salvar o Xtext de acordo com as necessidades da tarefa (caso tenha d&uacute;vidas sobre a sintaxe do Xtext, <a href="http://www.eclipse.org/Xtext/documentation/" target="_blank">clique aqui</a>).
                        </td>
                    </tr>
                    <tr class="sub_task_dsl">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Clicar com o bot&atilde;o direito sobre o arquivo <strong>.mwe2</strong> e na op&ccedil;&atilde;o "Run As", clicar em "MWE2 Workflow".
                        </td>
                    </tr>
                    <tr class="sub_task_dsl">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Abrir a pasta da inst&acirc;ncia nova do Eclipse e apagar a pasta <strong>.metadata</strong>.
                        </td>
                    </tr>
                    <tr class="sub_task_dsl">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            No bot&atilde;o "Run As" do Eclipse, clicar em "Eclipse Application".
                        </td>
                    </tr>
                    <tr class="sub_task_model">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Modificar e salvar o Modelo de acordo com as necessidades da tarefa e seguindo as defini&ccedil;&otilde;es da DSL (Xtext).
                        </td>
                    </tr>
                    <tr class="sub_task_model">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            No bot&atilde;o "Run As" da inst&acirc;ncia nova do Eclipse, clicar em "JET Transformation".
                        </td>
                    </tr>
                    <tr class="sub_task_model">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                        Testar as modifica&ccedil;&otilde;es.
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Localizar e abrir os arquivos da IR que precisam ser modificados.
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Utilizando o "Split JET Editor", abrir os templates correspondentes, deixando-os em uma view e os arquivos da IR em outra.
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Modificar e salvar os arquivos da IR de acordo com as necessidades da tarefa.
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Testar as modifica&ccedil;&otilde;es da IR.
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Aplicar as modifica&ccedil;&otilde;es nos templates correspondentes.
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            No bot&atilde;o "Run As" da inst&acirc;ncia nova do Eclipse, clicar em "JET Transformation".
                        </td>
                    </tr>
                    <tr class="sub_task_template">
                        <td>
                            <input type="checkbox">
                        </td>
                        <td>
                            Testar as modifica&ccedil;&otilde;es.
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</body>
<script type="text/javascript">
    var dialog;
    var currentCol;
    var idTask = 0;

    $(function() {
        dialog = $( "#dvAddTarefaDialog" ).dialog({
            autoOpen: false,
            height: 550,
            width: 600,
            modal: true,
            buttons: {
                "Adicionar Tarefa": function() {
                    var newTask = $("#dvBaseTarefa")
                        .clone(true)
                        .attr("id", "dvTask" + idTask)
                        .show()
                        .appendTo($("#" + currentCol));

                    $("#dvBaseTarefaNome", newTask).html($("#txtNome").val());
                    $("#dvBaseTarefaTempos", newTask).html($("#txtTempoGasto").val() + " / " + $("#txtTempoEstimado").val());
                    $("#dvBaseTarefaDesc", newTask).html($("#txtDescricao").val());
                    $("#dvBaseTarefaPrazo", newTask).html($("#txtPrazo").val());

                    if ($("input[name='rdbModel']:checked").val() == "Sim") {
                        if ($("input[name='rdbDSL']:checked").val() != "Sim") {
                            $(".sub_task_dsl", newTask).remove();
                        }

                        if ($("input[name='rdbTemplate']:checked").val() != "Sim") {
                            $(".sub_task_template", newTask).remove();
                        }
                    } else {
                        $(".sub_task_dsl", newTask).remove();
                        $(".sub_task_model", newTask).remove();
                    }

                    dialog.dialog( "close" );
                },
                "Cancelar": function() {
                    currentCol = "";
                    dialog.dialog( "close" );
                }
            },
            close: function() {
                //$("#formAddTarefa").reset();
                //allFields.removeClass( "ui-state-error" );
            }
        });

        $("#btnAddToDo").click(function() {
            currentCol = "colToDo";
            dialog.dialog("open");
        });
        $("#btnAddDoToday").click(function() {
            currentCol = "colDoToday";
            dialog.dialog("open");
        });
        $("#btnAddInProgress").click(function() {
            currentCol = "colInProgress";
            dialog.dialog("open");
        });
        $("#btnAddDone").click(function() {
            currentCol = "colDone";
            dialog.dialog("open");
        });

        $("#txtPrazo").datepicker();

        $("#dvInputDSL").hide();
        $("#dvInputTemplate").hide();

        $("input[name='rdbModel']").click(function() {
            if ($(this).val() == "Sim") {
                $("#dvInputDSL").show();
                $("#dvInputTemplate").show();
            } else {
                $("#dvInputDSL").hide();
                $("#dvInputTemplate").hide();
            }
        });

        $("#dvBaseTarefa").hide();

        $("#colToDo, #colDoToday, #colInProgress, #colDone").sortable({
            connectWith: ".col_kanban"
        }).disableSelection();
    });
</script>
</html>