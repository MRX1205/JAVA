package Interface;

public class Application{

    public static void main(String[] args) {
        // 调用方法
        Chinese chinese = new Chinese();
        chinese.eat();
        chinese.run();


        Weaterner weaterner = new Weaterner();
        weaterner.eat();
        weaterner.run();
    }
}
