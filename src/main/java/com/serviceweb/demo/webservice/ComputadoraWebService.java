package com.serviceweb.demo.webservice;

import com.serviceweb.demo.business.StoreService;
import com.serviceweb.demo.data.Celular;
import com.serviceweb.demo.data.Computadora;
import com.serviceweb.demo.dto.ComputadoraRequest;
import com.serviceweb.demo.dto.PatchDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.HTML;
import java.util.List;

@RestController
@RequestMapping("formularios/computadoras")
public class ComputadoraWebService {
    private final StoreService service;
    public ComputadoraWebService(StoreService service) {
        this.service = service;
    }
    @GetMapping
    public List<Computadora> getComputadoras(){
        return this.service.getComputadoras();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addComputadora(@RequestBody ComputadoraRequest computadora){
        service.addComputadora(computadora);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    @ResponseBody
    public Computadora deleteComputadora(@PathVariable int id){
        return this.service.deleteComputadora(id);
    }
    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public boolean partialUpdate(@PathVariable int id, @RequestBody PatchDto dto){
        return this.service.partialUpdateComputadora(id, dto.getKey(), dto.getValue());
    }
}
