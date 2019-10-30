import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class SampleGrouping {

    public static void main(String[] args) {

        String input = "I have a cat, dog, mat,cas and rat.";
        Pattern p = Pattern.compile("(c|d|r|m)[a][ts]");
        Matcher m = p.matcher(input);
        List<String> animals = new ArrayList<String>();
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
            animals.add(m.group());
        }


//        String input = "I have a kindle, but I like to read book better.";
//        Pattern p = Pattern.compile("(kindle|read|book|wolf|bear|human)");
//        Matcher m = p.matcher(input);
//        while (m.find()) {
//            System.out.println("Found a " + m.group() + ".");
//        }
    }
}
