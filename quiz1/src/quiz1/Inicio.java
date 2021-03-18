/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;


import controller.PanController;
import controller.Panaderia;

/**
 *
 * @author Andres Felipe Diaz Silvera
 * Date:21/02/2021
 */
public class Inicio {

   private static Panaderia tienda=new Panaderia();
	// TODO Auto-generated constructor st
   private static PanController pan=new PanController();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        // añadir panes
    	pan.guardarPanes(0,"rollo",1200);
    	pan.guardarPanes(1,"baguette",3200);
    	pan.guardarPanes(2,"espelta",5200);
    	pan.guardarPanes(3,"butterzopf",800);
    	pan.guardarPanes(4,"cubano",200);
    	tienda.venderPan(pan);
    	
        // vender pan: registrar cada cliente que va llegando y decirle el total
        
        //corregir errores (sintaxis y de lógica)
        
        //agregar try/catch correcta y realizar la guía de error para que no se dañe el programa
        
        
    }
    
}
