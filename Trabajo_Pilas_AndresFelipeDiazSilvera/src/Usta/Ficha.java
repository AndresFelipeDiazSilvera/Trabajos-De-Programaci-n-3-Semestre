package Usta;

public class Ficha {

    private String numero;
    private String color;

    public Ficha(int numero, String color) {
        this.numero = "";
        this.color = "";
    }

    public Ficha(String numero, String color) {
        this.numero = numero;
        this.color = color;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "ficha{" +
                "numero=" + numero +
                ", color=' " + color + '\'' +
                '}';
    }
}