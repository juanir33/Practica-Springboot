package com.crud.democrud.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class  UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idRol;


    @ManyToOne()
    @JoinColumn(name = "id_usuario")
    private UsuarioModel idUsuario;

    private String rol;



    public UsuarioRol() {
    }

    public UsuarioRol(Long idRol, UsuarioModel idUsuario, String rol) {
        this.idRol = idRol;
        this.idUsuario = idUsuario;
        this.rol = rol;
    }

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public UsuarioModel getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UsuarioModel idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
