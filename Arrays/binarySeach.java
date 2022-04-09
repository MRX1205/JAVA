package Arrays;

import java.util.Arrays;

public class binarySeach
{
    public static void main(String[] args)
    {
        int[] array_1 = {1129,1205,14523,124,4,425,675,1246,345,88};
        Arrays.sort(array_1);

        int result = Arrays.binarySearch(array_1,1205);//需排序在查找
        System.out.println("result= " + result);
    }
}
