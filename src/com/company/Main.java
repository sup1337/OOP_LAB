package com.company;

public class Main{

    public static void main(String[]args){
        String word = "ALMAFA";
        String name = "Laszlo Hunor";
        String mono = "L" + "H";
        for(int i = 0 ; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        System.out.println(mono);
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
        String string = "Laszlo Benedek Kovacs";
        String[] parts = string.split(" ");
        System.out.println(string);

    }
}