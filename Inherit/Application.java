package Inherit;

import static Inherit.BigCat.getbigCat;

public class Application {
    public static void main(String[] args) {
        Dogs hcjdog = new Dogs();
        hcjdog.setName("hcj");
        hcjdog.setAge(3);
        hcjdog.setVariety("拉布拉多");

        System.out.println("hcjdoname = " + hcjdog.getName());
        System.out.println("hcjdogage = " + hcjdog.getAge());
        System.out.println("hcjdogvariety = " + hcjdog.getVariety());

        System.out.println("\t");

        Cats zdrcat = new Cats();

        zdrcat.setName("zdr");
        zdrcat.setAge(3);
        zdrcat.setVariety("蓝猫");
        System.out.println("zdrcatname = " + zdrcat.getName());
        System.out.println("zdrcatage = " + zdrcat.getAge());
        System.out.println("zdrCatVariety = " + zdrcat.getVariety());

        hcjdog.eat();
        hcjdog.setFood("狗粮");
        zdrcat.setFood("猫粮");
        zdrcat.sleep();
        Cats.getBehai();
        Dogs.getBehia();

        BigCat bigcat = BigCat.getbigCat();
        bigcat.getReason();

        hcjdog.eat();
        zdrcat.eat();


        hcjdog.barking();
        zdrcat.barking();

        Dogs dog1 = new Dogs("Jerry",2);
        Cats cat1 = new Cats("蓝猫",3);
//        Animal animal = new Animal("jack","拉布拉多",3,"狗粮");

        // 获取类小区的名字
        System.out.println("Dogs.Community = " + Dogs.getCommunity());
        System.out.println("Cats.Community = " + Cats.getCommunity());
       zdrcat.barking2();
    }
}
