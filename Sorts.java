public class Sorts{

  public static void bubbleSort(int[] data){
    int temp = 0;
    boolean noswap = true;
    for (int i = 0; i < data.length - 1; i++) {
      for (int j = 0; j < data.length - 1; j++) {
        if (data[j] > data[j+1]) {
          noswap = false;
          temp = data[j];
          data[j] = data[j+1];
          data[j+1] = temp;
        }
      }
        if (noswap) {
          i = data.length;
        }
        noswap = true;
    }
  }

}
