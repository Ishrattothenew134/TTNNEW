package Implementations;

import Services.StudentConfigurationService;
import Services.StudentService;
import Services.StudentService2;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.osgi.service.component.annotations.Component;

@Component
public class MyClass {
   //@Reference
    //StudentConfigurationService studentConfigurationService;
   StudentService studentService;
}

   // @org.osgi.service.component.annotations.Reference(target = "(name=version2)")
    //NewService newService;
//}