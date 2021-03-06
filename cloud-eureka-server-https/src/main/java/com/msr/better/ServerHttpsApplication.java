package com.msr.better;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author MaiShuRen
 * @site http://www.maishuren.top
 * @date 2020-10-23
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerHttpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerHttpsApplication.class, args);
    }
}
