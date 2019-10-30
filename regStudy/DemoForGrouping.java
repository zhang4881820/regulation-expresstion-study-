import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class DemoForGrouping {

    public static void main(String[] args) {
        String text = "John writes about this, and John writes about that," +
                " and John writes about everything. ";
//        找到john组
        String patternString1 = "(John)";
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("found:"+matcher.group(1));
        }
    }
}
