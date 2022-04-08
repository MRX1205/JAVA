package String;

public class trim
{
    public static void main(String[] args)
    {
        String string = "    www.google.com    ";
        System.out.println("原始值：");
        System.out.println(string);
        System.out.println("删除头尾的空白后：");
        System.out.println(string.trim());
    }
}
