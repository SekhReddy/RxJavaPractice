package org.example;

import org.example.Observer;

public interface SubjectLibrary {

    public void subscribeObserver(Observer ob);

    public void unsubscribeObserver(Observer ob);

    public void notifyObservers();
}
