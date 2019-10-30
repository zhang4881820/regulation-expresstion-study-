import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class DemoForNegativeLookBehind {


    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?<!Y.{0,40})X");
        String txt = "Y less than 40 before X";
        // 这个公式意思是你不想要x前面以40个字符以内的开头。而这个txt就是在40个字符以内的。所以不匹配    
        Matcher m = p.matcher(txt);
        System.out.println(m.find());
        txt = "Y less ddddddddddddddddddddddddd than 40 before X";
        //这个txt就是超过40个字符的。所以匹配           
        m.reset(txt);
        System.out.println(m.find());
    }
}
