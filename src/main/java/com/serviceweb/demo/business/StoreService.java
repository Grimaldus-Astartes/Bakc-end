package com.serviceweb.demo.business;

import com.serviceweb.demo.data.*;
import com.serviceweb.demo.dto.CelularRequest;
import com.serviceweb.demo.dto.ComputadoraRequest;
import com.serviceweb.demo.dto.Impresorarequest;
import com.serviceweb.demo.util.constans.TableProperties;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StoreService {
    private final FormCelularRepository formCelularRepository;
    private final FormComputadoraRepository formComputadoraRepository;
    private final FormImpresoraRepository formImpresoraRepository;
    private final CatalogRepository catalogRepository;

    enum properties {

    }

    public StoreService(
            FormCelularRepository formCelularRepository,
            FormComputadoraRepository formComputadoraRepository,
            FormImpresoraRepository formImpresoraRepository, CatalogRepository catalogRepository) {
        this.formCelularRepository = formCelularRepository;
        this.formComputadoraRepository = formComputadoraRepository;
        this.formImpresoraRepository = formImpresoraRepository;
        this.catalogRepository = catalogRepository;
    }

    public List<Celular> getCelulares(){
        List<Celular> celulars = this.formCelularRepository.findAll();
        return celulars;
    }

    public void addCelular(CelularRequest newCelular) throws SQLException {
        if(newCelular == null) throw new RuntimeException("You tried added a null celular");
        try {
            Celular celular = new Celular();
            Optional<CatalogValue> catalogValue = catalogRepository
                    .findByIdCatalogValueAndIdCatalog(newCelular.getIdEmpresa(), "empresa");

            celular.setIdEmpresa(catalogValue.get());

            /*catalogValue = catalogRepository.findById(newCelular.getIdTelefonoAsignado());
            celular.setIdTelefonoAsignado(catalogValue.get());

            catalogValue = catalogRepository.findById(newCelular.getIdRegion());
            celular.setIdRegion(catalogValue.get());

            catalogValue = catalogRepository.findById(newCelular.getIdLocalidad());
            celular.setIdLocalidad(catalogValue.get());

            catalogValue = catalogRepository.findById(newCelular.getIdArea());
            celular.setIdArea(catalogValue.get());

            catalogValue = catalogRepository.findById(newCelular.getIdEquipo());
            celular.setIdEquipo(catalogValue.get());

            celular.setNombreUsuario(newCelular.getNombreUsuario());
            celular.setModelo(newCelular.getModelo());*/


            //this.formCelularRepository.save(celular);
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }

    }
    public Celular deleteCelular(int id){
        if (id == 0) throw  new RuntimeException("Id must not be null");
        try{
            Optional<Celular> celular = formCelularRepository.findById(id);
            formCelularRepository.delete(celular.get());
            return celular.get();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return new Celular();
    }
    public boolean partialUpdateCelular(int id, String key, String value){
        try {
            Celular celular = formCelularRepository.findById(id).get();
            CatalogValue catalogValue;
            TableProperties properties = TableProperties.valueOf(key);

            switch (properties){
                case USUARIO: celular.setNombreUsuario(value);
                break;
                case MODELO: celular.setModelo(value);
                break;
                case TELEFONO: catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                celular.setIdTelefonoAsignado(catalogValue);
                break;
                case AREA: catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                celular.setIdArea(catalogValue);
                break;
                case EQUIPO:catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                celular.setIdEquipo(catalogValue);
                break;
                case REGION: catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                celular.setIdRegion(catalogValue);
                break;
                case LOCALIDAD: catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                celular.setIdLocalidad(catalogValue);
                break;
                case EMPRESA: catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                celular.setIdEmpresa(catalogValue);
            }
            formCelularRepository.save(celular);
            return true;
        } catch (NoSuchElementException | IllegalArgumentException e){
            e.printStackTrace();
        }
        return false;
    }
    public List<Computadora> getComputadoras(){
        List<Computadora> computadoras = this.formComputadoraRepository.findAll();
        return computadoras;
    }
    public void addComputadora(ComputadoraRequest newComputadora){
        if(newComputadora == null) throw new RuntimeException("Computadora must not be null");
        try {
            Computadora computadora = new Computadora();
            Optional<CatalogValue> value;
            value = catalogRepository.findById(newComputadora.getIdEmpresa());
            computadora.setIdEmpresa(value.get());
            value = catalogRepository.findById(newComputadora.getIdTelefonoAsignado());
            computadora.setIdTelefonoAsignado(value.get());
            value = catalogRepository.findById(newComputadora.getIdRegion());
            computadora.setIdRegion(value.get());
            value = catalogRepository.findById(newComputadora.getIdLocalidad());
            computadora.setIdLocalidad(value.get());
            value = catalogRepository.findById(newComputadora.getIdArea());
            computadora.setIdArea(value.get());
            value = catalogRepository.findById(newComputadora.getIdEquipo());
            computadora.setIdEquipo(value.get());
            computadora.setNombreUsuario(newComputadora.getNombreUsuario());
            computadora.setModelo(newComputadora.getModelo());
            formComputadoraRepository.save(computadora);
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
    public Computadora deleteComputadora(int id){
        if(id == 0) throw new RuntimeException("Id must not be 0");
        try{
            Optional<Computadora> computadora = this.formComputadoraRepository.findById(id);
            this.formComputadoraRepository.delete(computadora.get());
            return computadora.get();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return new Computadora();
    }
    public boolean partialUpdateComputadora(int id, String key, String value){
        try {
            Optional<Computadora> optional = this.formComputadoraRepository.findById(id);
            Computadora computadora = optional.get();
            CatalogValue catalogValue;
            TableProperties properties = TableProperties.valueOf(key);

            switch (properties){
                case USUARIO: computadora.setNombreUsuario(value);
                    break;
                case MODELO: computadora.setModelo(value);
                    break;
                case EMPRESA:
                    catalogValue = catalogRepository.findById(
                            Integer.parseInt(value)
                    ).get();
                    computadora.setIdEmpresa(catalogValue);
                    break;
                case TELEFONO:
                    catalogValue = catalogRepository.findById(
                            Integer.parseInt(value)
                    ).get();
                    computadora.setIdTelefonoAsignado(catalogValue);
                    break;
                case LOCALIDAD:
                    catalogValue = catalogRepository.findById(
                            Integer.parseInt(value)
                    ).get();
                    computadora.setIdLocalidad(catalogValue);
                    break;
                case REGION:
                    catalogValue = catalogRepository.findById(
                            Integer.parseInt(value)
                    ).get();
                    computadora.setIdRegion(catalogValue);
                    break;
                case EQUIPO:
                    catalogValue = catalogRepository.findById(
                            Integer.parseInt(value)
                    ).get();
                    computadora.setIdEquipo(catalogValue);
                    break;
                case AREA:
                    catalogValue = catalogRepository.findById(
                            Integer.parseInt(value)
                    ).get();
                    computadora.setIdArea(catalogValue);
            }

            formComputadoraRepository.save(computadora);
            return true;
        } catch (NoSuchElementException e){
            e.printStackTrace();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            e.getCause();

        }
        return false;
    }
    public List<Impresora> getImpresoras(){
        List<Impresora> impresoras = this.formImpresoraRepository.findAll();
        return impresoras;
    }
    public void addimpresora(Impresorarequest newImpresora){
        if (newImpresora == null) throw new RuntimeException("Impresora must not be null");
        try {
            Impresora impresora = new Impresora();
            Optional<CatalogValue> value;
            value = catalogRepository.findById(newImpresora.getIdEmpresa());
            impresora.setIdEmpresa(value.get());
            value = catalogRepository.findById(newImpresora.getIdTelefonoAsignado());
            impresora.setIdTelefonoAsignado(value.get());
            value = catalogRepository.findById(newImpresora.getIdRegion());
            impresora.setIdRegion(value.get());
            value = catalogRepository.findById(newImpresora.getIdLocalidad());
            impresora.setIdLocalidad(value.get());
            value = catalogRepository.findById(newImpresora.getIdArea());
            impresora.setIdArea(value.get());
            value = catalogRepository.findById(newImpresora.getIdEquipo());
            impresora.setIdEquipo(value.get());

            impresora.setNombreUsuario(newImpresora.getNombreUsuario());
            formImpresoraRepository.save(impresora);
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
    }
    public Impresora deleteImpresora(int id){
        if(id == 0) throw new RuntimeException("Id must not be 0");
        try {
            Optional<Impresora> impresora = this.formImpresoraRepository.findById(id);
            this.formImpresoraRepository.delete(impresora.get());
            return impresora.get();
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return new Impresora();
    }
    public boolean partialUpdateImpresora(int id, String key, String value){
        try {
            Optional<Impresora> optional = this.formImpresoraRepository.findById(id);
            Impresora impresora = optional.get();
            CatalogValue catalogValue;
            if(key.equalsIgnoreCase("idEmpresa")){
                catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                impresora.setIdEmpresa(catalogValue);
            }
            if(key.equalsIgnoreCase("idTelefonoAsignado")){
                catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                impresora.setIdTelefonoAsignado(catalogValue);
            }
            if(key.equalsIgnoreCase("nombreUsuario")){
                impresora.setNombreUsuario(value);
            }
            if(key.equalsIgnoreCase("idRegion")){
                catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                impresora.setIdRegion(catalogValue);
            }
            if(key.equalsIgnoreCase("idLocalidad")){
                catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                impresora.setIdLocalidad(catalogValue);
            }
            if(key.equalsIgnoreCase("idArea")){
                catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                impresora.setIdArea(catalogValue);
            }
            if(key.equalsIgnoreCase("idEquipo")){
                catalogValue = catalogRepository.findById(
                        Integer.parseInt(value)
                ).get();
                impresora.setIdEquipo(catalogValue);
            }
            this.formImpresoraRepository.save(impresora);
            return true;
        } catch (NoSuchElementException e){
            e.printStackTrace();
            return false;
        }
    }
    public List<CatalogValue> getCatalogs(){
        List<CatalogValue> catalogs = this.catalogRepository.findAll();
        return catalogs;
    }

}
