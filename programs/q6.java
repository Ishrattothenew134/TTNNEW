/* Q6. There is an array with every element repeated twice except one. Find that element */
package custom;

import java.util.HashMap;
import java.util.Objects;

    class Ques6 {
    public static void main(String[] args) {
        int[] intArray = new int[]{2,3,5,7,1,6,2,3,5,1,7};
        int val;
        int key=0;
        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int i =0;i<intArray.length;++i)
        {
            if(map.containsKey(intArray[i]))
            {
                val = map.get(intArray[i]);
                val = val+1;
                map.replace(intArray[i],val);
            }
            else
            {
                map.put(intArray[i],1);
            }
        }

        for(HashMap.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(Objects.equals(1,entry.getValue()))
            {
                key = entry.getKey();
            }
        }
        System.out.println(key);
    }
}
