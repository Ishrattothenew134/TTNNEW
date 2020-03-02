import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class simplejavademo {
    public static void main(String[] args) {
        BasicConfigurator.configure();
    Logger log = Logger.getLogger(simplejavademo.class.getName());
    log.info("yo!..Project without using maven");
    }
}
