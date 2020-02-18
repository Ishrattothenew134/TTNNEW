package custom;
/*Q1. Write a program to replace a substring inside a string with other string.*/
public class q1 {

        void replaceSubstring(String s, String s1, String s2) {
            if (s.contains(s1)) {
                String str = s.replace(s1,s2);
                System.out.println(str);
            }
        }

    public static void main(String ar[]) {
        q1 objq = new q1();
        objq.replaceSubstring("ishrat","is" ,"nu");
    }
}
