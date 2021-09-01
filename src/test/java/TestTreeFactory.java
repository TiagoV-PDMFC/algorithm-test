import java.util.HashMap;
import java.util.Map;

public class TestTreeFactory {

    public static Node getTree(int node){
        Map<Integer, Node> nodesCache = new HashMap<>();
        Node n4 = new Node(1);
        Node n5 = new Node(2);
        Node n6 = new Node(5);
        Node n7 = new Node(4);
        Node n8 = new Node(5);
        Node n2 = new Node(2, new Node[] {n4, n5, n6});
        Node n3 = new Node(3, new Node[] {n7, n8});
        Node n1 = new Node(1, new Node[] {n2, n3});
        nodesCache.put(4, n4);
        nodesCache.put(5, n5);
        nodesCache.put(6, n6);
        nodesCache.put(7, n7);
        nodesCache.put(8, n8);
        nodesCache.put(2, n2);
        nodesCache.put(3, n3);
        nodesCache.put(1, n1);
        return nodesCache.get(node);
    }
}
