package ${package}.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet
    extends HttpServlet
{

    /**
     * 
     */
    private static final long serialVersionUID = 2397907284152436080L;

    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp )
        throws ServletException, IOException
    {
        String name = req.getParameter( "name" );
        if ( name == null )
        {
            name = "World.";
        }
        resp.getWriter().write( "Hello, " + name );
        resp.getWriter().flush();
    }

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp )
        throws ServletException, IOException
    {
        doGet( req, resp );
    }

}
