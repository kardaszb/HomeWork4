package triangles;

class TriangleType {


    boolean isRightTriangle(Triangle triangle) {
        double sqrA = triangle.sideA * triangle.sideA;
        double sqrB = triangle.sideB * triangle.sideB;
        double sqrC = triangle.sideC * triangle.sideC;
        return sqrA + sqrB == sqrC;
    }
}
