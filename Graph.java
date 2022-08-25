import java.util.ArrayList;

public class Graph {

  private int countNodes;// vertice
  private int countEdges;// aresta
  private int[][] adjMatrix;

  public Graph(int numNodes) {
    this.countNodes = numNodes;
    this.countEdges = 0;
    this.adjMatrix = new int[numNodes][numNodes];
  }

  public void addEdge(int source, int sink, int weight) {
    if (source < 0 || source > this.adjMatrix.length - 1 ||
        sink < 0 || sink > this.adjMatrix.length - 1 ||
        weight <= 0) {
      System.err.printf("Invalid edge: %d %d %d\n", source, sink, weight);
      return;
    }
    this.countEdges++;
    this.adjMatrix[source][sink] = weight;
  }

  public int degree(int node) {
    if (node < 0 || node > this.adjMatrix.length) {
      System.out.println("Invalid node: " + node);
      return -1;
    }
    int degree = 0;
    for (int j = 0; j < this.adjMatrix[node].length; ++j) {
      if (this.adjMatrix[node][j] != 0)
        degree++;
    }
    return degree;
  }

  public int highestDegree() {
    int highest = 0;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      int degreeI = degree(i);
      if (degreeI > highest)
        highest = degreeI;
    }
    return highest;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      for (int j = 0; j < this.adjMatrix[i].length; ++j) {
        str += this.adjMatrix[i][j] + "\t";
      }
      str += "\n";
    }
    return str;
  }

  public int lowestDegree() {
    int lowest = this.countNodes;
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      int degreeNodeI = this.degree(i);
      if (lowest > degreeNodeI)
        lowest = degreeNodeI;
    }
    return lowest;
  }

  public Graph complement() {
    Graph g2 = new Graph(this.countNodes);
    for (int i = 0; i < this.adjMatrix.length; ++i) {
      for (int j = 0; j < this.adjMatrix[i].length; ++j) {
        if (i != j && this.adjMatrix[i][j] == 0) {
          g2.addEdge(i, j, 1);
        }
      }
    }
    return g2;
  }

  public float density() {
    float densidade = Math.abs(this.countEdges) / (Math.abs(this.countNodes)) * (Math.abs(this.countNodes) - 1);
    return densidade;
  }

  public void addEdgeUnoriented(int source, int sink, int weight) {
    if (source < 0 || source > this.adjMatrix.length - 1 ||
        sink < 0 || sink > this.adjMatrix.length - 1 ||
        weight <= 0) {
      System.err.printf("Invalid edge: %d %d %d\n", source, sink, weight);
      return;
    }
    this.countEdges += 2;
    this.adjMatrix[source][sink] = weight;
    this.adjMatrix[sink][source] = weight;
  }

  public void buscaEmLargura(int ursprung)
  {
    int desc [ ] = new int [ this.countNodes ];
      //criar um array vazio
      ArrayList<Integer> q =new ArrayList<Integer>();
       ArrayList<Integer> r =new ArrayList<Integer>();
      
      q.add(ursprung);  //origem
      r.add(ursprung) //pesquisa
      
      while (!q.isEmpty() ) {
      int v = q.remove(0);

      for (int v = 0; v < this.adjMatrix[u].length++) {
          if( this.adjMatrix[u][y] !=0);
      }
      }
  }
}
