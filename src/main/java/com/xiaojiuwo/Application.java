package com.xiaojiuwo;

import com.xiaojiuwo.filters.AuthFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.system.ApplicationPidFileWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
@EnableTurbine
@EnableDiscoveryClient
@EnableZuulProxy
public class Application {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.addListeners(new ApplicationPidFileWriter());
        springApplication.run(args);

    }

    @Bean
    public AuthFilter authFilter() {
        return new AuthFilter();
    }
}

