package training.core.config;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

import javax.print.DocFlavor;

@ObjectClassDefinition(name = "API Config",description = "Student Config Service")
public @interface APIConfig {
    @AttributeDefinition(name = "API KEY",type= AttributeType.INTEGER,description = "Key")
    int API_KEY() default 1;

    @AttributeDefinition(name = "URL",type= AttributeType.STRING,description = "Url")
    String URL() default "http://google.com";
}
