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
    } else {
      int[] first = MergeSort(Arrays.copyOfRange(arr, 0, m));
      int[] second = MergeSort(Arrays.copyOfRange(arr, m, length));
      result = Merge(first, second);
    }
    
    return result;
  }
  
  private static int[] Merge(int[] first, int[] second) {
    int length = first.length + second.length;
    int[] result = new int[length];
    int index = 0;
    int first_index = 0;
    int second_index = 0;
    
    while (index < length) {
      if (first[first_index] > second[second_index]) {
        results[index] = second[second_index];
        second_index++;
      } else {
        results[index] = first_index[first_index];
        first_index++;
      }
      index++;
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