import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:-");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        helper(arr,0,arr.length-1);
        System.out.println("The Sorted Array:-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void helper(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
       int pivot=arr[low];
       int i=low;
       int j=high;
       int temp;
       while(i<j) {
           while (arr[i] <= pivot && i<high) {
               i++;
           }
           while (arr[j] > pivot && j>low) {
               j--;
           }
           if(i<j) {
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
        temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        helper(arr,low,j-1);
        helper(arr,j+1,high);
    }
}
