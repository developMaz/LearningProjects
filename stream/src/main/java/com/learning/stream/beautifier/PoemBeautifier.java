package com.learning.stream.beautifier;

public class PoemBeautifier {

    public void beauty(String text, PoemDecorator poemDecorator){
        String beautifiedText = poemDecorator.decorate(text);
        System.out.println(beautifiedText);
    }
}
