var currentCol;

$(document).ready(function () {
    $('.datepicker').datepicker({
        format: "dd/mm/yyyy"
    });
});

$(function() {
    $( "#btnAddTarefa" ).click(function() {
        var btnAddTarefa = $(this);
        $(btnAddTarefa).button('loading');

        var tarefaNome = "Tarefa " + idTask;
        if ($("#txtNome").val().length > 0) {
            tarefaNome = $("#txtNome").val();
        }

        var tempoGasto = "0h";
        var tempoEstimado = "0h";

        if ($("#txtTempoGasto").val().length > 0) {
            tempoGasto = $("#txtTempoGasto").val();
        }

        if ($("#txtTempoEstimado").val().length > 0) {
            tempoEstimado = $("#txtTempoEstimado").val();
        }

        var tarefaDescricao = "";
        if ($("#txtDescricao").val().length > 0) {
            tarefaDescricao = $("#txtDescricao").val();
        }

        var tarefaPrazo = "";
        if ($("#txtPrazo").val().length > 0) {
            tarefaPrazo = $("#txtPrazo").val();
        }

        var tarefaEnglobaModelo = $("input[name='rdbModel']:checked").val() == "Sim";
        var tarefaEnglobaDSL = $("input[name='rdbDSL']:checked").val() == "Sim";
        var tarefaEnglobaTemplate = $("input[name='rdbTemplate']:checked").val() == "Sim";

        $.ajax({
            url: "criarTask.php",
            method: "POST",
            cache: false,
            data: "tarefaNome=" + tarefaNome + "&tempoGasto=" + tempoGasto + "&tempoEstimado=" + tempoEstimado + "&tarefaDescricao=" + tarefaDescricao + "&tarefaPrazo=" + tarefaPrazo + "&tarefaEnglobaModelo=" + tarefaEnglobaModelo + "&tarefaEnglobaDSL=" + tarefaEnglobaDSL + "&tarefaEnglobaTemplate=" + tarefaEnglobaTemplate,
            beforeSend: function(jqXHR, settings) {
            },
            error: function(jqXHR, textStatus, errorThrown) {

            },
            success: function(data, textStatus, jqXHR) {
                var newTask = $("#dvBaseTarefa")
                    .clone(true)
                    .attr("id", "dvTask" + idTask)
                    .show()
                    .appendTo($("#" + currentCol));

                $("#lblBaseTarefaNome", newTask).html(tarefaNome);

                $("#dvBaseTarefaTempos", newTask).html(tempoGasto + " / " + tempoEstimado);

                if (tarefaDescricao.length > 0) {
                    $("#dvBaseTarefaDesc", newTask).html(tarefaDescricao);
                } else {
                    $("#dvBaseTarefaDesc", newTask).hide();
                }

                if (tarefaPrazo.length > 0) {
                    $("#dvBaseTarefaPrazo", newTask).html("<strong>Prazo</strong>: " + tarefaPrazo);
                } else {
                    $("#dvBaseTarefaPrazo", newTask).hide();
                }

                if (tarefaEnglobaModelo) {
                    if ( ! tarefaEnglobaDSL) {
                        $(".sub_task_dsl", newTask).remove();
                    }

                    if (tarefaEnglobaTemplate) {
                        $(".sub_task_template", newTask).remove();
                    }
                } else {
                    $(".sub_task_dsl", newTask).remove();
                    $(".sub_task_model", newTask).remove();
                }

                $("#btnDisplayTask", newTask).click(function() {
                    if ($(this).hasClass("glyphicon-minus")) {
                        $(".panel-body", newTask).hide();

                        $(this).removeClass("glyphicon-minus");
                        $(this).addClass("glyphicon-unchecked");
                    } else {
                        $(".panel-body", newTask).show();

                        $(this).addClass("glyphicon-minus");
                        $(this).removeClass("glyphicon-unchecked");
                    }
                });

                $(".sub_task_model, .sub_task_dsl, .sub_task_template", newTask).click(function() {
                    if ($("input[type='checkbox']", this).prop('checked')) {
                        $("label", this).removeClass("task_done");
                        $("input[type='checkbox']", this).prop('checked', false);
                    } else {
                        $("label", this).addClass("task_done");
                        $("input[type='checkbox']", this).prop('checked', true);
                    }
                });

                idTask++;

                $("#dvAddTarefaDialog").modal("hide");
            }
        });

        $(btnAddTarefa).button('reset');
    });

    $("#btnAddToDo").click(function() {
        currentCol = "colToDo";
    });
    $("#btnAddDoToday").click(function() {
        currentCol = "colDoToday";
    });
    $("#btnAddInProgress").click(function() {
        currentCol = "colInProgress";
    });
    $("#btnAddDone").click(function() {
        currentCol = "colDone";
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
        cursor: "pointer",
        connectWith: ".col_kanban",
        helper: 'clone',
        scroll: !0,
        appendTo: document.body
    }).disableSelection();

    var marginColKanban = $(".panel-default").outerHeight(true) - $(".col_kanban").height();

    $(".col_kanban").height($(window).outerHeight(true) - marginColKanban);

    $(window).resize(function() {
        var marginColKanban = $(".panel-default").outerHeight(true) - $(".col_kanban").height();

        $(".col_kanban").height($(window).outerHeight(true) - marginColKanban);
    });
});