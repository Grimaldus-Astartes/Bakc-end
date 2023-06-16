package com.serviceweb.demo.util;

import com.serviceweb.demo.business.StoreService;
import com.serviceweb.demo.data.Celular;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
    private final StoreService service;
    public AppStartupEvent(StoreService service) {
        this.service = service;
    }
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("---Ready---");
    }
}
