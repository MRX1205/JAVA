package Inherit;

public class BigCat extends Cats {

    // 一个猫大的原则
    private static BigCat bigCatinstance = new BigCat();

    private BigCat() {

    }

    public static BigCat getbigCat() {
        return bigCatinstance;
    }

    private String reason;
    // 公用的方法
    public void getReason() {
        System.out.println("因为是黄超健起的名字");
    }


}
