package Usta;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 20/04/2021

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<cliente> cola = new LinkedList<cliente>();

        cliente cliente1 = new cliente("Nicole", 1000846320, 31475675);
        cliente cliente2 = new cliente("Sebastian", 45694801, 322875687);
        cliente cliente3 = new cliente("Andres", 789645201, 311996478);
        cliente cliente4 = new cliente("Pepito", 49572320, 365478156);
        cliente cliente5 = new cliente("Alexis", 754520215, 242141442);
        cliente cliente6 = new cliente("Senna", 467522180, 318792492);
        cliente cliente7 = new cliente("Juan David", 13678007, 32795497);
        cliente cliente8 = new cliente("Santiago", 95479493, 32987450);
        cliente cliente9 = new cliente("Brayan", 79654123, 31678520);
        cliente cliente10 = new cliente("Amalia", 4676492, 31678942);

        cola.add(cliente1);
        cola.add(cliente2);
        cola.add(cliente3);
        cola.add(cliente4);
        cola.add(cliente5);
        cola.add(cliente6);
        cola.add(cliente7);
        cola.add(cliente8);
        cola.add(cliente9);
        cola.add(cliente10);

        System.out.println(cola.toString());

        System.out.println("Cliente atendido");
        System.out.println(cola.poll());
        System.out.println(cola.toString());
    }
}