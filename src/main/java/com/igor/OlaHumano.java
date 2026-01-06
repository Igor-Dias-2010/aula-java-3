package com.igor;

import java.util.Scanner;

public class OlaHumano{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + "! Welcome to Java.");

        sc.close();
    }
}