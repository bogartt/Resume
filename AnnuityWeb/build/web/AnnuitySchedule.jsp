
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Schedule</title>
    </head>
    <body>
        <h1>Annuity Schedule</h1>
        <table border="1">
            <tr>
                <th>Month</th>
                <th>Beg.Bal.</th>
                <th>Deposit@beginning</th>
                <th>Deposit@end</th>
                <th>Int.Earned</th>
                <th>End.Bal.</th>
            </tr>
            <c:forEach var="annmo" items="${annuity.months}">
                <tr>
                    <td align="right">${annmo.month}</td>
                    <td align="right">
                        <fmt:formatNumber value="${annmo.bbal}" type="currency"/></td>
                    <td align="right">
                        <fmt:formatNumber value="${annmo.deposit1}" type="currency"/></td>
                    <td align="right">
                        <fmt:formatNumber value="${annmo.deposit2}" type="currency"/></td>
                    <td align="right">
                        <fmt:formatNumber value="${annmo.intearn}" type="currency"/></td>
                    <td align="right">
                        <fmt:formatNumber value="${annmo.ebal}" type="currency"/></td>
                </tr>
            </c:forEach>
            
    </table>
        <br>
      <form action="NewAnnuity" method="post">
              <input type="submit" value="New Annuity"/>
          </form>
      
    </body>
</html>
