package com.paderlol.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author zhanglong
 */
@SpringBootApplication(
        scanBasePackages="com"
)
public class SpringBootShareApplication  {


    public static void main(String[] args) {
        SpringApplication.run(SpringBootShareApplication.class, args);

    }



}
