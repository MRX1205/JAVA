package Interface;



public class Weaterner implements Human{
    @Override
    public void eat(){
        System.out.println("西方人用刀叉吃饭！");

    }
    @Override
    public void run(){
        System.out.println("西方人跑步大跑。");
    }

}
