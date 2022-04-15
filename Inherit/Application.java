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
        zdrcat.sleep();
        Cats.getBehai();
        Dogs.getBehia();

        BigCat bigcat = BigCat.getbigCat();
        bigcat.getReason();
   }
}
