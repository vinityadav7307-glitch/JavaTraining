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

public class AdjacencyMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get total Nodes and Edges
        System.out.print("Enter total number of NODES (n): ");
        int n = sc.nextInt(); 
        
        System.out.print("Enter total number of EDGES (m): ");
        int m = sc.nextInt(); 

        // Create a 2D array of size (n+1) x (n+1) for 1-based indexing
        int[][] adj = new int[n + 1][n + 1];

        // 2. Input edges dynamically
        System.out.println("\n--- Enter the " + m + " edges (pairs of connected nodes) ---");
        for (int i = 0; i < m; i++) {
            System.out.print("Edge " + (i + 1) + " (Enter node U and node V separated by space): ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Mark the connection in the matrix grid
            adj[u][v] = 1;
            adj[v][u] = 1; 
        }

        // 3. Print the final matrix grid
        System.out.println("\n--- Final Adjacency Matrix Grid ---");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println(); // Moves to the next row
        }

        sc.close();
    }
}