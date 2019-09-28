package cn.com.prototype;

public class TestPrototypeEfficiency {
    public static void testNew(int count) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Laptop computer = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("通过new的方式创建对象耗时："+(end-start));
    }
    public static void testClone(int count) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Laptop computer = new Laptop();
        for (int i = 0; i < count; i++) {
            Laptop computer2 = (Laptop) computer.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("通过clone的方式创建对象耗时："+(end-start));
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        //测试原型模式在创建对象很耗时的情况下和在短时间需要创建大量的对象的情况下比new对象的情况下效率高
       testNew(1000);
        testClone(1000);
    }
}
class Laptop implements Cloneable{
    public Laptop() { //模拟创建对象的耗时过程
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        return object;
    }
}