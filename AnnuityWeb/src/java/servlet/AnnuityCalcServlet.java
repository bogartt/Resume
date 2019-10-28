
package servlet;

import business.Annuity;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Students
 */
public class AnnuityCalcServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String URL = "/AnnuityResults.jsp";
       String msg="";
       double deposit1,deposit2, rate;
       int term;
       Annuity a =  new Annuity();
        try{
            
            deposit1 = Double.parseDouble(request.getParameter("amt1"));
                a.setDeposit1(deposit1);
            deposit2 = Double.parseDouble(request.getParameter("amt2"));
                a.setDeposit2(deposit2);
            rate = Double.parseDouble(request.getParameter("irt"));
                a.setRate(rate);
             term = Integer.parseInt(request.getParameter("term"));
                a.setTerm(term);
           if(deposit1<=0 && deposit2<=0){
            msg = "Please enter a deposit";
            
        }
                
          
            }catch (NumberFormatException e){
                msg = "Non-numeric or bad input data. <br>";
        } 
        if(!msg.isEmpty()){
            URL ="/AnnuityInput.jsp"; 
           request.setAttribute("msg", msg);
        }
       
        HttpSession sess = request.getSession();
        sess.setAttribute("annuity", a);
        
             
          RequestDispatcher disp =
                  getServletContext().getRequestDispatcher(URL);
          disp.forward(request,response);
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
