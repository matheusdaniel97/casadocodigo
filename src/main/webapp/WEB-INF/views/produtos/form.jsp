<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Livros de Java, Android, iPhone, Ruby, PHP e muito mais - Casa do Código</title>
</head>
<body>
    <form action="/casadocodigo/produtos" method="POST">
        <div>
            <label>Titulo<label>
            <input type="text" name="titulo">
        <div>
        <div>
            <label>Descricao<label>
            <textarea rows="10" cols="20" name=descricao></textarea>
        <div>
        <div>
            <label>Paginas<label>
            <input type="number" name="paginas">
        <div>
        <button type="submit">Cadastrar</button>
    </form>
</body>
</html>