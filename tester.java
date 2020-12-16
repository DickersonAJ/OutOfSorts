import java.util.Arrays;
import java.util.Random;
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

    int[] nums1 = new int[0];
    Sorts.bubbleSort(nums1);
    System.out.println(Arrays.toString(nums1));

    int[] nums2 = new int[5];
    nums2[0] = 4;
    nums2[1] = -3;
    nums2[2] = 5;
    nums2[3] = 4;
    nums2[4] = 4;
    Sorts.bubbleSort(nums2);
    System.out.println(Arrays.toString(nums2));

    int[] nums3 = new int[5];
    nums3[0] = 5;
    nums3[1] = 4;
    nums3[2] = 3;
    nums3[3] = 2;
    nums3[4] = 1;
    Sorts.bubbleSort(nums3);
    System.out.println(Arrays.toString(nums3));

    int[] nums4 = new int[5];
    nums4[0] = 1;
    nums4[1] = 2;
    nums4[2] = 3;
    nums4[3] = 4;
    nums4[4] = 5;
    Sorts.bubbleSort(nums4);
    System.out.println(Arrays.toString(nums4));

    int[] nums5 = new int[5];
    nums5[0] = 1;
    nums5[1] = 1;
    nums5[2] = 1;
    nums5[3] = 1;
    nums5[4] = 1;
    Sorts.bubbleSort(nums5);
    System.out.println(Arrays.toString(nums5));

    int[] nums6 = new int[5];
    Random rng = new Random();
    for (int i = 0; i < 5; i++){
      nums6[i] = rng.nextInt() % 1000;
    }
    Sorts.bubbleSort(nums6);
    System.out.println(Arrays.toString(nums6));

    int[]nums8 = new int[5];
    Sorts.bubbleSort(nums8);
    System.out.println(Arrays.toString(nums8));

    rng = new Random();
    int thismightbeamistake = Math.abs(rng.nextInt() % 1000);
    int[] nums7 = new int[thismightbeamistake];
    rng = new Random();
    for (int i = 0; i < thismightbeamistake; i++) {
      nums7[i] = rng.nextInt() % 1000;
    }
    Sorts.bubbleSort(nums7);
    System.out.println(Arrays.toString(nums7));

  }

}
