import java.util.Scanner;

public class MergeSort {
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
        divideAndMerge(arr,0,arr.length-1);
        System.out.println("The Sorted Array:-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static void divideAndMerge(int[] arr,int low,int high)
    {
        if(low==high)
        {
            return;
        }
        int mid=(low+high)/2;
        divideAndMerge(arr,low,mid);
        divideAndMerge(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    private static void merge(int[] arr,int low,int mid,int high)
    {
        int[] arr1=new int[high-low+1];
        int index=0;
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high) {
            if (arr[i] <= arr[j]) {
                arr1[index++] = arr[i];
                i++;
            } else {
                arr1[index++] = arr[j];
                j++;
            }
        }
        while(i<=mid) {
            arr1[index++]=arr[i];
            i++;
        }
        while(j<=high) {
            arr1[index++]=arr[j];
            j++;
        }
        for(int k=low;k<=high;k++) {
            arr[k]=arr1[k-low];
        }
    }
}
