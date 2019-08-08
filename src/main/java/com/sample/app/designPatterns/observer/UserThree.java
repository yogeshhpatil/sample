package com.sample.app.designPatterns.observer;

public class UserThree implements IObserver {
    @Override
    public void showNotification(Message msg) {
        System.out.println("User 3 notified -> " + msg);
    }
}
