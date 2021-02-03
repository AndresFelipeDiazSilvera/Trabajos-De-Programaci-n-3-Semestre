package Model;



//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 27/11/2020
//DESCRIPTION: Presentando el proyecto final de programación

public abstract class Juegos {
    private String nameplayer;
    private int id;
    private String cedula;
    private String celular;
    private int edad;
    private String categoriaJuego;
    private String entrada;

    public Juegos(){


    }

    public Juegos(String nameplayer, int id, String cedula, String celular, int edad, String categoriaJuego, String entrada) {
        this.nameplayer = nameplayer;
        this.id = id;
        this.cedula = cedula;
        this.celular = celular;
        this.edad = edad;
        this.categoriaJuego = categoriaJuego;
        this.entrada = entrada;
    }

    public String getNameplayer() {
        return nameplayer;
    }

    public void setNameplayer(String nameplayer) {
        this.nameplayer = nameplayer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoriaJuego() {
        return categoriaJuego;
    }

    public void setCategoriaJuego(String categoriaJuego) {
        this.categoriaJuego = categoriaJuego;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "JuegoPeleas{" +
                "nameplayer='" + nameplayer + '\'' +
                ", id=" + id +
                ", cedula='" + cedula + '\'' +
                ", celular='" + celular + '\'' +
                ", edad=" + edad +
                ", categoriaJuego='" + categoriaJuego + '\'' +
                ", entrada='" + entrada + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Juegos other = (Juegos) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
