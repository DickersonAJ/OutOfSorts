public class Sorts{

  public static void bubbleSort(int[] data){
    int temp = 0;
    boolean swap = false;
    for (int i = 0; i < data.length - 1; i++) {

      if (data[i] > data[i+1]) {
        swap = true;
        temp = data[i];
        data[i] = data[i+1];
        data[i+1] = temp;
      }

      if (swap == false) {
        i = data.length;
      }
      swap = false;

    }

  }

}
