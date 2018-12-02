/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Neha Sharma
 */
public class vote extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //Before voting we must check whether voter is allowed to vote or not 
        HttpSession session=request.getSession(false);
         String voter=(String)session.getAttribute("voter");
        // We now have the voter id...now query the database for voted column
        try(PrintWriter out = response.getWriter())
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/votesystem?useSSL=false","root","nehasharma1481");
            PreparedStatement pstmt=DriverManager.getConnection("jdbc:mysql://localhost/votesystem?useSSL=false","root","nehasharma1481").prepareStatement("select voted from signup where voter=?");
            //Statement stmt=conn.createStatement();
            //PreparedStatement pstmt=conn.prepareStatement("select voted from signup where voter=?");
            int v1=Integer.parseInt(voter);
            pstmt.setInt(1, v1);
            ResultSet rs=pstmt.executeQuery();
            if(rs.last())
            {
                if(rs.getInt(1)==0)
                {
                    pstmt.close();
                    String a=request.getParameter("1001");
         String b=request.getParameter("1002");
         String c=request.getParameter("1003");
         String d=request.getParameter("1004");
         String e1=request.getParameter("1005");
         String f=request.getParameter("1006");
         String g=request.getParameter("1007");
         String h=request.getParameter("1008");
         int v=0;
         if(a!=null)
         {
             v=Integer.parseInt(a);
         }
         if(b!=null)
         {
             v=Integer.parseInt(b);
         }
         if(c!=null)
         {
             v=Integer.parseInt(c);
         }
         if(d!=null)
         {
             v=Integer.parseInt(d);
         }
         if(e1!=null)
         {
             v=Integer.parseInt(e1);
         }
         if(f!=null)
         {
             v=Integer.parseInt(f);
         }
         if(g!=null)
         {
             v=Integer.parseInt(g);
         }
         if(h!=null)
         {
             v=Integer.parseInt(h);
         }
        
         Class.forName("com.mysql.cj.jdbc.Driver");
            pstmt=DriverManager.getConnection("jdbc:mysql://localhost/votesystem?useSSL=false","root","nehasharma1481").prepareStatement("update result set vote_count=vote_count+1 where candidate_id=(?)");
           //Statement stmt=conn.createStatement();
           
            pstmt.setInt(1,v);
            pstmt.executeUpdate();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/votesystem?useSSL=false","root","nehasharma1481");
             pstmt=con.prepareStatement("update signup set voted=1 where voter=(?)");
            pstmt.setInt(1, Integer.parseInt(voter));
                    pstmt.executeUpdate(); 
                    out.println("<h1>voted sucessfully!! </h1>");
                }
                else
                {
                    out.println("<h1>You have already voted</h1>");
                    session.invalidate();
                    response.sendRedirect("loginhtml.html");
                }
            }
            else
            {
                out.println("voter doesnt exist");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
       
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
