package com.sktelecom.nova.product.pricing.internal;

import com.sktelecom.nova.product.pricing.api.PricingPlanDto;

class PricingPlanMapper {
    static PricingPlanDto toPricingPlanDto(PricingPlan pricingPlan) {
        return new PricingPlanDto(pricingPlan.getId(), pricingPlan.getProductId(), pricingPlan.getName(), pricingPlan.getPrice());
    }
}
