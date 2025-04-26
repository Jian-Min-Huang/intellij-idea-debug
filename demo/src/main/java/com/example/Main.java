package com.example;

public class Main {
    public static void main(String[] args) {
        ToString toString = new ToString("Hello", 123, true);
        NoToString noToString = new NoToString("Hello", 123, true);

        System.out.println("Hello world!");
    }
}
