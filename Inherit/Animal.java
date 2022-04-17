package Inherit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// 将类定义成抽象类时
public abstract class Animal {
    private String name;
    public String variety;
    private int age;
    private String food;
    //private static String community = "NanG";
    // 将小区的名字定义为final常量 好处时一经定义不可再修改 保证了安全
    // final定义的变量 不可以再修改
    private static final String  TEXR_COMMUNITY_NAME = "NanG";

    // 定义一个可以在继承类中调用获取小区名字的方法
    // 这样定义的方法 一样可以通过子类进行重写
    public static String getCommunity() {
        return TEXR_COMMUNITY_NAME;
    }
    // 如果不想被重写 默认使用父类的方法 可以用final定义

    public static final String getTexrCommunityName(){
        return TEXR_COMMUNITY_NAME;
    }

    public Animal() {

    }

    public Animal(String name, String variety, int age, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
            System.out.println("你所输入的数字不合法，已被清零");
        } else {
            this.age = age;
            // 没定义为常量时 一样可以修改小区的名字 安全问题
           // TEXR_COMMUNITY_NAME = "fuck0";
        }
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println(this.name + "正在吃" + food);
    }

    public void sleep() {
        System.out.println(this.name + "正在睡觉");
    }

    public void injection() {
        System.out.println("所有的动物 月底打针");
    }

    //    public String setName() {
//        return name;
//    }
//    public void getName(String name) {
//        this.name = name;
//    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String setVariety() {
        return variety;
    }

    public void getVariety(String variety) {
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //一个描述动物叫声的方法
    public void barking() {
        System.out.println(this.name + "动物在叫！");
    }

    // 写一个描述动物叫声音2的抽象方法
    // 抽象方法不能用具体的方法体
    // 其它子类继承时 必须要重写此方法
    public abstract void barking2();
}
