/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.3.v20170317
 * Generated at: 2020-04-05 11:11:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("s:mvcUrl", org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder.class, "fromMappingName", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(11);
    _jspx_dependants.put("/WEB-INF/views/cabecalho.jsp", Long.valueOf(1586084408315L));
    _jspx_dependants.put("file:/C:/Users/manch/.m2/repository/org/glassfish/web/jstl-impl/1.2/jstl-impl-1.2.jar", Long.valueOf(1580850432452L));
    _jspx_dependants.put("jar:file:/C:/Users/manch/.m2/repository/org/springframework/spring-webmvc/4.1.0.RELEASE/spring-webmvc-4.1.0.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1409815114000L));
    _jspx_dependants.put("/WEB-INF/views/rodape.jsp", Long.valueOf(1586085106878L));
    _jspx_dependants.put("file:/C:/Users/manch/.m2/repository/org/springframework/security/spring-security-taglibs/4.0.0.RELEASE/spring-security-taglibs-4.0.0.RELEASE.jar", Long.valueOf(1584665174946L));
    _jspx_dependants.put("jar:file:/C:/Users/manch/.m2/repository/org/springframework/security/spring-security-taglibs/4.0.0.RELEASE/spring-security-taglibs-4.0.0.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1427325680000L));
    _jspx_dependants.put("/WEB-INF/tags/pageTemplate.tag", Long.valueOf(1586084311373L));
    _jspx_dependants.put("file:/C:/Users/manch/.m2/repository/org/springframework/spring-webmvc/4.1.0.RELEASE/spring-webmvc-4.1.0.RELEASE.jar", Long.valueOf(1580850425357L));
    _jspx_dependants.put("file:/C:/Users/manch/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1579961110605L));
    _jspx_dependants.put("jar:file:/C:/Users/manch/.m2/repository/org/glassfish/web/jstl-impl/1.2/jstl-impl-1.2.jar!/META-INF/c.tld", Long.valueOf(1308137770000L));
    _jspx_dependants.put("jar:file:/C:/Users/manch/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425989470000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_tags_005fpageTemplate_005f0(_jspx_page_context))
        return;
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tags_005fpageTemplate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tags:pageTemplate
    org.apache.jsp.tag.web.pageTemplate_tag _jspx_th_tags_005fpageTemplate_005f0 = (new org.apache.jsp.tag.web.pageTemplate_tag());
    _jsp_getInstanceManager().newInstance(_jspx_th_tags_005fpageTemplate_005f0);
    _jspx_th_tags_005fpageTemplate_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/home.jsp(8,0) name = titulo type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_tags_005fpageTemplate_005f0.setTitulo("Livros de Java, Android, IOs, Mobile e muito mais...");
    _jspx_th_tags_005fpageTemplate_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_tags_005fpageTemplate_005f0, null));
    _jspx_th_tags_005fpageTemplate_005f0.doTag();
    _jsp_getInstanceManager().destroyInstance(_jspx_th_tags_005fpageTemplate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      // /WEB-INF/views/home.jsp(16,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/home.jsp(16,3) '${produtos }'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${produtos }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/home.jsp(16,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("produto");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t<li>\n");
            out.write("\t\t\t\t\t<a href=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s:mvcUrl('PC#detalhe').arg(0, produto.id).build() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, _jspx_fnmap_0));
            out.write("\" class=\"block clearfix\">\n");
            out.write("\t\t\t\t\t<h2 class=\"product-title\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${produto.titulo }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</h2> \n");
            out.write("\t\t\t\t\t<img width=\"143\" height=\"202\" src=\"https://cdn.shopify.com/s/files/1/0155/7645/products/java8-featured_large.png?v=1411490181\" alt=\"Java 8 Prático\" title=\"Java 8 Prático\" /> \n");
            out.write("\t\t\t\t\t<small class=\"buy-button\">Compre</small>\n");
            out.write("\t\t\t\t\t</a>\n");
            out.write("\t\t\t\t</li>\n");
            out.write("\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new javax.servlet.jsp.SkipPageException();
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
    } finally {
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write("\n");
      out.write("\n");
      out.write("\t<section id=\"index-section\" class=\"container middle\">\n");
      out.write("\n");
      out.write("\t\t<h1 class=\"cdc-call\">Últimos dias com os preços promocionais. Aproveite!</h1>\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"clearfix book-collection\">\n");
      out.write("\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\n");
      out.write("\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t<h2 class=\"cdc-call\">Diferenciais da Casa do Código</h2>\n");
      out.write("\n");
      out.write("\t\t<ul id=\"cdc-diferenciais\" class=\"clearfix\">\n");
      out.write("\t\t\t<li class=\"col-left\">\n");
      out.write("\t\t\t\t<h3>E-books sem DRM. Leia onde quiser</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-drm\"></span> Nossos e-books não possuem DRM, ou seja, você pode ler em qualquer computador, tablet e smartphone.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"col-right\">\n");
      out.write("\t\t\t\t<h3>Autores de renome na comunidade</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-renome\"></span> Autores que participam ativamente na comunidade com Open Source, listas de discussão, grupos e\n");
      out.write("\t\t\t\t\tmais.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"col-left\">\n");
      out.write("\t\t\t\t<h3>Receba atualizações dos e-books</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-atualizacoes\"></span> Quando você compra um e-book, automaticamente tem direito às atualizações e correções dele.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"col-right\">\n");
      out.write("\t\t\t\t<h3>Livros com curadoria da Caelum</h3>\n");
      out.write("\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t<span class=\"sprite\" id=\"sprite-caelum\"></span> Desenvolvedores experientes que avaliam e revisam os livros constantemente.\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
