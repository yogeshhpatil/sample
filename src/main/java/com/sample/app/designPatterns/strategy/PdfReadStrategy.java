package com.sample.app.designPatterns.strategy;

public class PdfReadStrategy implements IReadStrategy {
    @Override
    public void readFile() {
        System.out.println("Reading .pdf file");
    }
}
