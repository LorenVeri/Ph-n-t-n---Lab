package com.company.attNumber;

public class Thread_Fibonacci extends Thread {
    private int n;
    private int[] M;

    public Thread_Fibonacci() {

    }

    public Thread_Fibonacci(int n, int[] M) {
        this.n = n;
        this.M = M;
        perfectSquare(M);
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



    //    Kiểm tra số chính phương
    private static boolean checkperfectSquare(int number) {
        int cp = (int) Math.sqrt(number);
        if (cp*cp == number) {
            return true;
        }
        return false;
    }
    private static void perfectSquare(int[] M) {
        System.out.println("Số chính phương là: ");
        int sumPerfect = 0;
        for (int i = 0; i <M.length; i++) {
            if(checkperfectSquare(M[i]) == true) {
                System.out.print(M[i]+"\t");
                sumPerfect += M[i];
            }
//            System.out.print(+sumPerfect);
        }
    }

}
