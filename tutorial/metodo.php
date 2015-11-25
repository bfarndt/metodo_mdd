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
                    Um M&eacute;todo para Migra&ccedil;&atilde;o autom&aacute;tica de C&oacute;digo no MDD
                </h1>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-4">
                    <div class="thumbnail">
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe id="videoIntroducao" class="embed-responsive-item" src="https://www.youtube.com/embed/rTUNEUiQ1OI" frameborder="0" allowfullscreen></iframe>
                        </div>
                        <div class="caption">
                            <h3>Introdução</h3>
                        </div>
                        <a name="figura_metodo">
                            <img src="img/metodo.png" class="img_zoom" data-zoom-image="img/metodo.png" alt="Método criado por Bruno Arndt e Daniel Lucrédio">
                        </a>
                        <legend>
                            FIGURA 1 - Método criado por Bruno Arndt e Daniel Lucrédio.
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Devido a complexidade de manutenção no processo de desenvolvimento utilizando o MDD com templates,
                                    encontrou-se a necessidade de criar um método que guie o desenvolvedor por esse processo.
                                    Este método foi criado por Bruno Arndt e pelo professor Doutor Daniel Lucrédio e é constituído por três tipos de passos:
                                </p>
                                <ol>
                                    <li>Apenas Modelo;</li>
                                    <li>Criativa; e</li>
                                    <li>Manutenção.</li>
                                </ol>
                                <p>
                                    No tipo <strong>Apenas Modelo</strong> (representado pelo Passo 1) é a aplicação pura dos conceitos do MDD, pois apenas precisamos modificar o modelo para a conclusão da alteração.
                                    Já o tipo <strong>Criativa</strong> (representado pelo Passo 2) é quando precisamos Templatizar um arquivo fixo ou apenas alterar um arquivo fixo.
                                    Por fim, a <strong>Manutenção</strong> pode englobar a modificação do Metamodelo e sua DSL (representado pelo Passo 6)
                                    e/ou modificação dos Templates (representado pelos Passos 2, 3 e 4).
                                </p>
                            </div>
                        </div>
                        <?php
                            $contImg = 1;
                            include("dados/metodo_explicacao_niveis.php");
                            include("dados/metodo_conteudo_pacote.php");
                        ?>
                        <div class="caption">
                            <h3>Ferramenta Kanban</h3>
                        </div>
                        <a name="figura_metodo_ferramenta_index">
                            <img src="img/metodo_ferramenta_index.png" class="img_zoom" data-zoom-image="img/metodo_ferramenta_index.png" alt="Ferramenta Kanban desenvolvida por Bruno Arndt e Daniel Lucrédio">
                        </a>
                        <legend>
                            FIGURA 9 - Ferramenta Kanban desenvolvida por Bruno Arndt e Daniel Lucrédio.
                        </legend>
                        <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_ferramenta_adicionar">
                                        <img src="img/metodo_ferramenta_adicionar.png" class="img_zoom" data-zoom-image="img/metodo_ferramenta_adicionar.png" alt="Adicionar uma Nova Tarefa na Ferramenta Kanban">
                                    </a>
                                    <legend>
                                        FIGURA 10 - Adicionar uma Nova Tarefa na Ferramenta Kanban.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-2">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            Para auxiliar na utilização deste método, foi desenvolvida uma ferramenta baseada no quadro Kanban e que pode ser acessada clicando
                                            <a href="http://arndt-server.ddns.net:8080/metodo_mdd/ferramenta/" target="_blank">aqui</a>.
                                            Nesta ferramenta, podemos Adicionar as tarefas com as modificações.
                                            Nela, podemos registrar o Nome da tarefa, sua descrição, o tempo estimado para a conclusão, tempo já gasto e o prazo para entrega.
                                            Além disso, podemos indicar a qual tipo de passo a tarefa pertence:
                                        </p>
                                        <ul>
                                            <li>Apenas modificação no modelo;</li>
                                            <li>Criação de Template ou Modificação de arquivo fixo;</li>
                                            <li>Modificação apenas de Template; e</li>
                                            <li>Modificação do Metamodelo com ou sem alteração do Template.</li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_ferramenta_modificar">
                                        <img src="img/metodo_ferramenta_modificar.png" alt="Modificando uma tarefa na Ferramenta Kanban">
                                    </a>
                                    <legend>
                                        FIGURA 11 - Modificando uma tarefa na Ferramenta Kanban.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-2">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            Quando adicionamos uma tarefa, o sistema acrescentará a tarefa na coluna em que o botão Adicionar for clicado.
                                            Além de adicionar as tarefas, podemos mudá-las através das colunas, marcar o progresso da tarefa, editá-la, excluí-la e minimizá-la.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Passos</h3>
                        </div>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Para facilitar a compreensão do método, foram criados 4 vídeos para descrever cada tipo de passo, sendo seguinte divisão:
                                </p>
                                <ul>
                                    <li>Apenas modificação no modelo (Passo 1);</li>
                                    <li>Criação de Template ou Modificação de arquivo fixo (Passo 5);</li>
                                    <li>Modificação apenas de Template (Passo 2, 3 e 4); e</li>
                                    <li>Modificação do Metamodelo com ou sem alteração do Template (Passo 6).</li>
                                </ul>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Passo 1</h3>
                        </div>
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe id="videoPasso1" class="embed-responsive-item" src="https://www.youtube.com/embed/HpB8m7qeqy8" frameborder="0" allowfullscreen></iframe>
                        </div>
                        <div class="caption">
                            <h3>Passo 2, 3 e 4</h3>
                        </div>
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe id="videoPasso2" class="embed-responsive-item" src="https://www.youtube.com/embed/3CGk3kep3fI" frameborder="0" allowfullscreen></iframe>
                        </div>
                        <div class="caption">
                            <h3>Passo 5</h3>
                        </div>
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe id="videoPasso5" class="embed-responsive-item" src="https://www.youtube.com/embed/8HggkRBWaj0" frameborder="0" allowfullscreen></iframe>
                        </div>
                        <div class="caption">
                            <h3>Passo 6</h3>
                        </div>
                        <div class="embed-responsive embed-responsive-16by9">
                            <iframe id="videoPasso6" class="embed-responsive-item" src="https://www.youtube.com/embed/kaMaGxWq21o" frameborder="0" allowfullscreen></iframe>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <?php include("footer.php"); ?>
    </body>
</html>