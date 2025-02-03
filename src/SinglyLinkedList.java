public class SinglyLinkedList {
    public Node n;
    public int data;

    public static int sum(Node n) {
        int sum = 0;
        while (n != null) {
            sum += n.data;
            n = n.next;
        }
        return sum;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        a.next = b;
        System.out.println(SinglyLinkedList.sum(a));
    }
}
