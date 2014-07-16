package $github.smtp2006.maven.archetype;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HelloController
{
    protected static Logger L = LoggerFactory.getLogger( BaseController.class );

    @ResponseBody
    @RequestMapping( value = "/hello" )
    public String hello( @RequestParam( value = "name", defaultValue = "World" )
  )
        throws Exception
    {
        LOG.info( "name:{}",name );
        return "Hello, " + name;
    }
}
