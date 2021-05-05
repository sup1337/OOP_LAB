package lab_11;

import java.util.Random;

public class AddToArray extends Thread{

    public static Random random=new Random();
    private String[] array;

    public AddToArray( String[] array) {
        this.array = array;
    }


    @Override
    public void run() {
        while (true){
            work();
            //print array
            prinArray();
            try {
                Thread.sleep(2000);//alszik 2 mpet
            }catch (InterruptedException e){
                e.printStackTrace();
                break;
            }


        }


    }

    private void prinArray() {
        System.out.println("\n*******************************************************************************\n");
        System.out.println("\n" +Thread.currentThread().getName()+" print started...");
        for(String s: array)
        {
            System.out.println(s+ " ");
        }
        System.out.println("\n" +Thread.currentThread().getName()+" print ended...");

    }


    private void work(){
        String character= String.valueOf((char)(random.nextInt('z'- 'a' )+'a'));
        String generatedstring= character.repeat(3);

        //minpoz
        int minPosition= findMinPosition();
        //generalt string behelyezese a tombbe
        array[minPosition]=generatedstring;
    }

    private int findMinPosition()
    {
        String min= array[0];
        int minPoz=0;
        for(int i=1; i<array.length; i++)
        {
            if(array[i].compareTo(min)<0)
            {
                min=array[i];
                minPoz=i;
            }
        }
        return minPoz;
    }
}
