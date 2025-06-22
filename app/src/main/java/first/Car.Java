package first;

@Component
public class Car {
    @Autowired
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
        System.out.println("Car started.");
    }

    public void stop() {
        engine.stop();
        System.out.println("Car stopped.");
    }

    // Getter and Setter
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

// class Engine {
//     private String type;

//     public Engine(String type) {
//         this.type = type;
//     }

//     public void start() {
//         System.out.println(type + " engine started.");
//     }

//     public void stop() {
//         System.out.println(type + " engine stopped.");
//     }

//     public String getType() {
//         return type;
//     }

//     public void setType(String type) {
//         this.type = type;
//     }
// }