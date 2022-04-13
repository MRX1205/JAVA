package Arrays;

public class ArraysBase
{
    public static void main(String[] args)
    {
        int[] array_1 = {1,1,2,9,1,2,0,5};
        double[] array_2 = {1.3,1.7,6,5,4,3,2,6};
        int[] array_3 = new int[5];
        int total = 0;

        for(int i = 0;i < array_1.length;i++) {
            System.out.println(array_1[i]);
        }
        for(int i =0;i<array_2.length;i++)
        {
            total += array_2[i];
        }

        System.out.println("总和是："+ total);

        for(int e:array_1)
        {
            System.out.print(" e ="+e);
        }



    }
}
