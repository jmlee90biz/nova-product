package com.sktelecom.nova.product.pricing.api;

import java.math.BigDecimal;
import java.util.UUID;

public record PricingPlanDto(UUID id, UUID productId, String name, BigDecimal price) {
}
