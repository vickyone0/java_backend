package first;

import org.springframework.context.annotation.Bean;

public class BeanConfig {
    

    @Bean
    public Engine engine() {
        return new Engine("V8", "Ford");
    }
}
