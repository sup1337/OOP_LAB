package com.company;

public class Datum {
    private int d, ho, nap;

    //Konstruktor
    public Datum(int pev, int pho, int pnap) {
        if (isValidDate(pev, pho, pnap)) {
            ev = pev;
            ho = pho;
            nap = pnap;
        }

        public static boolean szokoEv ( int year){
            boolean leap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                } else
                    leap = true;
            } else
                leap = false;
        }
        static boolean isValidDate ( int d, int m, int y){
            if (y > 9999 || y < 1800)
                return false;
            if (m < 1 || m > 12)
                return false;
            if (d < 1 || d > 31)
                return false;
            if (m == 2) {
                if (szokoEv(y))
                    return (d <= 29);
                else
                    return (d <= 28);
            }
            if (m == 4 || m == 6 ||
                    m == 9 || m == 11)
                return (d <= 30);
            return true;
        }
    }
}
