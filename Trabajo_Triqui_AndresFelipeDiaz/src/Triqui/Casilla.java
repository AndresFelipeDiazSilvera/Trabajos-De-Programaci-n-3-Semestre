package Triqui;

//Author:Andres Felipe Diaz Silvera
//Date: 09/02/2021

public class Casilla {

    private boolean estado;
    private char ficha;
    private int numero;
    private int fila;

    public Casilla(int num) {
        this.estado = true;//disponible
        this.numero = num;
    }

    public Casilla(boolean estado, char ficha, int numero, int fila) {
        this.estado = estado;
        this.ficha = ficha;
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public char getFicha() {
        return ficha;
    }

    public void setFicha(char ficha) {
        this.ficha = ficha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }



}

