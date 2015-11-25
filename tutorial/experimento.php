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
                            <li role="presentation" class="dropdown">
                                <a href="#" id="infos_experimento" class="dropdown-toggle" data-toggle="dropdown" aria-controls="infos_experimento-contents">
                                    Informa&ccedil;&otilde;es necess&aacute;rias para o experimento <span class="caret"></span>
                                </a>
                                <ul class="dropdown-menu" aria-labelledby="infos_experimento" id="infos_experimento-contents">
                                    <li>
                                        <a href="#niveis_abstracao" id="niveis_abstracao-tab" role="tab" data-toggle="tab"
                                            aria-controls="niveis_abstracao" aria-expanded="false">
                                            Sobre os N&iacute;veis de Abstra&ccedil;&atilde;o
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#pacote" id="pacote-tab" role="tab" data-toggle="tab"
                                            aria-controls="pacote" aria-expanded="false">
                                            Conte&uacute;do do Pacote de Experimento
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#abrir_eclipse" id="abrir_eclipse-tab" role="tab" data-toggle="tab"
                                            aria-controls="abrir_eclipse" aria-expanded="false">
                                            Como abrir as inst&acirc;ncias do Eclipse
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#deploy_metamodelo" id="deploy_metamodelo-tab" role="tab" data-toggle="tab"
                                            aria-controls="deploy_metamodelo" aria-expanded="false">
                                            Deploy do Metamodelo
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#config_jet_transformaiton" id="config_jet_transformaiton-tab" role="tab" data-toggle="tab"
                                            aria-controls="config_jet_transformaiton" aria-expanded="false">
                                            Configurando o JET Transformation
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#tags_jet_suportadas" id="tags_jet_suportadas-tab" role="tab" data-toggle="tab"
                                            aria-controls="tags_jet_suportadas" aria-expanded="false">
                                            Tags do JET suportadas pelo Mapeamento
                                        </a>
                                    </li>
                                </ul>
                            </li>
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
                                <div role="tabpanel" class="tab-pane fade" id="niveis_abstracao" aria-labelledby="niveis_abstracao-tab">
                                    <div class="container container_tab">
                                        <div class="page-header">
                                            <h1 class="text-center">Sobre os N&iacute;veis de Abstra&ccedil;&atilde;o</h1>
                                        </div>
                                        <div class="container container_tab">
                                            <?php
                                                $contImg = 0;
                                                include("dados/metodo_explicacao_niveis.php");
                                            ?>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="pacote" aria-labelledby="pacote-tab">
                                    <div class="container container_tab">
                                        <div class="page-header">
                                            <h1 class="text-center">Conte&uacute;do do Pacote de Experimento</h1>
                                        </div>
                                        <div class="container container_tab">
                                            <?php
                                                $contImg = 0;
                                                include("dados/metodo_conteudo_pacote.php");
                                            ?>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="abrir_eclipse" aria-labelledby="abrir_eclipse-tab">
                                    <div class="container container_tab">
                                        <div class="page-header">
                                            <h1 class="text-center">Como abrir as inst&acirc;ncias do Eclipse</h1>
                                        </div>
                                        <div class="container container_tab">
                                            <div class="caption">
                                                <h3>Abrir a inst&acirc;ncias do Eclipse de edi&ccedil;&atilde;o do Metamodelo</h3>
                                            </div>
                                             <div class="row">
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="thumbnail thumbnail_col">
                                                       <a name="figura_experimento_executar_eclipse_metamodelo">
                                                            <img src="img/experimento_executar_eclipse_metamodelo.png" alt="Abrindo a instancia do Eclipse de edicao do Metamodelo">
                                                        </a>
                                                        <legend>
                                                            FIGURA 1 - Abrindo a inst&acirc;ncias do Eclipse de edi&ccedil;&atilde;o do <strong>Metamodelo</strong>.
                                                        </legend>
                                                    </div>
                                                </div>
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="caption">
                                                        <div class="texto_explicativo">
                                                            <p>
                                                                Para abrir a inst&acirc;ncias do Eclipse de edi&ccedil;&atilde;o do <strong>Metamodelo</strong> basta executar
                                                                o arquivo <strong>executarEclipse.sh</strong>.
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="caption">
                                                <h3>Abrir a inst&acirc;ncias do Eclipse de edi&ccedil;&atilde;o do Modelo, Templates e Implementa&ccedil;&atilde;o de Refer&ecirc;ncia</h3>
                                            </div>
                                             <div class="row">
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="thumbnail thumbnail_col">
                                                       <a name="figura_experimento_executar_eclipse_modelo">
                                                            <img src="img/experimento_executar_eclipse_modelo.png" alt="Abrindo a instancia do Eclipse de edicao do Modelo, Templates e Implementacao de Referencia">
                                                        </a>
                                                        <legend>
                                                            FIGURA 2 - Abrindo a inst&acirc;ncias do Eclipse de edi&ccedil;&atilde;o do <strong>Modelo, Templates e Implementa&ccedil;&atilde;o de Refer&ecirc;ncia</strong>.
                                                        </legend>
                                                    </div>
                                                </div>
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="caption">
                                                        <div class="texto_explicativo">
                                                            <p>
                                                                Para abrir a inst&acirc;ncias do Eclipse de edi&ccedil;&atilde;o do <strong>Modelo, Templates e Implementa&ccedil;&atilde;o de Refer&ecirc;ncia</strong>
                                                                basta estar com o arquivo do <strong>Metamodelo aberto</strong> (neste exemplo, o arquivo do Metamodelo &eacute;: Extended.xtext)
                                                                e clicar em <strong>Run As Eclipse Application</strong>.
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="deploy_metamodelo" aria-labelledby="deploy_metamodelo-tab">
                                    <div class="container container_tab">
                                        <div class="page-header">
                                            <h1 class="text-center">Deploy do Metamodelo</h1>
                                        </div>
                                        <div class="container container_tab">
                                             <div class="row">
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="thumbnail thumbnail_col">
                                                       <a name="figura_experimento_excluir_metadata">
                                                            <img src="img/experimento_excluir_metadata.png" alt="Excluindo a pasta .metadata">
                                                        </a>
                                                        <legend>
                                                            FIGURA 1 - Excluindo a pasta <strong>.metadata</strong>.
                                                        </legend>
                                                        <a name="figura_experimento_executar_mwe2">
                                                            <img src="img/experimento_executar_mwe2.png" alt="Executando o MWE2 Workflow">
                                                        </a>
                                                        <legend>
                                                            FIGURA 2 - Executando o <strong>MWE2 Workflow</strong>.
                                                        </legend>
                                                        <a name="figura_experimento_executar_eclipse_app">
                                                            <img src="img/experimento_executar_eclipse_app.png" alt="Executando o Run As Eclipse Application">
                                                        </a>
                                                        <legend>
                                                            FIGURA 3 - Executando o <strong>Run As Eclipse Application</strong>.
                                                        </legend>
                                                    </div>
                                                </div>
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="caption">
                                                        <div class="texto_explicativo">
                                                            <p>
                                                                Para refazer o deploy do Metamodelo temos que seguir os seguintes passos:
                                                                <ol>
                                                                    <li>
                                                                        Excluir a pasta <strong>.metadata</strong> do workspace da instância do Eclipse de edição do Modelo,
                                                                        que neste exemplo está na pasta <strong>runtime-EclipseApplication</strong>.
                                                                        Conforme demonstrado na Figura <a href="#figura_experimento_excluir_metadata">1</a>;
                                                                    </li>
                                                                    <li>
                                                                        Voltar para a instância de edição do Metamodelo;
                                                                    </li>
                                                                    <li>
                                                                         Localizar o arquivo com a extensão <strong>.mwe2</strong>,
                                                                         que está no mesmo pacote que o arquivo <strong>Xtext</strong>.
                                                                         No arquivo <strong>.mwe2</strong>, clicar com o botão direito e em <strong>Run As</strong>,
                                                                         clicar na opção <strong>MWE2 Workflow</strong>.
                                                                         Conforme demonstrado na Figura <a href="#figura_experimento_executar_mwe2">2</a>; e
                                                                    </li>
                                                                    <li>
                                                                        Após a execução do <strong>MWE2 Workflow</strong>,
                                                                        abrimos novamente a instância de edição do Modelo clicando no botão <strong>Run As Eclipse Application</strong>.
                                                                        Conforme demonstrado na Figura <a href="#figura_experimento_executar_eclipse_app">3</a>.
                                                                    </li>
                                                                </ol>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="config_jet_transformaiton" aria-labelledby="config_jet_transformaiton-tab">
                                    <div class="container container_tab">
                                        <div class="page-header">
                                            <h1 class="text-center">Configurando o JET Transformation</h1>
                                        </div>
                                        <div class="container container_tab">
                                             <div class="row">
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="thumbnail thumbnail_col">
                                                       <a name="figura_experimento_run_configuration">
                                                            <img src="img/experimento_run_configuration.png" alt="Clicando em Run Configuration">
                                                        </a>
                                                        <legend>
                                                            FIGURA 1 - Clicando em <strong>Run Configuration</strong>.
                                                        </legend>
                                                        <a name="figura_experimento_jet_transformation_add">
                                                            <img src="img/experimento_jet_transformation_add.png" alt="Adicionando um JET Transformation">
                                                        </a>
                                                        <legend>
                                                            FIGURA 2 - Adicionando um <strong>JET Transformation</strong>.
                                                        </legend>
                                                        <a name="figura_experimento_jet_transformation_config">
                                                            <img src="img/experimento_jet_transformation_config.png" alt="Configurando um JET Transformation">
                                                        </a>
                                                        <legend>
                                                            FIGURA 3 - Configurando um <strong>JET Transformation</strong>.
                                                        </legend>
                                                    </div>
                                                </div>
                                                <div class="col-lg-6 col-md-2">
                                                    <div class="caption">
                                                        <div class="texto_explicativo">
                                                            <p>
                                                                Para configurar o JET Transformation temos que seguir os seguintes passos:
                                                                <ol>
                                                                    <li>
                                                                        Clicar em <strong>Run Configuration</strong>.
                                                                        Conforme demonstrado na Figura <a href="#figura_experimento_run_configuration">1</a>;
                                                                    </li>
                                                                    <li>
                                                                        Adicionar um “JET Transformation”.
                                                                        Conforme demonstrado na Figura <a href="#figura_experimento_jet_transformation_add">2</a>;
                                                                    </li>
                                                                    <li>
                                                                         No par&acirc;metro <strong>Transformation Input</strong> indicar o arquivo do Modelo.
                                                                         Conforme demonstrado na Figura <a href="#figura_experimento_jet_transformation_config">3</a>;
                                                                    </li>
                                                                    <li>
                                                                        No par&acirc;metro <strong>Mapping File</strong> indicar o Arquivo de Mapeamento,
                                                                        que deve estar no mesmo projeto do Modelo.
                                                                        Conforme demonstrado na Figura <a href="#figura_experimento_jet_transformation_config">3</a>; e
                                                                    </li>
                                                                    <li>
                                                                        No par&acirc;metro <strong>Transformation</strong> indicar o projeto que est&atilde;o os Templates.
                                                                        Conforme demonstrado na Figura <a href="#figura_experimento_jet_transformation_config">3</a>.
                                                                    </li>
                                                                </ol>
                                                            </p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                </div>
                                <div role="tabpanel" class="tab-pane fade" id="tags_jet_suportadas" aria-labelledby="tags_jet_suportadas-tab">
                                    <div class="container container_tab">
                                        <div class="page-header">
                                            <h1 class="text-center">Tags do JET suportadas pelo Mapeamento</h1>
                                        </div>
                                        <div class="container container_tab">
                                             <div class="caption">
                                                <div class="texto_explicativo">
                                                    <p>
                                                        As Tags existentes do JET para serem utilizadas nos Templates est&atilde;o descritas
                                                        <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/workspaceTags/overview.html" target="_blank">aqui</a>.
                                                        Contudo, devido a quest&otilde;es de mapeamento, nem todas as Tags s&atilde;o suportadas pelo mesmo. Segue a lista de Tags suportadas e o link para sua sintaxe:
                                                    </p>
                                                    <ul>
                                                        <li>
                                                            <strong>ws:file</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/workspaceTags/fileTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>ws:folder</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/workspaceTags/folderTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>ws:project</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/workspaceTags/projectTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>c:get</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/controlTags/getTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>c:if</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/controlTags/ifTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>c:include</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/controlTags/includeTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>c:iterate</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/controlTags/iterateTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>c:set</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/controlTags/setTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>c:setVariable</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/controlTags/setVariableTag.html" target="_blank">sintaxe</a>; e
                                                        </li>
                                                        <li>
                                                            <strong>f:lc</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/formatTags/lcTag.html" target="_blank">sintaxe</a>;
                                                        </li>
                                                        <li>
                                                            <strong>f:uc</strong>:
                                                            <a href="http://www-01.ibm.com/support/knowledgecenter/SS8PJ7_7.0.0/org.eclipse.jet.doc/references/taglibs/formatTags/ucTag.html" target="_blank">sintaxe</a>.
                                                        </li>
                                                    </ul>
                                                </div>
                                            </div>
                                        </div><!-- /container -->
                                    </div><!-- /container -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Modal -->
        <div class="modal fade bs-example-modal-lg" id="dvDialogMaisInfos" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog modal-lg" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">Mais Informa&ccedil;&otilde;es</h4>
                    </div>
                    <div class="modal-body">
                    ...
                    </div>
                </div>
            </div>
        </div>

        <?php include("footer.php"); ?>
    </body>
</html>