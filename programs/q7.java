// Q7. Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively
package custom;
class myStaticClass {
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

class myClass {
    public static void main(String args[]) {
        System.out.println(myStaticClass.firstName);
        myStaticClass.setLastName("Mahajan");
        System.out.println(myStaticClass.lastName);
        myStaticClass.age = 22;
        System.out.println(myStaticClass.age);

    }
}
