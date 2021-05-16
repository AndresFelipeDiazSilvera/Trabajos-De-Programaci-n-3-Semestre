package model;


public class Edge {
    private Node mayor;
    private Node menor;
    private double diferencia;

    public Edge(Node origin, Node destination, double distance) {
        this.mayor = origin;
        this.menor = destination;
        this.diferencia = distance;
    }

    public Node getMayor() {
        return mayor;
    }

    public void setMayor(Node mayor) {
        this.mayor = mayor;
    }

    public Node getMenor() {
        return menor;
    }

    public void setMenor(Node menor) {
        this.menor = menor;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    @Override
    public String toString() {
        return "\n Edge [mayor=" + mayor.getNombre() + ", menor=" + menor.getNombre() + ", diferencia="
                + diferencia + "]";
    }
}
