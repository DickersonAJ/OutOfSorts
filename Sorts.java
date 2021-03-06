import java.util.Arrays;

public class Sorts{

  public static void bubbleSort(int[] data){
    int temp = 0;
    boolean noswap = true;
    if (data.length > 1){

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

  public static void selectionSort(int[] data){
    int temp = 0;
    if (data.length > 1) {
      for (int i = 0; i < data.length; i++) {
        temp = data[i];
        int smallest = i;
        for (int j = i; j < data.length; j++) {
          if (data[j] < data[smallest]) {
            smallest = j;
          }
        }
        data[i] = data[smallest];
        data[smallest] = temp;
      }
    }
  }

  public static void insertionSort(int[] data){
    int temp = 0;
    for (int i = 1; i < data.length; i++) {
      if (data[i] < data[i-1]){
        temp = data[i];
        for (int j = i - 1; j >= 0; j--) {
          if (temp < data[j]) {
            data[j+1] = data[j];
            if (j==0){
              data[0]=temp;
            }
          }
          else{
            data[j+1] = temp;
            j=-1;
          }
        }
      }
    }
  }

}
