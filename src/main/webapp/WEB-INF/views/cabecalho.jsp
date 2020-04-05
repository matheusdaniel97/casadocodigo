<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>

<body>

	<header id="layout-header">
		<div class="clearfix container">
			<a href="${ s:mvcUrl('HC#index').build() }" id="logo"> </a>
			<div id="header-content">
				<nav id="main-nav">

					<ul class="clearfix">
                        <li><a href="${s:mvcUrl('CCC#itens').build()}" rel="nofollow">Carrinho (${carrinhoCompras.quantidade}) </a></li>
						<li><a href="/pages/sobre-a-casa-do-codigo" rel="nofollow">Sobre</a></li>
						<li><a href="/pages/perguntas-frequentes" rel="nofollow">Perguntas Frequentes</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>
	<nav class="categories-nav">
		<ul class="container">
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }">Home</a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Agile </a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Front End </a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Games </a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Java </a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Mobile </a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Web </a></li>
			<li class="category"><a href="${ s:mvcUrl('HC#index').build() }"> Outros </a></li>
		</ul>
	</nav>