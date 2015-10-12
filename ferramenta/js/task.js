var currentCol;
var addTarefaDialog;
var editTarefaDialog;
var originalHeightColKanban = 20;

function addTarefaHtml(dataTarefa)
{
    console.log(dataTarefa);
    var newTask = $("#dvBaseTarefa")
        .clone(true)
        .attr("id", dataTarefa.divId)
        .show()
        .appendTo($("#" + dataTarefa.currentCol))
        .data("tarefa", dataTarefa.taskId);

    $(".btnDisplayTask", newTask).data("tarefa-div", dataTarefa.divId);
    $(".btnEditTask", newTask).data("tarefa", dataTarefa.taskId);
    $(".btnDestroyTask", newTask).data("tarefa", dataTarefa.taskId);

    $("#txtTaskId", newTask).val(dataTarefa.taskId);

    $("#lblBaseTarefaNome", newTask).html(dataTarefa.nome);

    $("#lblBaseTarefaTempoGasto", newTask).html(dataTarefa.tempoGasto);
    $("#lblBaseTarefaTempoEstimado", newTask).html(dataTarefa.tempoEstimado);

    if (dataTarefa.descricao.length > 0) {
        $("#dvBaseTarefaDesc", newTask).html(dataTarefa.descricao);
    } else {
        $("#dvBaseTarefaDesc", newTask).hide();
    }

    if (dataTarefa.prazo.length > 0) {
        $("#dvBaseTarefaPrazo", newTask).html("<strong>Prazo</strong>: " + dataTarefa.prazo);
    } else {
        $("#dvBaseTarefaPrazo", newTask).hide();
    }

    if ( ! dataTarefa.englobaModelo) {
        $(".sub_task_model", newTask).remove();
    }

    if ( ! dataTarefa.englobaCriacao) {
        $(".sub_task_criacao", newTask).remove();
    }

    if ( ! dataTarefa.englobaDSL) {
        $(".sub_task_dsl", newTask).remove();
    }

    if ( ! dataTarefa.englobaTemplate) {
        $(".sub_task_template", newTask).remove();
    }

    $("input[type='checkbox']", newTask).each(function() {
        $(this).data("tarefa", dataTarefa.tarefaId);
    });
}

function formAddReset()
{
    $("#formAddTarefa", addTarefaDialog)[0].reset();

    $("#dvInputCriacao", addTarefaDialog).hide();
    $("#dvInputDSL", addTarefaDialog).hide();
    $("#dvInputTemplate", addTarefaDialog).hide();
}

