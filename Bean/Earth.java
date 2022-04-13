package Bean;


// 单例模式
public class Earth {
    private static Earth earthinstance = new Earth();

    private Earth() {
    }

    // 这样设置的好处是保证了一个地球的原则
    public static Earth getearth() {
        return earthinstance;
    }
    public void hello() {
        System.out.println("Hello");
    }
}
