package triangles;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(7, 24, 25);
        TriangleType triangleType = new TriangleType();
        triangle.showInfo();
        System.out.println("Czy trojkąt jest prostokatny?\n" + triangleType.isRightTriangle(triangle));

    }
}
