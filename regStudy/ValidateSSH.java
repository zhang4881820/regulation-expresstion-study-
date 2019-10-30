import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class ValidateSSH {

    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("123-45-6789");
        input.add("9876-5-4321");
        input.add("987-65-4321 (attack)");
        input.add("987-65-4321 ");
        input.add("192-83-7465");
        String patternString = "^(\\d{3}-?\\d{2}-?\\d{4})$";
//        字符串的简单验证
        for (String ssn : input) {
            if (ssn.matches(patternString)) {
                System.out.println("Found good SSN: " + ssn);
            }
        }
//        使用正则类的Pattern和Matcher 的方法进行验证
        Pattern pattern = Pattern.compile(patternString);
        for (String ssn : input) {
            Matcher matcher = pattern.matcher(ssn);
            if (matcher.matches()) {
                System.out.println("Found good SSN:"+ssn);
            }
        }
    }
}

