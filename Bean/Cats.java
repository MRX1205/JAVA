package Bean;

public class Cats {
        public String name;
        public String variety;
        public int age;
        // 静态变量 plot小区
        public static String plot = "NanG";



        public void eat() {
                System.out.println(name + " 正在吃饭");
        }
        public void sleep() {
                System.out.println(name + "正在睡觉");
        }
        public void play() {
                System.out.println(name + "正在玩");
        }
        // 静态函数（方法）
        public static void injection() {
                System.out.println("所有的猫月底打针！");
        }



}