$(function() {
    $("#btnUserMenu").click(function() {
        window.location.href = "deslogar.php"
    });

    addTarefaDialog = $("#dvAddTarefaDialog");

    editTarefaDialog = $(addTarefaDialog)
        .clone(true)
        .attr("id", "dvEditTarefaDialog")
        .attr("aria-labelledby", "lblEditTarefaDialogTitle")
        .appendTo(document.body);

    $("#formAddTarefa", editTarefaDialog)
        .attr("id", "formEditTarefa");

    $("#btnAddTarefa", editTarefaDialog)
        .attr("id", "btnEditTarefa")
        .html("Salvar Tarefa");

    $("#lblAddTarefaDialogTitle", editTarefaDialog)
        .attr("id", "lblEditTarefaDialogTitle")
        .html("Editar Tarefa");

    $('.datepicker').datepicker({
        format: "dd/mm/yyyy"
    });

    $( "#btnAddTarefa" ).click(function() {
        var btnAddTarefa = $(this);
        $(btnAddTarefa).button('loading');

        var tarefaNome = "Tarefa " + idTask;
        if ($("#txtNome", addTarefaDialog).val().length > 0) {
            tarefaNome = $("#txtNome", addTarefaDialog).val();
        }

        var tempoGasto = "0h";
        var tempoEstimado = "0h";

        if ($("#txtTempoGasto", addTarefaDialog).val().length > 0) {
            tempoGasto = $("#txtTempoGasto", addTarefaDialog).val();
        }

        if ($("#txtTempoEstimado", addTarefaDialog).val().length > 0) {
            tempoEstimado = $("#txtTempoEstimado", addTarefaDialog).val();
        }

        var tarefaDescricao = "";
        if ($("#txtDescricao", addTarefaDialog).val().length > 0) {
            tarefaDescricao = $("#txtDescricao", addTarefaDialog).val();
        }

        var tarefaPrazo = "";
        if ($("#txtPrazo", addTarefaDialog).val().length > 0) {
            tarefaPrazo = $("#txtPrazo", addTarefaDialog).val();
        }

        var tarefaEnglobaModelo = $("input[name='rdbModel']:checked", addTarefaDialog).val() == "Sim";
        var tarefaEnglobaCriacao = $("input[name='rdbCriacao']:checked", addTarefaDialog).val() == "Sim";
        var tarefaEnglobaDSL = ($("input[name='rdbDSL']:checked", addTarefaDialog).val() == "Sim");
        var tarefaEnglobaTemplate = ($("input[name='rdbTemplate']:checked", addTarefaDialog).val() == "Sim") || ( ! tarefaEnglobaModelo && ! tarefaEnglobaCriacao && ! tarefaEnglobaDSL);

        $.ajax({
            url: "criarTask.php",
            method: "POST",
            cache: false,
            data: "tarefaNome=" + tarefaNome + "&tempoGasto=" + tempoGasto + "&tempoEstimado=" + tempoEstimado + "&tarefaDescricao=" + tarefaDescricao + "&tarefaPrazo=" + tarefaPrazo + "&tarefaEnglobaModelo=" + tarefaEnglobaModelo + "&tarefaEnglobaCriacao=" + tarefaEnglobaCriacao + "&tarefaEnglobaDSL=" + tarefaEnglobaDSL + "&tarefaEnglobaTemplate=" + tarefaEnglobaTemplate + "&tarefaColKanban=" + currentCol,
            beforeSend: function(jqXHR, settings) {
                $(addTarefaDialog).modal("hide");

                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Salvando a Tarefa no Banco de Dados");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "0");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "0%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("0%");

                $("#dvProgressBarDialog").modal("show");
            },
            error: function(jqXHR, textStatus, errorThrown) {
                $("#dvProgressBarDialog").modal("hide");

                $("#dvStatus", "#dvErrorMessage").html(textStatus);
                $("#dvTipoErroHTTP", "#dvErrorMessage").html(errorThrown);

                $("#dvErrorMessage").modal("show");
            },
            success: function(data, textStatus, jqXHR) {
                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Criando o HTML da Tarefa");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "50");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "50%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("50%");

                var tarefaId = jQuery.parseJSON(data);
                tarefaId = tarefaId.id;

                var tarefaDivId = "dvTask" + tarefaId;

                addTarefaHtml({
                    taskId: tarefaId,
                    divId: tarefaDivId,
                    currentCol: currentCol,
                    nome: tarefaNome,
                    descricao: tarefaDescricao,
                    tempoGasto: tempoGasto,
                    tempoEstimado: tempoEstimado,
                    prazo: tarefaPrazo,
                    englobaModelo: tarefaEnglobaModelo,
                    englobaCriacao: tarefaEnglobaCriacao,
                    englobaDSL: tarefaEnglobaDSL,
                    englobaTemplate: tarefaEnglobaTemplate
                });

                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Tarefa criada com sucesso!");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "100");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "100%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("100%");

                formAddReset();

                idTask++;

                $("#dvProgressBarDialog").modal("hide");
            }
        });

        $(btnAddTarefa).button('reset');
    });

    $(".btnDisplayTask").on("click", function() {
        var tarefaDivId = $(this).data("tarefa-div");

        if ($(this).hasClass("glyphicon-minus")) {
            $(".panel-body", "#" + tarefaDivId).hide();

            $(this).removeClass("glyphicon-minus");
            $(this).addClass("glyphicon-unchecked");
        } else {
            $(".panel-body", "#" + tarefaDivId).show();

            $(this).addClass("glyphicon-minus");
            $(this).removeClass("glyphicon-unchecked");
        }
    });

    $(".btnDestroyTask").on("click", function() {
        var tarefaId = $(this).data("tarefa");

        $("#btnDeleteTask").data("tarefa", tarefaId);

        $("#lblConfirmTitle").html("Deletar a Tarefa!");
        $("#lblConfirmDeleteTaskName").html("Voc&ecirc; realmente deseja remover a tarefa <label>" + $("#lblBaseTarefaNome", "#dvTask" + tarefaId).html() + "</label>?");

        $("#dvConfirmDeleteTask").modal("show");
    });

    $("#btnDeleteTask").click(function() {
        var tarefaId = $("#btnDeleteTask").data("tarefa");

        $.ajax({
            url: "deletarTask.php",
            method: "POST",
            cache: false,
            data: "tarefaId=" + tarefaId,
            beforeSend: function(jqXHR, settings) {
                $("#dvConfirmDeleteTask").modal("hide");

                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Deletando a Tarefa do Banco de Dados");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "0");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "0%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("0%");

                $("#dvProgressBarDialog").modal("show");
            },
            error: function(jqXHR, textStatus, errorThrown) {
                $("#dvProgressBarDialog").modal("hide");

                $("#dvStatus", "#dvErrorMessage").html(textStatus);
                $("#dvTipoErroHTTP", "#dvErrorMessage").html(errorThrown);

                $("#dvErrorMessage").modal("show");
            },
            success: function(data, textStatus, jqXHR) {
                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Deletando o HTML da Tarefa");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "50");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "50%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("50%");

                $("#dvTask" + tarefaId).remove();

                $("#lblProgressBarTitle", "#dvProgressBarDialotarefaIdg").html("Tarefa deletada com sucesso do Banco de Dados!");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "100");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "100%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("100%");

                $("#dvProgressBarDialog").modal("hide");
            }
        });
    });

    $(".btnEditTask").on("click", function() {
        var tarefaId = $(this).data("tarefa");
        var dvTask = $("#dvTask" + tarefaId);

        $("#btnEditTarefa").data("tarefa", tarefaId);

        $("#txtNome", editTarefaDialog).val($("#lblBaseTarefaNome", dvTask).html());

        $("#txtTempoGasto", editTarefaDialog).val($("#lblBaseTarefaTempoGasto", dvTask).html());

        $("#txtTempoEstimado", editTarefaDialog).val($("#lblBaseTarefaTempoEstimado", dvTask).html());

        if ($("#dvBaseTarefaDesc", dvTask).is(":visible")) {
            $("#txtDescricao", editTarefaDialog).val($("#dvBaseTarefaDesc", dvTask).html());
        } else {
            $("#txtDescricao", editTarefaDialog).val("");
        }

        if ($("#dvBaseTarefaPrazo", dvTask).is(":visible")) {
            $("#txtPrazo", editTarefaDialog).val($("#dvBaseTarefaPrazo", dvTask).html());
        } else {
            $("#txtPrazo", editTarefaDialog).val("");
        }

        var tarefaEnglobaModelo = $(".sub_task_model", dvTask).length > 0;
        var tarefaEnglobaCriacao = $(".sub_task_criacao", dvTask).length > 0;
        var tarefaEnglobaDSL = $(".sub_task_dsl", dvTask).length > 0;
        var tarefaEnglobaTemplate = $(".sub_task_template", dvTask).length > 0;

        console.log(dvTask);dvTask
        console.log(tarefaEnglobaDSL);
        console.log(tarefaEnglobaTemplate);

        if (tarefaEnglobaModelo) {
            $("#rdbModelSim", editTarefaDialog).prop('checked', true);

            $("#rdbCriacaoNao", editTarefaDialog).prop('checked', true);
            $("#dvInputCriacao", editTarefaDialog).hide();
            $("#rdbDSLNao", editTarefaDialog).prop('checked', true);
            $("#dvInputDSL", editTarefaDialog).hide();
            $("#rdbTemplateNao", editTarefaDialog).prop('checked', true);
            $("#dvInputTemplate", editTarefaDialog).hide();
        } else {
            $("#rdbModelNao", editTarefaDialog).prop('checked', true);
            $("#dvInputCriacao", editTarefaDialog).show();

            if (tarefaEnglobaCriacao) {
                $("#rdbCriacaoSim", editTarefaDialog).prop('checked', true);

                $("#rdbDSLNao", editTarefaDialog).prop('checked', true);
                $("#dvInputDSL", editTarefaDialog).hide();
                $("#rdbTemplateNao", editTarefaDialog).prop('checked', true);
                $("#dvInputTemplate", editTarefaDialog).hide();
            } else {
                $("#rdbCriacaoNao", editTarefaDialog).prop('checked', true);

                $("#dvInputDSL", editTarefaDialog).show();

                if (tarefaEnglobaDSL) {
                    $("#rdbDSLSim", editTarefaDialog).prop('checked', true);

                    $("#dvInputTemplate", editTarefaDialog).show();

                    if (tarefaEnglobaTemplate) {
                        $("#rdbTemplateSim", editTarefaDialog).prop('checked', true);
                    } else {
                        $("#rdbTemplateNao", editTarefaDialog).prop('checked', true);
                    }
                } else {
                    $("#rdbDSLNao", editTarefaDialog).prop('checked', true);

                    $("#dvInputTemplate", editTarefaDialog).show();

                    if (tarefaEnglobaTemplate) {
                        $("#rdbTemplateSim", editTarefaDialog).prop('checked', true);
                    } else {
                        $("#rdbTemplateNao", editTarefaDialog).prop('checked', true);
                    }
                }
            }
        }

        $(editTarefaDialog).modal("show");
    });

    $("#btnEditTarefa").click(function() {
        var btnEditTarefa = $(this);
        $(btnEditTarefa).button('loading');

        var tarefaId = $("#btnEditTarefa").data("tarefa");
        var tarefaDivId = "dvTask" + tarefaId;
        var currentTask = $("#" + tarefaDivId);

        currentCol = $(currentTask).parent().attr("id");

        var tarefaNome = "Tarefa " + tarefaId;
        if ($("#txtNome", editTarefaDialog).val().length > 0) {
            tarefaNome = $("#txtNome", editTarefaDialog).val();
        }

        var tempoGasto = "0h";
        var tempoEstimado = "0h";

        if ($("#txtTempoGasto", editTarefaDialog).val().length > 0) {
            tempoGasto = $("#txtTempoGasto", editTarefaDialog).val();
        }

        if ($("#txtTempoEstimado", editTarefaDialog).val().length > 0) {
            tempoEstimado = $("#txtTempoEstimado", editTarefaDialog).val();
        }

        var tarefaDescricao = "";
        if ($("#txtDescricao", editTarefaDialog).val().length > 0) {
            tarefaDescricao = $("#txtDescricao", editTarefaDialog).val();
        }

        var tarefaPrazo = "";
        if ($("#txtPrazo", editTarefaDialog).val().length > 0) {
            tarefaPrazo = $("#txtPrazo", editTarefaDialog).val();
        }

        var tarefaEnglobaModelo = $("input[name='rdbModel']:checked", editTarefaDialog).val() == "Sim";
        var tarefaEnglobaCriacao = $("input[name='rdbCriacao']:checked", editTarefaDialog).val() == "Sim";
        var tarefaEnglobaDSL = ($("input[name='rdbDSL']:checked", editTarefaDialog).val() == "Sim");
        var tarefaEnglobaTemplate = ($("input[name='rdbTemplate']:checked", editTarefaDialog).val() == "Sim") || ( ! tarefaEnglobaModelo && ! tarefaEnglobaCriacao && ! tarefaEnglobaDSL);

        $.ajax({
            url: "editarTask.php",
            method: "POST",
            cache: false,
            data: "tarefaId=" + tarefaId + "&tarefaNome=" + tarefaNome + "&tempoGasto=" + tempoGasto + "&tempoEstimado=" + tempoEstimado + "&tarefaDescricao=" + tarefaDescricao + "&tarefaPrazo=" + tarefaPrazo + "&tarefaEnglobaModelo=" + tarefaEnglobaModelo + "&tarefaEnglobaCriacao=" + tarefaEnglobaCriacao + "&tarefaEnglobaDSL=" + tarefaEnglobaDSL + "&tarefaEnglobaTemplate=" + tarefaEnglobaTemplate + "&tarefaColKanban=" + currentCol,
            beforeSend: function(jqXHR, settings) {
                $(editTarefaDialog).modal("hide");

                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Salvando a Tarefa no Banco de Dados");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "0");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "0%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("0%");

                $("#dvProgressBarDialog").modal("show");
            },
            error: function(jqXHR, textStatus, errorThrown) {
                $("#dvProgressBarDialog").modal("hide");

                $("#dvStatus", "#dvErrorMessage").html(textStatus);
                $("#dvTipoErroHTTP", "#dvErrorMessage").html(errorThrown);

                $("#dvErrorMessage").modal("show");
            },
            success: function(data, textStatus, jqXHR) {
                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Criando o HTML da Tarefa");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "50");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "50%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("50%");

                $(currentTask).remove();

                addTarefaHtml({
                    taskId: tarefaId,
                    divId: tarefaDivId,
                    currentCol: currentCol,
                    nome: tarefaNome,
                    descricao: tarefaDescricao,
                    tempoGasto: tempoGasto,
                    tempoEstimado: tempoEstimado,
                    prazo: tarefaPrazo,
                    englobaModelo: tarefaEnglobaModelo,
                    englobaCriacao: tarefaEnglobaCriacao,
                    englobaDSL: tarefaEnglobaDSL,
                    englobaTemplate: tarefaEnglobaTemplate
                });

                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Tarefa criada com sucesso!");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "100");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "100%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("100%");

                $("#dvProgressBarDialog").modal("hide");
            }
        });

        $(btnEditTarefa).button('reset');
    });

    $(".sub_task_model, .sub_task_dsl, .sub_task_template").on("click", function() {
        var taskDone;
        var tarefaId = $("span", this).data("tarefa");
        var passoId = $("span", this).data("passo");

        if ($("label", this).hasClass("task_done")) {
            taskDone = false;

            $("label", this).removeClass("task_done");

            $("span", this).addClass("glyphicon-unchecked");
            $("span", this).removeClass("glyphicon-check");
        } else {
            taskDone = true;

            $("label", this).addClass("task_done");

            $("span", this).removeClass("glyphicon-unchecked");
            $("span", this).addClass("glyphicon-check");
        }

        $.ajax({
            url: "editarTaskPasso.php",
            method: "POST",
            cache: false,
            data: "tarefaId=" + tarefaId + "&passoId=" + passoId + "&taskDone=" + taskDone,
            beforeSend: function(jqXHR, settings) {
                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Salvando a Tarefa no Banco de Dados");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "0");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "0%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("0%");

                $("#dvProgressBarDialog").modal("show");
            },
            error: function(jqXHR, textStatus, errorThrown) {
                $("#dvProgressBarDialog").modal("hide");

                $("#dvStatus", "#dvErrorMessage").html(textStatus);
                $("#dvTipoErroHTTP", "#dvErrorMessage").html(errorThrown);

                $("#dvErrorMessage").modal("show");
            },
            success: function(data, textStatus, jqXHR) {

                $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Tarefa salva com sucesso!");

                $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "100");
                $("#dvProgressBar", "#dvProgressBarDialog").css("width", "100%");
                $("#dvProgressBar", "#dvProgressBarDialog").html("100%");

                $("#dvProgressBarDialog").modal("hide");
            }
        });
    });

    $("#btnAddToDo").click(function() {
        currentCol = "colToDo";
        formAddReset();
    });
    $("#btnAddDoToday").click(function() {
        currentCol = "colDoToday";
        formAddReset();
    });
    $("#btnAddInProgress").click(function() {
        currentCol = "colInProgress";
        formAddReset();
    });
    $("#btnAddDone").click(function() {
        currentCol = "colDone";
        formAddReset();
    });

    $("#txtPrazo").datepicker();

    $("#dvInputCriacao").hide();
    $("#dvInputDSL").hide();
    $("#dvInputTemplate").hide();

    $("input[name='rdbModel']", addTarefaDialog).click(function() {
        if ($(this).val() == "Sim") {
            $("#dvInputCriacao", addTarefaDialog).hide();
            $("#dvInputDSL", addTarefaDialog).hide();
            $("#dvInputTemplate", addTarefaDialog).hide();

            $("#rdbCriacaoNao", addTarefaDialog).prop('checked', true);
        } else {
            $("#dvInputCriacao", addTarefaDialog).show();

            $("#rdbCriacaoSim", addTarefaDialog).prop('checked', true);
        }
    });

    $("input[name='rdbCriacao']", addTarefaDialog).click(function() {
        if ($(this).val() == "Sim") {
            $("#dvInputDSL", addTarefaDialog).hide();
            $("#dvInputTemplate", addTarefaDialog).hide();

            $("#rdbDSLNao", addTarefaDialog).prop('checked', true);
            $("#rdbTemplateNao", addTarefaDialog).prop('checked', true);
        } else {
            $("#dvInputDSL", addTarefaDialog).show();

            $("#rdbDSLSim", addTarefaDialog).prop('checked', true);

            $("#dvInputTemplate", addTarefaDialog).show();

            $("#rdbTemplateSim", addTarefaDialog).prop('checked', true);
        }
    });

    $("input[name='rdbModel']", editTarefaDialog).click(function() {
        if ($(this).val() == "Sim") {
            $("#dvInputCriacao", editTarefaDialog).hide();
            $("#dvInputDSL", editTarefaDialog).hide();
            $("#dvInputTemplate", editTarefaDialog).hide();

            $("#rdbCriacaoNao", editTarefaDialog).prop('checked', true);
        } else {
            $("#dvInputCriacao", editTarefaDialog).show();

            $("#rdbCriacaoSim", editTarefaDialog).prop('checked', true);
        }
    });

    $("input[name='rdbCriacao']", editTarefaDialog).click(function() {
        if ($(this).val() == "Sim") {
            $("#dvInputDSL", editTarefaDialog).hide();
            $("#dvInputTemplate", editTarefaDialog).hide();

            $("#rdbDSLNao", editTarefaDialog).prop('checked', true);
            $("#rdbTemplateNao", editTarefaDialog).prop('checked', true);
        } else {
            $("#dvInputDSL", editTarefaDialog).show();

            $("#rdbDSLSim", editTarefaDialog).prop('checked', true);

            $("#dvInputTemplate", editTarefaDialog).show();

            $("#rdbTemplateSim", editTarefaDialog).prop('checked', true);
        }
    });

    $("#dvBaseTarefa").hide();

    $("#colToDo, #colDoToday, #colInProgress, #colDone").sortable({
        cursor: "pointer",
        connectWith: ".col_kanban",
        helper: 'clone',
        scroll: !0,
        appendTo: document.body,
        update: function( event, ui ) {
            var tarefaId = $(ui.item).data("tarefa");

            $.ajax({
                url: "editarColKanbanTask.php",
                method: "POST",
                cache: false,
                data: "tarefaId=" + tarefaId + "&tarefaColKanban=" + $(ui.item).parent().attr("id"),
                beforeSend: function(jqXHR, settings) {
                    $("#dvConfirmDeleteTask").modal("hide");

                    $("#lblProgressBarTitle", "#dvProgressBarDialog").html("Salvando as altera&ccedil;&otilde;es na Tarefa no Banco de Dados");

                    $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "0");
                    $("#dvProgressBar", "#dvProgressBarDialog").css("width", "0%");
                    $("#dvProgressBar", "#dvProgressBarDialog").html("0%");

                    $("#dvProgressBarDialog").modal("show");
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    $("#dvProgressBarDialog").modal("hide");

                    $("#dvStatus", "#dvErrorMessage").html(textStatus);
                    $("#dvTipoErroHTTP", "#dvErrorMessage").html(errorThrown);

                    $("#dvErrorMessage").modal("show");
                },
                success: function(data, textStatus, jqXHR) {
                    $("#lblProgressBarTitle", "#dvProgressBarDialotarefaIdg").html("Tarefa salva com sucesso no Banco de Dados!");

                    $("#dvProgressBar", "#dvProgressBarDialog").attr("aria-valuenow", "100");
                    $("#dvProgressBar", "#dvProgressBarDialog").css("width", "100%");
                    $("#dvProgressBar", "#dvProgressBarDialog").html("100%");

                    $("#dvProgressBarDialog").modal("hide");
                }
            });
        }
    }).disableSelection();

    $(".col_kanban").height($(window).outerHeight(true)  - $("#dvKanbanColTitle").outerHeight(true) - originalHeightColKanban);

    $(window).resize(function() {
        $(".col_kanban").height($(window).outerHeight(true)  - $("#dvKanbanColTitle").outerHeight(true) - originalHeightColKanban);
    });
});