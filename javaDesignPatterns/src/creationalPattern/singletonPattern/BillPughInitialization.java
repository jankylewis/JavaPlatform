package creationalPattern.singletonPattern;

public class BillPughInitialization {

    private static int _instanceCount = 0;

    private BillPughInitialization(){
        ++_instanceCount;
        System.out.println("Constructor gets called: " + _instanceCount);
    }

    private static class BillPughInstanceHolder {
        private static final BillPughInitialization INSTANCE = new BillPughInitialization();
    }

    public static BillPughInitialization getInstance(){
        return BillPughInstanceHolder.INSTANCE;
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            BillPughInitialization instance1 = BillPughInitialization.getInstance();
            System.out.println("Thread 1 instance: " + instance1.hashCode());
        });

        Thread thread2 = new Thread(() -> {
            BillPughInitialization instance2 = BillPughInitialization.getInstance();
            System.out.println("Thread 2 instance: " + instance2.hashCode());
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
