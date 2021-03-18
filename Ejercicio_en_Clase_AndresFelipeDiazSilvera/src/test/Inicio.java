package test;

//Author: Andres Felipe Diaz Silvera
//Date: 1/03/2021

import Model.Estudiante;


public class Inicio {

    public static void main(String[] args){

        char v[]={'a', 'n', 'f', 'e' };
        char mayor = ' ';
        for (int i = 0;i < v.length;i++)
        {
            if (v[i]>mayor)
                mayor=v[i];
        }


        int vi[]={1,5,8,5,5,7,12,24,56};
        int mayori = 0;
        for (int i = 0;i < vi.length;i++)
        {
            if (vi[i]>mayori)
                mayori=vi[i];
        }
        System.out.println(mayori);

        String vs[]={"hola", "pablo", "arroz", "videojuego"};
        String mayors = "";
        for (int i =0;i < vs.length;i++)
        {
            if (vs[i].compareTo(mayors)>0)
                mayors=vs[i];
        }
        System.out.println(mayors);


    }

}
