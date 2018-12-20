package springboot.test;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Test {

    public static void main(String[] args)  {

        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        System.out.println("格式化后的日期：" + dateNowStr);
        String s1 = dateNowStr.substring(0,11);
        String s2 = dateNowStr.substring(11);
        System.out.println("s1：" + s1);
        System.out.println("s2：" + s2);
    }
}
