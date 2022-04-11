package privateBean;

public class ApplicationRun1 {
    public static void main(String[] args) {
        PrivateCat HcjCat = new PrivateCat();

        HcjCat.name = "猫大";
        HcjCat.setAge(5);
        HcjCat.variety = "中华狸花猫";


        System.out.println("我的猫名字叫"+HcjCat.name);
        System.out.println("我的猫的品种是"+HcjCat.variety);
        System.out.println("我的猫今年" + HcjCat.getAge() + "岁");
        // 引用toString() 方法
        System.out.println("HcjCat = " + HcjCat);


        PrivateCat ZdrCat = new PrivateCat("猫小","白花猫",3);
        System.out.println("ZdrCat = " + ZdrCat);

    }
}
