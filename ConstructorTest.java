class Data1_1 {
    int value;
}

class Data1_2 {
    int value;

    Data1_2(int x) {
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1_1 d1 = new Data1_1();
        // Data1_2 d2 = new Data1_2(); Error( The constructor Data1_2() is undefined.)
        // 기본생성자가 추가되지 않았기 때문에 에러가 발생함.
        // 해결방법 1. 기본생성자(Data1_2(){})를 정의해준다.
        // 해결방법 2. Data1_2인스턴스 생성 시 ->> Data1_2 d2 = new Data1_2(10); int x 의 값을 넣어준다.
    }

}
