package org.example.callbackdemo;

public class CallbackDemo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread is running!");

        Runnable r = new Runnable() {
            @Override
            public void run() {
                new CallbackDemo().runningAsync(new Callback() {

                    @Override
                    public void pushComplete() {
                        System.out.println("CallBack complete!");
                    }


                    @Override
                    public void pushData(String data) {
                        System.out.println("Callback data: " + data);
                    }

                    @Override
                    public void pushError(Exception ex) {
                        System.out.println("Callback error: " + ex);
                    }

                });
            }
        };

        Thread t = new Thread(r);
        t.start();

        Thread.sleep(2000);

        System.out.println("Main thread is done!");

    }

    public void runningAsync(Callback callback) {
        System.out.println("Running on a separate thread!");
        sleep(1000);
        callback.pushData("Data1");
        callback.pushData("Data2");
        callback.pushData("Data3");

        callback.pushError(new RuntimeException("Error!"));
        callback.pushComplete();
    }

    private void sleep(int duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}