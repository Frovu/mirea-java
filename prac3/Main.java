/* Практика №3

1.Создать класс, описыващий модель окружности (Circle). В классе должны быть описаны нужные свойства окружности и методы для получения, и изменения этих свойст. Протестировать класс

2. Создать класс, описывающий тело человека (Human). Для описания каждой части тела создаит отдельный класс (Head, Leg, Hand). Описать необходимые свойства и методы для каждого класса. Протестировать класс Human
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 (circle)");
        Circle circle = new Circle(0, 0, 10);
        System.out.println("a circle with" +
            "\n  radius = " + circle.getRadius() +
            "\n  area = " + String.format("%.3f", circle.getArea()) +
            "\n  perimeter = " + String.format("%.3f", circle.getPerimeter()));

        System.out.println("Task 2 (human)");
        Human human = new Human();
        System.out.println(human.toString());
        human.head.setHat(true);
        System.out.println("+ hat");
        System.out.println(human.toString());
    }
}
