package lab_11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String[] sa_array=new String[10];
        Arrays.fill(sa_array," ");
        AddToArray addition1 = new AddToArray(sa_array);
        addition1.start();
    }
}
