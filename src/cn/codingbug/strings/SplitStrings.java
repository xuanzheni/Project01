package cn.codingbug.strings;

/**
 * @author
 * @create 2021-09-24 9:20
 */
public class SplitStrings {
    public static void main(String[] args) {
        String str1="www-runoob-com";
        String[] temp;
        String delimeter="-";
        temp = str1.split(delimeter);
        for (int i = 0; i < temp.length ; i++) {
            System.out.println(temp[i]);
        }
        String str2="www.runoob.com";
        String[] temp2;
        String delimeter2="\\.";
        temp2=str2.split(delimeter2);
        for (String s : temp2) {
            System.out.println(s);

        }
    }
}
