package ${package}.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping( value = "/mvc" )
public class HelloController
{
    protected static Logger L = LoggerFactory.getLogger( HelloController.class );

    @ResponseBody
    @RequestMapping( value = "/hello" )
    public String hello( @RequestParam( value = "name", defaultValue = "World" )
    String name )
        throws Exception
    {
        L.info( "name:{}", name );
        return "Hello, " + name;
    }
}
