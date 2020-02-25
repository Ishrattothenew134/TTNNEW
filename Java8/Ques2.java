

// Q2.Create a functional interface whose method takes 2 integers and return one integer.
package Java8;

import java.util.function.BiFunction;

public class Ques2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (e1,e2)-> e1+e2;
        System.out.println(biFunction.apply(4,9));

    }
}
