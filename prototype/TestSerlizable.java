package cn.com.prototype;

import java.io.*;
import java.util.Date;

public class TestSerlizable {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //测试序列化和反序列化实现深拷贝
        Date date = new Date(12346L);
        Sheep s1 = new Sheep("喜羊羊",date);

        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());
//        Sheep s2 = (Sheep) s1.clone();
        //使用序列化和反序列化实现深拷贝
        //序列化
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(s1);
        byte[] bytes = baos.toByteArray();

        //反序列化
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Sheep s2 = (Sheep)ois.readObject();//得到克隆好的新羊

        date.setTime(789456123L);
        System.out.println(s1.getBirthday());
        s2.setName("美羊羊");
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());
    }
}
