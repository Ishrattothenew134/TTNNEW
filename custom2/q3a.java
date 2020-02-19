// Q.3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
//ClassNotFoundException
package custom2;
public class q3
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

        }catch (ClassNotFoundException e)

        {
            e.printStackTrace();
        }
    }
}
