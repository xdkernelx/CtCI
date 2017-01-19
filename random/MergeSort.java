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
      if (first_index < first.length && second_index < second.length) {
        if (first[first_index] > second[second_index]) {
          result[index] = second[second_index];
          second_index++;
        } else {
          result[index] = first[first_index];
          first_index++;
        }
        index++;
      } else if (first_index < first.length) {
        for (int i = first_index; i < first.length; i++) {
          result[index] = first[first_index];
          first_index++;
          index++;
        }
      } else {
        for (int i = second_index; i < second.length; i++) {
          result[index] = second[second_index];
          second_index++;
          index++;
        }
      }
    }
   
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter the number of values.");
    int n = scanner.nextInt();
    System.out.println("Please enter the numbers in any order.");
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
        a[i] = scanner.nextInt();
    }
    a = MergeSort(a);

    System.out.println(Arrays.toString(a));
  }
}