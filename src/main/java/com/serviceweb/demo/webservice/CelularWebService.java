package com.serviceweb.demo.webservice;

import com.serviceweb.demo.business.StoreService;
import com.serviceweb.demo.data.Celular;
import com.serviceweb.demo.dto.CelularRequest;
import com.serviceweb.demo.dto.PatchDto;
import jdk.jfr.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CelularWebService implements WebMvcConfigurer {
    private final StoreService service;

    public CelularWebService(StoreService service) {
        this.service = service;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedMethods("*");
    }

    @GetMapping(value = "/formularios/celulares", produces = "application/json")
    public List<Celular> getCelulares(){
        List<Celular> celulares = service.getCelulares();
        System.out.println(celulares);
        return celulares;
    }
    @PostMapping("/formularios/celulares")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody CelularRequest celular){
        try{
            this.service.addCelular(celular);
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }
    @DeleteMapping("/formularios/celulares/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Celular deleteCelular(@PathVariable int id){
        return service.deleteCelular(id);
    }
    @PatchMapping("/formularios/celulares/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public boolean partialUpdate(@PathVariable int id, @RequestBody PatchDto body){
        System.out.println("asdasdasddasd");
        return service.partialUpdateCelular(id, body.getKey(), body.getValue());
    }
}
