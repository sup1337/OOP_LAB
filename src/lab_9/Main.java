package lab_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args){
        ArrayList<MyDate> datetimes= new ArrayList<>();
        int year=2021;
        for(int i=0; i<10; i++){
            int momnth= ThreadLocalRandom.current().nextInt(1, 13);
            int day= ThreadLocalRandom.current().nextInt(1, 32);
            MyDate date= new MyDate(year, momnth, day);
            if(date.isValid())
            {
                datetimes.add(date);
                i++;
            }
        }
        System.out.println("Before Sorting: ");
        for (MyDate data:datetimes)
        {
            System.out.println(data);
        }

        //rendezes
        Collections.sort(datetimes);


        System.out.println("After Sorting: ");
        for (MyDate data:datetimes)
        {
            System.out.println(data);
        }


    }
}
