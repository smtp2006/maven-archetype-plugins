package ${package}.web.springmvc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DevInterceptor
    extends HandlerInterceptorAdapter
{
    protected static Logger L = LoggerFactory.getLogger( DevInterceptor.class );

    private boolean dev = true;

    public boolean isDev()
    {
        return dev;
    }

    public void setDev( boolean dev )
    {
        this.dev = dev;
    }

    /**
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle( HttpServletRequest request, HttpServletResponse response, Object handler )
        throws Exception
    {
        if ( dev )
        {
            L.info( "preHandle:{}", request.getRequestURI() );
        }
        return super.preHandle( request, response, handler );
    }

}
