package creationalPattern.singletonPattern;

public class LazyInitialization {
    
    private static LazyInitialization instance = null;

    private LazyInitialization(){}

    public static LazyInitialization getInstance() {

        if (instance == null) 
            instance = new LazyInitialization();

        return instance;
    }

    public static void main(String[] args) {

        LazyInitialization instance1 = LazyInitialization.getInstance();
        LazyInitialization instance2 = LazyInitialization.getInstance();

        System.out.println(instance1 == instance2);
    }
}