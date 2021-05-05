package lab_11;

public class TakeSomeFromArray extends Thread{
    private String[] array;
    private int numberOfReplacements;

    @Override
    public void run() {
        while (currentNumberOfReplacements < numberOfReplacements){
            int findAt = fintItem();
            if ()
        }
    }

    private String stringToBeReplacements;
    private int currentNumberOfReplacements = 0;

    public TakeSomeFromArray(String[] array, int numberOfReplacements, String stringToBeReplacements, int currentNumberOfReplacements) {
        this.array = array;
        this.numberOfReplacements = numberOfReplacements;
        this.stringToBeReplacements = stringToBeReplacements;
        this.currentNumberOfReplacements = currentNumberOfReplacements;
    }
}
