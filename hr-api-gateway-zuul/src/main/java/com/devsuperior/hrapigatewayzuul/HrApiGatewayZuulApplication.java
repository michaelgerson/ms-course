package com.devsuperior.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class HrApiGatewayZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrApiGatewayZuulApplication.class, args);
    }

}
