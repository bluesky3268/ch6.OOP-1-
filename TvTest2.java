class Tv2 {
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
        System.out.println(" 채널값을 1낮춰 현재 채널은 " + channel + "입니다.");
    }
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");
        t1.channel = 7;
        System.out.println("t1의 channel값을 " + t1.channel + "로 변경하였습니다.");
        t2.channel = 10;
        System.out.println("t2의 channel값을 " + t2.channel + "로 변경하였습니다.");
        t2.channelDown();

        System.out.println("t1의 channel값은" + t1.channel + "입니다.");
        System.out.println("t2의 channel값은" + t2.channel + "입니다.");

    } // End Main

}
