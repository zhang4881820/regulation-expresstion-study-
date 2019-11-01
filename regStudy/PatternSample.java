import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * create by zhangbo on 2019/10/31 0031
 */
public class PatternSample {

    public static void main(String[] args) {

//        Pattern pattern = Pattern.compile(".ab.");
//        Matcher matcher = pattern.matcher("WabY");
//        Matcher m1 = pattern.matcher("WxxY");
//        System.out.println("输入字符串与正则匹配 - " + matcher.matches());
//        System.out.println("输入字符串与正则匹配 - " + m1.matches());

//        String content = "This is my tutorial sample";
//        String patternString = ".*tutorial.*";
//        boolean isMatch = Pattern.matches(patternString, content);
//        System.out.println("The text contains 'tutorial'? " + isMatch);

//        String content = "This is my regex sample";
//        String patternString = ".*rEgeX.*";
//        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(content);
//        boolean isMatched = matcher.matches();
//        System.out.println("Is it a Match?" + isMatched);
//
//        String text = "ItIsRegexSample.ItISProvidedByMe";
//        // 定界符                           
//        String patternString = "is";
//        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
//        String[] myStrings = pattern.split(text);
//        for (String temp : myStrings) {
//
//            System.out.println(temp);
//        }
//        System.out.println("分割后的字符串个数:"+myStrings.length);


//        String REGEX = "Saa";
//        String INPUT = "aaSaa0aaaS";
//        Pattern pattern = Pattern.compile(REGEX);
//        Matcher matcher = pattern.matcher(INPUT);
//        System.out.println("Current REGEX is: "+REGEX);
//        System.out.println("Current INPUT is: "+INPUT);
//        System.out.println("lookingAt(): "+matcher.lookingAt());
//        System.out.println("matches(): "+matcher.matches());

//        String REGEX = "too";
//        String INPUT = "too";
//        Pattern p = Pattern.compile(REGEX);
//        Matcher m = p.matcher(INPUT);
//        while (m.find()) {
//            System.out.println("start(): " + m.start());
//            System.out.println("end(): " + m.end());
//        }
//        Pattern p = Pattern.compile("dog");
//        Matcher m = p.matcher("one dog two dogs in the house");
//        StringBuffer sb = new StringBuffer();
//        while (m.find()) {
//            m.appendReplacement(sb, "rabbit");
//        }
//        System.out.println(sb.toString());
//        m.appendTail(sb);
//        System.out.println(sb.toString());。

        String input = "aaahorsebbbhorseccchorse";
        String patternString = "horse";
        String output="";
        Pattern p = Pattern.compile(patternString);
        Matcher m = p.matcher(input);
        output = m.replaceAll("dog");
        System.out.println("Input:"+input);
        System.out.println("Output:"+output);
    }

}

