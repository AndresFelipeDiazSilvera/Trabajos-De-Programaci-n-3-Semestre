package Usta;


class cliente {
    private String nombre;
    private int documento;
    private double numero;

    public cliente(String nombre, int documento, double numero) {
        this.nombre = nombre;
        this.documento = documento;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", numero=" + numero +
                '}';
    }
}