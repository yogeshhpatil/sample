package com.sample.app.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher implements ISubject {
    private List<IObserver> users = new ArrayList<>();

    @Override
    public void subscribe(IObserver IObserver) {
        users.add(IObserver);
    }

    @Override
    public void unsubscribe(IObserver IObserver) {
        users.remove(IObserver);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (IObserver user : users) {
            user.showNotification(message);
        }
    }
}
