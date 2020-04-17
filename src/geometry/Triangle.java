package geometry;

public class Triangle {
    private LengthP2P lengthP2P;
    private final LengthP2P l1 = new LengthP2P();
    private final LengthP2P l2 = new LengthP2P();
    private final LengthP2P l3 = new LengthP2P();

    public Triangle() {

    }

    public void setLengthP2P(LengthP2P lengthP2P) {
        this.lengthP2P = lengthP2P;
    }

    public int lenghtP2P() {
        int dy = Math.subtractExact(lengthP2P.getP().getY(), lengthP2P.getPp().getY());
        int dx = Math.subtractExact(lengthP2P.getPp().getX(), lengthP2P.getP().getX());

        int powDy = dy * dy;
        int powDx = dx * dx;

        int sqrtD = powDx + powDy;

        return (int) Math.sqrt(sqrtD);
    }

    public boolean triangleInequality(Point P, Point Pp, Point Ppp) {
        l1.setP(P);
        l1.setPp(Pp);
        System.out.println(l1.lengthPP());
        l2.setP(P);
        l2.setPp(Ppp);
        System.out.println(l2.lengthPP());
        l3.setP(Pp);
        l3.setPp(Ppp);
        System.out.println(l3.lengthPP());

        return l2.lengthPP() + l3.lengthPP() > l1.lengthPP()
                && l1.lengthPP() + l3.lengthPP() > l2.lengthPP()
                && l1.lengthPP() + l3.lengthPP() > l3.lengthPP();
    }
}
