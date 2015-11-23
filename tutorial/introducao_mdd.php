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
                    Introdu&ccedil;&atilde;o ao MDD
                </h1>
            </div>
            <div class="row">
                <div class="col-lg-12 col-md-4">
                    <div class="thumbnail">
                        <div class="caption">
                            <h3>Desenvolvimento Dirigido por Modelos ou <i>Model-Driven Development</i> (MDD)</h3>
                            <div class="texto_explicativo">
                                <p>
                                    Com a indústria cada vez mais automatizada, houve um aumento na procura por sistemas de software mais complexos e com uma menor quantidade de erros.
                                    Sendo assim, verificou-se a necessidade de utilizar métodos e ferramentas que tornem a produção de sistemas mais ágil e eficaz, otimizando o tempo gasto
                                    e melhorando a qualidade dos mesmos
                                    (RAUSCHMAYER; KNAPP; WIRSING, <a href="http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.94.9812&rep=rep1&type=pdf" target="_blank">2004</a>;
                                        FRANCE; RUMPE, <a href="http://arxiv.org/pdf/1409.6620.pdf" target="_blank">2007</a>;
                                        PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                        LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>).
                                </p>
                                <p>
                                    Deste modo os sistemas computacionais têm que se adaptar constantemente a essa nova realidade onde um software não deve ser somente confiável,
                                    mas também operar em ambientes variados, comunicar-se com diversos paradigmas de comunicação e se adaptar facilmente às mudanças constantes de nosso mundo
                                    e às novas tecnologias
                                    (PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>).
                                </p>
                                <p>
                                    Todavia essas questões ficam ainda mais críticas em virtude do princípio de se construir o software e reutilizá-lo inúmeras vezes,
                                    exigindo que os seus artefatos sejam facilmente adaptados a diferentes contextos, características, plataformas e ambientes (PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>).
                                    Tais necessidades são somente supridas quando artefatos de alto nível são reutilizados também (NEIGHBORS, <a href="http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.21.4397&rep=rep1&type=pdf" target="_blank">1980</a>;
                                    KRUEGER, <a href="http://www.biglever.com/papers/Krueger_AcmReuseSurvey.pdf" target="_blank">1992</a>;
                                    GRISS, <a href="http://www.hpl.hp.com/techreports/95/HPL-95-03.html" target="_blank">1995</a>;
                                    FRAKES; ISODA, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=311045" target="_blank">1994</a>).
                                </p>
                                <p>
                                    Para a solução desses problemas, é proposto o MDD (<i>Model-Driven Development</i> ou Desenvolvimento Orientado a Modelos) que é a combinação entre programação generativa,
                                    linguagens específicas de domínio e transformações de software. Esta técnica enfatiza a importância dos modelos no processo de criação e manutenção do software,
                                    deixando de ser somente uma atividade que auxilia as atividades de desenvolvimento e manutenção,
                                    tornando-se parte constituinte do software (NEIGHBORS, <a href="http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.21.4397&rep=rep1&type=pdf" target="_blank">1980</a>;
                                    FEILKAS, <a href="http://www.researchgate.net/profile/Martin_Feilkas/publication/250800877_How_to_represent_Models_Languages_and_Transformations/links/0c96053beb5374cfb8000000.pdf" target="_blank">2006</a>;
                                    LUCR&Eacute;DIO <i>et al.</i>, <a href="http://www.researchgate.net/profile/Renata_Fortes/publication/229004679_The_Draco_Approach_Revisited_Model-Driven_Software_Reuse/links/00b49531b506f4176e000000.pdf" target="_blank">2006</a>;
                                    FRANCE; RUMPE, <a href="http://arxiv.org/pdf/1409.6620.pdf" target="_blank">2007</a>;
                                    PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                                <p>
                                    A proposta do MDD é definida como a redução da distância semântica entre os domínios problema e solução/implementação os quais são realizados por meio do uso de modelos de alto nível
                                    para expressar conceitos do domínio e de sucessivas transformações de refinamento até resultarem no código-fonte
                                    (NEIGHBORS, <a href="http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.21.4397&rep=rep1&type=pdf" target="_blank">1980</a>;
                                    CZARNECKI; HELSEN, <a href="http://www.researchgate.net/profile/Simon_Helsen/publication/213882885_Classification_of_Model_Transformation_Approaches/links/00b495204f8807e206000000.pdf" target="_blank">2003</a>;
                                    HAILPERN; TARR, <a href="http://www.hailpern.com/bthpub/papers/ISJ_45_3_2006.pdf" target="_blank">2006</a>;
                                    FRANCE; RUMPE, <a href="http://arxiv.org/pdf/1409.6620.pdf" target="_blank">2007</a>;
                                    PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>;
                                    PAPOTTI; DO PRADO; DE SOUZA, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=6427204" target="_blank">2012</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    As transformações realizadas pelo MDD podem, de acordo com seu resultado, serem classificadas
                                    em: <i>Model-to-Model</i> (M2M ou Modelo-para-Modelo), <i>Model-to-Code</i> (M2C ou Modelo-para-Código) ou <i>Model-to-Text</i> (M2T ou Modelo-para-Texto).
                                    Na primeira o artefato-alvo gerado é outro modelo, já no M2C é um código-fonte e no M2T os resultados são, além do código-fonte, outros artefatos textuais, tais como,
                                    casos de teste e diversas documentações (CZARNECKI; HELSEN, <a href="http://www.researchgate.net/profile/Simon_Helsen/publication/213882885_Classification_of_Model_Transformation_Approaches/links/00b495204f8807e206000000.pdf" target="_blank">2003</a>;
                                    PAPOTTI, <a href="https://macc.lncc.br/restrito/admin/pdf/Dissertacao%20de%20Mestrado28-06-2013-171131.pdf" target="_blank">2013</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    Com a utilização do M2T e, consecutivamente, a geração de vários tipos de artefatos, há um aumento significante na produtividade
                                    (CZARNECKI; HELSEN, <a href="http://www.researchgate.net/profile/Simon_Helsen/publication/213882885_Classification_of_Model_Transformation_Approaches/links/00b495204f8807e206000000.pdf" target="_blank">2003</a>;
                                    HAILPERN; TARR, <a href="http://www.hailpern.com/bthpub/papers/ISJ_45_3_2006.pdf" target="_blank">2006</a>;
                                    FRANCE; RUMPE, <a href="http://arxiv.org/pdf/1409.6620.pdf" target="_blank">2007</a>;
                                    PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>;
                                    PAPOTTI; DO PRADO; DE SOUZA, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=6427204" target="_blank">2012</a>).
                                </p>
                                <p>A utilização do MDD com o enfoque nos três níveis de abstração, traz duas principais vantagens: a primeira é relacionada aos modelos,
                                    pois quando comparados com as linguagens Orientadas a Objetos (OO), são muito mais próximos dos conceitos do domínio problema e dos requisitos do sistema,
                                    além de serem mais fáceis de se compreender e facilitarem o desenvolvimento (PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>).
                                </p>
                                <p>
                                    A segunda vantagem é relacionada à independência das tecnologias da implementação, uma vez que os conceitos utilizados nos modelos são menos ligados à esta tecnologia,
                                    o software é menos suscetível a mudanças tecnológicas, fazendo a manutenção mais fácil e com menor custo (PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>).
                                </p>
                                <p>
                                    As vantagens citadas anteriormente não necessariamente serão observadas quando o enfoque for em apenas um dos níveis de abstração, como no nível da <i>Platform Specific Mode</i>
                                    isoladamente, por exemplo. Outras vantagens são: a produtividade, pois as tarefas triviais são automatizadas e o reuso do conhecimento adquirido em outros projetos (THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    O MDD ainda possui dificuldades técnicas como a complexidade da mudança para o paradigma de desenvolvimento orientado a modelos, a redundância dos artefatos,
                                    devido à representação dos diferentes níveis de abstração e a necessidade de um maior conhecimento em Engenharia de Software, principalmente, em modelagem e transformadores de código.
                                    Contudo, ressalta-se que a sua adoção tem se mostrado vantajosa (HAILPERN; TARR, <a href="http://www.hailpern.com/bthpub/papers/ISJ_45_3_2006.pdf" target="_blank">2006</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>;
                                    PAPOTTI; DO PRADO; DE SOUZA, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=6427204" target="_blank">2012</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                            </div>
                        </div>
                        <a name="figura_visao_geral_abstracao_mdd">
                            <img src="img/visao_geral_abstracao_mdd.png" alt="Os n&iacute;veis de abstra&ccedil;&atilde;o do MDD e seus processos de transforma&ccedil;&atilde;o">
                        </a>
                        <legend>
                            FIGURA 1 - Os níveis de abstração do MDD e seus processos de transformação (PELLEGRINI <i>et al.</i>, <a href="http://www.researchgate.net/profile/Rita_Suzana_Maciel/publication/229045161_Transformaes_de_Modelos_para_um_Processo_MDA/links/00463525c4299da77d000000.pdf" target="_blank">2010</a>)
                        </legend>
                        <div class="caption">
                            <h3>Transforma&ccedil;&atilde;o de Modelo</h3>
                            <div class="texto_explicativo">
                                <p>
                                    O desenvolvimento tradicional de um sistema de software passa por vários níveis de abstração, como código de máquina, código <i>Assembly</i> e código-fonte (PAPOTTI, <a href="https://macc.lncc.br/restrito/admin/pdf/Dissertacao%20de%20Mestrado28-06-2013-171131.pdf" target="_blank">2013</a>).
                                    Normalmente, o desenvolvedor não precisa se preocupar com esses níveis, pois a tecnologia atual de compiladores é capaz de automaticamente traduzir código de um nível para outro.
                                </p>
                                <p>
                                    O MDD tenta aplicar a mesma filosofia em outros níveis de abstração adicionais para os modelos.
                                    Conforme representado na Figura <a href="#figura_visao_geral_abstracao_mdd">1</a>, geralmente são considerados três novos níveis de abstração:
                                    <i>Computacional Independent Model</i> (CIM ou Modelos Independentes de Computação),
                                    <i>Platform Independent Model</i> (PIM ou Modelo Independente de Plataforma) e <i>Platform Specific Model</i> (PSM ou Modelo Específico de Plataforma)
                                    (OMG, <a href="http://www.omg.org/news/meetings/workshops/UML_2003_Manual/00-2_MDA_Guide_v1.0.1.pdf" target="_blank">2003</a>;
                                    BEYDEDA; BOOK; GRUHN, <a href="http://link.springer.com/book/10.1007/3-540-28554-7" target="_blank">2005</a>;
                                    COSTA; GOMES; CAGNIN, <a href="http://reuse.cos.ufrj.br/wdra2007/images/artigos/30385.pdf" target="_blank">2007</a>;
                                    PELLEGRINI <i>et al.</i>, <a href="http://www.researchgate.net/profile/Rita_Suzana_Maciel/publication/229045161_Transformaes_de_Modelos_para_um_Processo_MDA/links/00463525c4299da77d000000.pdf" target="_blank">2010</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    O primeiro nível é o <i>Computacional Independent Model</i> (CIM ou Modelos Independentes de Computação) que representa as abstrações de um software de tal forma
                                    que não há dependência da computação. Este modelo não representa os detalhes do sistema, mas apenas os conceitos do domínio
                                    (OMG, <a href="http://www.omg.org/news/meetings/workshops/UML_2003_Manual/00-2_MDA_Guide_v1.0.1.pdf" target="_blank">2003</a>;
                                    BEYDEDA; BOOK; GRUHN, <a href="http://link.springer.com/book/10.1007/3-540-28554-7" target="_blank">2005</a>;
                                    COSTA; GOMES; CAGNIN, <a href="http://reuse.cos.ufrj.br/wdra2007/images/artigos/30385.pdf" target="_blank">2007</a>;
                                    PELLEGRINI <i>et al.</i>, <a href="http://www.researchgate.net/profile/Rita_Suzana_Maciel/publication/229045161_Transformaes_de_Modelos_para_um_Processo_MDA/links/00463525c4299da77d000000.pdf" target="_blank">2010</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    Já o segundo nível é chamado de <i>Platform Independent Model</i> (PIM ou Modelo Independente de Plataforma)
                                    que é um nível de abstração bem detalhado e que tem o enfoque na arquitetura do software que os modelos presentes representam as características independentes de plataforma
                                    ou qualquer tecnologia de implementação (OMG, <a href="http://www.omg.org/news/meetings/workshops/UML_2003_Manual/00-2_MDA_Guide_v1.0.1.pdf" target="_blank">2003</a>;
                                    BEYDEDA; BOOK; GRUHN, <a href="http://link.springer.com/book/10.1007/3-540-28554-7" target="_blank">2005</a>;
                                    PARREIRAS; BAX, <a href="http://www.fernando.parreiras.nom.br/publicacoes/CLEI2005.pdf" target="_blank">2005</a>;
                                    COSTA; GOMES; CAGNIN, <a href="http://reuse.cos.ufrj.br/wdra2007/images/artigos/30385.pdf" target="_blank">2007</a>;
                                    PELLEGRINI <i>et al.</i>, <a href="http://www.researchgate.net/profile/Rita_Suzana_Maciel/publication/229045161_Transformaes_de_Modelos_para_um_Processo_MDA/links/00463525c4299da77d000000.pdf" target="_blank">2010</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    Por fim, o terceiro é chamado de <i>Platform Specific Model</i> (PSM ou Modelo Específico de Plataforma) onde há a combinação entre os modelos PIM
                                    e as características das tecnologias de implementação (OMG, <a href="http://www.omg.org/news/meetings/workshops/UML_2003_Manual/00-2_MDA_Guide_v1.0.1.pdf" target="_blank">2003</a>;
                                    BEYDEDA; BOOK; GRUHN, <a href="http://link.springer.com/book/10.1007/3-540-28554-7" target="_blank">2005</a>;
                                    PARREIRAS; BAX, <a href="http://www.fernando.parreiras.nom.br/publicacoes/CLEI2005.pdf" target="_blank">2005</a>;
                                    COSTA; GOMES; CAGNIN, <a href="http://reuse.cos.ufrj.br/wdra2007/images/artigos/30385.pdf" target="_blank">2007</a>;
                                    PELLEGRINI <i>et al.</i>, <a href="http://www.researchgate.net/profile/Rita_Suzana_Maciel/publication/229045161_Transformaes_de_Modelos_para_um_Processo_MDA/links/00463525c4299da77d000000.pdf" target="_blank">2010</a>;
                                    THEODORO JÚNIOR, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_arquivos/3/TDE-2013-01-23T143809Z-4939/Publico/4801.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    Os mapeamentos e as relações entre os níveis de abstração são definidos nas regras das transformações. Um mapeamento é a definição unidirecional do processo de transformação,
                                    ao contrário de uma relação que estabelece um relacionamento bidirecional entre os artefatos-fonte e o artefato-alvo (OMG, <a href="http://www.omg.org/news/meetings/workshops/UML_2003_Manual/00-2_MDA_Guide_v1.0.1.pdf" target="_blank">2003</a>;
                                    KOCH, <a href="http://dl.acm.org/citation.cfm?id=1149997" target="_blank">2006</a>).
                                </p>
                                <p>
                                    Essas transformações de modelos podem ser classificadas em automáticas, semi-automáticas e manuais.
                                    São consideradas automáticas quando não há a necessidade da intervenção humana durante o processo de geração de código;
                                    semi-automáticas quando o desenvolvedor escolhe quais elementos do modelo serão transformados e, por fim, manuais quando é o desenvolvedor que realiza a transformação.
                                    Em um processo de desenvolvimento de software utilizando MDD é possível a definição de regras de transformação para que este processo ocorra de forma automática
                                    (KOCH, <a href="http://dl.acm.org/citation.cfm?id=1149997" target="_blank">2006</a>).
                                </p>
                                <p>
                                    As transformações realizadas pelo MDD podem ocorrer: CIM para CIM (transformação do tipo M2M), CIM para PIM (transformação do tipo M2M), PIM para PIM (transformação do tipo M2M),
                                    PIM para PSM (transformação do tipo M2M), PSM para código-fonte  (transformação do tipo M2C ou M2T)
                                    (KOCH, <a href="http://dl.acm.org/citation.cfm?id=1149997" target="_blank">2006</a>).
                                </p>
                            </div>
                        </div>

                        <div class="caption">
                            <h3>Geração de Código baseado em <i>Templates</i></h3>
                            <div class="texto_explicativo">
                                <p>
                                    Em sua essência, um gerador de código é um utilitário que, a partir de uma especificação de alto nível de um problema implementável,
                                    transforma automaticamente essa especificação em artefatos-alvo para esse problema. Tais artefatos-alvo podem ser de vários tipos, como códigos-fonte,
                                    testes e diversos tipos de documentação
                                    (CZARNECKI; EISENECKER, <a href="http://link.springer.com/book/10.1007/3-540-36208-8#page=24" target="_blank">2000</a>;
                                    BRAGA, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-12052003-102000/en.php" target="_blank">2002</a>;
                                    CZARNECKI; HELSEN, <a href="http://www.researchgate.net/profile/Simon_Helsen/publication/213882885_Classification_of_Model_Transformation_Approaches/links/00b495204f8807e206000000.pdf" target="_blank">2003</a>;
                                    HAILPERN; TARR, <a href="http://www.hailpern.com/bthpub/papers/ISJ_45_3_2006.pdf" target="_blank">2006</a>;
                                    FRANCE; RUMPE, <a href="http://arxiv.org/pdf/1409.6620.pdf" target="_blank">2007</a>;
                                    PHAM <i>et al.</i>, <a href="http://www.researchgate.net/profile/A_Ferworn/publication/4275485_Applying_Model-Driven_Development_Techniques_to_the_Development_of_Search_and_Rescue_Systems/links/0fcfd5115297774c27000000.pdf" target="_blank">2007</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    LUCR&Eacute;DIO, <a href="http://www.teses.usp.br/teses/disponiveis/55/55134/tde-02092009-140533/pt-br.php" target="_blank">2009</a>;
                                    PAPOTTI; DO PRADO; DE SOUZA, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=6427204" target="_blank">2012</a>).
                                </p>
                                <p>
                                    Portanto, gerador de código é um componente importante do MDD, que tem como objetivo escrever um software a partir de modelos abstratos e refiná-los em código
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    MUSZYNSKI, <a href="http://dsmforum.org/events/DSM05/Muszynski.pdf" target="_blank">2005</a>;
                                    FEILKAS, <a href="http://www.researchgate.net/profile/Martin_Feilkas/publication/250800877_How_to_represent_Models_Languages_and_Transformations/links/0c96053beb5374cfb8000000.pdf" target="_blank">2006</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                    Um Gerador de Código, que é a transformação do tipo M2C ou M2T,
                                    pode ser baseado em um destes três tipos de abordagens: <i>Framework-Specific Modeling Languages</i> (FSML), padrões de software e <i>templates</i>
                                    (KOCH, <a href="http://dl.acm.org/citation.cfm?id=1149997" target="_blank">2006</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    PAPOTTI, <a href="https://macc.lncc.br/restrito/admin/pdf/Dissertacao%20de%20Mestrado28-06-2013-171131.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    A abordagem baseada em <i>templates</i> é a técnica de transformação de modelos de alto nível em código-fonte mais difundida e também é uma maneira prática e
                                    robusta de gerar código-fonte utilizando modelos de alto nível
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    FEILKAS, <a href="http://www.researchgate.net/profile/Martin_Feilkas/publication/250800877_How_to_represent_Models_Languages_and_Transformations/links/0c96053beb5374cfb8000000.pdf" target="_blank">2006</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                            </div>
                        </div>
                        <a name="esquema_gerador_codigo_baseado_templates">
                            <img src="img/esquema_gerador_codigo_baseado_templates.png" alt="Esquematização da Geração de Código baseado em Templates">
                        </a>
                        <legend>
                            FIGURA 2 - Esquematização da Geração de Código baseado em <i>Templates</i>
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Quando os Geradores de Código são baseados em <i>templates</i>, estes contém as regras que são mapeadas nos artefatos-fonte,
                                    como por exemplo as ferramentas <i>Java Emitter Templates</i> (JET) (VOGEL, <a href="http://www.vogella.de/articles/EclipseJET/article.html" target="_blank">2009</a>),
                                    AndroMDA (BOHLEN, <a href="http://www.andromda.org/" target="_blank">2003</a>),
                                    ArcStyler (ARCSTYLER, <a href="http://www.interactive-objects.com/en/model-driven-engineering.html" target="_blank">2010</a>),
                                    Acceleo (ACCELEO, <a href="http://www.acceleo.org/" target="_blank">2010</a>)
                                    e a proposta por Possatto (<a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>)
                                    e por Perini (<a href="<?php echo $sysPath;?>/downloads/pdf/Perini2015.pdf" target="_blank">2015</a>)
                                    (CZARNECKI; HELSEN, <a href="http://www.researchgate.net/profile/Simon_Helsen/publication/213882885_Classification_of_Model_Transformation_Approaches/links/00b495204f8807e206000000.pdf" target="_blank">2003</a>;
                                    PAPOTTI, <a href="https://macc.lncc.br/restrito/admin/pdf/Dissertacao%20de%20Mestrado28-06-2013-171131.pdf" target="_blank">2013</a>).
                                </p>
                                <p>
                                    <i>Template</i> é um arquivo de texto padronizado qualquer, instrumentado principalmente com construções de seleção e expansão de código,
                                    sendo responsável por realizar consultas de parâmetros em uma entrada (um programa ou um arquivo textual), uma <i>Wizard</i>, diagramas ou modelos.
                                    As informações obtidas por meio destas consultas são utilizadas como parâmetro para produzir código-fonte,
                                    conforme exemplificado na Figura <a href="#esquema_gerador_codigo_baseado_templates">2</a>
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    CZARNECKI; EISENECKER, <a href="http://link.springer.com/book/10.1007/3-540-36208-8#page=24" target="_blank">2000</a>;
                                    ANGYAL; LENGYEL; CHARAF, <a href="http://ieeexplore.ieee.org/xpl/articleDetails.jsp?reload=true&arnumber=4492428" target="_blank">2008</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                                <p>
                                    Nessa técnica, primeiramente os <i>templates</i> são lidos pelo gerador de código (Figura <a href="#esquema_gerador_codigo_baseado_templates">2</a>-1)
                                    e os parâmetros necessários são consultados nas entradas (Figura <a href="#esquema_gerador_codigo_baseado_templates">2</a>-2).
                                    Por fim, essas informações contidas nos <i>templates</i> e nas entradas são processadas pelo gerador de código,
                                    resultando no código-fonte da aplicação (Figura <a href="#esquema_gerador_codigo_baseado_templates">2</a>-3).
                                </p>
                            </div>
                        </div>
                        <a name="geracao_codigo_templates_esquema">
                            <img src="img/geracao_codigo_templates_esquema.png" alt="Exemplo da Geração de Código baseado em Templates">
                        </a>
                        <legend>
                            FIGURA 3 - Exemplo da Geração de Código baseado em <i>Templates</i>
                        </legend>
                        <div class="caption">
                            <div class="texto_explicativo">
                                <p>
                                    Esse processo de geração de código é melhor exemplificado pela Figura <a href="#geracao_codigo_templates_esquema">3</a>.
                                    A partir de um <i>template</i> em <i>PHP: Hypertext Preprocessor</i> (PHP) e a consulta de um modelo em <i>Extensible Markup Language</i> (XML),
                                    foi gerado um código-fonte em <i>HyperText Markup Language</i> (HTML).
                                </p>
                                <p>
                                    Ao se executar o gerador de código, ele lê os <i>templates</i> (Figura <a href="#geracao_codigo_templates_esquema">3</a>-1),
                                    e caso necessário, realiza a consulta a uma entrada (Figura <a href="#geracao_codigo_templates_esquema">3</a>-2).
                                    Após a leitura e interpretação de todos os <i>templates</i> está pronto o código-fonte (Figura <a href="#geracao_codigo_templates_esquema">3</a>-3).
                                </p>
                                <p>
                                    Entretanto, construir <i>templates</i> é uma tarefa onerosa, pois um <i>template</i> mistura código gerado com código para geração, aumentando, por sua vez,
                                    a complexidade deste processo. Desta forma, realizar uma edição direta em um <i>template</i> mostra-se árdua,
                                    o que também limita o desenvolvedor na visualização das modificações realizadas nele
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    CZARNECKI; EISENECKER, <a href="http://link.springer.com/book/10.1007/3-540-36208-8#page=24" target="_blank">2000</a>;
                                    MUSZYNSKI, <a href="http://dsmforum.org/events/DSM05/Muszynski.pdf" target="_blank">2005</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                                <p>
                                    Tendo em vista a complexidade exposta, a existência de uma aplicação-exemplo, para servir como base para a construção de <i>templates</i>,
                                    chamada de Implementação de Referência (IR), tem-se mostrado fundamental
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    CZARNECKI; EISENECKER, <a href="http://link.springer.com/book/10.1007/3-540-36208-8#page=24" target="_blank">2000</a>;
                                    MUSZYNSKI, <a href="http://dsmforum.org/events/DSM05/Muszynski.pdf" target="_blank">2005</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                                <p>
                                    O objetivo dessa é que o desenvolvedor possa trabalhar nesta versão, que utiliza uma forma convencional de desenvolvimento,
                                    podendo realizar os testes e a depuração normalmente, sem ter a preocupação com as questões das transformações e geração de código
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    CZARNECKI; EISENECKER, <a href="http://link.springer.com/book/10.1007/3-540-36208-8#page=24" target="_blank">2000</a>;
                                    MUSZYNSKI, <a href="http://dsmforum.org/events/DSM05/Muszynski.pdf" target="_blank">2005</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                                <p>
                                    Alguns dos benefícios dessa técnica são: a redução dos custos, o aumento da produtividade, a facilidade da adoção pelos desenvolvedores
                                    (devido à possibilidade de gerar código-fonte em qualquer linguagem ou formato) e o código-fonte gerado legível,
                                    pois o <i>template</i> é parecido com a saída desejada e diminuição do índice de erros presentes no software, aumentando, assim, a qualidade do sistema produzido
                                    (CLEAVELAND, <a href="http://www.computer.org/csdl/mags/so/1988/04/s4025.pdf" target="_blank">1988</a>;
                                    CZARNECKI; EISENECKER, <a href="http://link.springer.com/book/10.1007/3-540-36208-8#page=24" target="_blank">2000</a>;
                                    POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                </p>
                                <p>
                                    Contudo, a utilização desta técnica traz a necessidade da sincronização entre a IR e os <i>templates</i>.
                                    Este processo consiste na identificação das alterações realizadas no código-fonte e a sua referência em um ou mais <i>templates</i>.
                                    Após essa identificação, eles são atualizados com essas modificações, mantendo, assim, a sincronia entre ambos artefatos.
                                </p>
                                <p>
                                    Muszynski (<a href="http://dsmforum.org/events/DSM05/Muszynski.pdf" target="_blank">2005</a>)
                                    relata que os problemas da utilização de uma aplicação-exemplo é o custo da migração que fica entre 20 a 25% aproximadamente do custo do tempo de desenvolvimento
                                    e as duplicações de código entre a aplicação-exemplo e os <i>templates</i> que requerem cautela do desenvolvedor,
                                    pois necessitam que a manutenção mantenha a consistência entre ambos.
                                </p>
                                <p>
                                    Uma solução para tal questão é a automatização do processo de migração de código entre a aplicação-exemplo e os <i>templates</i>,
                                    o que não é uma tarefa trivial. Porém, ainda que essa automação seja parcial, a redução do custo de desenvolvimento é significantemente recompensadora
                                    (POSSATTO, <a href="http://www.bdtd.ufscar.br/htdocs/tedeSimplificado/tde_busca/arquivo.php?codArquivo=7015" target="_blank">2014</a>).
                                    Nas páginas <a href="<?php echo $sysPath; ?>/ferramenta_possatto.php"><?php echo $menu["/ferramenta_possatto.php"]; ?></a>
                                    e <a href="<?php echo $sysPath; ?>/ferramenta_perini.php"><?php echo $menu["/ferramenta_perini.php"]; ?></a> estão descritas as ferramentas que foram utilizadas como base deste método.
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