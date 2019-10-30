import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class DemoForPositiveLookAhead {


    public static void main(String args[]) {
        String regex = "(?=^255).*";
        Pattern pattern = Pattern.compile(regex);
        String candidate = "255.0.0.1";
        String candidate1 = "25.255.0.1";
        Matcher matcher = pattern.matcher(candidate);
        Matcher matcher1 = pattern.matcher(candidate1);
        String ip = "not found";
        String ip1= "not found";

        if (matcher.find())
            ip = matcher.group(0);
        String msg = "ip: " + ip;
        System.out.println(msg);

        if (matcher1.find())
            ip1 = matcher1.group();
        String msg1 = "ip1: " + ip1;
        System.out.println(msg1);
    }
}
