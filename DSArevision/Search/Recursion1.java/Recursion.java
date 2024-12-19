
//     public static void main(String[] args) {
//         print(1);
        
//     }
//     static void print(int n){
//         System.out.println(n);
//         print(n+1);
//     }
// }









// class Main {
//     public static void main(String[] args) {
//         print(1);
        
//     }
//     static void print(int n){
//         if(n==5){
//         System.out.println(5);
//         return;
//         }
//         System.out.println(n);
//         print(n+1);
//     }
// }





// public class Recursion{
//     public static void main(String[] args) {
//        int ans = fibo(5);
//        System.out.println(ans); 

//     }
//     static int fibo(int n){
//         if(n<2){
//             return n;
//         }
//         return fibo(n-1)+fibo(n-2);
//     }
// }







public class Recursion {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,55,66,78};
        //int target = 1;
        System.out.println(search(arr,0,arr.length-1,1));
        
    }
    static int search(int[]arr,int s,int e,int target){
           
        if(s>e){

            return -1;
        }
        
            int mid = s+(e-s)/2;

            if(mid == target){
                return mid;
            }
            else if(target<arr[mid]){
               return search(arr,s,mid-1,target);
            }
            else {
               return search(arr,mid+1,e,target);
            
           
        }

    }
   
}
