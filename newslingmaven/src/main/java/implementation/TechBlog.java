package implementation;

import Configurations.TechBlogconfig;
import Services.services;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Designate(ocd= TechBlogconfig.class)
@Component(service = services.class, property = {"version=tech"})
public class TechBlog implements services {

    private TechBlogconfig techBlogconfig;
    private Logger logger = LoggerFactory.getLogger(this.getClass());



    public String getBlogCategory()
    {
        return techBlogconfig.setBlogCategory();
    }
    public int getRank()
    {
        return techBlogconfig.setRank();
    }

    @Activate
    void activate(final TechBlogconfig techBlogconfig)
    {
        logger.info("tech blog started");
        this.techBlogconfig = techBlogconfig;

    }

}
