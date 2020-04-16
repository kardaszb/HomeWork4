package room;

public class Test {
    public static void main(String[] args) {
        Room room = new Room();
        room.setMeasurement(12.4);
        room.setActualTemp(20);
        room.setIsVentInstalled(true);
        room.setMinTemp(18);

        room.decreasTemp();
        System.out.println(room.showInfo());

        room.decreasTemp();
        System.out.println(room.showInfo());

        room.decreasTemp();
        System.out.println(room.showInfo());

    }
}
