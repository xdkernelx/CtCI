import java.util.*;

public class MergeSort {
  
  private static int[] MergeSort(int[] arr) {
    int length = arr.length;
    int m = length / 2;
    int[] result = new int[length];
    if (length < 2) {
      return arr;
    } else if (length == 2){
      if (arr[0] > arr[1]) {
        result[0] = arr[1];
        result[1] = arr[0];
      } else {
        return arr;
      }
      return result;
    }
    
    return result;
  }
  
  
  public static void main(String[] args) {
    int[] data = {1,4};
    
    data = MergeSort(data);
    
    for (int e : data) {
      System.out.println(e);
    }
    
  }
}