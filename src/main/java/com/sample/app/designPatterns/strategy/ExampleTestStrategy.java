package com.sample.app.designPatterns.strategy;

public class ExampleTestStrategy {
    public static void main(String args[]) {

        FileReader fileReader = new FileReader();

        fileReader.setReadStrategy(new PdfReadStrategy());
        fileReader.read();

        fileReader.setReadStrategy(new XlsReadStrategy());
        fileReader.read();

        fileReader.setReadStrategy(new TextReadStrategy());
        fileReader.read();
    }
}
