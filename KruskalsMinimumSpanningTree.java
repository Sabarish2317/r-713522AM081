import java.util.ArrayList;
import java.util.PriorityQueue;


//mimimum spanning tree
public class KruskalsMinimumSpanningTree {
    public static class Node {
        int node;
        int weight;
        Node(int node,int weight){
            this.node = node;
            this.weight =weight;
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Node>> adj = new ArrayList<>();

        //test case 1 Bidirectional graph
        // 0-1-2
        // | |
        // 3-4

        int N = 5;
        for(int i=0; i<N; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new Node(1,2));
        adj.get(0).add(new Node(3,3));
        adj.get(1).add(new Node(0,2));
        adj.get(1).add(new Node(2,4));
        adj.get(2).add(new Node(1,4));
        adj.get(3).add(new Node(0,3));
        adj.get(3).add(new Node(4,1));
        adj.get(4).add(new Node(3,2));
        adj.get(4).add(new Node(1,2));



        ArrayList<Integer> visited = new ArrayList<>();
        PriorityQueue<Node> queue = new PriorityQueue<>((a,b)-> a.weight-b.weight);
        queue.add(adj.get(0).get(0)); //first node
        System.out.println("Bfs search o bidirectional graph");
        while(!queue.isEmpty()){
            Node n = queue.poll();
            System.out.println(n.node);
            visited.add(n.node);

            for(Node i : adj.get(n.node)){
                if(!visited.contains(i.node)){
                    queue.add(i);
                }
            }
        }

    }
}
