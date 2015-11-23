<?php
    $urlPacoteExperimento = "https://www.dropbox.com/s/wecq4t44rwumv93/experimento.zip?dl=0";
    $urlQuestionaioExperimento = "http://goo.gl/forms/tYiGPFp9dO";
    $urlFerramentaKanban = "http://arndt-server.ddns.net:8080/metodo_mdd/ferramenta/";

    $path = $_SERVER["SCRIPT_NAME"];
    $path = explode("/", $path);
    unset($path[count($path) - 1]);
    $path = implode("/", $path);
    $sysPath = $_SERVER["REQUEST_SCHEME"] . "://" . $_SERVER["HTTP_HOST"] . $path;

    $imgFolder = $sysPath . "/img/";

    $menu = array(
        "/index.php" => "Home",
        "/introducao_mdd.php" => "Introdu&ccedil;&atilde;o ao MDD",
        "/ferramenta_possatto.php" => "Ferramenta Possatto",
        "/ferramenta_perini.php" => "Ferramenta Perini",
        "/metodo.php" => "M&eacute;todo",
        "/downloads.php" => "Downloads",
        "/experimento.php" => "Experimento"
    );
?>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/">Tutorial</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <?php
                    foreach ($menu as $pageURL => $pageName) {
                            $active = "";
                            if ($_SERVER["SCRIPT_NAME"] == $pageURL) {
                                $active = "active";
                            }
                        ?>
                            <li class="<?php echo $active; ?>">
                                <a href="<?php echo $sysPath . $pageURL; ?>"><?php echo $pageName; ?></a>
                            </li>
                        <?php
                    }
                ?>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>