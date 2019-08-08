package com.sample.app.designPatterns.observer;

public class UserOne implements IObserver {

    @Override
    public void showNotification(Message msg) {
        System.out.println("User 1 notified -> " + msg);
    }
}
