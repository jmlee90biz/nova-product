@ApplicationModule(
        displayName = "product-catalog-internal",
        allowedDependencies = {
                "product.catalog.api",
                "product.catalog.event"
        }
)
package com.sktelecom.nova.product.catalog.internal;

import org.springframework.modulith.ApplicationModule;