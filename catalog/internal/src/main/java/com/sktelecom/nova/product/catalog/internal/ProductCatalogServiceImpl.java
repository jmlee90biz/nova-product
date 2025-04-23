package com.sktelecom.nova.product.catalog.internal;

import com.sktelecom.nova.product.catalog.api.ProductCatalogService;
import com.sktelecom.nova.product.catalog.api.ProductDto;
import com.sktelecom.nova.product.catalog.api.ProductRegistrationRequest;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
//@RequiredArgsConstructor
public class ProductCatalogServiceImpl implements ProductCatalogService {
    private final ProductRepository productRepository;
    private final ApplicationEventPublisher eventPublisher;

    public ProductCatalogServiceImpl(ProductRepository productReposity, EventPublisherWrapper eventPublisher) {
        this.productRepository = productReposity;
        this.eventPublisher = eventPublisher;
    }

    @Override
    @Transactional
    public ProductDto registerProduct(ProductRegistrationRequest productRegistrationRequest) {
        Product registeredProduct = productRepository.save(
                Product.createProduct(productRegistrationRequest.name(), productRegistrationRequest.description())
        );

        eventPublisher.publishEvent(registeredProduct.createProductRegisteredEvent());

        System.out.println("Registered product: " + registeredProduct);
        return ProductMapper.toProductDto(registeredProduct);
    }

    @Override
    public ProductDto getProductById(UUID productId) {
        return productRepository.findById(productId).map(ProductMapper::toProductDto)
                .orElseThrow(()->new RuntimeException("Product not found"));
    }

    @Override
    public List<ProductDto> findAllProducts() {
        return productRepository.findAll().stream().map(ProductMapper::toProductDto).toList();
    }
}
