package com.serviceweb.demo.business;

import com.serviceweb.demo.data.Usuario;
import com.serviceweb.demo.data.UsuarioRepository;
import com.serviceweb.demo.dto.LoginResponse;
import com.serviceweb.demo.dto.UsuarioRequest;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {
    private final UsuarioRepository usuarioRepository;

    public UserService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario getUsuario(int usuarioId) throws SQLException{
        if (usuarioId == 0) throw new RuntimeException("Id must not be null");
        Usuario usuario;
        try {
            Optional<Usuario> optionalUsuario = usuarioRepository.findById(usuarioId);
            usuario = optionalUsuario.get();
            return usuario;
        } catch (NoSuchElementException e){
            e.printStackTrace();
        }
        return new Usuario();
    }
    public LoginResponse login(UsuarioRequest usuarioRequest){
        LoginResponse loginResponse = new LoginResponse();


        return loginResponse;
    }
}
