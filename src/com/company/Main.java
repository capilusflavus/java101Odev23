package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int n=scanner.nextInt();
        double toplam=0.0;
        for (int i=1; i<=n; i++){
            toplam+= (1.0/i);
        }
        System.out.println("Harmonik seriniz = " + toplam);
    }
}

