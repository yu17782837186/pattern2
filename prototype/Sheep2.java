package cn.com.prototype;

import java.util.Date;

public class Sheep2 implements Cloneable{
    private String name;
    private Date birthday;

    public Sheep2() {
    }

    public Sheep2(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();//调用父类的clone()方法
        Sheep2 s = (Sheep2) o;
        s.birthday = (Date)this.birthday.clone();//把属性也拷贝一份
        return o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
