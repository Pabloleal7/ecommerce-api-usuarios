package com.example.apiusuarios.controller;

import com.example.apiusuarios.entity.UsuarioEntity;
import com.example.apiusuarios.repository.UsuarioRepository;
import com.example.apiusuarios.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("/usuarios")
public class UsuarioController {

    private UsuarioService usuarioService;

    private UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioService usuarioService, UsuarioRepository usuarioRepository){
        this.usuarioService = usuarioService;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<UsuarioEntity>> getUserById(@PathVariable Long id)
    {
        return  new ResponseEntity<>(usuarioRepository.findById(id),HttpStatus.OK ) ;

    }

    @GetMapping
    public ResponseEntity getAll(){
        return new ResponseEntity<>(usuarioRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping()
    public  ResponseEntity cadastrarUsuario(@RequestBody UsuarioEntity usuarioEntity){

        return new ResponseEntity(usuarioRepository.save(usuarioEntity),HttpStatus.OK) ;

    }


}
