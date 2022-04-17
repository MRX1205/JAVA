package Interface;

// implements 实现接口
// 也一样要全部重写接口中的所有方法
public class Chinese implements Human {

    @Override
    public void eat() {
        System.out.println("中国人用筷子吃饭！");
    }

    @Override
    public void run() {
        System.out.println("中国人跑步小跑。");
    }

}
