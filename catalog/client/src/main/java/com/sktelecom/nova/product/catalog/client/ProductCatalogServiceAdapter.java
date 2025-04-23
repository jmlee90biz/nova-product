package com.sktelecom.nova.product.catalog.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sktelecom.nova.product.catalog.api.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static com.sktelecom.nova.product.catalog.client.ProductCatalogProperties.PRODUCT_CATALOG_PRODUCTS_URL;

//@Component
//@RequiredArgsConstructor
public class ProductCatalogServiceAdapter {
//    private final HttpClient httpClient;
//    private final ProductCatalogProperties properties;

//    public List<ProductDto> findAllProducts() throws IOException, InterruptedException {
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create(properties.getBaseUrl() + PRODUCT_CATALOG_PRODUCTS_URL))
//                .GET()
//                .build();
//
//        HttpResponse<String> response = httpClient.send(
//                request,
//                HttpResponse.BodyHandlers.ofString()
//        );
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        return objectMapper.readValue(
//                response.body(),
//                new TypeReference<List<ProductDto>>() {}
//        );
//
//    }
}
