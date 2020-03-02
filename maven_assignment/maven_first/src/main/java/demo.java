import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class demo {
    public static void main(String[] args) {
        BasicConfigurator.configure();
    Logger log = Logger.getLogger(demo.class.getName());
    log.info("ishrat");
    }
}
