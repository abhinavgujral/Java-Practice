package practice;// write a program that creates two threads and makes them print 1-10 using join method()

import java.util.concurrent.atomic.AtomicInteger;

public class TwoThreadCounter extends Thread{

    public static void main(String[] args) throws InterruptedException {

        //Integer counter =0;
        AtomicInteger counter =new AtomicInteger(0);
        Thread t1 = new Thread(()->{ counter.incrementAndGet();
            System.out.println(counter+" t1");});
        Thread t2= new Thread(()->{counter.incrementAndGet();
        System.out.println(counter+" t1");});

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}

//public class SharedCounterExample {
//    public static void main(String[] args) throws InterruptedException {
//        AtomicInteger counter = new AtomicInteger(0);
//
//        Thread t1 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.incrementAndGet();
//            }
//        });
//
//        Thread t2 = new Thread(() -> {
//            for (int i = 0; i < 1000; i++) {
//                counter.incrementAndGet();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        // Wait for threads to complete
//        t1.join();
//        t2.join();
//
//        System.out.println("Counter value: " + counter.get());
//    }
//}