package custom2;
// Q7. WAP to convert seconds into days, hours, minutes and seconds.
import java.io.*;

class time
{
    static void Convert(int sec)
    {
        int day = sec / (24 * 3600);

        sec = sec % (24 * 3600);
        int hour = sec / 3600;

        sec %= 3600;
        int minutes = sec / 60 ;

        sec %= 60;
        int seconds = sec;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }

    public static void main (String[] args)
    {
        int sec = 879600;
        Convert(sec);

    }
}
