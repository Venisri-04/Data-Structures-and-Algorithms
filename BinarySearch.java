public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,8,16,26,30};
        int key=26;
        int index =helper(arr,key);
        if(index==-1) {
            System.out.println(key+" not found");
        }
        else {
            System.out.println(key+" found at index "+index);
        }
    }
    private static int helper(int[] arr,int key) {
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high) {
            mid=(low+high)/2;
            if(arr[mid]==key) {
                return mid;
            }
            else if(arr[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
