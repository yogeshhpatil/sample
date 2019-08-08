package com.sample.app.designPatterns.observer;

public class TestObserverPattern {
    public static void main(String[] args) {
        UserOne userOne = new UserOne();
        UserTwo userTwo = new UserTwo();
        UserThree userThree = new UserThree();

        NotificationPublisher notificationPublisher = new NotificationPublisher();
        notificationPublisher.subscribe(userOne);
        notificationPublisher.subscribe(userTwo);

        Message message1  = new Message("Channel1","www.xyz.com","Notification from channel 1");
        notificationPublisher.notifyUpdate(message1);

        notificationPublisher.subscribe(userThree);

        System.out.println();

        Message message2  = new Message("Channel2","www.xyz.com","Notification from channel 2");
        notificationPublisher.notifyUpdate(message2);

        notificationPublisher.unsubscribe(userOne);

        System.out.println();

        notificationPublisher.notifyUpdate(message2);
    }
}
