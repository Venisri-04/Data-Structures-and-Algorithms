import java.util.Scanner;

public class BubbleSort {
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
    public static void helper(int[] arr)
    {
        int n=arr.length;
        int temp;
        boolean swapped=false;
        for(int i=1;i<arr.length;i++) { // no of passes (One pass = One highest element pops at end)
            for(int j=0;j<arr.length-i;j++) { //compares the adjacent elements in the unordered part)
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            {
                return;
            }
        }
    }
}
