import javax.sound.midi.Soundbank;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class MaskingDemo {

    public static void main(String[] args) {
        String input = "User userId=23421. Some more userId=33432. This is userNum=100";
        Pattern p = Pattern.compile("(userId=)(\\d+)");
        Matcher m = p.matcher(input);
        StringBuffer result = new StringBuffer();
        while (m.find()) {
//          获取第二个分组的值··
            System.out.println("Masking: " + m.group(2));
//           第一个参数容器，第二参数放入容器的值 往后追加的方式
            m.appendReplacement(result, m.group(1) + "***masked***");
        }
        System.out.println(result);
//       根据result末尾的位置把input里面的text按照此位置之后的text追加到result中
        m.appendTail(result);
        System.out.println(result);
    }
}
