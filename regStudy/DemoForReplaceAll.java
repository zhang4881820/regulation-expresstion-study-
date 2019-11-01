/**
 * create by zhangbo on 2019/10/31 0031
 */
public class DemoForReplaceAll {

    public static void main(String[] args) {
        // 准备一个正则表达式                           
        String regex = ".@.";
        String replacementString = "***";
        // 匹配正则表达式 进行替换                           
        DemoForReplaceAll.replaceMatch("webd@koj", regex, replacementString);
    }

    public static void replaceMatch(String str, String regex, String replacementString) {
        // 测试替换                           
        String newStr = str.replaceAll(regex, replacementString);
        System.out.println(regex + " replaced " + newStr);
    }
}

