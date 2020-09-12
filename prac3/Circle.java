public class Circle {
    private int radius;
    private int x;
    private int y;

    public Circle(int x, int y, int r) {
        this.radius = r;
        this.x = x;
        this.y = y;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
