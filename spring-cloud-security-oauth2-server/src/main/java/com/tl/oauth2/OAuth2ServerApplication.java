package com.tl.oauth2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author guoyong
 */
@SpringBootApplication
@MapperScan(basePackages = "com.tl.oauth2.mapper")
public class OAuth2ServerApplication {
    public static void main(String[] args) {

        SpringApplication.run(OAuth2ServerApplication.class,args);
    }
}
