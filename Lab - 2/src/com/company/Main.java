package com.company;

import com.company.Dekker.Dekker;
import com.company.Dekker.Lock;
import com.company.Dekker.Thread_Mutex;

public class Main{

    public static void main(String[] args) {
	// write your code here

        Lock lock = new Dekker();
        Thread_Mutex T1 = new Thread_Mutex(lock, 0);
        Thread_Mutex T2 = new Thread_Mutex(lock, 1);


        Thread run1 = new Thread(T1);
        Thread run2 = new Thread(T2);

        run1.start();
        run2.start();


    }

}
