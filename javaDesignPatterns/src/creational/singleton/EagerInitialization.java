package creational.singleton;

public class EagerInitialization {
    
    private static final EagerInitialization INSTANCE = new EagerInitialization();
    
    private EagerInitialization() {}

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = EagerInitialization.getInstance();

        System.out.println(instance1 == instance2);
    }
}
