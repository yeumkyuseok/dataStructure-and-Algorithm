package graphAdjacencyList;

import java.util.ArrayList;

public class GraphNode {
    public String name;
    public int index;
    public ArrayList<GraphNode> neighbour;

    public GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        this.neighbour = new ArrayList<>();
    }

}
