package Earth;

public class RunEarth {

    public static void main(String[] args) {
        // 先从地球仅有的一个账号 创建属于人类的账号
        // 通过类名调用静态变量

        Earth earthhuman = Earth.getEarthinstance();

        earthhuman.hello();
    }
}
