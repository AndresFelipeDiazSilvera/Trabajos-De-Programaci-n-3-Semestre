package Usta;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 20/04/2021 

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack fichas = new Stack();
        fichas.push(new Ficha(2,"Azul"));
        fichas.push(new Ficha(8,"Gris"));
        fichas.push(new Ficha(96,"Marron"));
        fichas.push(new Ficha(55,"Negro"));
        for (int i = 0; i<fichas.size(); i++){
            System.out.println(fichas.get(i));
        }
        fichas.pop();
        System.out.println("\n"+fichas);
        System.out.println("La Ultima Ficha de la Pila es: "+fichas.peek());
        while (!fichas.empty()){
            fichas.pop();
        }
        System.out.println("fichas is empty?" +fichas.empty());



    }
}