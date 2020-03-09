package implementation;

import Services.services;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(service = BlogsCollector.class)
public class BlogsCollector {

//    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Reference(target = "(version=tech)")
    services techblog;

    @Reference(target = "(version=market)")
    services marketblog;

    @Activate
    void activate() {
//        logger.info("blog collector active");
//        logger.info(techblog.getBlogCategory());
//       // String rank_techblog = String.valueOf(techblog.getRank());
//        logger.info("Rank :" +techblog.getRank());
//        logger.info(marketblog.getBlogCategory());
//       // String rank_marktblog = String.valueOf(marketblog.getRank());
//        logger.info("Rank : " +marketblog.getRank());
    }

    @Deactivate
    void deactivate(){
//        logger.info("service shutdown");
    }
}
