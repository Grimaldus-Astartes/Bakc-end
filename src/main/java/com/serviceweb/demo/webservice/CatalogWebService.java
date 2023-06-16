package com.serviceweb.demo.webservice;

import com.serviceweb.demo.business.StoreService;
import com.serviceweb.demo.data.CatalogValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("catalogs")
public class CatalogWebService {
    private final StoreService storeService;

    public CatalogWebService(StoreService storeService) {
        this.storeService = storeService;
    }
    @GetMapping
    public List<CatalogValue> getCatalogs(){
        return this.storeService.getCatalogs();
    }
}
