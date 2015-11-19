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
                    Ferramenta desevolvida por Perini (<a href="<?php echo $sysPath;?>/downloads/pdf/Perini2015.pdf" target="_blank">2015</a>)
                </h1>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-4">
                    <div class="thumbnail">
                        <a name="figura_split_jet_editor">
                            <img src="img/split_jet_editor.png" alt="O Split JET Editor">
                        </a>
                         <legend>
                            FIGURA 1 - O Split JET Editor desenvolvido por Perini (<a href="<?php echo $sysPath;?>/downloads/pdf/Perini2015.pdf" target="_blank">2015</a>).
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Dando continuidade ao trabalho de Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>),
                                    Perini (<a href="<?php echo $sysPath;?>/downloads/pdf/Perini2015.pdf" target="_blank">2015</a>) desenvolveu um ambiente especializado para a edição simultânea
                                    de templates e código gerado, possibilitando um maior dinamismo e controle do processo de evolução do software.
                                    Esse ambiente especializado recebeu o nome de "Split JET Editor" e foi desenvolvido como um plug-in da IDE Eclipse.
                                    Além disso, ele e é integrada ao plug-in JET e ao protótipo de
                                    Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>O que é?</h3>
                        </div>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    O "Split JET Editor" é um plug-in para a IDE Eclipse que faz a migração automática das modificações realizadas na Implementeção de Referência para os templates,
                                    reduzindo desta forma o tempo de desenvolvimento e facilitando a análise do impacto que a alteração irá ter no sistema.
                                </p>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Por que usar?</h3>
                        </div>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <ul>
                                    <li>Facilidade na visualização da propagação das alterações, destacando a região que está sendo editada na IR e sua respectiva parte no template;</li>
                                    <li>Bloqueio da edição em áreas protegidas da IR, isso se deve através dos status que serão explicados a seguir; e</li>
                                    <li>Migração automática das alterações realizadas na IR para os templates, não havendo a necessidade de a realização de uma migração manual por parte dos desenvolvedores.</li>
                                </ul>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Como usar?</h3>
                        </div>
                        <div class="row">
                            <div class="col-lg-8 col-md-3">
                                <div class="thumbnail thumbnail_col">
                                   <a name="figura_ferramenta_perini_abrir_dsl">
                                        <img src="img/ferramenta_perini_abrir_dsl.png" alt="O Split JET Editor">
                                    </a>
                                     <legend>
                                        FIGURA 2 - Abrindo a DSL do Metamodelo.
                                    </legend>
                                    <br>
                                    <a name="figura_ferramenta_perini_abrir_instancia">
                                        <img src="img/ferramenta_perini_abrir_instancia.png" alt="O Split JET Editor">
                                    </a>
                                     <legend>
                                        FIGURA 3 - Abrindo a instância de edição do Modelo, template e IR.
                                    </legend>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-1">
                                <div class="caption">
                                    <div class="texto_explicativo">
                                        <p>
                                            Com a instância do Eclipse para a edição da DSL do Metamodelo aberta,
                                            precisamos abrir a DSL do Metamodelo para que a mesma gere uma versão do Eclipse que possa editar o Modelo de acordo com as definições do Metamodelo.
                                            Após isso, clicamos em "Run As Eclipse Application" e será aberta a instância de edição do Modelo, template e IR.
                                            Com a abertura dessa instância, no canto inferior dela irá aparecer o "Split JET Editor".
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Configuração</h3>
                        </div>
                        <a name="figura_split_jet_editor_config">
                            <img src="img/split_jet_editor_config.png" alt="Configurações do Split JET Editor">
                        </a>
                         <legend>
                            FIGURA 4 - Configurações do Split JET Editor.
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Do lado direito do "Split JET Editor" está presente as configurações do mesmo.
                                    Primeiramente, temos o botão de habilitar (cor de fundo verde) / desabilitar (cor de fundo vermelha) o "Split JET Editor".
                                    Após isso, configuramos em qual projeto está o Modelo e o arquivo de Mapeamento.
                                    Depois temos de indicar em qual projeto está os Templates e, por fim, digitamos o nome do arquivo de mapeamento.
                                </p>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Status</h3>
                        </div>
                        <a name="figura_split_jet_editor_status">
                            <img src="img/split_jet_editor_status.png" alt="Os Status do Split JET Editor">
                        </a>
                         <legend>
                            FIGURA 5 - Os Status do Split JET Editor.
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Para auxiliar o desenvolvedor, o "Split JET Editor" conta com 5 status:
                                </p>
                                <ul>
                                    <li>
                                        O status <strong>Edição Habilitada</strong> é representado pela cor de fundo verde no texto: Este é o status padrão do “Split JET Editor”,
                                        nele estamos editando uma região do código da IR que ainda não foi alterada em outro arquivo e também não estamos alterando uma região resultante de uma consulta ao modelo;
                                    </li>
                                    <li>
                                        Já o status <strong>Recursos fora de Sincronia</strong> é quando um trecho de código da IR está sendo alterado e o seu template correspondente já foi alterado por outra edição
                                        e a transformação ainda não foi executada;
                                    </li>
                                    <li>
                                        O status <strong>Modificando Template</strong> é quando tentamos alterar um template diretamente;
                                    </li>
                                    <li>
                                        Por sua vez, o status <strong>Arquivo de template fechado</strong> é quando estamos tentando editar uma região de código da IR,
                                        cujo template associado não está aberto, sendo assim o "Split JET Editor" não pode migrar as alterações automaticamente para o mesmo e, portanto,
                                        precisamos abrir o template para o correto funcionamento do plug-in;
                                    </li>
                                    <li>
                                        Por fim, o status <strong>Modificando uma consulta ao modelo</strong> é quando estamos alterando uma região do código da IR que é o resultado de uma consulta ao modelo,
                                        como por exemplo o nome de uma classe ou atributo.
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="caption">
                            <h3>Resumo</h3>
                        </div>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Como podemos ver, a ferramenta “Split JET Editor" facilita muito a manutenção de sistemas que utilizam o paradigma MDD com templates,
                                    já que ele faz a migração automática das alterações realizadas na Implementação de Referência para o template correspondente. Além disso, ela indica ao desenvolvedor,
                                    através de status, se o mesmo está tentando editar uma região de código protegida, como por exemplo ser uma região de consulta ao modelo.
                                </p>
                                <p>
                                    Contudo, devido a utilização de 4 níveis de abstração nesse ambiente de desenvolvimento (Metamodelo, Modelo, Template e IR),
                                    há a necessidade de um método para guiar o desenvolvedor na realização das modificações, pois cada tarefa pode ter um nível de complexidade diferente,
                                    já que pode ser simples (apenas alteração do Modelo) ou extremamente complexa (alteração do Metamodelo e sua DSL e dos Templates).
                                </p>
                                <p>
                                    Devido a essa complexidade, Bruno Arndt e o professor Doutor Daniel Lucrédio criaram um método para guiar o desenvolvedor nas manutenções no paradigma MDD
                                    com a utilização de templates e IR. Este método engloba 6 tipos de passos para a manutenção / evolução de um sistema:
                                </p>
                                <ul>
                                    <li>Quando uma alteração engloba <strong>apenas alteração do Modelo</strong>;</li>
                                    <li>Quando uma alteração engloba <strong>apenas alteração nos templates</strong>;</li>
                                    <li>Quando uma alteração engloba <strong>apenas a criação de um Template ou modificação de um arquivo fixo</strong>; e</li>
                                    <li>Quando uma alteração engloba <strong>a modificação do Metamodelo e sua DSL com ou sem modificação dos templates</strong>.</li>
                                </ul>
                                <p>
                                    Para mais informações, basta clicar <a href="<?php echo $sysPath; ?>/metodo.php">aqui</a>.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <?php include("footer.php"); ?>
    </body>
</html>