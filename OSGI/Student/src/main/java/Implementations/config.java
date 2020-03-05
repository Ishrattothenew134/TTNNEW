package Implementations;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "student configuration for marks&classsize")
public @interface config {
    @AttributeDefinition(name = "maximum class size", type = AttributeType.INTEGER)
    int CLASS_SIZE() default 12;

    @AttributeDefinition(name =  "passing marks", type = AttributeType.INTEGER)
    int PASSING_MARKS()  default 33;

}
