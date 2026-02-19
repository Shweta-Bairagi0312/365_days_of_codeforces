import java.util.Scanner;
 
public class MaxWateredSections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] heights = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        
        int maxWatered = 0;
        
        for (int i = 0; i < n; i++) {
            int count = 1; // current section
            
            // Spread left
            int j = i - 1;
            while (j >= 0 && heights[j] <= heights[j + 1]) {
                count++;
                j--;
            }
            
            // Spread right
            j = i + 1;
            while (j < n && heights[j] <= heights[j - 1]) {
                count++;
                j++;
            }
            
            if (count > maxWatered) {
                maxWatered = count;
            }
        }
        
        System.out.println(maxWatered);
        sc.close();
    }
}
