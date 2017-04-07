package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by xuhaowen on 2017/4/7.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    /**
     * 部署到外部Tomcat(需要继承SpringBootServletInitializer，重写configure方法)
     *
     * @param application
     * @return
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    /**
     * 部署到内部Tomcat(Spring Boot自身)
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
