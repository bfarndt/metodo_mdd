<?php
    $urlPacoteExperimento = "#";
    $urlQuestionaioExperimento = "http://goo.gl/forms/YC3ReZ6z2P";
    $urlFerramentaKanban = "http://arndt-server.ddns.net:8080/metodo_mdd/ferramenta/";
    $urlMaquinaVirtual = "https://www.mediafire.com/folder/vr1864m3c1v53/vm_experimento_modelo";
    $urlVirtualBox = "http://www.mediafire.com/download/99nnks6dd74xvi8/VirtualBox-5.0.10-104061-Win.exe";
    $urlUbuntu1404LTS = "http://www.mediafire.com/download/0wcj7bs90afeska/ubuntu-14.04.2-desktop-amd64.iso";

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

    if ($experimentoAdHoc) {
        unset($menu["/ferramenta_possatto.php"]);
        unset($menu["/ferramenta_perini.php"]);
        unset($menu["/metodo.php"]);

        $urlPacoteExperimento = "http://www.mediafire.com/download/zhse07rfxsfgrtu/experimento_adhoc.zip";
        $urlMaquinaVirtual = "https://www.mediafire.com/folder/bfgx7v9v966j6/vm_experimento_ad_hoc";
    }
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
            <a class="navbar-brand" href="#">Tutorial</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <?php
                    foreach ($menu as $pageURL => $pageName) {
                            $active = "";
                            if ($_SERVER["SCRIPT_NAME"] == $pageURL) {
                                $active = "active";
                            }

                            $url = $sysPath . $pageURL;
                            if ($experimentoAdHoc) {
                                $url .= "?accessId=" . $adhocKey;
                            }
                        ?>
                            <li class="<?php echo $active; ?>">
                                <a href="<?php echo $url; ?>"><?php echo $pageName; ?></a>
                            </li>
                        <?php
                    }
                ?>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>