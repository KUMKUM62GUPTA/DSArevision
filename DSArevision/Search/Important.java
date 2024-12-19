// maximum element index
public class Important {
    public static void main(String[] args) {
        int[]arr = {4,5,1,2,3};
        selection(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        

    }

    static void selection(int[]arr){
        for(int i =0;i<arr.length;i++){
        int end = arr.length -i-1;

            // Find the index of the maximum element in the range [0, end]
            int maxIndex = max(arr, 0, end);

            // Swap the maximum element with the last element in the unsorted part
            swap(arr, maxIndex, end);
        }
    }
    static int max(int[]arr,int start,int end){
       
        int max =start;
        for(int i = start;i<end;i++){
        if(arr[i]>arr[max]){

            max = i;
            return max;
            
        }
        
    }
    return start;
   
}

static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
} 






static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
    

