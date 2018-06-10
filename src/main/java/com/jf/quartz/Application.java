package com.jf.quartz;

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
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan({"com.jf"})
@EnableAspectJAutoProxy
@EnableWebMvc
@EnableScheduling
@Import({ServerPropertiesAutoConfiguration.class, DispatcherServletAutoConfiguration.class,
        EmbeddedServletContainerAutoConfiguration.class})
@PropertySource(value = {"classpath:quartz.properties", "classpath:db.properties"})
@ImportResource(value = {"classpath:spring/spring-main.xml"})
public class Application {

    private static final Logger logger = Logger.getLogger(Application.class);
    public static void main(String[] args) {
        logger.info("start >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.setProperty("user.timezone","America/New_York");
        SpringApplication.run(Application.class, args);
    }
}
