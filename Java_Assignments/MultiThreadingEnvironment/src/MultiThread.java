import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThread implements Runnable{

    private Thread t;
    private String name;

    public MultiThread(String name) {
        this.name = name;
        System.out.println("Creating Thread 1 ");
    }

    @Override
    public void run() {

        try {
            CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();

            numbers.add(11);
            numbers.add(87);
            numbers.add(5);
            numbers.add(113);

            Iterator<Integer> it = numbers.listIterator();
            for(Integer e: numbers){
                numbers.add(123);
                System.out.println(it.next());
            }

            System.out.println(numbers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start(){
        System.out.println("Starting thread");
        if(t == null)
            t = new Thread(this, name);
            t.start();
    }
}
