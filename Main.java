public class Main {
    
    public static void main(String args[]){
    Node one = new Node("hi");
    Node two = new Node("hihi");
    Graph g = new Graph();
    g.addNode(one);
    g.addNode(two);
    g.addEdge(one, two, 28);
    System.out.println(g.getNeighbors(one));
    }



}

