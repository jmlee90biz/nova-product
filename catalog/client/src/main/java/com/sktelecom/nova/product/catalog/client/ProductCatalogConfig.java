package com.sktelecom.nova.product.catalog.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;

//@Configuration
public class ProductCatalogConfig {

//    @Bean
    public HttpClient httpClient() {
        return HttpClient.newHttpClient();
    }
}