package Cycle;

public class fotCycle {
    public static void main(String[] args) {
        for (int x = 10; x < 20; x++) {
            if (x == 16) {
                // continue 是跳出本次循环
                // break 是跳出本层循环
                continue;
                //break;
            }
            System.out.println("value = " + x);

        }
    }
}
