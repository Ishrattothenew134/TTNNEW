//Q.7 Override the default method of the interface.

package Java8;
interface MyInterface{
    default void getName()
    {
        System.out.println("My name");
    }
}
public class Ques7 implements MyInterface {
    public  void getName()
    {
        System.out.println("this is my name");
    }
    public static void main(String[] args) {

    Ques7 obj = new Ques7();
    obj.getName();
    }
}
