import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * create by zhangbo on 2019/10/30 0030
 */
public class DemoForQuantity {

    public static void main(String[] args) {
        String regex = "a?"; // to match a in abaa once or not at all
        String regex1 = "a*";//  to match a in abaa zero or more times
        String regex2 = "a+";//greedy quantifier to match a in abaa one or more times
        String regex3 = "a{2}";// greedy quantifier to match every aa sequence in aababbaaaab
        String regex4 = "a{2,}";//greedy quantifier to match two or more consecutive as in aababbaaaab                                  
        String regex5 = "a{1,3}";// greedy quantifier to match every a, aa, or aaa in aababbaaaab   
        String regex6 = "a+?";//reluctant quantifier to match a in abaa one or more times
        String regex7 = ".*+end";//uses a possessive quantifier to match all characters                              followed by end in This is the end zero or more times

        String text = "abaa";
        String text1 ="abaa";
        String text2 ="abaa";
        String text3 ="aababbaaaab";
        String text4 ="aababbaaaab";
        String text5 ="aababbaaaab";
        String text6 ="abaa";
        String text7 ="This is the end";
        Pattern p1 = Pattern.compile(regex);
        Pattern p2 = Pattern.compile(regex1);
        Pattern p3 = Pattern.compile(regex2);
        Pattern p4 = Pattern.compile(regex3);
        Pattern p5 = Pattern.compile(regex4);
        Pattern p6 = Pattern.compile(regex5);
        Pattern p7 = Pattern.compile(regex6);
        Pattern p8 = Pattern.compile(regex7);
        Matcher m1 = p1.matcher(text);
        Matcher m2 = p2.matcher(text1);
        Matcher m3 = p3.matcher(text2);
        Matcher m4 = p4.matcher(text3);
        Matcher m5 = p5.matcher(text4);
        Matcher m6 = p6.matcher(text5);
        Matcher m7 = p7.matcher(text6);
        Matcher m8 = p8.matcher(text7);

        while (m1.find()) {
            System.out.println("m1StartIndex->"+m1.start()+"EndIndex->"+m1.end());
        }
        System.out.println("------------------------------");
        while (m2.find()) {
            System.out.println("m2StartIndex->"+m2.start()+"EndIndex->"+m2.end());
        }
        System.out.println("------------------------------");
        while (m3.find()) {
            System.out.println("m3StartIndex->"+m3.start()+"EndIndex->"+m3.end());
        }
        System.out.println("------------------------------");
        while (m4.find()) {
            System.out.println("m4StartIndex->"+m4.start()+"EndIndex->"+m4.end());
        }
        System.out.println("------------------------------");
        while (m5.find()) {
            System.out.println("m5StartIndex->"+m5.start()+"EndIndex->"+m5.end());
        }
        System.out.println("------------------------------");
        while (m6.find()) {
            System.out.println("m6StartIndex->"+m6.start()+"EndIndex->"+m6.end());
        }
        System.out.println("------------------------------");
        while (m7.find()) {
            System.out.println("m7StartIndex->"+m7.start()+"EndIndex->"+m7.end());
        }
        System.out.println("------------------------------");
        while (m8.find()) {
            System.out.println("m8StartIndex->"+m8.start()+"EndIndex->"+m8.end());
        }
    }
}
