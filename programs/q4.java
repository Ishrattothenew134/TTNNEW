/*Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters
In A String
 */
package custom;

    class Ques4 {
    public static void main(String[] args) {
        int ctr_upper=0, ctr_lower=0, ctr_digit=0, ctr_special = 0 , wh=0;
        String str = "a 2QuiCk @ brOwn fox jumped over 1 #lazy doG";
        char s2[] = str.toCharArray();

        for(int i =0; i< s2.length;++i)
        {
            if(Character.isUpperCase(s2[i]))
            {
                ctr_upper++;
            }
            else if(Character.isLowerCase(s2[i]))
            {
                ctr_lower++;
            }
            else if(Character.isDigit(s2[i]))
            {
                ctr_digit++;
            }
            else if(Character.isWhitespace(s2[i]))
            {
                wh++;
            }
            else
            {
                ctr_special++;
            }
        }
        int efflen = str.length()-wh;
        //float per_upper = (ctr_upper*100)/efflen;
        //System.out.println(per_upper);
        //float percentage_upper = (ctr_upper/efflen)*100;
        System.out.println("\n Upper Case character count:"+ (ctr_upper*100)/efflen+"%");
        System.out.println("\n Lower case character count:"+(ctr_lower)*100/efflen+"%");
        System.out.println("\n digit count:"+(ctr_digit)*100/efflen+"%");
        System.out.println("\n Special character count:"+(ctr_special)*100/efflen+"%");
    }
}
