package emhlz;

public class MethodOverLoading
{
    public static void main(String[] args)
    {
        int value_1 = sum(1,2);
        double value_2 = sum(1.2,1.6);
        int value_3 = sum(1,2,3);


        System.out.println("value_1 = " +value_1);
        System.out.println("value_2 = " +value_2);

        System.out.println("value_3 = " + value_3);
    }
    public static int sum(int x,int y)
    {
        return x + y;
    }
    public static double sum(double x,double y)
    {
        return x +y ;
    }
    public static int sum(int x ,int y, int z)
    {
        return x +y +z;
    }
}
