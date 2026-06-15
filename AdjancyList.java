// import java.util.*;
// public class AdjancyList {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt(); 
//         int m = sc.nextInt(); 

//         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

//         // Create n+1 lists for 1-based indexing
//         for (int i = 0; i <= n; i++) {
//             adj.add(new ArrayList<>());
//         }

//         // Input edges
//         for (int i = 0; i < m; i++) {
//             int u = sc.nextInt();
//             int v = sc.nextInt();

//             adj.get(u).add(v);
//             adj.get(v).add(u); // Remove for directed graph
//         }

//         // Print adjacency list
//         for (int i = 1; i <= n; i++) {
//             System.out.print(i + " -> ");

//             for (int neighbor : adj.get(i)) {
//                 System.out.print(neighbor + " ");
//             }

//             System.out.println();
//         }

//         sc.close();
//     }
// }




import java.util.*;

public class AdjancyList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ask for total Nodes and Edges
        System.out.print("Enter total number of NODES (n): ");
        int n = sc.nextInt(); 
        
        System.out.print("Enter total number of EDGES (m): ");
        int m = sc.nextInt(); 

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Create n+1 lists for 1-based indexing
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // 2. Ask for each connection (edge)
        System.out.println("\n--- Enter the " + m + " edges (pairs of connected nodes) ---");
        for (int i = 0; i < m; i++) {
            System.out.print("Edge " + (i + 1) + " (Enter node U and node V separated by space): ");
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u); // Remove for directed graph
        }

        // 3. Print adjacency list
        System.out.println("\n--- Final Adjacency List ---");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}