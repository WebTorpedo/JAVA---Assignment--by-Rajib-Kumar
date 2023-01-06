/* Write a program to create a room class, the attributes of this class is roomno,
roomtype, roomarea and ACmachine. In this class the member functions are
setdata and displaydata */

class Room {
    int roomNo;
    String roomType;
    double roomArea;
    boolean acMachine;
    void setData(int rno, String rt, double area, boolean ac) {
        roomNo = rno;
        roomType = rt;
        roomArea = area;
        acMachine = ac;
    }
    void displayData() {
        System.out.println("The room number is: " + roomNo);
        System.out.println("The room Type is: " + roomType);
        System.out.println("The room area is: " + roomArea);
        String s = (acMachine) ? "ON" : "OFF";
        System.out.println("The A / c Machine needed: " + s);
    }
}

public class RoomInfo {
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.setData(420, "Farmhouse", 750.50, true);
        room1.displayData();
    }
}
