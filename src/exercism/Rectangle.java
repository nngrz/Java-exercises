class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return (width + height) * 2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}