package geometry;

public class Point {
    private int X;
    private int Y;

    public Point() {
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    boolean isInFirstQuarter() {
        if (X > 0 && Y > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isInSecondQuoter() {
        if (X < 0 && Y > 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isInThirdQuoter() {
        if (X < 0 && Y < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isInFourthQuoter() {
        if (X > 0 && Y < 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOnXaxis() {
        if (X == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOnYaxis() {
        if (Y == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isInCenter() {
        if (X == 0 && Y == 0) {
            return true;
        } else {
            return false;
        }
    }

}
