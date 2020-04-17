package geometry;

public class LengthP2P {

    private Point p;
    private Point pp;

    public LengthP2P() {
    }

    public void setP(Point P) {
        this.p = P;
    }

    public void setPp(Point Pp) {
        this.pp = Pp;
    }

    public Point getP() {
        return p;
    }

    public Point getPp() {
        return pp;
    }

    public int lengthPP() {
        int dy = Math.subtractExact(p.getY(), pp.getY());
        int dx = Math.subtractExact(pp.getX(), p.getX());

        int powDy = dy * dy;
        int powDx = dx * dx;

        int sqrtD = powDx + powDy;

        return (int) Math.sqrt(sqrtD);
    }
}
