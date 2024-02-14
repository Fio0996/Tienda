/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *clase de mapeo
 * data set a get// entity modulador //tabla para cual tabla vamos a mapear
 */
@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L; //todas las utilidades van a tener esta version en nuestro caso.
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name="id_categoria")//dejar llave primaria bien detallada
    private Long idCategoria; //id_categoria (es equivalente a idCategoria entonces se ponen diferentes en la base de datos)
    private String description;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }

    public Categoria(String description, String rutaImagen, boolean activo) {
        this.description = description;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }



}
