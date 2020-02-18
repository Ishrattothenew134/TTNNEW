/*Q3. Write a program to find the number of occurrences of a character in a string without using loop? */
package custom;

class  q3 {
    static int countOccurences(String someString, char searchedChar, int index) {
        if (index >= someString.length()) {
            return 0;
        }

        int count = someString.charAt(index) == searchedChar ? 1 : 0;
        return count + countOccurences(someString, searchedChar, index + 1);
    }

    public static void main(String[] args) {
        int m = q3.countOccurences("elephant",'e',0);
        System.out.println(m);
    }
}