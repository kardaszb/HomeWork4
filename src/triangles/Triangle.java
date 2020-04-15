package triangles;

class Triangle {
    double sideA;
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    void showInfo() {
        System.out.println(
                "Długości boków odpowiednio wynoszą: \n"
                        + "A = " + sideA + "\n"
                        + "B = " + sideB + "\n"
                        + "C = " + sideC + "\n"
        );
    }
}
