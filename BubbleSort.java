public class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {15,14,21,4,3,8,12};
        int n =arr.length;
        bubble(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(+arr[i]+",");
        }
    }

    // Compare two adajecent element swap them
    // Not suitable for large datasets
    //Time complexity O(n2)

    public static void bubble(int[] arr, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;

                }
              
            }
        }
    }
}