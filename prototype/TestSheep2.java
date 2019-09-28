package cn.com.prototype;

import java.util.Date;

public class TestSheep2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //测试原型模式 深拷贝
        Date d = new Date(45679L);
        Sheep2 s = new Sheep2("小🐏",d);
        Sheep2 s2 = (Sheep2)s.clone();
        System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getBirthday());
        d.setTime(78913L);
        System.out.println(s.getBirthday());
        System.out.println("==============");

        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}
