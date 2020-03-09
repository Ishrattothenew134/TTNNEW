package Configurations;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition
public @interface TechBlogconfig {

    @AttributeDefinition(name = "Blog Category" , type = AttributeType.STRING)
    String setBlogCategory() default "Technology";

    @AttributeDefinition(name="Rank",type = AttributeType.INTEGER)
    int setRank() default 1;

}

