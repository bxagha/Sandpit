package Java1.Thread;

/**
 * Created by Сергей on 23.03.2016.
 */
public class MainClass {
    static class Recipe implements Runnable{

        void cook(){
            for (int i = 0; i < 10; i++) {
                System.err.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        public void run() {
            cook();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread first = new Thread(new Recipe());
            first.start();
        }
        System.err.println(Thread.currentThread().getName());
    }
}
