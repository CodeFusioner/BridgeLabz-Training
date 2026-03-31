package functionalInterface;
public class BackgroundJob {
    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Background job running...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Job completed");
        };

        Thread thread = new Thread(job);
        thread.start();
    }
}
