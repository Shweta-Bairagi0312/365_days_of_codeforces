import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
 
        String vowels = "aoyeuiAOYEUI";
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
 
            if (vowels.indexOf(ch) == -1) {   // not a vowel
                result.append(".");
                result.append(Character.toLowerCase(ch));
            }
        }
 
        System.out.println(result.toString());
    }
}
