/**
 * create by zhangbo on 2019/10/31 0031
 */
public class DemoForReplaceFirst {


    public static void main(String[] args) {
        String regex = ".@.";
        String replacementString = "***";
        DemoForReplaceFirst.replaceMatch("A@BandH@G", regex, replacementString);
    }

    public static void replaceMatch(String str, String regex, String replacementString) {
        String newStr = str.replaceFirst(regex, replacementString);
        System.out.println(regex + " replaced " + newStr);
    }
}

