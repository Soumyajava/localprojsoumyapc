<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="image/favicon" rel="icon" href="resources/images/a.png" />
<link type="image/favicon" rel="shortcut icon"
href="resources/images/a.png" />
<link rel="stylesheet" href="resources/css/login.css" />
<script src="resources/js/login.js">
</script>
<title>Insert title here</title>
</head>
<body>
  <div class="iiblogo">
  <img alt="IIB Logo" src="resources/images/IIB_Logo.png" />
  </div>
  <div id="login">
  <form id="login_form">
  <div class="formName">
  <b>OD Claim Login Form</b>
  </div>
    <div class="field_container">
      <input type="text" placeholder="User ID">
    </div>
   
    <div class="field_container">
      <input type="Password" placeholder="Password">
      <button id="sign_in_button">
        <span class="button_text">Sign In</span>
      </button>
     <div id="dont_have_an_account">
    <h2>
      <a href="#" id="forgot_password_link" class="login_link">Forgot your password?</a>
    </h2>
    </div>
    </div>
   
   
</form>

</div>
 
 
</body>
</html>