package com.sktelecom.nova.product.catalog.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "product.catalog")
public class ProductCatalogProperties {
    public final static String PRODUCT_CATALOG_PRODUCTS_URL = "/product/catalog/products";
    private String baseUrl;
    public String getBaseUrl() { return baseUrl; }
    public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }
}