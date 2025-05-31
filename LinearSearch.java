public class LinearSearch {
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,16,26,8,30};
        int key=8;
        int index =helper(arr,key);
        if(index==-1) {
            System.out.println(key+" not found");
        }
        else {
            System.out.println(key+" found at index "+index);
        }
    }
    private static int helper(int[] arr,int key) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
}