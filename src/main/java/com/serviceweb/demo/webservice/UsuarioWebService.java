package com.serviceweb.demo.webservice;

import com.serviceweb.demo.business.UserService;
import com.serviceweb.demo.data.Usuario;
import com.serviceweb.demo.dto.LoginResponse;
import com.serviceweb.demo.dto.UsuarioRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
public class UsuarioWebService {
    private final UserService userService;

    public UsuarioWebService(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/usuarios/{id}")
    @ResponseBody
    public Usuario getUsuario(@PathVariable int id){
        try {
            return userService.getUsuario(id);
        } catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
        return new Usuario();
    }
}
