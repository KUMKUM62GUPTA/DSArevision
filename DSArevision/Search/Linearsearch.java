// public class Linearsearch{
//     public static void main(String[] args) {
//         int[]nums = {23,45,1,2,8,19,-3,16,-11};
//         int target = 19;
//         int ans = linearSearch(nums,target);
//         System.out.println(ans);
//     }

//     static int linearSearch(int[]nums,int target){
//         if(nums.length == 0){
//             return -1;
//         }

//         for(int index = 0; index<nums.length ;index++){
//             if(nums[index] == target){
//                 return index;



//             }
//         }
//         return -1;
//     }
// }








// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//        int[]nums = {23,45,1,2,8,19,-3,16,-11};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the target :");
//        int target = sc.nextInt();
//         //int target = 19;
        
//         int ans = linearSearch(nums,target);
//         System.out.println(ans);
//     }

//     static int linearSearch(int[]nums,int target){
//         if(nums.length == 0){
//             return -1;
//         }

//         for(int index = 0; index<nums.length ;index++){
//             if(nums[index] == target){
//                 return index;



//             }
//         }
//         return -1;
//     }
// } 







// online
// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//        int[]nums = {23,45,1,2,8,19,-3,16,-11};
//     //   int start = 1;
//     //   int end = 3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the target :");
//        int target = sc.nextInt();
//         //int target = 19;
        
//         int ans = linearSearch(nums,target,1,3);
//         System.out.println(ans);
//     }

//     static int linearSearch(int[]nums,int target,int start,int end){
//         if(nums.length == 0){
//             return -1;
//         }

//         for(int index = start; index<=end ;index++){
//             if(nums[index] == target){
//                 return index;



//             }
//         }
//         return -1;
//     }
// } 








// import java.util.Scanner;
// class Main {
//     public static void main(String[] args) {
//        int[]nums = {23,45,1,2,8,19,-3,16,-11};
//        System.out.println(min(nums));
       
//     }
    
//     static int min(int[]arr){
//         int ans =arr[0];
//         for(int i =1;i<arr.length;i++){
//             if(arr[i]<ans){
//                 ans = arr[i];
//             }
//         }
//         return ans;
//     }
// }

class Main {
    public static void main(String[] args) {
        String []arr = {"helllo", "world","java","programming"};
        String key = "java";
        int index = search(arr,key);
        System.out.println(index);
        
    }
    public static int search(String[]arr, String key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
    }
}

