@ApplicationModule(
        displayName = "product-pricing-internal",
        allowedDependencies = {
                "product.catalog.api",
                "product.pricing.api"
        }
)
package com.sktelecom.nova.product.pricing.internal;

import org.springframework.modulith.ApplicationModule;