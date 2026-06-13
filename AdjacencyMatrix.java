//Java Code (Undirected Graph)


// import java.util.*;

// public class AdjacencyMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int vertices = sc.nextInt(); // Number of vertices
//         int edges = sc.nextInt();    // Number of edges

//         int[][] graph = new int[vertices][vertices];

//         for (int i = 0; i < edges; i++) {
//             int u = sc.nextInt();
//             int v = sc.nextInt();

//             graph[u][v] = 1;
//             graph[v][u] = 1; // For undirected graph
//         }

//         System.out.println("Adjacency Matrix:");

//         for (int i = 0; i < vertices; i++) {
//             for (int j = 0; j < vertices; j++) {
//                 System.out.print(graph[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }


//For Competitive Programming (1-based indexing)


import java.util.*;

 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // nodes
        int m = sc.nextInt(); // edges

        int[][] adj = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1; // remove for directed graph
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}