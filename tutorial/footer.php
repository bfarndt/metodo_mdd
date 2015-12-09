<footer class="footer">
    <div class="container">
        <p class="text-muted">2015. M&eacute;todo criado por Bruno Felipe Arndt e Daniel Lucr&eacute;dio.</p>
    </div>
</footer>

<!-- Datepicker - Retirado de: http://websocialdev.com/calendario-input-date-com-datepicker-bootstrap/ -->
<script src="js/bootstrap-datepicker.js"></script>

<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>

<!-- Image Zoom: http://www.elevateweb.co.uk/image-zoom -->
<script src="js/jquery.elevateZoom-3.0.8.min.js"></script>

<script type="text/javascript">
    $(document).ready(function () {
        var $input = $("#txtArquivoTarefa1");

        $('.datepicker').datepicker({
            format: "yyyy-mm-dd"
        });

        $(".img_zoom").elevateZoom({
            zoomType: "lens",
            lensShape: "round",
            lensSize: 200
        });

        $('.open_dialog').click(function() {
            $('.modal-body', '#dvDialogMaisInfos').html($($(this).attr('href')).html());
            $('#dvDialogMaisInfos').modal('show');

            return false;
        });

        $('.open_dialog_upload').click(function() {
            if (tarefaId != 0) {
                $input.fileinput('destroy');
            }
            tarefaId = $(this).data('tarefaId');
            $('#lblDialogUploadTarefaId').html(tarefaId);
            $('#dvDialogUploadTarefa').modal('show');

            $input.fileinput({
                language:"pt-BR",
                uploadUrl: "<?php echo $sysPath; ?>/upload.php", // server upload action
                uploadExtraData: {tarefa: tarefaId},
                browseClass: "btn btn-primary btn-block",
                showCaption: false,
                showUpload: false, // hide upload button
                showRemove: false, // hide remove button
                initialPreviewShowDelete: false,
                allowedFileExtensions: ['zip', 'rar', 'gz', 'tgz'],
                elErrorContainer: '#errorBlock',
                minFileCount: 1,
                maxFileCount: 1
            }).on("filebatchselected", function(event, files) {
                // trigger upload method immediately after files are selected
                $input.fileinput("upload");
            });
        });
    });
</script>

<!-- Table - Retirado de: http://bootstrap-table.wenzhixin.net.cn/ -->
<script src="js/bootstrap-table.js"></script>
