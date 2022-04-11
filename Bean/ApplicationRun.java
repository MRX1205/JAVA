package Bean;

import com.cgoogle.H1;

public class ApplicationRun {
    public static void main(String[] args) {
        // 为我的猫创建一个新用户
        Cats HuangChaoJianCat = new Cats();
        HuangChaoJianCat.name = "HCJ";
        HuangChaoJianCat.variety = "蓝眼猫";
        HuangChaoJianCat.age = 2;

        System.out.println("黄超健的猫多大 " + HuangChaoJianCat.age);
        Cats ZhuDongRongCat = new Cats();
        ZhuDongRongCat.name = "ZDR";
        ZhuDongRongCat.variety = "可爱多";
        ZhuDongRongCat.age = 2;
        System.out.println("猫叫什么名字”：" + ZhuDongRongCat.name);

        // 注销用户
        //HuangChaoJian  指向属性名
      //  HuangChaoJianCat = null;
        HuangChaoJianCat.play();

        ZhuDongRongCat.sleep();
    }


}
