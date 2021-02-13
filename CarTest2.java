class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "manual", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");
        Car2 c3 = new Car2("red", "auto", 2);
        System.out.println("c1의 color: " + c1.color + ", c1의 gearType: " + c1.gearType + ", c1의 door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", c2의 gearType: " + c2.gearType + ", c2의 door: " + c2.door);
        System.out.println("c3의 color: " + c3.color + ", c3의 gearType: " + c3.gearType + ", c3의 door: " + c3.door);
    }

}
