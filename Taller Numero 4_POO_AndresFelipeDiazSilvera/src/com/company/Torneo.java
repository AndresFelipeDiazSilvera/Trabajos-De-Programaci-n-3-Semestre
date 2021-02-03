package com.company;

public class Torneo {

    public static void main(String[] args) {
	// Author: Andres Felipe Diaz Silvera
    // Date: 16-10-2020
    }
    public static class Torneo{
        //Attributes
        private int id;
        private String name;
        private String Cedula;
        private String Celular;
        private String Edad;
        private String Categoriajuego;
        private String Entrada;

        //Constructors
        public Torneo(){}

        public Torneo(int id, String name, String Cedula, String Celular, int Edad, String Categoriajuego, String Entrada){
            this. id = id;
            this. name = name;
            this. Cedula = Cedula;
            this. Celular= Celular;
            this. Edad = Edad;
            this. Categoriajuego = Categoriajuego;
            this. Entrada = Entrada;
        }

        //Setters & Getters
        public int getId(){
            return this.id;
        }
        public void setId(int id){
            this.id = id;
        }
        public String getName(){
            return this.name;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getCedula(){
            return this.Cedula;
        }
        public void setCedula(String Cedula){
            this.Cedula = Cedula;
        }
        public String getCelular(){
            return this.Celular;
        }
        public void setCelular(String Celular){
            this.Celular = Celular;
        }
        public String getEdad(){
            return this.Edad;
        }
        public void setEdad(String Edad){
            this.Edad = Edad;
        }
        public String getCategoriajuego(){
            return this.Categoriajuego;
        }
        public void setCategoriajuego(String Categoriajuego){
            this.Categoriajuego = Categoriajuego;
        }
        public String getEntrada(){
            return this.Entrada;
        }
        public void setEntrada(String Entrada){
            this.Entrada = Entrada;
        }

        //Own methods
        public int getAge(){
            //TODO: Perform method's logic
            return 0;
        }
    }
}


