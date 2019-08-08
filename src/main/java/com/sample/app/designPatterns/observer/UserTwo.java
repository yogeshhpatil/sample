package com.sample.app.designPatterns.observer;

public class UserTwo implements IObserver {
    @Override
    public void showNotification(Message msg) {
        System.out.println("User 2 notified -> " + msg);
    }
}
