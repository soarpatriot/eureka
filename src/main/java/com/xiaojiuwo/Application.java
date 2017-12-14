package com.xiaojiuwo;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@EnableEurekaServer
@SpringCloudApplication
public class Application {


    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Application.class)
                .web(true).run(args);
        //SpringApplication.run(Application.class, args);
    }

}

