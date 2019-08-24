package graph;

/**
 * GraphTest
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph graph=new Graph("A");
        graph.addVerTex("B");
        graph.addVerTex("C");
        graph.addVerTex("D");
        graph.addVerTex("E");
        System.out.println(graph.toString());
        System.out.println(graph.adjacencyMatrixToString());
        graph.addEdge("A", "B");
        graph.addEdge("A", "E");
        graph.addEdge("B", "E");
        graph.addEdge("C", "D");
        graph.addEdge("C", "E");
        System.out.println(graph.toString());
        System.out.println(graph.adjacencyMatrixToString());

    }
    
}