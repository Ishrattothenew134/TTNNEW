/* Q5. Find common elements between two arrays. */
package custom;

import java.util.ArrayList;

public class q5 {
    public static void main(String[] args) {
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] intArray1 = new int[]{3,4,6,9,10,11,12};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i<intArray.length;++i)
        {
         for(int j= 0; j<intArray1.length;++j)
         {
             if(intArray[i]==intArray1[j])
             {
                 al.add(intArray[i]);
                 break;
             }
         }
        }
        System.out.println("common elements are:"+al);

    }
}
