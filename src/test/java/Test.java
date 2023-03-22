
class Test {
    @org.junit.jupiter.api.Test
    void test() {
        Class j = new Class();
        j.main(true, false, false, "");
    }
    @org.junit.jupiter.api.Test
     void test1() {
        Class j = new Class();
        j.main(false, true, false, "");
    }
    @org.junit.jupiter.api.Test
    void test2() {
        Class j = new Class();
        j.main(true, false, true, "");
    }
    @org.junit.jupiter.api.Test
    void test3() {
        Class j = new Class();
        j.main(false, true, true, "");
    }
    @org.junit.jupiter.api.Test
    void test4() {
        Class j = new Class();
        j.main(false, true, false, "C:\\Users\\PC\\Downloads\\Telegram Desktop\\answer.txt");
    }
}
