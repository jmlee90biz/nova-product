package com.sktelecom.nova.product.catalog.client;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sktelecom.nova.product.catalog.api.ProductCatalogService;
import com.sktelecom.nova.product.catalog.api.ProductDto;
import com.sktelecom.nova.product.catalog.api.ProductRegistrationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;

import static com.sktelecom.nova.product.catalog.client.ProductCatalogProperties.PRODUCT_CATALOG_PRODUCTS_URL;

@Service
@RequiredArgsConstructor
public class ProductCatalogServiceClient implements ProductCatalogService {
    //private final ProductCatalogServiceAdapter productCatalogServiceAdapter;
    private final ProductCatalogProperties properties;

    @Override
    public ProductDto registerProduct(ProductRegistrationRequest productRegistrationRequest) {
        return null;
    }

    @Override
    public ProductDto getProductById(UUID productId) {
        return null;
    }

    @Override
    public List<ProductDto> findAllProducts() {
        System.out.println("ProductCatalogServiceClient.findAllProducts");

        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(properties.getBaseUrl() + PRODUCT_CATALOG_PRODUCTS_URL))
                    .GET()
                    .build();

            HttpResponse<String> response = httpClient.send(
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            ObjectMapper objectMapper = new ObjectMapper();

            return objectMapper.readValue(
                    response.body(),
                    new TypeReference<List<ProductDto>>() {}
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
