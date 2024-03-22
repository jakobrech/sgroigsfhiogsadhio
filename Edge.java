public class Edge{

    private Node from;
    private Node to;
    private int distance;

    public Edge (Node from, Node to, int distance}{

        this.from = from;
        this.to = to;
        this.distance = distance;

    }

    public Node getFrom(){

        return this.from;

    }

    public Node getTo(){

        return this.to;

    }

    public int getDistance(){

        return this.distance;

    }

}