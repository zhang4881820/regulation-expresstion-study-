import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidteEmail{

    public static void main(String[]args){
//        不用正则很麻烦
        String str1 = "myname@abc.com";
        int index = str1.indexOf("@");
        System.out.println(index);
//        使用正则
//        正则可以对URL,Email,数字，字符，特殊字符，网页地址，搜索替换字符等验证
//        Pattern模型通过ASCII提供的包括里面的字符
        String input ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String emailAddress ="xyz@abc-.com";
        Pattern p = Pattern.compile(input);
        Matcher m = p.matcher(emailAddress);
        System.out.println ("The email 1 matches:"+ m.matches());

    }
}





