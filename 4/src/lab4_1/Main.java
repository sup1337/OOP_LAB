package lab4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

///




    }

    public static void readFilePrintItsLineNumbered( String fileName ){
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
