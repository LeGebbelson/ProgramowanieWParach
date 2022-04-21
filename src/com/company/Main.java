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

    public static int intMin(int max, int min){
        if(max > min){
            return min;
        } else if ((max < min)) {
            return max;
        }
        return max;
    }
}
