/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderSystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Owner
 */
@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //set variables
        PrintWriter out = response.getWriter();
        String RESULT_PAGE = "/completedOrder.jsp";
        String[] items = request.getParameterValues("item");
        String customerName = request.getParameter("name");
        double tax = 0;
        double subTotal = 0;
        double total = 0;
        double tip = 0;
        double ITEM_PRICE = 9.99;
        
        //instantiate model class
        ReceiptBuilder rb = new ReceiptBuilder();
        
        //call model methods
        rb.setItems(items);
        rb.setCustomerName(customerName);
        subTotal = rb.calculateSubTotal();
        tax = rb.calculateTax();
        total = rb.calculateTotal();
        tip = rb.calculateTip();
//        System.out.println( Arrays.toString( items ) );

        
        //set attributes
        request.setAttribute("items", Arrays.toString(items));
        request.setAttribute("name", customerName);
        request.setAttribute("subTotal", subTotal);
        request.setAttribute("tax", tax);
        request.setAttribute("total", total);
        request.setAttribute("tip", tip);
        request.setAttribute("price", ITEM_PRICE);
        // This object lets you forward both the request and response
        // objects to a destination page
        RequestDispatcher view =
                request.getRequestDispatcher(RESULT_PAGE);
        view.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
