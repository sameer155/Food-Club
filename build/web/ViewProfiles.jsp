



<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.List"%>
<%@page import="profiles.Profiles"%>
<%@page import="profiles.ProfileDaoIMPl"%> 
<%@page import="profiles.ProfileDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    
    <%
    ProfileDAO pdao = new ProfileDaoIMPl();
    
   List<Profiles> list = pdao.getProfiles();         
         
   
   request.setAttribute("products", list);
    
    %>
    
    <body>
         <nav class="navbar navbar-inverse" style="margin-bottom:0px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
<a class="navbar-brand" href="#" style="color:#17A589">Food Club</a>
      <ul class="nav navbar-nav">
        <li> <a href="ViewProfiles.jsp">Profiles</a></li>
        <li class="active"><a href="cloud.jsp">Upload Products</a></li>
        <li class="active"><a href="fooddetails.jsp">Product Details</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">

          <!-- User Name -->
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> Sameer as Admin</b></a></li>
    	

<!-- User Registration Button -->
	<li ><a href="login.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>
       <br><Br>
        <h1 style="border:1px solid brown; margin: auto; width: 80%; text-align: center;">View Profiles</h1>
        <br><BR>
        
        <table class="table table-striped" style="margin: auto; width: 80%; text-align: center;"> 
           
            <tbody>
                <c:forEach items="${products}" var="x">
                <tr>
                    <th>${x.getName()}</th>
                     <th>${x.getEmail()}</th>
                     <th>${x.getPassword()}</th>
                      <th>${x.getPhone()}</th>
                       <th>${x.getAddress()}</th>
                       <th><a href="DeleteFromDB?id=${x.getId()}" class="btn btn-danger">Delete</a></th>
                        <th> <th><a href="UpDate.jsp?id=${x.getId()}" class="btn btn-success">Update</a></th></th>
                </tr>
                </c:forEach>
                
            </tbody>
        </table>
     
      
              
        
    </body>
    </head>

