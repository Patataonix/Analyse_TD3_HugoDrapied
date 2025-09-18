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
    
    
    /**
    @param int x premier entier
    @param int y second entier
    @return x+y addition des deux
     */
    public static int addition(int param1, int param2){
        return param1+param2;
    }

    /**
    @param int x premier entier 
    @param int y second entier
    @return x*y renvoie le produit des deux
     */
    public static int multiply(int x, int y){
        return x*y;
    }
}
