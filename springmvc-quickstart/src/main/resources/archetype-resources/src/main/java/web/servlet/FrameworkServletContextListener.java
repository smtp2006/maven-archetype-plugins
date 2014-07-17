package ${package}.web.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @format Eclipse format:http://maven.apache.org/developers/maven-eclipse-codestyle.xml
 * @Email hua.wanghuawh@alibaba-inc.com
 * @Date 2014年7月17日 上午9:38:54
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
        L.info( "Web容器销毁应用上下文，回收资源" );
    }

    @Override
    public void contextInitialized( ServletContextEvent arg0 )
    {
        L.info( "[Web容器初始化]应用上下文，在应用的生命周期内只初始化一次" );
        L.info( "Web容器按照web.xml中ServletContextListener定义的顺序，初始化对应的ServletContextListener" );
    }

}
