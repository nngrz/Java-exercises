public class Node2 {
    public Node2 next;
    public int data;

    public Node2(int data) {
        this.data = data;
    }

    public static int sum(Node2 n) {
        int sum = 0;
        while (n != null) {
            sum += n.data;
            n = n.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Node2 a = new Node2(1);
        Node2 b = new Node2(2);
        a.next = b;
        System.out.println(Node2.sum(a));
    }
}
