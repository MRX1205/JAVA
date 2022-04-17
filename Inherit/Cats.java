package Inherit;

public class Cats extends Animal {
    private static String behai;

    public static void getBehai() {
        System.out.println("所有的猫正在利爪");
    }

    // 这个为方法的重写
    // 即继承父类的方法头 但重写了父类的方法体 成了子类的特别的方法
    @Override
    public void barking() {
        System.out.println(this.getName() + "在喵喵喵~~~");
    }

    // 重写父类的抽象方法 变为具体
    @Override
    public void barking2() {
        System.out.println("猫猫猫猫猫猫");
    }

    // 这是完全继承父类的方法
    public Cats() {

    }

    public Cats(String name, String variety, int age, String food) {
       // super(变量名) 即完全继承父类此方法中的所有 意为啃老
        super(name, variety, age, food);
    }

    public Cats(String name, int age) {
        super(name, age);
    }


    // 因为在父类中已经定义了final的方法 所以在子类中不能重写 没有权限
//    @Override
//    public static String getTexrCommunityName(){
//        return TEXT_COMMUNITY_NAME;
//    }

}
