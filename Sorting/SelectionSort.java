import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args)
    {
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
    public static void helper(int[] arr) {
        int min;
        int minIndex=-1;
        int temp;
        for(int i=0;i<arr.length;i++) {
            min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++) {
                  if(arr[j]<min)
                  {
                      min=arr[j];
                      minIndex=j;
                  }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
