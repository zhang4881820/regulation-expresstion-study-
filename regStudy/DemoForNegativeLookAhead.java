import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class DemoForNegativeLookAhead {

    public static void main(String[] args) {
        String regex = "John (?!Heins)[A-Z]\\w+";
        Pattern pattern = Pattern.compile(regex);
        String candidate = "I think that John Heins ";
        candidate += "is a fictional character. His real name ";
        candidate += "might be John Jackson, John Westling, ";
        candidate += "or John Holmes for all we know.";
        Matcher matcher = pattern.matcher(candidate);
        String tmp;
        while (matcher.find()) {
            tmp = matcher.group();
            System.out.println("MATCH:" + tmp);
        }
    }
}
