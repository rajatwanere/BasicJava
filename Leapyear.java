package com.demojava;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("enter year");
        int year =sc.nextInt();
        if((year % 400==0) || ((year%4==0 && year % 100 !=00))){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }

    }

    }

}
