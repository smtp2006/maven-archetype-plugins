/**
 * Copyright (c) 2014.
 */
package github.smtp2006.maven.springmvc;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * @format Eclipse format:http://maven.apache.org/developers/maven-eclipse-codestyle.xml
 * @Email hua.wanghuawh@alibaba-inc.com
 * @Date 2014年7月16日 下午1:40:05
 * @Class QuickStartMojo.java
 */
@Mojo( name = "quickstart" )
public class QuickStartMojo
    extends AbstractMojo
{

    public void execute()
        throws MojoExecutionException, MojoFailureException
    {
        getLog().info( "##SpringMVC QuickStart" );

    }

}
