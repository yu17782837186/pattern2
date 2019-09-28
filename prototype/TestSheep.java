package cn.com.prototype;

import java.util.Date;

public class TestSheep {
    public static void main(String[] args) throws CloneNotSupportedException {
        //测试原型模式 浅拷贝
        Date date = new Date(124356789L);
        Sheep s1 = new Sheep("小羊",date);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
        date.setTime(1853679L);
        System.out.println(s1.getBirthday());
        System.out.println("=================");
        //不是同一个对象但是值都是一样的,这里说明s1,s2的birthday属性指的是同一个对象
        //拷贝的是s1的date对象的值和地址，所以引用的是同一个对象，这就是浅拷贝
        Sheep s2 = (Sheep) s1.clone();
        s2.setName("大🐏");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}
