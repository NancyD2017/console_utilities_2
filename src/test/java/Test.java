class Test {
    @org.junit.jupiter.api.Test
    void testForFile() {
        Class j = new Class();
        j.main(new String[]{"C:\\Users\\PC\\Downloads\\Folder", "[-l]"});
    }
    @org.junit.jupiter.api.Test
    void testForDirectory_HumanReadable() {
        Class j = new Class();
        j.main(new String[]{"C:\\Users\\PC\\Downloads\\Folder", "[-h]"});
    }
    @org.junit.jupiter.api.Test
    void testForDirectory_IsLong_Reverse() {
        Class j = new Class();
        j.main(new String[]{"C:\\Users\\PC\\Downloads\\Folder", "[-l]", "[-r]"});
    }
    @org.junit.jupiter.api.Test
    void testForDirectory_HumanReadable_Reverse() {
        Class j = new Class();
        j.main(new String[]{"C:\\Users\\PC\\Downloads\\Folder", "[-h]", "[-r]"});
        }
    @org.junit.jupiter.api.Test
    void testAnswerInFile() {
        Class j = new Class();
        j.main(new String[]{"C:\\Users\\PC\\Downloads\\Folder", "[-h]", "[-o]", "C:\\Users\\PC\\3D Objects\\answer.txt"});
    }
}