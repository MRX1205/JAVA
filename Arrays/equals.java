package Arrays;

import java.util.Arrays;

public class equals
{
    public static void main(String[] args)
    {
        int[] array_1 = {1129,1314};
        int[] array_2 = {1205,1314};
        int[] array_3 = {'h','c','j'};
        int[] array_4 = {'h','c','j'};
        boolean result = Arrays.equals(array_1,array_2);//判断两个数组是否相等
        System.out.println("result= " + result);
        boolean result_1 = Arrays.equals(array_3,array_4);
        System.out.println("result_1= " + result_1);
    }
}
