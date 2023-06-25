/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author PC
 */

@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private Long idArbol;
    private String descripcion;
    private String rutaImagen;
    private String nombre;
    private String tipo_flor;
    private String dureza_madera;
    private int existencias;
    private boolean activo;
    
    public Arbol(){
        
    }
    
    public Arbol(String arbol, boolean activo){
        this.descripcion = arbol;
        this.activo = activo;
    }
    
}
