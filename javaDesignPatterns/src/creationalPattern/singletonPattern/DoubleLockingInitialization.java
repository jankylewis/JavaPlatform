package creationalPattern.singletonPattern;

public class DoubleLockingInitialization {

    private static DoubleLockingInitialization INSTANCE = null;

    private DoubleLockingInitialization(){}

    public static DoubleLockingInitialization getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleLockingInitialization.class) {
                if (INSTANCE == null)
                    INSTANCE = new DoubleLockingInitialization();
            }
        }

        return INSTANCE;
    }
}
