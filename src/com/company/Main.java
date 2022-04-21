package com.company;

public class Main {

    public static void main(String[] args) {
    }

    public static int intMax(int a, int b){
        if(a > b){
            return a;
        } else if ((a < b)) {
            return b;
        }
        return a;
    }

    public static int intMin(int higher, int lower){
        if(higher > lower){
            return lower;
        } else if ((higher < lower)) {
            return higher;
        }
        return higher;
    }
}
