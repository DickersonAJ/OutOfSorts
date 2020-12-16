import java.util.Arrays;
public class tester{

  public static void main(String[] args){
    int[] nums = new int[5];
    nums[0] = 4;
    nums[1] = 3;
    nums[2] = 5;
    nums[3] = 1;
    nums[4] = 2;
    Sorts.bubbleSort(nums);
    System.out.println(Arrays.toString(nums));
  }

}
