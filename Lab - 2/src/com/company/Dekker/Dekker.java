package com.company.Dekker;

public class Dekker implements Lock{
    protected int turn = 1;
    protected boolean[] wantCS = {false, false};



    @Override
    public void requestCS(int i) {
//    i = 0 hoặc 1
        int j = 1 - i;
        this.wantCS[i] = true;
        while (this.wantCS[j]) {
            if (this.turn == j) {
                this.wantCS[i] = false;
                while (turn == j);
                wantCS[i] = true;
            }
        }
    }

    @Override
    public void releaseCS(int i) {
        turn = 1 - i;
        this.wantCS[i] = false;
    }


}
