package model;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nombre;
    private List<Edge> edges;


    public Node(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }

    @Override
    public String toString() {
        return "\n \tNode [nombre=" + nombre + ", edges=" + edges + "]";
    }
    public Edge findEdge(){
        Edge edgeMayor = new Edge(null,null,0);
        if (edges!=null){
            for (Edge edge : edges){
                if (edgeMayor.getDiferencia() < edge.getDiferencia()){
                    edgeMayor = edge;
                }
            }
        }
        return edgeMayor;
    }
}
