package cn.codingbug.hello;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author
 * @create 2021-09-12 18:57
 */
public class Hello {

    public static void main(String[] args) {
        Date date = new Date();
        List<Object> list = new ArrayList<>();
//        list.add();
        try (FileInputStream fis = new FileInputStream("22hello.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
