import org.junit.jupiter.api.Test;
import org.kohsuke.args4j.CmdLineException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tests {
    @Test
    void test1() throws IOException, CmdLineException {
        String[] line1 = "-l -h -r -o .\\src\\test\\resources\\Modified_answers\\test1.txt .\\src\\test\\resources\\Info_for_test".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line1);
        File one = new File(".\\src\\test\\resources\\Modified_answers\\test1.txt");
        File one1 = new File(".\\src\\test\\resources\\Real_answers\\test1.txt");
        List<String> test1 = Files.readAllLines(one.toPath());
        List<String> answer1 = Files.readAllLines(one1.toPath());
        assertEquals(test1, answer1);
    }

    @Test
    void test2() throws IOException, CmdLineException {
        String[] line2 = "-l -o .\\src\\test\\resources\\Modified_answers\\test2.txt .\\src\\test\\resources\\Info_for_test".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line2);
        File two = new File(".\\src\\test\\resources\\Modified_answers\\test2.txt");
        File two2 = new File(".\\src\\test\\resources\\Real_answers\\test2.txt");
        List<String> test2 = Files.readAllLines(two.toPath());
        List<String> answer2 = Files.readAllLines(two2.toPath());
        assert (test2.equals(answer2));
    }

    @Test
    void test3() throws IOException, CmdLineException {
        String[] line3 = "-l -r -o .\\src\\test\\resources\\Modified_answers\\test3.txt .\\src\\test\\resources\\Info_for_test".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line3);
        File three = new File(".\\src\\test\\resources\\Modified_answers\\test3.txt");
        File three3 = new File(".\\src\\test\\resources\\Real_answers\\test3.txt");
        List<String> test3 = Files.readAllLines(three.toPath());
        List<String> answer3 = Files.readAllLines(three3.toPath());
        assertEquals(test3, answer3);
    }

    @Test
    void test4() throws IOException, CmdLineException {
        String[] line4 = "-h -o .\\src\\test\\resources\\Modified_answers\\test4.txt .\\src\\test\\resources\\Info_for_test".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line4);
        File four = new File(".\\src\\test\\resources\\Modified_answers\\test4.txt");
        File four4 = new File(".\\src\\test\\resources\\Real_answers\\test4.txt");
        List<String> test4 = Files.readAllLines(four.toPath());
        List<String> answer4 = Files.readAllLines(four4.toPath());
        assertEquals(test4, answer4);
    }

    @Test
    void test5() throws IOException, CmdLineException {
        String[] line5 = "-h -r -o .\\src\\test\\resources\\Modified_answers\\test5.txt .\\src\\test\\resources\\Info_for_test".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line5);
        File five = new File(".\\src\\test\\resources\\Modified_answers\\test5.txt");
        File five5 = new File(".\\src\\test\\resources\\Real_answers\\test5.txt");
        List<String> test5 = Files.readAllLines(five.toPath());
        List<String> answer5 = Files.readAllLines(five5.toPath());
        assertEquals(test5, answer5);
    }

    @Test
    void test6() throws IOException, CmdLineException {
        String[] line6 = "-l -h -r -o .\\src\\test\\resources\\Modified_answers\\test6.txt .\\src\\test\\resources\\Info_for_test\\first.bmp".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line6);
        File six = new File(".\\src\\test\\resources\\Modified_answers\\test6.txt");
        File six6 = new File(".\\src\\test\\resources\\Real_answers\\test6.txt");
        List<String> test6 = Files.readAllLines(six.toPath());
        List<String> answer6 = Files.readAllLines(six6.toPath());
        assertEquals(test6, answer6);
    }

    @Test
    void test7() throws IOException, CmdLineException {
        String[] line7 = "-l -o .\\src\\test\\resources\\Modified_answers\\test7.txt .\\src\\test\\resources\\Info_for_test\\first.bmp".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line7);
        File seven = new File(".\\src\\test\\resources\\Modified_answers\\test7.txt");
        File seven7 = new File(".\\src\\test\\resources\\Real_answers\\test7.txt");
        List<String> test7 = Files.readAllLines(seven.toPath());
        List<String> answer7 = Files.readAllLines(seven7.toPath());
        assertEquals(test7, answer7);
    }

    @Test
    void test8() throws IOException, CmdLineException {
        String[] line8 = "-l -r -o .\\src\\test\\resources\\Modified_answers\\test8.txt .\\src\\test\\resources\\Info_for_test\\first.bmp".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line8);
        File eight = new File(".\\src\\test\\resources\\Modified_answers\\test8.txt");
        File eight8 = new File(".\\src\\test\\resources\\Real_answers\\test8.txt");
        List<String> test8 = Files.readAllLines(eight.toPath());
        List<String> answer8 = Files.readAllLines(eight8.toPath());
        assertEquals(test8, answer8);
    }

    @Test
    void test9() throws IOException, CmdLineException {
        String[] line9 = "-h -o .\\src\\test\\resources\\Modified_answers\\test9.txt .\\src\\test\\resources\\Info_for_test\\first.bmp".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line9);
        File nine = new File(".\\src\\test\\resources\\Modified_answers\\test9.txt");
        File nine9 = new File(".\\src\\test\\resources\\Real_answers\\test9.txt");
        List<String> test9 = Files.readAllLines(nine.toPath());
        List<String> answer9 = Files.readAllLines(nine9.toPath());
        assertEquals(test9, answer9);
    }

    @Test
    void test10() throws IOException, CmdLineException {
        String[] line10 = "-h -r -o .\\src\\test\\resources\\Modified_answers\\test10.txt .\\src\\test\\resources\\Info_for_test\\first.bmp".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line10);
        File ten = new File(".\\src\\test\\resources\\Modified_answers\\test10.txt");
        File ten10 = new File(".\\src\\test\\resources\\Real_answers\\test10.txt");
        List<String> test10 = Files.readAllLines(ten.toPath());
        List<String> answer10 = Files.readAllLines(ten10.toPath());
        assertEquals(test10, answer10);
    }

    @Test
    void test11() throws IOException, CmdLineException {
        String[] line11 = "-h -l -r -o .\\src\\test\\resources\\Modified_answers\\test11.txt .\\src\\test\\resources\\Info_for_test\\first.bmp".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line11);
        File eleven = new File(".\\src\\test\\resources\\Modified_answers\\test11.txt");
        File elven11 = new File(".\\src\\test\\resources\\Real_answers\\test11.txt");
        List<String> test11 = Files.readAllLines(eleven.toPath());
        List<String> answer11 = Files.readAllLines(elven11.toPath());
        assertEquals(test11, answer11);
    }

    @Test
    void test12() throws IOException, CmdLineException {
        String[] line12 = "-h -l .\\src\\test\\resources\\Info_for_test".split(" ");
        FilesInfo g = new FilesInfo();
        g.main(line12);
    }
}