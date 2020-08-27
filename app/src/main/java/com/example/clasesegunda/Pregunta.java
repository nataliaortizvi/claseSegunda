package com.example.clasesegunda;

public class Pregunta {
    public String pregu;
    public int numPregun;
    public String respu;

    public Pregunta() {
        this.pregu = pregu;
        this.respu = respu;
        this.numPregun = 0;

    }

    public void operar(){

        this.numPregun = (int) (Math.random()*19);

        switch(numPregun){
            case 0:
                pregu = "12x3";
                respu = "36";
                break;
            case 1:
                pregu = "8x4";
                respu = "32";
                break;
            case 2:
                pregu = "2x10";
                respu = "20";
                break;
            case 3:
                pregu = "30/6";
                respu = "30";
                break;
            case 4:
                pregu = "7x10";
                respu = "70";
                break;
            case 5:
                pregu = "3x7";
                respu = "21";
                break;
            case 6:
                pregu = "24+14";
                respu = "38";
                break;
            case 7:
                pregu = "45-21";
                respu = "24";
                break;
            case 8:
                pregu = "33-10";
                respu = "23";
                break;
            case 9:
                pregu = "17+5";
                respu = "22";
                break;
            case 10:
                pregu = "15/3";
                respu = "5";
                break;
            case 11:
                pregu = "30x2";
                respu = "60";
                break;
            case 12:
                pregu = "18/6";
                respu = "3";
                break;
            case 13:
                pregu = "9x4";
                respu = "36";
                break;
            case 14:
                pregu = "22x2";
                respu = "4";
                break;
            case 15:
                pregu = "15+11";
                respu = "26";
                break;
            case 16:
                pregu = "33/3";
                respu = "11";
                break;
            case 17:
                pregu = "26-22";
                respu = "4";
                break;
            case 18:
                pregu = "19x4";
                respu = "76";
                break;
            case 19:
                pregu = "10+34";
                respu = "44";
                break;



        }
    }

    public int getNumPregun() {
        return numPregun;
    }

    public void setNumPregun(int numPregun) {
        this.numPregun = numPregun;
    }

    public String getPregu() {
        return pregu;
    }

    public void setPregu(String pregu) {
        this.pregu = pregu;
    }

    public String getRespu() {
        return respu;
    }

    public void setRespu(String respu) {
        this.respu = respu;
    }
}
