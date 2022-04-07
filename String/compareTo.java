package String;

public class compareTo
{
    public static void main(String[] args)
    {
        String str_1 = "strings";
        String str_2 = "strings";
        String str_3 = "string123";

        int result = str_1.compareTo(str_2);
        System.out.println(result);

        result = str_2.compareTo(str_3);
        System.out.println(result);

        result= str_3.compareTo(str_1);
        System.out.println(result);
    }
}
