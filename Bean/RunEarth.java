package Bean;

public class RunEarth {
    public static void main(String[] args) {

        // 新建一个账号 但保证了一个地球
        Earth earth1 = Earth.getearth();

        earth1.hello();
    }


}
