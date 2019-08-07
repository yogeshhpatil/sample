package com.sample.app.designPatterns.strategy;

public class XlsReadStrategy implements IReadStrategy {
    @Override
    public void readFile() {
        System.out.println("Reading .xls file");
    }
}
