package com.pubud.authenticationcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@SpringBootApplication
public class AuthenticationCenterWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationCenterWebApplication.class, args);
    }

}
