package com.company;

public class Main {
    public static void main(String[]args){
    Auto auto1=new Auto("Kek");
    System.out.println(auto1.toString());
    for (int i = 0 ; i<12 ;i++ )
    auto1.novelSebesseg();
    System.out.println(auto1.toString());
        Auto auto2=new Auto("Sarga");
        for (int i = 0 ; i<6 ;i++ )
            auto2.novelSebesseg();
        System.out.println(auto2.toString());
    }
}
