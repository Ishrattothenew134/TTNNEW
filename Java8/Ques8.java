//Q8.Implement multiple inheritance with default method inside  interface.
package Java8;

interface FirstInterface{
    default void sayHello() {
        System.out.println("in first interface");
    }
}

interface SecondInterface{
    default void sayHello(){
        System.out.println("in second interface");
    }
}

public class Ques8 implements FirstInterface,SecondInterface {
    public void sayHello(){
        System.out.println("in the main class");
    }
    public static void main(String[] args) {
        Ques8 obj = new Ques8();
        obj.sayHello();

    }
}
