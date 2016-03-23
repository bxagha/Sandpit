package Java1.Thread;

/**
 * Created by Сергей on 23.03.2016.
 */
public class MainClass {
    static class Recipe implements Runnable{
        void cook(){
            System.out.println("...");
        }

        @Override
        public void run() {
            System.out.println("...");
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread first = new Thread();
        first.setName("first");
        first.start();
        System.out.println(first.getName());
    }
}
