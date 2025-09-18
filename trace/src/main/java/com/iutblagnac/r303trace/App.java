package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    public static String hello() {
        return "Hello World!";
    }

    public static String hello(String param) {
        return param;
    }

    /*
    @param int x 
    @param int y
    @return x*y
     */
    public static int multiply(int x, int y){
        return x*y;
    }
}
