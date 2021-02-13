public class BlockTest {
    // 클래스 초기화 블럭(클래스 변수의 복잡한 초기화 시 사용.)
    static {
        System.out.println("static {  }");
    }
    // 인스턴스 초기화 블럭 (인스턴스 변수의 복잡한 초기화 시 사용.)
    {
        System.out.println("{  }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest bt = new BlockTest();");
        BlockTest bt = new BlockTest();
        System.out.println("BlockTest bt2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }

}
