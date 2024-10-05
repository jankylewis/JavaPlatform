package creationalPattern.singletonPattern;

public class ThreadsafeInitialization {
    
    private static ThreadsafeInitialization instance = null;

    private ThreadsafeInitialization(){}

    public static ThreadsafeInitialization getInstance() {

        synchronized (ThreadsafeInitialization.class) {
            if (instance == null)
                instance = new ThreadsafeInitialization();
        }

        return instance;
    }

    public static void main(String[] args) {

        ThreadsafeInitialization instance1 = ThreadsafeInitialization.getInstance();
        ThreadsafeInitialization instance2 = ThreadsafeInitialization.getInstance();

        System.out.println(instance1 == instance2);
    }
}