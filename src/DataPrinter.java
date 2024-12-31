public class DataPrinter {
    Node next;
    int data;

    DataPrinter (int data) {
        this.data = data;
    }

    public static void showListForward(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void showListBackward(Node n) {
        if (n == null) {
            return;
        }
        showListBackward(n.next);
        System.out.print(n.data + " ");
    }

    public static void main (String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        first.next = second;
        second.next = third;
        showListForward(first);
        showListBackward(first);
        System.out.println();
    }
}
