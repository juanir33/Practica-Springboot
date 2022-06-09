package com.crud.democrud.controllers;


import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping()
    public ArrayList<UsuarioRol> obtenerTodosLosRoles(){return  rolService.obtenerTodosLosRoles();}

    @PostMapping()

    public UsuarioRol guardarNuevoRol(@RequestBody UsuarioRol rol, UsuarioModel usuarioid){return rolService.guardarNuevoRol(rol, usuarioid);}
}
