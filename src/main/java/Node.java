import java.util.Arrays;

public class Node {
    private final int value;
    private final Node[] children;

    public Node(int value, Node[] children) {
        this.value = value;
        this.children = children;
    }

    public Node(int value) {
        this.value = value;
        this.children = new Node[0];
    }

    public int getValue() {
        return value;
    }

    public Node[] getChildren() {
        return children;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", children=" + Arrays.toString(children) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (value != node.value) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(children, node.children);
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
