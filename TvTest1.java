class Tv1 {

    // Tv의 속성
    String color;
    boolean power;
    int channel;

    // Tv의 기능
    void power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }

}

class TvTest1 {
    public static void main(String[] args) {
        Tv1 t; // Tv타입의 t변수 선언
        t = new Tv1(); // Tv인스턴스 생성
        t.channel = 10;
        t.channelUp();
        System.out.println("현재 채널은 " + t.channel + "입니다.");

    }
}