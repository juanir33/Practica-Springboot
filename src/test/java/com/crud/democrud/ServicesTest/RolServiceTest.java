package com.crud.democrud.ServicesTest;

import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRol;
import com.crud.democrud.repositories.RolRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static  org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class RolServiceTest {

    @Autowired
    RolRepository rolRepository;

    @Test
    public  void testGuardarUnRolaUsuarioPorId(){
        UsuarioModel user = new UsuarioModel("juan", "juan@", 22);
        UsuarioRol usuarioRol = new UsuarioRol( user, "jefe");
        UsuarioRol usuarioRolGuardado = rolRepository.save(usuarioRol);
        assertNotNull(usuarioRolGuardado);

    }

    @Test
    public void testConsultarTodosLosRoles(){
        List<UsuarioRol> rolList = (List<UsuarioRol>) rolRepository.findAll();
        assertThat(rolList).size().isGreaterThan(0);
    }



}
