package geometry;

public class Test {
    public static void main(String[] args) {
        Point pointP1 = new Point();
        pointP1.setX(-2);
        pointP1.setY(5);

        Point pointP2 = new Point();
        pointP2.setX(6);
        pointP2.setY(-1);

        Point pointP3 = new Point();
        pointP3.setX(-2);
        pointP3.setY(10);

        LengthP2P lengthP1P2 = new LengthP2P();
        lengthP1P2.setP(pointP1);
        lengthP1P2.setPp(pointP2);
        System.out.println(lengthP1P2.lengthPP());

        Triangle triangle = new Triangle();
        triangle.setLengthP2P(lengthP1P2);
        System.out.println(triangle.lenghtP2P());


        System.out.println(triangle.triangleInequality(pointP1,pointP2,pointP3));

    }
}
