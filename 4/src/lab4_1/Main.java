package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        readFilePrintItsLineNumbered(("lab4_1_input.txt"));
        readFilePrintItsLineNumbered(("lab4_1_input.csv"));
    }


    public static void readFilePrintItsLineNumbered( String fileName ){
// Open the file
        Scanner scanner = null;
        try {

            scanner = new Scanner( new File(fileName));
            //vagy itt
            for(int i=0; scanner.hasNextLine(); i++)
            {
                String line =scanner.nextLine();
                System.out.println(i + " " +line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //vagy itt
        //if(scanner != null)
        // for(int i=0; scanner.hasNextLine(); i++)
        //  {
        //     String line =scanner.nextLine();
        //     System.out.println(i + " " +line);
        // }

//...
    }

}