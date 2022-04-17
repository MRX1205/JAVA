package Polymorphism;

public class Application {
    public static void main(String[] args) {
        // 多态
        // 替父从军 先向上转型
        HuaHu huahu = new HuaMuLan();
        System.out.println(huahu.name);
        System.out.println(huahu.age);
        huahu.sayMe();



        // 向下转型做回自己
        HuaMuLan huamulan = (HuaMuLan) huahu;

        System.out.println(huamulan.name);
        System.out.println(huamulan.age);
        huamulan.sayMe();
    }
}
