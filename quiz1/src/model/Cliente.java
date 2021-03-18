/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;

/**
 *
 * @author Andres Felipe Diaz Silvera
 * Date:21/02/2021
 */
public class Cliente {
	
    private String nombre;
    public Pan Canasta[]=new Pan[10];

    @Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", Canasta=" + Arrays.toString(Canasta) + "]";
	}

	public Cliente() {
    }

    public Cliente(String nombre, Pan[] Canasta) {
        this.nombre = nombre;
        this.Canasta = Canasta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pan[] getCanasta() {
        return Canasta;
    }

    public void setCanasta(int i,Pan[] Canasta) {
        this.Canasta=Canasta;
    }
    
    
}
