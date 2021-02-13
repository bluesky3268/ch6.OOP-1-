class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
    // static int cv2 = iv; Error. 클래스변수(static변수)는 인스턴스변수를 사용할 수 없음.
    static int cv2 = new MemberCall().iv; // 객체를 생성 후 사용 가능함.

    static void staticMethod1() {
        System.out.println(cv);
        // System.out.println(iv); Error. 클래스메소드(static메소드)에서는 인스턴스변수 사용할 수 없음.
        MemberCall c = new MemberCall(); // 객체 생성 후 인스턴스변수의 참조 가능.
        System.out.println(c.iv);
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); // 인스턴스메소드에서는 인스턴스변수 사용 가능함.
    }

    static void staticMethod2() {
        staticMethod1();
        // instanceMethod1(); Error. 클래스메소드(static메소드)에서는 인스턴스메소드 사용할 수 없음.
        MemberCall c = new MemberCall();
        c.instanceMethod1(); // 인스턴스를 생성후 사용할 수 있음.
    }

    void instanceMethod2() {
        staticMethod1();
        MemberCall.staticMethod2();
        instanceMethod1();
        // 인스턴스메소드에서는 인스턴스메소드와 static메소드 모두 객체 생성없이 바로 호출 가능함.
    }
}
