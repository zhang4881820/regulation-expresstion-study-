import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class DemoForPositiveLookBehind {

    public static void main(String[] args) {
        String reg = "(?<=http://)\\S+";
        Pattern p = Pattern.compile(reg);
        String str = "http://www.a.com. My name";
        Matcher m = p.matcher(str);
        while (m.find()) {
            String msg = ":" + m.group() + ":";
            System.out.println(msg);
        }
    }
}
