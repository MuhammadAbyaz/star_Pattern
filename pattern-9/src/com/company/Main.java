package com.company;

public class Main {

    public static void main(String[] args) {
     char k;
        for(int i = 1; i<=4; i++){
            k = 'A';
            for(int j = 1; j<= 7; j++){
                if(j<=5-i || j>=i+3){
                    System.out.print(k);
                    if (j<4) {
                        k++;
                    }else {
                        k--;
                    }
                }else {
                    System.out.print(' ');
                    if (j ==4){
                        k--;
                    }
                }
            }
            System.out.println();
        }
    }
}