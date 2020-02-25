package custom;

/* Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
  */

class Ques10 {
    public static void main(String [] agrs) {
        addinteger(8,6);
        addinteger(2.5,2.6);
        multiplyinteger(2.5f,7.6f);
        multiplyinteger(7,2);
        concate("Java ", "Developer");
        concate("Java", " AMC ", "Developer");
    }
    static void addinteger(int num1, int num2) {
        System.out.println("Result 1 : " + (num1 + num2));
    }
    static void addinteger(Double num1, Double num2) {
        System.out.println("Result 2 : " + (num1 + num2));
    }
    static void multiplyinteger(Float num1, Float num2) {
        System.out.println("Result 3 : " + (num1 * num2));
    }
    static void multiplyinteger(int num1, int num2) {
        System.out.println("Result 4 : " + (num1 * num2));
    }
    static void concate(String str1, String str2) {
        System.out.println("Result 5 : " + (str1 + str2));
    }
    static void concate(String str1, String str2, String str3) {
        System.out.println("Result 6 : " + (str1 + str2 + str3));
    }
}
