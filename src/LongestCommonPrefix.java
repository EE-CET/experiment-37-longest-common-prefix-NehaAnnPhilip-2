import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read N
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        // TODO: Handle the newline character after reading N
        sc.nextLine();

        if (n <= 0) {
            System.out.println("-1");
            return;
        }

        // TODO: Read N strings into an array
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        // TODO: Find the longest common prefix
        // Hint: Start with the first string as the 'prefix'. 
        String prefix = strs[0];

        for (int i = 1; i < n; i++) {
            // Shorten the prefix until it is found at the start (index 0) of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    break;
                }
            }
        }

        // TODO: If prefix is empty, print "-1", otherwise print the prefix.
        if (prefix.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(prefix);
        }

        sc.close();
    }
}
