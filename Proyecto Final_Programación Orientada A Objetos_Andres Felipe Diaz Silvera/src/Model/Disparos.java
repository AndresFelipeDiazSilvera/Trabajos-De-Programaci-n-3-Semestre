package Model;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 27/11/2020
//DESCRIPTION: Presentando el proyecto final de programación

public class Disparos extends Juegos{

    private String rango;
    public Disparos(){
        super();
    }

    public Disparos(String rango) {
        this.rango = rango;
    }

    public Disparos(String nameplayer, int id, String cedula, String celular, int edad, String categoriaJuego, String entrada, String rango) {
        super(nameplayer, id, cedula, celular, edad, categoriaJuego, entrada);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Disparos{" +
                "rango='" + rango +
                "("+ super.toString() +
                '}';
    }
}
