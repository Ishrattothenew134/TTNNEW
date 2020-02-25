// Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
package custom;
class MyStaticClass {
    static String firstName;
    static String lastName;  // static variable
    static int age;
    int j;

    // static block
    static {
        firstName = "Ishrat";
    }

    // static method
    static void setLastName(String lName){
        lastName = lName;
    }

}

class MyClass {
    public static void main(String args[]) {
        System.out.println(MyStaticClass.firstName);
        MyStaticClass.setLastName("Mahajan");
        System.out.println(MyStaticClass.lastName);
        MyStaticClass.age = 22;
        System.out.println(MyStaticClass.age);

    }
}
