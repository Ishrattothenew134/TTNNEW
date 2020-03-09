package Services;

import implementation.BlogsCollector;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class Test {
    @Reference
    BlogsCollector blogsCollector;
}
