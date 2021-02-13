class Car1 {
    String color;
    String gearType;
    int door;

    Car1() {
    }

    Car1(String c, String g, int d) {
        color = c;
        gearType = g;
        door = d;
    }
}

public class CarTest1 {
    public static void main(String[] args) {
        Car1 c1 = new Car1();
        c1.color = "red";
        c1.gearType = "manual";
        c1.door = 2;
        Car1 c2 = new Car1("white", "auto", 4);
        System.out.println("c1의 color : " + c1.color + ", c1의 gearType : " + c1.gearType + ", c1의 door: " + c1.door);
        System.out.println("c2의 color : " + c2.color + ", c2의 gearType : " + c2.gearType + ", c2의 door: " + c2.door);
    }

}
