 import java.util.*;
 class arraydemo{
 public static void main (String[] args){
    int arr[] = new int [10];
    int max=0;
    Scanner sc = new Scanner(System.in);
    for (int i = 0 ; i <10 ; i++){
        System.out.println("Enter the element at "+(i+1));
           arr[i]=sc.nextInt();
    
         }
         for (int i = 0 ; i<10 ; i++){
            
            if( arr[i]> max){
               max = arr[i];
        
            }

     }
 System.out.println(max);
 }
 }
 
 