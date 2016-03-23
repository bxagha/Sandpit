package Java1.Thread;

/**
 * Created by Сергей on 23.03.2016.
 */
public class MainClass {
    static class Recipe implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println("...");
            System.err.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new Recipe());
        first.setName("first");
        first.start();
        Thread.sleep(3000);
        System.err.println(first.getName());
        System.err.println(Thread.currentThread().getName());
    }
}
