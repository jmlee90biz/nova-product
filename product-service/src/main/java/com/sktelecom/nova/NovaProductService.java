package com.sktelecom.nova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class NovaProductService {
    public static void main(String[] args) {
        SpringApplication.run(NovaProductService.class, args);
    }
}
