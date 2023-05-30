package practice;

import java.util.*;

public class Main extends Thread{

    public static Integer counter=0;
public static synchronized void counter (Boolean state){
    if(state)
        counter++;
    else counter--;


}
    public static void main(String[] args) {
 Thread t1 = new Thread();
 Thread t2 = new Thread();
 int counter =0;

 t1.start();
 t2.start();





    }


}
