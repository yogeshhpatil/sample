package com.sample.app.designPatterns.strategy;

public class TextReadStrategy implements IReadStrategy {

    @Override
    public void readFile() {
        System.out.println("Reading .txt file");
    }
}
