import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements between 0 and 9:-");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        helper(arr);
        System.out.println("The Sorted Array:-");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void helper(int[] arr)
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int[] count=new int[max+1];
        Arrays.fill(count,0);
        int[] tempArr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            tempArr[--count[arr[i]]]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=tempArr[i];
        }
    }
}
