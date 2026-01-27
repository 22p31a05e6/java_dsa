class Solution {
    class Edge{
        int wt;
        Node node;
        public Edge(int wt, Node node){
            this.wt = wt;
            this.node = node;
        }
    }
    class Node{
        int id;
        Set<Edge> set;
        public Node(int id){
            this.id = id;
            this.set = new HashSet<>();
        }
    }
    class Trip{
        int cost;
        Node n;
        public Trip(int cost, Node n){
            this.cost = cost;
            this.n = n;
        }
    }
    public int minCost(int n, int[][] edges) {
        Node arr[] = new Node[n];
        int cost[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = new Node(i);
            cost[i] = Integer.MAX_VALUE;
        }
        for(int i = 0;i < edges.length;i++){
            Node a = arr[edges[i][0]];
            Node b = arr[edges[i][1]];
            int wt = edges[i][2];
            a.set.add(new Edge(wt, b));
            b.set.add(new Edge(wt*2, a));
        }
        cost[0] = 1;
        Set<Node> set = new HashSet<>();
        Queue<Trip> queue = new PriorityQueue<Trip>((Trip a, Trip b)->{
            return Integer.compare(a.cost, b.cost);
        });
        queue.add(new Trip(0, arr[0]));
        while(queue.size() != 0 && !set.contains(arr[n-1])){
            Trip t = queue.poll();
            if(t.cost >= cost[t.n.id]){
                continue;
            }
            set.add(arr[t.n.id]);
            cost[t.n.id] = t.cost;
            // System.out.printf("visited: %d\n", t.n.id);
            for(Edge e: arr[t.n.id].set){
                if(t.cost + e.wt < cost[e.node.id]){
                    queue.add(new Trip(t.cost + e.wt, e.node));
                }
            }
        }
        if(cost[n-1] == Integer.MAX_VALUE)
            return -1;
        return cost[n-1];
    }
}