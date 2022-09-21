package org.example.callbackdemo;

public interface Callback {

    void pushComplete();

    void pushData(String data);

    void pushError(Exception ex);
}
