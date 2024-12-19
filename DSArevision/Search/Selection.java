// codde of finding maximum element in the array
// public class Selectionsort{
//     public static void main(String[] args) {
//         int[]arr = {4,5,1,2,3};
//       int ans = getMax(arr,0,5);
//       System.out.println(ans);
        
//     }
//     static int getMax(int[]arr,int start,int end){
//         int max = arr[start];
//         for(int i= start+1;i<end;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
        
//     }
// }




// function of finding maximum value without return type
// public class Selectionsort {
//     public static void main(String[] args) {
//         int[]arr = {4,2,1,2,3};
//       getMax(arr,0,5);
        
//     }
//     static void getMax(int[]arr,int start,int end){
//         int max = arr[start];
//         for(int i= start+1;i<end;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//                 System.out.println(max);
//             }
//         }
    
        
//     }
// }









// class Main {
//     public static void main(String[] args) {
//         int[]arr = {4,2,1,2,3};
//       getMax(arr,0,5);
        
//     }
//     static void getMax(int[]arr,int start,int end){
//         int max = arr[start];
//         for(int i= start+1;i<end;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//                 System.out.println(max);
//             }
            
           
//             }
              
//                 System.out.println("Maxmimum vale :"+max);
              
//         }
    
        
    
// }







// swapping code

// public class Selectionsort{
//     public static void main(String[] args) {
        
//     }

//     static void swap(int[]arr, int first, int second){
//         int temp = first;
//         first = second;
//         second = temp;


//     }
// }






// main code of selection sort
public class Selection{
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
    









