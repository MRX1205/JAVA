package String;

public class lastindex
{
    public static void main(String[] args)
    {
        String string = "zdr if i want a chance i want to say i love you forever hcj";

        String string_1 = "zdr";
        String string_2 = "love";
        String string_3 = "hcj";

        System.out.println(string.lastIndexOf('r'));
        System.out.println(string.lastIndexOf(string_1));
        System.out.println(string.lastIndexOf(string_2));
        System.out.println(string.lastIndexOf(string_3));
    }
}
