package com.sample.app.designPatterns.strategy;

public class FileReader {
    private IReadStrategy readStrategy;

    public void setReadStrategy(IReadStrategy readStrategy) {
        this.readStrategy = readStrategy;
    }

    public void read() {
        readStrategy.readFile();
    }
}
