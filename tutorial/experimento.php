<!DOCTYPE html>
<html lang="en">
    <head>
        <?php include("html_header.php"); ?>
    </head>
    <body role="document">
        <?php
            include("menu.php");
            require("dados/experimento.php");
        ?>

        <div class="container theme-showcase" role="main">
            <div class="page-header">
                <h1>Experimento</h1>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-4">
                    <div class="thumbnail">
                        <ul id="ulTabExperimento" class="nav nav-tabs" role="tablist">
                            <?php
                                $first = true;
                                foreach ($experimento as $tarefa) {
                                    ?>
                                    <li role="presentation" class="<?php echo ($first ? 'active' : ''); ?>">
                                        <a href="#<?php echo $tarefa['id']; ?>" id="<?php echo $tarefa['id']; ?>-tab" role="tab" data-toggle="tab"
                                            aria-controls="<?php echo $tarefa['id']; ?>" aria-expanded="<?php echo ($first ? 'true' : 'false'); ?>">
                                            <?php echo $tarefa['nome']; ?>
                                        </a>
                                    </li>
                                    <?php
                                        $first = false;
                                }
                            ?>
                        </ul>
                        <div id="myTabContent" class="tab-content">
                            <?php
                                $first = true;
                                foreach ($experimento as $tarefa) {
                                    ?>
                                    <div role="tabpanel" class="tab-pane fade<?php echo ($first ? ' active in' : ''); ?>" id="<?php echo $tarefa['id']; ?>" aria-labelledby="<?php echo $tarefa['id']; ?>-tab">
                                        <div class="container container_tab">
                                            <div class="page-header">
                                                <h1 class="text-center"><?php echo $tarefa['nome']; ?></h1>
                                                <?php
                                                    if (isSet($tarefa['html'])) {
                                                        echo $tarefa['html'];
                                                    }
                                                ?>
                                            </div>
                                            <div class="container container_tab">
                                                <?php
                                                    foreach ($tarefa['passos'] as $key => $passo) {
                                                        if ($key % 3 == 0) {
                                                            if ($key != 0) {
                                                                ?></div><?php
                                                            }
                                                            ?><div class="row stylish-panel"><?php
                                                        }
                                                        ?>
                                                        <div class="col-md-4">
                                                            <div>
                                                                <img src="<?php echo $passo['img']; ?>.png" alt="<?php echo $passo['alt']; ?>" class="img-circle img-thumbnail">
                                                                <h2><?php echo ($key + 1); ?>&ordm; Passo</h2>
                                                                <p>
                                                                    <?php echo $passo['html']; ?>
                                                                </p>
                                                            </div>
                                                        </div>
                                                        <?php
                                                    }
                                                ?>
                                                </div>
                                            </div>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                    <?php
                                        $first = false;
                                }
                            ?>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <?php include("footer.php"); ?>
    </body>
</html>