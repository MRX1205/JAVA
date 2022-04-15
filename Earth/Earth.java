package Earth;

public class Earth {
    // 目标 保证一个地球的原则
    // 先在类中新建一个地球的账号 属于私密静态的方式
    // 设计一个私密的类方法 返回类型为void 防止外部调用方法新建一个地球
    // 设计一个公开的静态方法 返回值为地球仅有一个地球账号

    private static Earth earth = new Earth();

    private Earth() {
    }

    public static Earth getEarthinstance() {
        return earth;
    }

    public void hello() {
        System.out.println("Hello");
    }
}
