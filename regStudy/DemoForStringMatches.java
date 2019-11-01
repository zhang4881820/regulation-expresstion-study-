/**
 * create by zhangbo on 2019/10/31 0031
 */
public class DemoForStringMatches {

    public static void main(String[] args) {

        // 定义一个匹配模式                            
        String regex = ".@.";
        // 尝试将需要字符串与正则表达式匹配                           
        DemoForStringMatches.matchIt("a@k", regex);
        DemoForStringMatches.matchIt("webmaster@jdojo.com", regex);
        DemoForStringMatches.matchIt("r@j", regex);
        DemoForStringMatches.matchIt("a%N", regex);
        DemoForStringMatches.matchIt(".@.", regex);
    }
    public static void matchIt(String str, String regex) {
//        测试模式匹配
        if (str.matches(regex)) {
//            使用String类的匹配方法
            System.out.println(str + "匹配这个模式:" + regex);
        } else {
            System.out.println(str + "不匹配这个模式:" + regex);
        }
    }
}
