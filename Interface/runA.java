package Interface;

public class runA {
    public static void main(String[] args) {
        //可以在一个类中new一个接口 并引用接口中的方法
        // 内部类
//        Animal animal = new Animal() {
//            @Override
//            public void eat() {
//                System.out.println("吃饭");
//            }
//
//            @Override
//            public void play() {
//                System.out.println("玩球！");
//            }
//        };
//
//        animal.eat();


        // 和上面不一样的是 这个没有变量名字
        // 称为匿名内部类

//        new Animal() {
//            @Override
//            public void eat() {
//                System.out.println("吃豆豆");
//            }
//
//            @Override
//            public void play() {
//                System.out.println("踢球");
//            }
//        }.eat();
//


        // 这种是改变返回类型的方法
        new Animal() {
            @Override
            public Animal eat() {
                System.out.println("吃豆豆");
                return this;
            }

            @Override
            public void play() {
                System.out.println("踢球");
            }
            // 相当于 this.play
        }.eat().play();



    }
}
