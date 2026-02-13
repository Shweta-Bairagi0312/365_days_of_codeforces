
import java.util.*;
 
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        char firstchar = Character.toupperCase(str.charAt(0));
        String res = firstchar + str.subString(1);
        
        System.out.println(res);
        
    }
    
}
