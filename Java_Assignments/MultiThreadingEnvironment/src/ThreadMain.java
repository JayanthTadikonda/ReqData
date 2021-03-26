public class ThreadMain {

    public static void main(String[] args) {

        MultiThread nt = new MultiThread("Thread1");

        nt.start();

        MultiThread nt1 = new MultiThread("Thread2");

        nt1.start();
    }
}
