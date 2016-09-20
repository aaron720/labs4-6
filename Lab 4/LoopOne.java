
/**
 * Write a description of class LoopOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoopOne
{
    int[] nums = new int[10];
    public LoopOne(){
    }
    public void loadArray(){
        for(int i=0; i<nums.length; i++) {
            nums[i] = i*5;
        }
    }
    public void printArray(){
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
