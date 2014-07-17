package ${package}.web.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @format Eclipse format:http://maven.apache.org/developers/maven-eclipse-codestyle.xml
 * @Email hua.wanghuawh@alibaba-inc.com
 * @Class FrameworkServletContextListener.java
 * @see org.springframework.web.util.Log4jConfigListener
 * @see org.springframework.web.context.ContextLoaderListener
 */
public class FrameworkServletContextListener
    implements ServletContextListener
{
    protected static Logger L = LoggerFactory.getLogger( FrameworkServletContextListener.class );

    @Override
    public void contextDestroyed( ServletContextEvent arg0 )
    {
        L.info( "Destroy, release resources" );
    }

    @Override
    public void contextInitialized( ServletContextEvent arg0 )
    {
        L.info( "Web Container init Listener as the order in web.xml." );
    }

}
