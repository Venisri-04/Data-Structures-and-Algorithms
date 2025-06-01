import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args)
    {
        System.out.println("Insertion sort");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n=scanner.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements:-");
        for(int i=0;i<n;i++) {
            arr[i]=scanner.nextInt();
        }
        scanner.close();
        helper(arr);
        System.out.println("The Sorted Array:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void helper(int[] arr)
    {
        int temp;
        int key;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            int j=i-1;
            while(j>=0 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
