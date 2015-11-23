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

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui.min.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body role="document">
        <div class="container theme-showcase" role="main">
            <div class="modal fade bs-example-modal-lg" id="dvLoginDialog" tabindex="-1" role="dialog" aria-labelledby="lblLoginDialogTitle">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="lblLoginDialogTitle">Login</h4>
                        </div>
                        <div class="modal-body">
                            <form id="formLogin" method="POST" action="logar.php">
                                <div class="panel panel-default">
                                    <div class="input-group">
                                        <span class="input-group-addon" id="lblEmail">E-mail</span>
                                        <input type="text" class="form-control"  id="txtEmail" name="txtEmail" aria-describedby="lblEmail">
                                    </div>

                                    <div class="input-group">
                                        <span class="input-group-addon" id="lblSenha">Senha</span>
                                        <input type="password" class="form-control"  id="txtSenha" name="txtSenha" aria-describedby="lblSenha">
                                    </div>
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" id="btnReset" class="btn btn-default">Limpar</button>
                            <button type="button" id="btnLogin" class="btn btn-primary">Logar</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

    <script type="text/javascript">
        $(function() {
            $("#dvLoginDialog").modal("show");

            $('#dvLoginDialog').on('hide.bs.modal', function (e) {
                return false;
            });

            $("#btnReset").click(function() {
                $("#formLogin")[0].reset();
            });

            $("#btnLogin").click(function() {
                $("#formLogin")[0].submit();
            });
        });
    </script>
</html>