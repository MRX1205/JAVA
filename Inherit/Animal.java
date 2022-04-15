package Inherit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Animal {
    private String name;
    public String variety;
    private int age;
    private String food;

    public void setAge(int age) {
        if (age < 0 || age >100) {
            age =0;
            System.out.println("你所输入的数字不合法，已被清零");
        } else {
            this.age = age;
        }
    }
    public int getAge() {
       return this.age;
    }

    public void eat() {
        System.out.println(this.name + "正在吃饭");
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
}
