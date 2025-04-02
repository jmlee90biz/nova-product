package com.sktelecom.nova.config;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisherWrapper implements ApplicationEventPublisher {

    private final ApplicationEventPublisher delegate;

    public EventPublisherWrapper(ApplicationEventPublisher delegate) {
        this.delegate = delegate;
    }

    @Override
    public void publishEvent(Object event) {
        delegate.publishEvent(event);
    }

    @Override
    public void publishEvent(ApplicationEvent event) {
        delegate.publishEvent(event);
    }
}