/*Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them. */
package custom;

import java.util.*;

    class Ques2{
    public static void main(String[] args) {
        String s1 = "smart work is smart work";
        String[] s2 = s1.split(" ");
        //ArrayList<String> al = new ArrayList<String>();
        List<String> itemList = new ArrayList<String>(Arrays.asList(s2));
        System.out.println(itemList);

       HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<itemList.size();++i)
        {
            if(map.containsKey(itemList.get(i)))
            {

                int val =  map.get(itemList.get(i));
                val = val+1;
                map.replace(itemList.get(i),val);
            }
            else
            {
                map.put(itemList.get(i),1);
            }
        }
        System.out.println("New HashMap: "
                + map.toString());



    }
}
