package Inherit;

public class Dogs extends Animal {
    // 定义狗的自身特征行为
    // static 为类变量
    private static String behia;

    // 一个获取动物行为的方法
    public static void getBehia() {
        System.out.println("所有的狗的在趴着");
    }

    public Dogs() {
    }

    public Dogs(String name, String variety, int age, String food) {
        super(name, variety, age, food);
    }

    public Dogs(String name, int age) {
        super(name, age);
    }

    // 这个为方法的重写
    // 即继承父类的方法头 但重写了父类的方法体 成了子类的特别的方法
    @Override

    public void barking() {
        // super.方法 表示完全继承父类的方法
        super.barking();
//        System.out.println(this.getName() + "在汪汪汪~~~");



    }

    @Override
    public void barking2() {

    }
}
