class Shape {
    private String type;
    public Shape(String s) {
        type = s;
    }
    @Override
    public String toString() {
        return "Shape{ type=" + type + " }";
    }
}

class Ball {}
class Book {}

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Shape shape = new Shape("triangle");
        System.out.println(shape.toString());
        Ball ball = new Ball();
        Book book = new Book();
    }
}
