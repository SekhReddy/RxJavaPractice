package org.example.librarydemo;

public interface SubjectLibrary {

    public void subscribeObserver(Observer ob);

    public void unsubscribeObserver(Observer ob);

    public void notifyObservers();
}
