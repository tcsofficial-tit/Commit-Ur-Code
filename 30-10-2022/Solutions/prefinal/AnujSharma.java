import java.util.Scanner;

class AnujSharma {    
 public static void main(String[] args) {        
      int S;     

           Scanner sc=new Scanner(System.in);  

           System.out.println("Size of array : ");

         S=sc.nextInt();

        int[] arr = new int[10];  

           System.out.println("Enter the elements of the array: "); 
           for(int i=0; i<S; i++)  
           {  
           arr[i]=sc.nextInt();  
           }      

          System.out.println("how many step you want to rotate : "); 

          int n =sc.nextInt(); 
            
        for(int i = 0; i < n; i++){    
            int j, last;    
        last = arr[S-1];    
            
            for(j = S-1; j > 0; j--){    
                arr[j] = arr[j-1];    
            }    
               
            arr[0] = last;    
        }    
        
        System.out.println();    
      
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< S; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }    
}