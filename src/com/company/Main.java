package com.company;

public class Main{
    public static double maxElement( double array[] ){
        double max = Double.NEGATIVE_INFINITY;
        for( int i=0; i<array.length; ++i ){
            if( array[i] > max){
                max = array[ i ];
            }
        }
        return max;
    }
    public static void getBit(int number, int order){
        if(order < 0){
            System.out.println(1);
        }
        else
            System.out.println(((number & (1 << (order - 1))) >> (order - 1)));
    }


    public static void main(String[]args) {
        String szo = "ALMAFA";
        String name = "Laszlo Hunor";
        String mono = "L" + "H";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        System.out.println(mono);
        for (int i = 0; i < szo.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(szo.charAt(i));
            }
            System.out.println();
        }
        String names ="Laszlo Hunor Miklos Akos";
        if (names.length() == 0)
            return;
        //split the string using 'space'
        //and print the first character of every word
        String words[] = names.split(" ");
        for(String word : words) {
            System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        }
        System.out.println();
        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));

        getBit(13,1);



    }
}