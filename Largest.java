public class Largest{  
    public static void main(String[] args) {   
        int [] arr = new int [] {25, 11, 7, 75, 56};  
        //Initialize max with first element of array.  
        int max = arr[0]; 
        for (int i = 0; i < arr.length; i++) { 
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}  