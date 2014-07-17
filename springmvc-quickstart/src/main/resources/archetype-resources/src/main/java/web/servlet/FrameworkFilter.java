package ${package}.web.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @format Eclipse format:http://maven.apache.org/developers/maven-eclipse-codestyle.xml
 * @Date 2014年7月17日 上午9:46:10
 * @Class FrameworkFilter.java
 * @see org.springframework.web.filter.CharacterEncodingFilter
 */
public class FrameworkFilter
    implements Filter
{
    protected static Logger L = LoggerFactory.getLogger( FrameworkFilter.class );

    @Override
    public void destroy()
    {

    }

    @Override
    public void doFilter( ServletRequest arg0, ServletResponse arg1, FilterChain arg2 )
        throws IOException, ServletException
    {
        L.info( "Execute doFilter as the order in web.xml" );
        L.info( "Access html page" );
        arg1.getOutputStream().write( "Access html page".getBytes( ) );
        arg1.getOutputStream().flush();
        return;
    }

    @Override
    public void init( FilterConfig arg0 )
        throws ServletException
    {
        L.info( "Web Container init Filter" );

    }

}
