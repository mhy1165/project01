package com.mhy.bean;

import java.util.Arrays;

public class Coustmer {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Coustmer.main");
        System.out.println("args = " + args);
        for (int i = 0; i < 10; i++) {

        }
        for (String arg : args) {

        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println();
            System.out.println("arg = " + arg);
        }


    }


}