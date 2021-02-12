class Tv3 {
    String color;
    boolean power;
    int channel;

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

public class TvTest3 {
    public static void main(String[] args) {
        Tv3 t1 = new Tv3();
        Tv3 t2 = new Tv3();
        System.out.println("t1의 채널값은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널값은 " + t2.channel + "입니다.");
        t2 = t1; // t1의 주소값을 t2에 저장.
        t1.channel = 7;
        System.out.println("t1의 채널값을 " + t1.channel + "로 변경하였습니다.");
        System.out.println("t1의 채널값은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널값은 " + t2.channel + "입니다."); // t2도 t1과 같은 주소값을 가지면서 같은 인스턴스를 참조함(가르킴)

    }

}
