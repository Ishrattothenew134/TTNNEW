package Services;

import Implementations.config;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.Designate;

import java.util.ArrayList;
import java.util.List;

@Designate(ocd= config.class)
@Component(property = "name=n1",immediate = true)
public class ClassConfigurationService implements StudentService2 {
    @Activate
    private config c;
    ArrayList al = new ArrayList();
    public boolean isClassLimitReached(List al){
        if(al.isEmpty()){
            return false;
        }
        else {
            int s = al.size();
            if(s==c.CLASS_SIZE())
            {
                return true;
            }
            else
            {
                return false;
            }

        }
    }

    public int getPassingMarks(){
        return c.PASSING_MARKS();
    }

}
