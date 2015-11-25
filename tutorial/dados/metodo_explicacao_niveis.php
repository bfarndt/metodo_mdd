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
                <img src="img/metodo_dsl.png" class="img_zoom" data-zoom-image="img/metodo_dsl.png" alt="Exemplo de uma DSL">
            </a>
            <legend>
                FIGURA <?php echo ++$contImg; ?> - Exemplo de uma DSL.
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
                FIGURA <?php echo ++$contImg; ?> - Exemplo de um Modelo.
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
                <img src="img/metodo_template.png" class="img_zoom" data-zoom-image="img/metodo_template.png" alt="Exemplo de um Template">
            </a>
            <legend>
                FIGURA <?php echo ++$contImg; ?> - Exemplo de um <i>Template</i>.
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
                <img src="img/metodo_IR.png" class="img_zoom" data-zoom-image="img/metodo_IR.png" alt="Exemplo de uma Implementação de Referência">
            </a>
            <legend>
                FIGURA <?php echo ++$contImg; ?> - Exemplo de uma Implementação de Referência.
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