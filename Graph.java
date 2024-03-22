import java.util.ArrayList;

public class Graph{

    private ArrayList<Node> nodes = new ArrayList<>();
    private ArrayList<Edge> edges = new ArrayList<>();

    public void addNode(Node node){

        nodes.add(node);

    }

    public void addEdge(Node from, Node to, int distance){

        edges.add(new Edge(from, to, distance));

    }

    public ArrayList<Node> getNodes(){

        return nodes;

    }

    public ArrayList<Edge> getEdges(){

        return edges;

    }

    public ArrayList<Node> getNeighbors(Node node){

        ArrayList<Node> neighbors = new ArrayList<>();

        for(int i = 0; i < edges.size(); i++){

            if(edges.get(i).getFrom() == node){

                neighbors.add(edges.get(i).getTo());

            }

        }

        return neighbors;

    }

}
