package Configurations;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface MarketBlogConfig {

    @AttributeDefinition(name ="Blog category",type = AttributeType.STRING)
    String setBlogcategory() default "Marketing";

    @AttributeDefinition(name="Rank",type = AttributeType.INTEGER)
    int setRank() default 2;
}
