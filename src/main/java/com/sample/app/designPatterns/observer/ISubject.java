package com.sample.app.designPatterns.observer;

public interface ISubject {
    void subscribe(IObserver IObserver);
    void unsubscribe(IObserver IObserver);
    void notifyUpdate(Message message);
}
