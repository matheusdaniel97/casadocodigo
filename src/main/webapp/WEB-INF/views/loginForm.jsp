<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>



<c:url value="/resources/css" var="cssPath" />

<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css">


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais - Casa do Código</title>
</head>
<body>
<div class = "container">

    <h1>Login da casa do codigo:</h1>
    <form:form servletRelativeAction="/login" method="POST"
    commandName="produto" enctype="multipart/form-data">
        <div class="form-group">
            <label>E-mail</label>
            <input name="username" type="text" cssClass="form-control"/>
            <form:errors path="titulo" />
        </div>
        <div class="form-group">
            <label>Password</label>
            <input name="password" type="password" cssClass="form-control"/>
        </div>
        <button type="submit" class "btn btn-primary">Logar</button>
    </form:form>
</div>
</body>
</html>