import java.util.*;
 
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int k = input.nextInt();
        
        
        int []arr = new int[n];
        
        for(int i = 0; i<n; i++){
            
            a[i] = input.nextInt();
        }
        
        int threshold = a[k-1];
        int count = 0;
        
        for(int i = 0; i<n; i++){
            if(a[i]>=threshold && a[i]>0){
                count++;
            }
        }
        System.out.println(count);
      
    }
}
