package com.company.attNumber;

public class Thread_Prime extends Thread {
    private int n;
    private int[] M;

    public Thread_Prime() {
    }

    public Thread_Prime(int n, int[] M) {
        this.n = n;
        this.M = M;
        primeNumber(M);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getM() {
        return M;
    }

    public void setM(int[] M) {
        this.M = M;
    }

    //    Kiểm tra số nguyên tố
    private static boolean checkprimeNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            for(int i =2; i <= Math.sqrt(number); i++){
                if(number % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void primeNumber(int[] M) {
        System.out.println("Số nguyên tố là: ");
        for (int i = 0; i <M.length; i++) {
            if(checkprimeNumber(M[i])) {
                System.out.print(M[i]+"\t");
            }
        }
    }
}
