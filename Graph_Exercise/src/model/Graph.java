package model;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<Node> nodes;
    Node current;

    public void addNode(Node node) {
        if (nodes == null) {
            nodes = new ArrayList<>();
        }
        nodes.add(node);
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void MostrarNodes(){
        current=nodes.get(1);
        while (current!=null){
            System.out.println(current);
            if (current.getEdges()!=null) {
                current = current.getEdges().get(0).getMenor();
            }else {
                current=null;
            }
        }
    }
    public Node nodoMayor(){
        Node nodeMayor = new Node(null);
        nodeMayor.addEdge(new Edge(null,null,0));
        for (Node node:nodes){
            if (nodeMayor.findEdge().getDiferencia()<node.findEdge().getDiferencia()){
                nodeMayor = node;
            }
        }
        return nodeMayor;
    }



    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + "]";
    }

}






















