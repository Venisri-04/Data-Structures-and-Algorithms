import java.util.Arrays;
import java.util.Scanner;

public class RadixSort {
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
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        for(int pos=1;max/pos>0;pos=pos*10)
        {
            countSort(arr,pos);
        }
    }
    public static void countSort(int[] arr,int pos)
    {
        int[] count=new int[10];
        Arrays.fill(count,0);
        int[] tempArr=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            count[(arr[i]/pos)%10]++;
        }
        for(int i=1;i<count.length;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            tempArr[--count[(arr[i]/pos)%10]]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=tempArr[i];
        }
    }
}
