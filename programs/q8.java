/* Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed
string using String Buffer
 */
package custom;
public class q8 {
    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("assassination");
        StringBuffer newsbr = new StringBuffer();
        newsbr = sbr.reverse();
        System.out.println("reversed string: "+newsbr);
        newsbr.replace(4,10,"");
        System.out.println("\nedited string: "+newsbr);
    }
}
