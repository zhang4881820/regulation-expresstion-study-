/**
 * create by zhangbo on 2019/10/31 0031
 */
public class DemoForSplit {

    public static void main(String[] args) {
        String str = "one-two-three";
        String[] temp; /* delimiter */
        String delimiter = "-";
        temp = str.split(delimiter); /* print substrings */
        for (int i = 0; i < temp.length; i++)
            System.out.println(temp[i]);
    }

}
