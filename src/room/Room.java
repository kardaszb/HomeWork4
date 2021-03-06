package room;

public class Room {
    private double measurement;
    private int actualTemp;
    private int minTemp;
    private boolean isVentInstalled;


    public Room() {
    }

    public void setMeasurement(double measurement) {
        this.measurement = measurement;
    }

    public void setActualTemp(int actualTemp) {
        this.actualTemp = actualTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public void setIsVentInstalled(boolean ventInstalled) {
        isVentInstalled = ventInstalled;
    }

    public double getMeasurement() {
        return measurement;
    }

    public int getActualTemp() {
        return actualTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public boolean getIsVentInstalled() {
        return isVentInstalled;
    }

    boolean decreasTemp() {
        if (isVentInstalled && minTemp < actualTemp) {
            actualTemp -= 1;
            return true;
        } else return false;
    }

    public String showInfo() {
        return "Metraż pokoju: " + measurement + "\n"
                + "Actualna temperatura: " + actualTemp + "\n"
                + "Czy pokój ma klimatyzacje?: " + isVentInstalled + "\n"
                + "Minimalna temp. w pokoju wynosi: " + minTemp + "\n";
    }
}
