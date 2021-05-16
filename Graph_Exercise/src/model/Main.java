package model;

//AUTHOR: Andres Felipe Diaz Silvera
//DATE: 13/05/2021

public class Main {

    public static Graph familia(){
        Node r = new Node("Andres");
        Node j = new Node("Mariana");
        Node i = new Node("Alexis");
        Node mp = new Node("Santiago");
        Node g = new Node("Juan David");
        Node e = new Node("Michael");
        Node m = new Node("Kevin");
        Node l = new Node("Alejandra");
        Node jd = new Node("Brayan");
        Node p = new Node("Nicole");
        Node gs = new Node("Sarah");

        r.addEdge(new Edge(r, j, 5));
        r.addEdge(new Edge(r, i, 7));
        r.addEdge(new Edge(r, mp, 16));
        r.addEdge(new Edge(r, g, 26));
        r.addEdge(new Edge(r, e, 9));
        r.addEdge(new Edge(r, m, 18));

        j.addEdge(new Edge(j, mp,7));
        j.addEdge(new Edge(j, g,13));
        j.addEdge(new Edge(j, e,19));
        j.addEdge(new Edge(j, m,12));

        i.addEdge(new Edge(i, j, 0.9));
        i.addEdge(new Edge(i, mp, 8));
        i.addEdge(new Edge(i, g, 6));
        i.addEdge(new Edge(i, e, 75));
        i.addEdge(new Edge(i, m, 28));

        mp.addEdge(new Edge(mp, g,1));
        mp.addEdge(new Edge(mp, e,5));
        mp.addEdge(new Edge(mp, m,18));

        g.addEdge(new Edge(g, e, 23));
        g.addEdge(new Edge(g, m, 3));

        l.addEdge(new Edge(l,g,29));
        l.addEdge(new Edge(l,jd,6));
        l.addEdge(new Edge(l,p,69));
        l.addEdge(new Edge(l,m,35));

        jd.addEdge(new Edge(jd, g,80));
        jd.addEdge(new Edge(jd, p,40));
        jd.addEdge(new Edge(jd, m,9));

        p.addEdge(new Edge(p, g,2));
        p.addEdge(new Edge(p, m,5));

        gs.addEdge(new Edge(gs, l,8));
        gs.addEdge(new Edge(gs, jd,15));
        gs.addEdge(new Edge(gs, p,26));
        gs.addEdge(new Edge(gs, g,28));
        gs.addEdge(new Edge(gs, m,39));

        Graph graph = new Graph();
        graph.addNode(r);
        graph.addNode(j);
        graph.addNode(i);
        graph.addNode(mp);
        graph.addNode(g);
        graph.addNode(e);
        graph.addNode(m);
        graph.addNode(l);
        graph.addNode(p);
        graph.addNode(jd);
        graph.addNode(gs);

        return graph;


    }
    public static void main(String[] args){
        Graph graph = familia();
        //System.out.println(graph);
        //graph.MostrarNodes();
        System.out.println(graph.nodoMayor());

    }

}