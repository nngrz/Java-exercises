class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
    }

    static void iterate(Node n) {
        Node tmp = n;
        while (tmp != null) {
            System.out.println(tmp.data + " ");
            tmp = tmp.next;
        }
    }
    
    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        first.next = second;
        second.next = third;
        iterate(first);
        // iterate(second);
        // iterate(third);
    }
}
