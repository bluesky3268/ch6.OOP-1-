class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 가로: " + Card.width + ", 세로: " + Card.height);
        // System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 가로: " +
        // c2.width + ", 세로: " + c2.height);

        System.out.println();
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        // c1.width = 50; c1.width, c1.height로 쓰는 것이 아니라 Card.width, Card.height로 써야 한다.
        // c1.height = 80;
        // System.out.println();
        // System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 가로: " +
        // c1.width + ", 세로: " + c1.height);
        // System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 가로: " +
        // c2.width + ", 세로: " + c2.height);
        // 클래스 변수는 모든 인스턴스가 하나의 저장공간을 공유하므로, 항상 공통된 값을 갖는다.
    } // End Main

}
