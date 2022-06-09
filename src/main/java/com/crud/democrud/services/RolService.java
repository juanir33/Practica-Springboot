package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;


    public ArrayList<UsuarioRol> obtenerTodosLosRoles(){return (ArrayList<UsuarioRol>) rolRepository.findAll();}

    public UsuarioRol guardarNuevoRol(UsuarioRol rol){return rolRepository.save(rol);}

    public Optional<UsuarioRol> actualizarRol(Long id){return rolRepository.findById(id);}


}
