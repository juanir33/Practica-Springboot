package com.crud.democrud.controllers;


import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    RolService rolService;

    @GetMapping()
    public ArrayList<UsuarioRol> obtenerTodosLosRoles(){return  rolService.obtenerTodosLosRoles();}

    @PostMapping()

    public UsuarioRol guardarNuevoRol(@RequestBody UsuarioRol rol){return rolService.guardarNuevoRol(rol);}



    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.rolService.eliminarRol(id);
        if (ok) {
            return "Se eliminó el rol con id " + id;
        } else {
            return "No pudo eliminar el rol con id" + id;
        }
    }
}
