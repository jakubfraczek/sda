package buzz.coding.sda;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        Graph g = new Graph(v);
        int e = scanner.nextInt();
        for (int i = 0; i < e; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            g.addEdge(from, to);
            g.addEdge(to, from);
        }

//        System.out.println("----------");
//        System.out.println("----------");
//        g.bfs(0);
    }
}
