package com.company;

import com.company.attNumber.Thread_Fibonacci;
import com.company.attNumber.Thread_Prime;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int check = 0;
        int n = sc.nextInt();
        do {
            if (n > 0) {
                check++;
            } else {
                System.out.println("Nhập lại! Độ dài mảng phải > 0");
            }
        }while (check < 0);

//        Khai báo mảng
        int[] M = new int[n];
        nhapMang(M);
        xuatMang(M);

        Thread T1 = new Thread_Prime(n, M);
        System.out.println("\n");
        Thread T2 = new Thread_Fibonacci(n, M);
        T1.start();
        try {
            T1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        T2.start();
    }


    //    Nhập mảng
    private static void nhapMang(int[] M) {
        for (int i = 0; i <M.length; i++) {
//            System.out.print("Nhập phần tử thứ M["+i+"]= ");
//            M[i] = new Scanner(System.in).nextInt();
            Random random = new Random();
            M[i] = random.nextInt(100);
        }
    }

//    Xuất mảng
    private static void xuatMang(int[] M) {
        System.out.println("Mảng sau khi nhập là:");
        for (int i = 0; i <M.length; i++) {
            System.out.print("M["+i+"]= "+M[i]+"    ");
        }
        System.out.print("\n");
    }
}
