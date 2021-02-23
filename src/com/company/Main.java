package com.company;


/**
 * Ami megvan megfelelő, de nem sok.
 * Próbáljuk még jobban rendezni a kódot. A main zsúfolt.
 * Használjuk ki az IDE nyújtotta lehetőségeket.
 * A projekt legyen mindig egy külön folderben, és úgy töltsd fel.
 * Ha még egy projekt kellett volna ehhez a laborhoz összevisszaság lett volna.
 */
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
public static void CountBits(int n ){
    System.out.println(Integer.toBinaryString(n));
    System.out.println(Integer.bitCount(n));
}

    /**
     * A main függvényt inkább hagyjuk legfelül. Ez a standard általában.
     *
     */

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
        /**
         * Kerüljük a redundáns kódrészeket. Ahol kell legyen ellenőrzés, de ahol felesleges ott ne legyen.
         * Itt még az IDE is jelzi, hogy nem szükséges.
         */
        if (names.length() == 0)
            return;
       
        String words[] = names.split(" ");
        for(String word : words) {
            System.out.print(Character.toUpperCase(word.charAt(0)) + " ");
        }
        System.out.println();
        double x[] ={7, 1, -3, 45, 9};
        System.out.printf("MAX: %6.2f\n", maxElement( x ));
        int n = 31;
        getBit(13,1);
        for(int i=0 ; i<n; i++){
            CountBits(i);
        }



    }
}