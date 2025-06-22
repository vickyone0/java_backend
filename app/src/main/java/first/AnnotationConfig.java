package first;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "first")
@PropertySource("classpath:application.properties")
public class AnnotationConfig {
    
}
