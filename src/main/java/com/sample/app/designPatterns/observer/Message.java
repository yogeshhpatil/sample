package com.sample.app.designPatterns.observer;

public class Message {
    private String channelName;
    private String url;
    private String description;

    public Message(String channelName, String url, String description) {
        this.channelName = channelName;
        this.url = url;
        this.description = description;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "channelName='" + channelName + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
