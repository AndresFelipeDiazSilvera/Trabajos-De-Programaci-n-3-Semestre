package modelo;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 4/05/2021

import modelo.USTA.modelo.Node;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ArbolMain {
    public static void main(String[] args) {
        // write your code here

        arbolEntero();
        arbolTreemap();

    }

    public static void arbolTreemap()
    {
        //strings
        TreeMap<String,String> paisesCapitalesTM=new TreeMap<String,String>();
        paisesCapitalesTM.put("India","Delhi");
        paisesCapitalesTM.put("Japón","Tokyo");
        paisesCapitalesTM.put("Francia","Paris");
        paisesCapitalesTM.put("Colombia","Bogotá");
        paisesCapitalesTM.put("Yugoslavia","Belgrado");

        System.out.println("");
        System.out.println("for each mostrando el mapa");
        for (String llavePais:paisesCapitalesTM.keySet()) {
            System.out.println("País:"+ llavePais +" y su  capital: "+paisesCapitalesTM.get(llavePais));

        }

        //enteros
        TreeMap<Integer,String> edadesPersonasTM=new TreeMap<Integer,String>();
        edadesPersonasTM.put(23,"Juan");
        edadesPersonasTM.put(20,"Diego");
        edadesPersonasTM.put(45,"Jorge");
        edadesPersonasTM.put(2,"Gabriel");
        edadesPersonasTM.put(33,"Paola");
        edadesPersonasTM.put(55,"Blanca");
        edadesPersonasTM.put(80,"Elena");
        edadesPersonasTM.put(0,"Emilia");

        System.out.println("");
        System.out.println("for each mostrando el mapa");
        for (Integer llaveEdad:edadesPersonasTM.keySet()) {
            System.out.println("Edad:"+ llaveEdad +" años tiene: "+edadesPersonasTM.get(llaveEdad));

        }
        Map<String, String> gfg
                = new TreeMap<String, String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");

        // using for-each loop for
        // iteration over TreeMap.entrySet()
        for (Map.Entry<String, String> entry : gfg.entrySet())
            System.out.println(
                    "[" + entry.getKey() + ", " + entry.getValue() + "]");



    }

    public static void arbolEntero()
    {
        Node raiz = new Node("Mortal Kombat");
        raiz.insert("Forza Horizon");
        raiz.insert("League Of Legends");
        raiz.insert("Assasins Creed");
        raiz.insert("Doom Eternal");




        System.out.println("Recorrer preorden");
        raiz.preorder();

        System.out.println("Recorrer postorden");
        raiz.postorder();

        System.out.println("Recorrer inorden");
        raiz.inorder();
    }
}
