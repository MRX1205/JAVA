package privateBean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// 注解  可以自动导入包
@Getter
@Setter
@ToString
public class PrivateCat {
    // 下面的this 指向对象的属性名
    // 即String name
    public String name;
    private int age;
    public String variety;
    // 私密的静态变量 通过静态函数调用
    private static String plot = "NanG";




    public static String getPlotInstance() {
        return plot;
    }

    @Override
    public String toString() {
        return "PrivateCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", variety='" + variety + '\'' +
                '}';
    }


   // 特殊的要求需要单独写
    public void setAge(int age) {
        if (age < 0 || age >100) {
            this.age = 0;
        } else{
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }


    // 构造方法 无参构造器 先定义 后使用
    public PrivateCat() {
    }
// 有参方法 直接初始化使用
    public PrivateCat(String name,String variety,int age) {
        this.name = name;
        this.variety = variety;
        this.age = age;
    }
}
