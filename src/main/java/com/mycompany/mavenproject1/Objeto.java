/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Lucas
 */
public class Objeto extends Interactuables{
    
    private String tipoObjeto;

    public Objeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public Objeto(String tipoObjeto, int IdObjeto, String NombreObjeto) {
        super(IdObjeto, NombreObjeto);
        this.tipoObjeto = tipoObjeto;
    }
    
    
    
}
