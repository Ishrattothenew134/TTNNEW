package training.core.Services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import training.core.config.APIConfig;

@Component(service = services.class,immediate = true)
@Designate(ocd = APIConfig.class)
public class APIService implements services {

    @Activate
    private APIConfig apiConfig;

    @Activate
    void activate(){
        Logger log = LoggerFactory.getLogger(this.getClass());
        log.info(apiConfig.URL());
        log.info(""+apiConfig.API_KEY());
    }
}