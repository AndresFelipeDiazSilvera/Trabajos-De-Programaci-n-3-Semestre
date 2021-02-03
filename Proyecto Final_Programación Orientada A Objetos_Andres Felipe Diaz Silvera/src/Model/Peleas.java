package Model;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 27/11/2020
//DESCRIPTION: Presentando el proyecto final de programación

public class Peleas extends Juegos{

    private int avatares;

    public Peleas(){
        super ();
    }



    public Peleas(String nameplayer, int id, String cedula, String celular, int edad, String categoriaJuego, String entrada, int avatares) {
        super(nameplayer, id, cedula, celular, edad, categoriaJuego, entrada);
        this.avatares = avatares;
    }

    public int getAvatares() {
        return avatares;
    }

    public void setAvatares(int avatares) {
        this.avatares = avatares;
    }

    @Override
    public String toString() {
        return "Peleas{" +
                "avatares=" + avatares +
                "("+ super.toString() +
                '}';
    }
}
