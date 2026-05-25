void main() {
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    int vertices = 4;

    for (int i = 0; i < vertices; i++) {
        graph.add(new ArrayList<>());
    }

    addEdge(graph, 0, 1);
    addEdge(graph, 0, 2);
    addEdge(graph, 1, 3);
    addEdge(graph, 2, 3);

    System.out.println(graph);

}

void addEdge(ArrayList<ArrayList<Integer>> graph , int u , int v){
    graph.get(u).add(v);
    graph.get(v).add(u);
}
