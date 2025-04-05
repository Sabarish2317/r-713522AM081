import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class GraphBfsTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        //test case 1 Bidirectional graph
        // 0-1-2
        // | |
        // 3-4

        int N = 5;
        for(int i=0; i<N; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(3).add(0);
        adj.get(3).add(4);
        adj.get(4).add(3);



        ArrayList<Integer> visited = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        System.out.println("Bfs search o bidirectional graph");
        while(!queue.isEmpty()){
            int n = queue.poll();
            System.out.println(n);
            visited.add(n);

            for(int i : adj.get(n)){
                if(!visited.contains(i)){
                    queue.add(i);
                }
            }
        }

    }
}
