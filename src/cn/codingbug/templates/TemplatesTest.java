package cn.codingbug.templates;

import cn.codingbug.beans.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author
 * @create 2021-09-12 22:35
 */
public class TemplatesTest {
    //prsf:生成private static final
    private static final Customer cust=new Customer();
    //psf
    public static final int NUM=1;
    //psfi
    public static final int NUM2=2;
    //psfs
    public static final String NATION="china";
    //模板一psvm-main方法
    public static void main(String[] args) {
        //模板二sout输出
        System.out.println("Hello World!");
        //soutp 输出形参
        System.out.println("args = " + Arrays.deepToString(args));
        //soutm 输出方法名
        System.out.println("TemplatesTest.main");
        int num1=10;
        int num2=11;
        //soutv 输出方法的参数值
        System.out.println("num1 = " + num1);
        //xxx.sout输出变量值
        System.out.println(num2);
        //模板三:fori for循环
        String[] arr=new String[]{"tom","jerry"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //itar for循环有赋值
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四:list.for集合
        List<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(345);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
    public void method(){
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("234");
        list.add("345");
        //模板五:ifn
        if (list == null) {

        }
        //inn
        if (list != null) {

        }
        //xxx.nn
        if (list != null) {

        }
        //xxx.null
        if (list == null) {

        }

    }

}
