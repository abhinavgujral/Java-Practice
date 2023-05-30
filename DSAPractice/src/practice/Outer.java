package practice;

import java.util.ArrayList;
import java.util.List;

public class Outer {
    public static void main(String[] args) throws InterruptedException {

        List<String> myList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            myList.add("some string");
        }
        myList=null;

        System.gc();
        String str = new String("Hello World");
        str = null;


        Thread.sleep(10000);
        System.out.println("end of main");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method called");
    }
}

//public class Outer {
//    public static int temp1 = 1;
//    private static int temp2 = 2;
//    public int temp3 = 3;
//    private int temp4 = 4;
//
//    public static class Inner {
//        private static int temp5 = 5;
//
//        private static int getSum() {
//            return (temp1 + temp2 + temp3 + temp4 + temp5);
//        }
//    }
//
//    public static void main(String[] args) {
//        Outer.Inner obj = new Outer.Inner();
//        System.out.println(obj.getSum());
//    }
//}




