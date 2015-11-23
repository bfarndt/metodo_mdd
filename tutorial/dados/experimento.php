<?php
    $experimento = array(
        array(
            "id" => "intoducao",
            "nome" => "Intodu&ccedil;&atilde;o",
            "passos" => array(
                array(
                    "img" => $imgFolder . "logo_download",
                    "alt" =>"Baixar o pacote do experimento",
                    "html" => "Baixar o pacote do experimento clicando <a href='" . $urlPacoteExperimento . "' target='_blank'>aqui</a>.
                        Para que o experimento funcione, &eacute; preciso que voc&ecirc; utilize Linux e tenha instalado o Apache, PHP e PostgreSQL."
                ), array(
                    "img" => $imgFolder . "logo_extrair",
                    "alt" => "Extrair o experimento",
                    "html" => "Extrair o experimento para a sua pasta <strong>www</strong> ou equivalente."
                ), array(
                    "img" => $imgFolder . "logo_youtube",
                    "alt" => "Assistir o video de introducao",
                    "html" => "Assistir o v&iacute;deo de introdu&ccedil;&atilde;o ao experimento, aonde ir&aacute; explicar sobre o conte&uacute;do do pacote.
                        Para assistir ao v&iacute;deo basta clicar <a href='" . $sysPath . "/metodo.php#videoIntroducao' target='_blank'>aqui</a>.
                        Come&ccedil;ar a fazer as tarefas."
                ), array(
                    "img" => $imgFolder . "logo_comecar",
                    "alt" => "Comecar a fazer as tarefas",
                    "html" => "Come&ccedil;ar a fazer as tarefas."
                )
            )
        ), array(
            "id" => "tarefa_1",
            "nome" => "Tarefa 1",
            "html" => "<p class='lead'>
                    Criar um Cadastro de Receitas que deve conter o seguintes campos:
                </p>
                <ul class='lead'>
                    <li>M&eacute;dico;</li>
                    <li>Paciente;</li>
                    <li>Medicamento; e</li>
                    <li>Dosagem (Tipo: Texto).</li>
                </ul>
                <p class='lead'>
                    Esta altera&ccedil;&atilde;o tem um prazo estimado de <strong>1 hora</strong>.
                </p>",
            "passos" => array(
                array(
                    "img" => $imgFolder . "logo_youtube",
                    "alt" => "Assistir Video",
                    "html" => "Assistir o v&iacute;deo sobre o 1&ordm; passo do experimento, que ir&aacute; explicar sobre como realizar uma modifica&ccedil;&atilde;o que altera apenas o modelo.
                        Para assistir ao v&iacute;deo basta clicar <a href='" . $sysPath . "/metodo.php#videoPasso1' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_kanban",
                    "alt" => "Adicionar a Tarefa a ferramenta Kanban",
                    "html" => "Devemos adicionar a tarefa na ferramenta Kanban. Para acess&aacute;-la basta clicar <a href='" . $urlFerramentaKanban . "' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_eclipse",
                    "alt" => "Abrir o Eclipse",
                    "html" => "Conforme demonstrado no v&iacute;deo, devemos abrir a inst&acirc;ncia de edi&ccedil;&atilde;o do Modelo, Template e Implementa&ccedil;&atilde;o de Refer&ecirc;ncia (IR).
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para abrir esta inst&acirc;ncia est&aacute; descrita
                        <a href='" . $sysPath . "/ferramenta_perini.php#dvComoUsar' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Comecar a marcar o tempo",
                    "html" => "Come&ccedil;ar a marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_editar",
                    "alt" => "Fazer a alteracao no Modelo",
                    "html" => "Fazer a altera&ccedil;&atilde;o no Modelo. O Modelo est&aacute; localizado no projeto <strong>ProjetoMedicoModelo</strong>,
                        na pasta <strong>src</strong>, arquivo <strong>entrada.dmodel</strong>."
                ), array(
                    "img" => $imgFolder . "logo_teste",
                    "alt" => "Testar as modificacoes",
                    "html" => "Testar as modifica&ccedil;&otilde;es."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Parar de marcar o tempo",
                    "html" => "Parar de marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_questionario",
                    "alt" => "Assistir Responder o questionario",
                    "html" => "Responder o <strong>Questionário de Opinião sobre o Método e Tutorial Proposto</strong>
                        clicando <a href='" . $urlQuestionaioExperimento . "'' target='_blank'>aqui</a>."
                )
            )
        ), array(
            "id" => "tarefa_2",
            "nome" => "Tarefa 2",
            "html" => "<p class='lead'>
                    Criar um arquivo de configura&ccedi;&atilde;o fixo para o Banco de Dados, deixando os seguintes dados como padr&atilde;o:
                </p>
                <ul class='lead'>
                    <li><strong>Host</strong>: localhost;</li>
                    <li><strong>Port</strong>: 5432;</li>
                    <li><strong>User</strong>: postgres;</li>
                    <li><strong>Password</strong>: postgres; e</li>
                    <li><strong>Dbname</strong>: Nome do projeto.</li>
                </ul>
                <p class='lead'>
                    <strong>Dica</strong>: Fa&ccedil;a esse arquivo como uma classe PHP.<br>
                    Esta altera&ccedil;&atilde;o tem um prazo estimado de <strong>30 minutos</strong>.
                </p>",
            "passos" => array(
                array(
                    "img" => $imgFolder . "logo_youtube",
                    "alt" => "Assistir Video",
                    "html" => "Assistir o v&iacute;deo sobre o 5&ordm; passo do experimento, que ir&aacute; explicar sobre como realizar uma modifica&ccedil;&atilde;o que altera apenas os templates.
                        Para assistir ao v&iacute;deo basta clicar <a href='" . $sysPath . "/metodo.php#videoPasso5' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_kanban",
                    "alt" => "Adicionar a Tarefa a ferramenta Kanban",
                    "html" => "Devemos adicionar a tarefa na ferramenta Kanban. Para acess&aacute;-la basta clicar <a href='" . $urlFerramentaKanban . "' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_eclipse",
                    "alt" => "Abrir o Eclipse",
                    "html" => "Conforme demonstrado no v&iacute;deo, devemos abrir a inst&acirc;ncia de edi&ccedil;&atilde;o do Modelo, Template e Implementa&ccedil;&atilde;o de Refer&ecirc;ncia (IR).
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para abrir esta inst&acirc;ncia est&aacute; descrita
                        <a href='" . $sysPath . "/ferramenta_perini.php#dvComoUsar' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Comecar a marcar o tempo",
                    "html" => "Come&ccedil;ar a marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_editar",
                    "alt" => "Fazer a alteracao no Template",
                    "html" => "Fazer a altera&ccedil;&atilde;o no Template. Os Templates est&atilde;o localizados no projeto <strong>Gerador</strong>,
                        na pasta <strong>templates</strong>."
                ), array(
                    "img" => $imgFolder . "logo_teste",
                    "alt" => "Testar as modificacoes",
                    "html" => "Testar as modifica&ccedil;&otilde;es."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Parar de marcar o tempo",
                    "html" => "Parar de marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_questionario",
                    "alt" => "Assistir Responder o questionario",
                    "html" => "Responder o <strong>Questionário de Opinião sobre o Método e Tutorial Proposto</strong>
                        clicando <a href='" . $urlQuestionaioExperimento . "'' target='_blank'>aqui</a>."
                )
            )
        ), array(
            "id" => "tarefa_3",
            "nome" => "Tarefa 3",
            "html" => "<p class='lead'>
                    Colocar os <strong>Totais</strong> em campos do tipo <strong>int</strong> e <strong>currency</strong> em cada tabela.<br>
                    Ap&oacute;s isso, fazer com que as classes DB utilizem as configura&ccedil;&otilde;es do arquivo anterior.<br>
                    Esta altera&ccedil;&atilde;o tem um prazo estimado de <strong>3 horas</strong>.
                </p>",
            "passos" => array(
                array(
                    "img" => $imgFolder . "logo_youtube",
                    "alt" => "Assistir Video",
                    "html" => "Assistir o v&iacute;deo sobre o 2&ordm;, 3&ordm; e 4&ordm; passo do experimento, que ir&aacute; explicar sobre como realizar uma modifica&ccedil;&atilde;o que altera apenas os templates.
                        Para assistir ao v&iacute;deo basta clicar <a href='" . $sysPath . "/metodo.php#videoPasso2' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_kanban",
                    "alt" => "Adicionar a Tarefa a ferramenta Kanban",
                    "html" => "Devemos adicionar a tarefa na ferramenta Kanban. Para acess&aacute;-la basta clicar <a href='" . $urlFerramentaKanban . "' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_eclipse",
                    "alt" => "Abrir o Eclipse",
                    "html" => "Conforme demonstrado no v&iacute;deo, devemos abrir a inst&acirc;ncia de edi&ccedil;&atilde;o do Modelo, Template e Implementa&ccedil;&atilde;o de Refer&ecirc;ncia (IR).
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para abrir esta inst&acirc;ncia est&aacute; descrita
                        <a href='" . $sysPath . "/ferramenta_perini.php#dvComoUsar' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Comecar a marcar o tempo",
                    "html" => "Come&ccedil;ar a marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_editar",
                    "alt" => "Fazer a alteracao no Template",
                    "html" => "Fazer a altera&ccedil;&atilde;o no Template. Os Templates est&atilde;o localizados no projeto <strong>Gerador</strong>,
                        na pasta <strong>templates</strong>."
                ), array(
                    "img" => $imgFolder . "logo_teste",
                    "alt" => "Testar as modificacoes",
                    "html" => "Testar as modifica&ccedil;&otilde;es."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Parar de marcar o tempo",
                    "html" => "Parar de marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_questionario",
                    "alt" => "Assistir Responder o questionario",
                    "html" => "Responder o <strong>Questionário de Opinião sobre o Método e Tutorial Proposto</strong>
                        clicando <a href='" . $urlQuestionaioExperimento . "'' target='_blank'>aqui</a>."
                )
            )
        ), array(
            "id" => "tarefa_4",
            "nome" => "Tarefa 4",
            "html" => "<p class='lead'>
                    Criar o tipo <strong>Password</strong> no Metamodelo e sua DSL.<br>
                    Esta altera&ccedil;&atilde;o tem um prazo estimado de <strong>2 horas</strong>.
                </p>",
            "passos" => array(
                array(
                    "img" => $imgFolder . "logo_youtube",
                    "alt" => "Assistir Video",
                    "html" => "Assistir o v&iacute;deo sobre o 6&ordm; passo do experimento, que ir&aacute; explicar sobre como realizar uma modifica&ccedil;&atilde;o que altera apenas os templates.
                        Para assistir ao v&iacute;deo basta clicar <a href='" . $sysPath . "/metodo.php#videoPasso6' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_kanban",
                    "alt" => "Adicionar a Tarefa a ferramenta Kanban",
                    "html" => "Devemos adicionar a tarefa na ferramenta Kanban. Para acess&aacute;-la basta clicar <a href='" . $urlFerramentaKanban . "' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_eclipse",
                    "alt" => "Abrir o Eclipse",
                    "html" => "Conforme demonstrado no v&iacute;deo, devemos abrir a inst&acirc;ncia de edi&ccedil;&atilde;o do Metamodelo.
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para abrir esta inst&acirc;ncia est&aacute; descrita
                        <a href='" . $sysPath . "/ferramenta_perini.php#dvComoUsar' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Comecar a marcar o tempo",
                    "html" => "Come&ccedil;ar a marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_editar",
                    "alt" => "Fazer a alteracao no Metamodelo",
                    "html" => "Fazer a altera&ccedil;&atilde;o no Metamodelo. O Metamodelo est&aacute; localizado no projeto <strong>org.example.domainmodel.extended</strong>,
                        na pasta <strong>src</strong>, no pacote <strong>org.example.domainmodel</strong>, no arquivo <strong>Extended.xtext</strong>."
                ), array(
                    "img" => $imgFolder . "logo_extrair",
                    "alt" => "Refazer o deploy do Metamodelo.",
                    "html" => "Refazer o <i>deploy</i> do Metamodelo.
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para realiz&aacute;-lo est&aacute; descrito
                        <a href='https://youtu.be/kaMaGxWq21o?t=6m16s' target='_blank'>nesse v&iacute;deo</a> entre 6:16 e 7:48."
                ), array(
                    "img" => $imgFolder . "logo_extrair",
                    "alt" => "Reconfigurar o JET Transformation.",
                    "html" => "Reconfigurar o JET Transformation.
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para realiz&aacute;-lo est&aacute; descrito
                        <a href='https://youtu.be/kaMaGxWq21o?t=10m48s' target='_blank'>nesse v&iacute;deo</a> entre 10:48 e 11:05."
                ), array(
                    "img" => $imgFolder . "logo_teste",
                    "alt" => "Testar as modificacoes",
                    "html" => "Testar as modifica&ccedil;&otilde;es."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Parar de marcar o tempo",
                    "html" => "Parar de marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_questionario",
                    "alt" => "Assistir Responder o questionario",
                    "html" => "Responder o <strong>Questionário de Opinião sobre o Método e Tutorial Proposto</strong>
                        clicando <a href='" . $urlQuestionaioExperimento . "'' target='_blank'>aqui</a>."
                )
            )
        ), array(
            "id" => "tarefa_5",
            "nome" => "Tarefa 5",
            "html" => "<p class='lead'>
                    Alterar o sistema para que funcione como um <strong><i>Software as a Service</i></strong> (SaaS). Para isso voc&ecirc; precisar&aacute;:
                </p>
                <ol class='lead'>
                    <li>Criar um Cadastro de Consult&oacute;rio;</li>
                    <li>
                        Criar um Cadastro de Usu&aacute;rio com os seguintes campos:
                        <ul>
                            <li>Nome;</li>
                            <li>E-mail;</li>
                            <li>Senha (utilizar MD5 como criptografia); e</li>
                            <li>Consult&oacute;rio.</li>
                        </ul>
                    </li>
                    <li>
                        Adicionar no Metamodelo e na sua DSL um novo tipo de Form (FormTypes) com o nome de <strong>FormLogin</strong>, tendo como par&acirc;metros:
                            <ul>
                                <li>Entity</li>
                                <li>userField</li>
                                <li>passwordField</li>
                            </ul>
                    </li>
                    <li>Fazer a p&aacute;gina de login e guardar a ID do usu&aacute;rio na \$_SESSION;</li>
                    <li>
                        Alterar o Metamodelo e sua DSL para que ele suporte atributos (Features) que n&atilde;o ser&atilde;o preenchidos pelo usu&aacute;rio (hidden).
                    </li>
                    <li>Adicionar um atributo do tipo Consult&oacute;rio em todos os Cadastros, sendo que este atributo n&atilde;o ser&aacute; preenchido pelo usu&aacute;rio; e</li>
                    <li>Ap&oacute;s isso, fazer esse tratamento nos Formul&aacute;rios, sendo que o c&oacute;digo do Consult&oacute;rio deve ser lido do Cadastro do Usu&aacute;rio atual.</li>
                </ol>
                <p class='lead'>
                    Esta altera&ccedil;&atilde;o tem um prazo estimado de <strong>10 horas</strong>.
                </p>",
            "passos" => array(
                array(
                    "img" => $imgFolder . "logo_youtube",
                    "alt" => "Assistir Video",
                    "html" => "Assistir o v&iacute;deo sobre o 6&ordm; passo do experimento, que ir&aacute; explicar sobre como realizar uma modifica&ccedil;&atilde;o que altera apenas os templates.
                        Para assistir ao v&iacute;deo basta clicar <a href='" . $sysPath . "/metodo.php#videoPasso6' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_kanban",
                    "alt" => "Adicionar a Tarefa a ferramenta Kanban",
                    "html" => "Devemos adicionar a tarefa na ferramenta Kanban. Para acess&aacute;-la basta clicar <a href='" . $urlFerramentaKanban . "' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_eclipse",
                    "alt" => "Abrir o Eclipse",
                    "html" => "Conforme demonstrado no v&iacute;deo, devemos abrir a inst&acirc;ncia de edi&ccedil;&atilde;o do Metamodelo.
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para abrir esta inst&acirc;ncia est&aacute; descrita
                        <a href='" . $sysPath . "/ferramenta_perini.php#dvComoUsar' target='_blank'>aqui</a>."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Comecar a marcar o tempo",
                    "html" => "Come&ccedil;ar a marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_editar",
                    "alt" => "Fazer a alteracao no Metamodelo",
                    "html" => "Fazer a altera&ccedil;&atilde;o no Metamodelo. O Metamodelo est&aacute; localizado no projeto <strong>org.example.domainmodel.extended</strong>,
                        na pasta <strong>src</strong>, no pacote <strong>org.example.domainmodel</strong>, no arquivo <strong>Extended.xtext</strong>."
                ), array(
                    "img" => $imgFolder . "logo_extrair",
                    "alt" => "Refazer o deploy do Metamodelo.",
                    "html" => "Refazer o <i>deploy</i> do Metamodelo.
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para realiz&aacute;-lo est&aacute; descrito
                        <a href='https://youtu.be/kaMaGxWq21o?t=6m16s' target='_blank'>nesse v&iacute;deo</a> entre 6:16 e 7:48."
                ), array(
                    "img" => $imgFolder . "logo_extrair",
                    "alt" => "Reconfigurar o JET Transformation.",
                    "html" => "Reconfigurar o JET Transformation.
                        Caso voc&ecirc; tenha alguma d&uacute;vida, o passo-a-passo para realiz&aacute;-lo est&aacute; descrito
                        <a href='https://youtu.be/kaMaGxWq21o?t=10m48s' target='_blank'>nesse v&iacute;deo</a> entre 10:48 e 11:05."
                ), array(
                    "img" => $imgFolder . "logo_teste",
                    "alt" => "Testar as modificacoes",
                    "html" => "Testar as modifica&ccedil;&otilde;es."
                ), array(
                    "img" => $imgFolder . "logo_relogio",
                    "alt" => "Parar de marcar o tempo",
                    "html" => "Parar de marcar o tempo."
                ), array(
                    "img" => $imgFolder . "logo_questionario",
                    "alt" => "Assistir Responder o questionario",
                    "html" => "Responder o <strong>Questionário de Opinião sobre o Método e Tutorial Proposto</strong>
                        clicando <a href='" . $urlQuestionaioExperimento . "'' target='_blank'>aqui</a>."
                )
            )
        )
    );
?>