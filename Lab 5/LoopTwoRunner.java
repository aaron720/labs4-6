
/**
 * Write a description of class LoopTwoRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopTwoRunner
{
    public static void main(String args[]){
        int[] numbers = new int[100];
        LoopTwo newLoop = new LoopTwo();
        newLoop.loadRandom(numbers);
        System.out.println(newLoop.printArray() + "\n");
        System.out.println("\n" + "The average is " + newLoop.findAverage());
    
    }
}
