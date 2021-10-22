package com.company.Dekker;

public class Thread_Mutex extends Dekker implements Runnable{
    Lock lock;
    int tid;
    String name;
    public Thread_Mutex() {
    }


    public Thread_Mutex(Lock lock, int tid) {
        this.lock = lock;
        this.tid = tid;
    }

    public void CS() {
        System.out.println("Đã đi vào khu vực quan trọng 1 ");
        System.out.println("Đã đi vào khu vực quan trọng 2 ");
    }

    public void nonCS() {
        System.out.println("Ngoài khu vực quan trọng của ");
        System.out.println("Ngoài khu vực quan trọng của ");
    }

    @Override
    public void run() {
        lock.requestCS(tid);
        CS();
        lock.releaseCS(tid);
        nonCS();
    }
}
