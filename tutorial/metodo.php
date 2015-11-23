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
                            <img src="img/metodo.png" alt="Método criado por Bruno Arndt e Daniel Lucrédio">
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
                        <div class="caption">
                            <h3>Mas, o que é um Metamodelo?</h3>
                        </div>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    O Metamodelo representa as abstrações de um software, representando apenas os conceitos do domínio e, com isso, não há dependência da computação.
                                </p>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Mas, o que é uma DSL?</h3>
                        </div>
                         <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_dsl">
                                        <img src="img/metodo_dsl.png" alt="Exemplo de uma DSL">
                                    </a>
                                    <legend>
                                        FIGURA 2 - Exemplo de uma DSL.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-2">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            A Domain-Specifi Language (DSL) é uma linguagem para especificação de um domínio,
                                            sendo utilizada para criar uma linguagem específica para resolver os problemas de um domínio específico.
                                            Um grande exemplo de DSL é o SQL.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Mas, o que é um Modelo?</h3>
                        </div>
                         <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_dsl">
                                        <img src="img/metodo_modelo.png" alt="Exemplo de um Modelo">
                                    </a>
                                    <legend>
                                        FIGURA 3 - Exemplo de um Modelo.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-2">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            O Modelo defini a arquitetura do software seguindo as definições do Metamodelo, sendo independente das tecnologias de implementação,
                                            ou seja, não há qualquer dependência de uma linguagem de desenvolvimento, sistema operacional ou framework.
                                            Um exemplo de modelo é o Modelo de Classe.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Mas, o que é um Template?</h3>
                        </div>
                         <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_template">
                                        <img src="img/metodo_template.png" alt="Exemplo de um Template">
                                    </a>
                                    <legend>
                                        FIGURA 4 - Exemplo de um <i>Template</i>.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-2">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            Um Template é um arquivo de texto padronizado, sendo instrumentado principalmente com construções de seleção e expansão de código
                                            e também é responsável por realizar consultas em um modelo.
                                            As informações obtidas por meio destas consultas são utilizadas como parâmetro para produção de código-fonte.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Mas, o que é uma Implementação de Referência (IR)?</h3>
                        </div>
                         <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_IR">
                                        <img src="img/metodo_IR.png" alt="Exemplo de uma Implementação de Referência">
                                    </a>
                                    <legend>
                                        FIGURA 5 - Exemplo de uma Implementação de Referência.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-2">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            A Implementação de Referência (IR) é uma aplicação-exemplo que serve como base para a construção dos <i>Templates</i>
                                            e tem-se mostrado fundamental no desenvolvimento utilizando <i>Templates</i>, pois diminui a complexidade de criação do mesmo.
                                            O objetivo da utilização da IR é que o desenvolvedor possa trabalhar nesta versão, que utiliza uma forma convencional de desenvolvimento,
                                            podendo realizar os testes e a depuração normalmente, sem ter a preocupação com as questões das transformações e geração de código.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Projetos inclusos no experimento</h3>
                        </div>
                        <a name="figura_metodo_experimento_pastas_home">
                            <img src="img/metodo_experimento_pastas_home.png" alt="Pastas incluídas no pacote de experimento">
                        </a>
                        <legend>
                            FIGURA 6 - Pastas incluídas no pacote de experimento.
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <ul>
                                    <li>
                                        <strong>apache-tomcat-7.0.56, db-derby-10.11.1.1-bin e derbyDatabases:</strong>
                                        O Apache e o Derby DB são utilizados pelos experimentos do professor Doutor Daniel Lucrédio,
                                        sendo que esses experimentos se encontra na pasta "workspace -> generatorForWebDomain";
                                    </li>
                                    <li>
                                        <strong>eclipse:</strong> pasta onde está a IDE Eclipse onde é editada a DSL do Metamodelo;
                                    </li>
                                    <li>
                                        <strong>runtime-EclipseApplication:</strong> Nessa pasta está os projetos da instância do Eclipse de edição do Modelo, Templates e IR;
                                    </li>
                                    <li>
                                        <strong>workspace:</strong> Nessa pasta está o projeto da DSL do Metamodelo, e o experimento do professor Doutor Daniel Lucrédio;
                                    </li>
                                    <li>
                                        <strong>executarEclipse.sh:</strong> Executável para abrir corretamente a IDE Eclipse na instância de edição da DSL do Metamodelo.
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <a name="figura_metodo_experimento_pastas_runtime">
                            <img src="img/metodo_experimento_pastas_runtime.png" alt="Pastas incluídas na pasta runtime-EclipseApplication">
                        </a>
                        <legend>
                            FIGURA 7 - Pastas incluídas na pasta runtime-EclipseApplication.
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Na pasta <strong>runtime-EclipseApplication</strong> encontramos os seguintes projetos:
                                </p>
                                <ul>
                                    <li>
                                        <strong>gerador:</strong>
                                        Nessa pasta está localizado os <i>templates</i> para geração de código;
                                    </li>
                                    <li>
                                        <strong>ProjetoMedicoIR:</strong> Nessa pasta está a Implementação de Referência do sistema para médicos;
                                    </li>
                                    <li>
                                        <strong>ProjetoMedicoModelo:</strong> Nessa pasta está o Modelo e o arquivo de Mapeamento do sistema para médicos.
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <a name="figura_metodo_experimento_pastas_workspace">
                            <img src="img/metodo_experimento_pastas_workspace.png" alt="Pastas incluídas na pasta workspace">
                        </a>
                        <legend>
                            FIGURA 8 - Pastas incluídas na pasta workspace.
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Na pasta <strong>workspace</strong> encontramos os seguintes projetos:
                                </p>
                                <ul>
                                    <li>
                                        <strong>generatorForWebDomain:</strong>
                                        Projeto do experimento do professor Doutor Daniel Lucrédio;
                                    </li>
                                    <li>
                                        <strong>
                                            org.example.domainmodel.extended;
                                            org.example.domainmodel.extended.sdk;
                                            org.example.domainmodel.extended.test e org.example.domainmodel.extended.ui:
                                        </strong>
                                        Projeto da DSL do Metamodelo, que utiliza a linguagem Xtext. Para mais informações da linguagem Xtext clique <a href="https://eclipse.org/Xtext/" target="_blank">aqui</a>.
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Ferramenta Kanban</h3>
                        </div>
                        <a name="figura_metodo_ferramenta_index">
                            <img src="img/metodo_ferramenta_index.png" alt="Ferramenta Kanban desenvolvida por Bruno Arndt e Daniel Lucrédio">
                        </a>
                        <legend>
                            FIGURA 9 - Ferramenta Kanban desenvolvida por Bruno Arndt e Daniel Lucrédio.
                        </legend>
                        <div class="row">
                            <div class="col-lg-6 col-md-2">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_metodo_ferramenta_adicionar">
                                        <img src="img/metodo_ferramenta_adicionar.png" alt="Adicionar uma Nova Tarefa na Ferramenta Kanban">
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