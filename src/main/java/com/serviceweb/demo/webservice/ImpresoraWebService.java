package com.serviceweb.demo.webservice;

import com.serviceweb.demo.business.StoreService;
import com.serviceweb.demo.data.Impresora;
import com.serviceweb.demo.dto.Impresorarequest;
import com.serviceweb.demo.dto.PatchDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("formularios/impresoras")
public class ImpresoraWebService {
    private final StoreService service;

    public ImpresoraWebService(StoreService service) {
        this.service = service;
    }
    @GetMapping
    public List<Impresora> getImpresoras(){
        return this.service.getImpresoras();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addImpresora(@RequestBody Impresorarequest impresora){
        service.addimpresora(impresora);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Impresora delete(@PathVariable int id){
        return this.service.deleteImpresora(id);
    }
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public boolean partialUpdate(@PathVariable int id, @RequestBody PatchDto dto){
       return service.partialUpdateComputadora(id, dto.getKey(), dto.getValue());
    }
}
