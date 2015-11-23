<!DOCTYPE html>
<html lang="en">
    <head>
        <?php include("html_header.php"); ?>
    </head>
    <body role="document">
        <?php include "menu.php" ?>

        <div class="container theme-showcase" role="main">
            <div class="page-header">
                <h1>
                    Downloads
                </h1>
            </div>
            <div class="container container_tab">
                <div class="row stylish-panel">
                    <div class="col-lg-6">
                        <div>
                            <a href="<?php echo $urlPacoteExperimento; ?>" target="_blank">
                                <img src="<?php echo $imgFolder; ?>/logo_extrair.png" alt="Pacote Experimento" class="img-circle img-thumbnail">
                                <h2>Pacote Experimento</h2>
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div>
                            <a href="https://github.com/bfarndt/metodo_mdd" target="_blank">
                                <img src="<?php echo $imgFolder; ?>/logo_extrair.png" alt="GitHub do Projeto" class="img-circle img-thumbnail">
                                <h2>GitHub do Projeto</h2>
                            </a>
                        </div>
                    </div>
                </div>
            </div><!-- /container -->
        </div>

        <?php include("footer.php"); ?>
    </body>
</html>