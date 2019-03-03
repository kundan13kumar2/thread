package com.thread.learn;

public class Basic extends Thread {

    @Override
    public void run() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Basic t1 = new Basic();
      //  Thread t2 = new Thread(new Basic(), "B");
        t1.start();
       // t2.start();
    }
}
