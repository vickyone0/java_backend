package first;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type;

    public Engine(@Value("${engine.type}")String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine started.");
    }

    public void stop() {
        System.out.println(type + " engine stopped.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
