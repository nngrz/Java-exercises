class B {
    private String shape;
    private int a, b;
    public B(String s, int x, int y) {
        shape = s;
        a = x;
        b = y;
    }

    public String toString() { 
        return shape + ":area=" + area(); 
    }

    protected int area() { 
        return a*b; 
    }
}

class D extends B {

    public D(int x) {
        super("Square", x, x);
    }
}

public class M {
    public static void main(String[] args) {
        for (B e : new B[]{new B("Rect", 2, 3), new D(5), new D(7), new B("Rect", 4, 5)})
            System.out.println(e + " ");
    }
}
