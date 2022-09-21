package org.example;

public class CallbackDemo {
    public static void main(String[] args) {

        System.out.println("Main thread is running!");

    }

    public void runningAsync() {
        System.out.println("Running on a seperate thread!");
        sleep(1000);
    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}