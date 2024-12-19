public class Cyclicsort{
    public static void main(String[] args) {
        int[]arr = {3,5,2,1,4};
        cyclic(arr);
        for(int i =0 ;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

        
    }

    static void cyclic(int[]arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != correctIndex){
                swap(arr,arr[i],arr[correctIndex]);
            }
                else{
                    i++;
                }



            }
        }
    

    static void swap(int[]arr ,int i,int j){
        int temp = i;
         i= j;
         j = temp;
    }
}