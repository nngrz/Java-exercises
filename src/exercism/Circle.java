import java.text.DecimalFormat;

class Circle {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(3.14 * Math.pow(radius, 2)));
    }

    public double getCircumference() {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(2 * 3.14 * radius));
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
        circle.setRadius(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
