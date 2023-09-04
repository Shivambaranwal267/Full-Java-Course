import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    bubblesortHelper(arr);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }

  public static void bubblesortHelper(int arr[]) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}





// void bubblesort(int arr[])
// {
//     for (int i = 0; i < arr.length; i++)
//     {
//         bool swapped = false;
//         for (int j = 0; j < arr.length() - 1 - i; j++)
//         {
//             if (arr[j] > arr[j + 1])
//             {
//                 swap(arr[j], arr[j + 1]);
//                 swapped = true;
//             }
//             if (swapped == false)
//                 break;
//         }
//     }
// }
