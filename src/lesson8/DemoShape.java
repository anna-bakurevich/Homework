package lesson8;

public class DemoShape {
    public static void main(String[] args) {
        Shape triangle = new Triangle(2, 3, 4);
        System.out.printf("Площадь треугольника со сторонами: %.2f; %.2f; %.2f равна: %.2f\n",
                triangle.getA(), triangle.getB(), triangle.getC(), triangle.area());
        Triangle triangle1 = new Triangle(2, 3, 4);
        System.out.printf("Высота треугольника со сторонами: %.2f; %.3f; %.2f равна: %.2f\n",
                triangle1.getA(), triangle1.getB(), triangle1.getC(), triangle1.heightTriangle());
        System.out.println(triangle.toString());

        Shape rectangle = new Rectangle(2, 32);
        System.out.printf("Площадь прямоугольника со сторонами: %.2f; %.2f равна: %.2f\n",
                rectangle.getA(), rectangle.getB(), rectangle.area());
        Rectangle rectangle1 = new Rectangle(2, 4);
        System.out.printf("Диагональ прямоугольника со сторонами: %.2f; %.2f равна: %.2f\n",
                triangle1.getA(), triangle1.getB(), rectangle1.diagonalRectangle());
        System.out.println(rectangle.toString());

        Shape circle = new Circle(5);
        System.out.printf("Площадь круга с радиусом: %.2f равна: %.2f\n", circle.getA(), circle.area());
        Circle circle1 = new Circle(10, 85);
        System.out.printf("Длина дуги окружности с радиусом: %.2f и центральным углом: %.2f равна: %.2f\n",
                circle1.getA(), circle1.getB(), circle1.lengthArc());

        Shape square = new Square(8);
        System.out.printf("Площадь квадрата со стороной: %.2f равна: %.2f\n", square.getA(), square.area());

        Shape ellipse = new Ellipse(5, 10);
        System.out.printf("Площадь эллипса с осями: %.2f; %.2f равна: %.2f\n", ellipse.getA(), ellipse.getB(), ellipse.area());
        System.out.printf("Длина эллипса с осями: %.2f; %.2f равна: %.2f\n", ellipse.getA(), ellipse.getB(), ellipse.perimeter());

        triangle.isEqualsArea(triangle);
        circle.isEqualsArea(circle1);
        square.isEqualsArea(rectangle);

        ShapeUtils.isRectangle(triangle);
        ShapeUtils.isTriangle(triangle);
        ShapeUtils.isRectangle(square);

    }
}
