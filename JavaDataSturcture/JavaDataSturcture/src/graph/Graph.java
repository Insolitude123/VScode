package graph;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Graph
 */
public class Graph {
    // 无权无向图
    private ArrayList<VerTex> vertexes=new ArrayList<VerTex>();
    private boolean[][] adjMat;// adjacency matrix

    public Graph(String val) {
        vertexes.add(new VerTex(val));
        adjMat = new boolean[vertexes.size()][vertexes.size()];
    }

    public void addVerTex(String val) {
        vertexes.add(new VerTex(val));
        boolean[][] new2DArr = new boolean[vertexes.size()][vertexes.size()];
        for (int i = 0; i < vertexes.size() - 1; i++) {
            new2DArr[i] = Arrays.copyOf(adjMat[i], vertexes.size());
        }
        adjMat = new2DArr;
    }

    public void addEdge(String v1, String v2) {
        int index1 = -1;
        for (int i = 0; i < vertexes.size(); i++) {
            if (vertexes.get(i).getVal().equals(v1)) {
                index1 = i;
                break;
            }
        }
        int index2 = -1;
        for (int i = 0; i < vertexes.size(); i++) {
            if (vertexes.get(i).getVal().equals(v2)) {
                index2 = i;
                break;
            }
        }
        if (index1 == -1 || index2 == -1) {
            throw new RuntimeException();
        }
        adjMat[index1][index2] = true;
        adjMat[index2][index1] = true;
    }

    @Override
    public String toString() {
        return vertexes.toString();
    }

    public String adjacencyMatrixToString() {
        return Arrays.deepToString(adjMat);
    }
}