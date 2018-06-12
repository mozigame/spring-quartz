package com.jf.main2;

/**
 * User: joey
 * Date: 2018/6/11
 * Time: 1:32
 */

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.web.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerPropertiesAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.concurrent.TimeUnit;


@Configuration
@ComponentScan({"com.jf.quartz"})
@EnableAspectJAutoProxy
@EnableWebMvc
@EnableScheduling
@Import({ServerPropertiesAutoConfiguration.class, DispatcherServletAutoConfiguration.class
//        ,EmbeddedServletContainerAutoConfiguration.class
})
@PropertySource(value = {/* "classpath:appli2.properties",*/  "classpath:quartz.properties", "classpath:db.properties"})
@ImportResource(value = {"classpath:spring/spring-main.xml"})
public class Application2 {

    private static final Logger logger = Logger.getLogger(Application2.class);
    public static void main(String[] args) {
        logger.info("start >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.setProperty("user.timezone","America/New_York");
        SpringApplication.run(Application2.class, args);
    }
//
//    @Bean
//    public EmbeddedServletContainerFactory servletContainer() {
//        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
//        factory.setPort(8082);
//        factory.setSessionTimeout(10, TimeUnit.MINUTES);
//        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/notfound.html"));
//        return factory;
//    }
}
