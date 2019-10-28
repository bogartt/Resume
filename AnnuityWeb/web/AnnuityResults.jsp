<%-- 
    Document   : AnnuityResults
    Created on : Oct 10, 2019, 1:49:46 PM
    Author     : Students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="annuity" scope="session" class="business.Annuity"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Annuity Results</title>
    </head>
    <body>
        <h1>Annuity Results:</h1>
        <p>An annuity with a deposit of:
        <jsp:getProperty name="annuity" property="deposit"/> at the beginning of the month 
          <jsp:getProperty name="annuity" property="deposit2"/> and or at the end of the month
        and earning <jsp:getProperty name="annuity" property="rate"/>  % per year for <jsp:getProperty name="annuity" property="term"/> <br> months
        will have a final value of: <jsp:getProperty name="annuity" property="finalValue"/>
        </p>
        
        <br>
        <form action="AnnuitySchedule.jsp" method="post">
            <input type="submit" value="Schedule"/>
            
        </form>
            
          <br>
          <form action="NewAnnuity" method="post">
              <input type="submit" value="New Annuity"/>
          </form>
          
        </body>
        </html>
