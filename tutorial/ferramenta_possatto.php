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
                    Ferramenta desevolvida por Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>)
                </h1>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-4">
                    <div class="thumbnail">
                        <a name="figura_possatto_ferramenta">
                            <img src="img/ferramenta_possatto.png" alt="Ferramenta desenvolvida por Possatto">
                        </a>
                        <legend>
                            FIGURA 1 - Ferramenta desenvolvida por POSSATTO (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                        </legend>
                        <div class="caption">
                            <!--<h3>Desenvolvimento Dirigido por Modelos ou <i>Model-Driven Development</i> (MDD)</h3>-->
                            <div class="texto_explicativo">
                                <p>
                                    Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>) elaborou um protótipo para a
                                    sincronização parcialmente automática entre a Implementação de Referência (IR) e os <i>templates</i> do gerador de código.
                                    Esse protótipo foi desenvolvido como um <i>plug-in</i> da <i>Integrated Development Environment</i> (IDE) Eclipse, utilizando a ferramenta JET,
                                    que é um recurso que permite a geração de código baseada em <i>templates</i>.
                                </p>
                                <p>
                                    O objetivo principal de tal trabalho foi a sincronização automática entre IR e <i>templates</i>,
                                    também conhecida como migração de código. Para que essa sincronização pudesse ocorrer,
                                    foi necessário estabelecer o mapeamento físico entre a Implementação de Referência e os <i>templates</i>,
                                    identificar as alterações realizadas na IR e desenvolver uma ferramenta para realizar a sincronização propriamente dita.
                                </p>
                                <p>
                                    Com o objetivo de estabelecer o mapeamento físico, foi utilizado um arquivo externo de mapeamento e o <i>plug-in Fluorite</i>
                                    (YOON; MYERS, <a href="https://ecs.victoria.ac.nz/foswiki/pub/Events/PLATEAU/Program/plateau2011-yoon.pdf" target="_blank">2011</a>).
                                    Na ferramenta JET foi incluído um mecanismo que gera um arquivo com o mapeamento entre a IR e os <i>templates</i> o qual contém a relação das posições de cada mapeamento,
                                    obtido através da associação dos <i>templates</i> com as referências dos modelos de entrada e com o código gerado correspondente,
                                    conforme exemplificado na Figura <a href="#figura_possatto_arquivo_mapeamento">2</a>.
                                </p>
                            </div>
                        </div>
                        <a name="figura_possatto_arquivo_mapeamento">
                            <img src="img/possatto_arquivo_mapeamento.png" alt="Os n&iacute;veis de abstra&ccedil;&atilde;o do MDD e seus processos de transforma&ccedil;&atilde;o">
                        </a>
                        <legend>
                            FIGURA 2 - Arquivo de Mapeamento gerado pelo <i>plug-in</i> JET (POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                        </legend>
                        <div class="caption">
                            <!--<h3>Transforma&ccedil;&atilde;o de Modelo</h3>-->
                            <div class="texto_explicativo">
                                <p>
                                    Cada linha do arquivo de mapeamento consiste em um mapeamento existente, sendo que em uma linha há as seguintes informações e elas são delimitadas pelo caractere ``:'':
                                </p>
                                <ul>
                                    <li>Caminho e nome do arquivo de <i>template</i>;</li>
                                    <li>Posição de início do mapeamento no arquivo de <i>template</i>;</li>
                                    <li>Posição de término do mapeamento no arquivo de <i>template</i>;</li>
                                    <li>Caminho e nome do arquivo gerado;</li>
                                    <li>Posição de início do mapeamento no arquivo gerado;</li>
                                    <li>Posição de término do mapeamento no arquivo gerado;</li>
                                    <li>Informação da origem do código produzido: Em um <i>template</i> pode ocorrer a inclusão de outro <i>template</i>, a leitura de uma variável ou a execução de um <i>scriptlet</i>; e</li>
                                    <li>
                                        Tipo de Mapeamento: Conforme o mapeamento realizado por Lucredio e Fortes \autocite*{LucredioFortes2010} e descrito no <a href="secao_tipo_mapeamento">abaixo</a>,
                                        existem 7 tipos de mapeamento, que são Cópia Simples, Substituição Simples, Substituição Indireta, Repetição, Condicional, Inclusão e Novo Arquivo.
                                        Contudo, pode não haver um tipo associado ao mapeamento.
                                    </li>
                                </ul>
                                <p>
                                    O <i>plug-in Fluorite</i> detecta todos os eventos ocorridos durante a utilização do editor de código e os armazena em arquivos de log.
                                    Por meio da análise desses eventos, é possível estabelecer todas as alterações ocorridas no código-fonte e, dessa forma,
                                    foi possível o desenvolvimento do protótipo de migração.
                                </p>
                                <p>
                                    Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>)
                                    realizou um estudo empírico para testar a efetividade de sua ferramenta,
                                    sob a hipótese de que qualquer redução dos 25% de tempo gasto na migração relatados por
                                    Muszynski (<a href="http://dsmforum.org/events/DSM05/Muszynski.pdf" target="_blank">2005</a>)
                                    é vantajosa pois a longo prazo, a redução absoluta se mostrará considerável.
                                </p>
                                <p>
                                    As tarefas testadas compreendiam tarefas básicas de manutenção em uma aplicação <i>Web</i>, englobando correções, inserções e modificações de seu código-fonte,
                                    sendo que cada tarefa foi elaborada por
                                    Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>)
                                    de forma específica.
                                </p>
                                <p>
                                    Os participantes desse estudo foram estudantes de graduação e pós-graduação em Ciência da Computação,
                                    com envolvimento em projetos de Engenharia de Software e com experiência em abordagens dirigidas a modelos e em manutenção de aplicações <i>Web</i>.
                                </p>
                                <p>
                                    Dessa forma, para a realização desse estudo, foram selecionados oito participantes, sendo seis de pós-graduação e dois de graduação.
                                    Para a realização correta do estudo, eles deveriam anotar qual técnica de migração de código foi utilizada (Manual ou Protótipo),
                                    qual a tarefa executada (T1, T2, T3 ou T4) e a hora de início e término da execução da tarefa. Em seguida, eles foram divididos em dois grupos balanceados de acordo com suas experiências.
                                </p>
                                <p>
                                    Esse estudo demonstrou que, apesar das limitações do protótipo, ele é efetivo na maioria das situações testadas, conseguindo reduzir o tempo gasto na migração pela metade,
                                    conforme demonstrado na Tabela <a href="#tab_resultados_estudo_possatto">1</a>.
                                </p>
                            </div>
                        </div>

                        <table class="table table-striped" style="width: 100%">
                            <thead>
                                <tr>
                                    <th>Técnica</th>
                                    <th>Tarefas</th>
                                    <th>Grupo</th>
                                    <th>Média</th>
                                    <th>Soma das Médias</th>
                                    <th>Porcentagem</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>
                                    <td rowspan="4">Manual</td>
                                    <td>T1</td>
                                    <td>G1</td>
                                    <td>00:14</td>
                                    <td rowspan="4">00:51</td>
                                    <td rowspan="4">68,92%</td>
                                </tr>
                                <tr>
                                    <td>T2</td>
                                    <td>G2</td>
                                    <td>00:07</td>
                                </tr>
                                <tr>
                                    <td>T3</td>
                                    <td>G1</td>
                                    <td>00:15</td>
                                </tr>
                                <tr>
                                    <td>T4</td>
                                    <td>G2</td>
                                    <td>00:13</td>
                                </tr>

                                <tr>
                                    <td rowspan="4">Protótipo</td>
                                    <td>T1</td>
                                    <td>G2</td>
                                    <td>00:06</td>
                                    <td rowspan="4">00:23</td>
                                    <td rowspan="4">31,08%</td>
                                </tr>
                                <tr>
                                    <td>T2</td>
                                    <td>G1</td>
                                    <td>00:07</td>
                                </tr>
                                <tr>
                                    <td>T3</td>
                                    <td>G2</td>
                                    <td>00:03</td>
                                </tr>
                                <tr>
                                    <td>T4</td>
                                    <td>G1</td>
                                    <td>00:05</td>
                                </tr>
                            </tbody>
                            <tfoot>
                                <tr>
                                    <td colspan="4">Total</td>
                                    <td>01:14</td>
                                    <td>100,00%</td>
                                </tr>
                            </tfoot>
                        </table>
                        <a name="tab_resultados_estudo_possatto"></a>
                        <legend>
                            TABELA 1 - Resultados obtidos pelo estudo realizado por Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                        </legend>
                        <div class="caption">
                            <!--<h3>Transforma&ccedil;&atilde;o de Modelo</h3>-->
                            <div class="texto_explicativo">
                                <p>
                                    O estudo também mostrou que existem tarefas em que a migração automática não traz benefícios, ou seja, em certos casos não há ganho ou perda de tempo utilizando tal abordagem.
                                    No entanto, ainda não foram feitos estudos no sentido de caracterizá-las.
                                </p>
                                <p>
                                    Apesar dos benefícios trazidos pelo protótipo desenvolvido por Possatto \autocite*{Possatto2013}, a migração segue um processo de execução única.
                                    Assim, as modificações realizadas na IR pelo desenvolvedor são propagadas para os \textit{templates},
                                    não possibilitando o teste de impacto das diferentes formas de realizar as modificações, isto é,
                                    não é possível identificar as possíveis consequências da realização dessa modificação no software
                                    (ARNOLD; BOHNER, <a href="<?php echo $sysPath;?>/downloads/pdf/ArnoldBohner1993.pdf" target="_blank">1993</a>;
                                    BOHNER, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=1167777" target="_blank">2002</a>;
                                    HASSINE <i>et al.</i>, <a href="https://jucmnav.softwareengineering.ca/ucm/pub/UCM/VirLibIwpse05/Iwpse05CiaUcm.pdf" target="_blank">2005</a>).
                                    Para que isso ocorra, é necessário um processo mais flexível, conforme desenvolvido por Perini (<a href="<?php echo $sysPath;?>/downloads/pdf/Perini2015.pdf" target="_blank">2015</a>)
                                    que está descrito na página "<a href="<?php echo $sysPath; ?>/ferramenta_perini.php"><?php echo $menu["/ferramenta_perini.php"]; ?></a>".
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