<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!doctype html>
<html lang="en">

<head>
    <title>Pokemon</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS v5.2.1 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">

</head>

<body>
    <div class="container shadow p-0">
        <nav class="py-5 navbar navbar-expand-sm navbar-light bg-light">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"><img
                        src="data:image/jpeg;base64,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"
                        alt=""></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarID"
                    aria-controls="navbarID" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarID">
                    <div class="navbar-nav">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>

                    </div>
                </div>
            </div>
        </nav>
        <main>
            <div class="row mx-3">
            <c:forEach items="${pokemons}" var="item">
                <div class="col-md-4 mt-4">
                    <div class="card">
                        <img src="<c:out value="${item.foto}"></c:out>"
                            width="100%" alt="Title">
                        <div class="card-body">
                            <p class="card-text"><c:out value="${item.name}"></c:out></p>
                        </div>
                    </div>
                </div>
            </c:forEach>
            </div>
        </main>
    </div>
    <!-- Bootstrap JavaScript Libraries -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
        integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous">
        </script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
        integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz" crossorigin="anonymous">
        </script>
</body>

</html>