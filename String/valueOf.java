package String;

public class valueOf
{
    public static void main(String[] args)
    {
        double d = 1314.120;
        float f =  1314.2f;
        long l = 15954L;
        int i = 1129;
        boolean b = false;
        char c = 'a';
        char[] ch = {'g','o','o','l','e'};

        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(i));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(ch));
        //返回参数类型的表现形式

    }
}
