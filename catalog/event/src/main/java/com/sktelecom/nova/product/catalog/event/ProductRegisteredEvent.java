package com.sktelecom.nova.product.catalog.event;

import java.util.UUID;

public record ProductRegisteredEvent(UUID id, String name, String email) {
}
