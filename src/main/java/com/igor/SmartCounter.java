package com.igor;

import java.util.Scanner;
public class SmartCounter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++){
            System.out.println(i);
        }
        sc.close();
    }
}