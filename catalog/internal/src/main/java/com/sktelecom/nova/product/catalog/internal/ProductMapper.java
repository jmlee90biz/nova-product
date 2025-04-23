package com.sktelecom.nova.product.catalog.internal;

import com.sktelecom.nova.product.catalog.api.ProductDto;

class ProductMapper {
    static ProductDto toProductDto(Product product) {
        return new ProductDto(product.getId(), product.getName(), product.getDescription());
    }
}
