<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<%-- Taglib directives can be specified here: --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>

<%@ attribute name="produto" required="true"
	type="webdomain.core.beans.Produto"%>

<br />
<table>
<tr>
<td>
<img class="imagemItemResumo"
	src="webdomain.core.actions.NavegacaoActions.mostraImagemProduto.do?produtoId=${produto.produtoId}" />

</td>
<td class="conteudoItemResumo">
<a href="webdomain.core.actions.NavegacaoActions.mostraProduto.do?produtoId=${produto.produtoId}">${produto.nome}</a>
<br />
<f:message key="webdomain.core.beans.Produto.descricao.label" />
: ${produto.descricao}
<br />
</td>
</tr>
</table>
