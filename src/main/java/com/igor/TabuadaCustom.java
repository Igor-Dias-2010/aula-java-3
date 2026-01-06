package com.igor;

import java.util.Scanner;

public class TabuadaCustom{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(number +  " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}