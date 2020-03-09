package implementation;

import Configurations.MarketBlogConfig;
import Services.services;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = services.class, property = {"version=market"})
@Designate(ocd= MarketBlogConfig.class)
public class MarketBlog implements services {

    private MarketBlogConfig marketBlogConfig;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public String getBlogCategory() {
        return marketBlogConfig.setBlogcategory();
    }

    @Override
    public int getRank() {
     return marketBlogConfig.setRank();
    }

    @Activate
    void activate(MarketBlogConfig marketBlogConfig){
        logger.info("Market blog started");
        this.marketBlogConfig=marketBlogConfig;
    }
}
