class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "manual", 4);
    }

    Car3(Car3 c) { // 인스턴스 복사를 위한 생성자.
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c3 = new Car3("red", "auto", 2);
        Car3 c2 = new Car3(c3);
        System.out.println("c1의 color: " + c1.color + ", c1의 gearType: " + c1.gearType + ", c1의 door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", c2의 gearType: " + c2.gearType + ", c2의 door: " + c2.door);
        System.out.println("c3의 color: " + c3.color + ", c3의 gearType: " + c3.gearType + ", c3의 door: " + c3.door);

        c3.door = 100;
        System.out.println("c3.door = 100 수행 후");
        System.out.println("c1의 color: " + c1.color + ", c1의 gearType: " + c1.gearType + ", c1의 door: " + c1.door);
        System.out.println("c2의 color: " + c2.color + ", c2의 gearType: " + c2.gearType + ", c2의 door: " + c2.door);
        System.out.println("c3의 color: " + c3.color + ", c3의 gearType: " + c3.gearType + ", c3의 door: " + c3.door);
        // 서로 독립적인 메모리 공간에 존재하는 별도의 인스턴스이기 때문에 c3의 값이 변경되어도 c2는 영향을 받지 않는다.

    }

}