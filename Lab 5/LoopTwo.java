
/**
 * Write a description of class LoopTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class LoopTwo
{
  private int[] numbers;
  private double sum;
  public LoopTwo() {
      numbers = new int[100];
      loadRandom(numbers);
    }
  public void loadRandom(int[] numbers) {
    for(int i=0; i < numbers.length; i++){
        numbers[i] = (int)(Math.random()*100 +1);
    }
    }
  public void printArray(){
      for (int i= 0; i< numbers.length; i++) {
        //if(i%10 = 0){
        System.out.println(numbers[i]);
        }
        }
  public double findAverage(double sum){
     for (int i=0; i<numbers.length; i++){
          sum = sum + numbers[i];
        }
     return sum;
    }
}
