import java.util.Scanner;

public class jewels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of test cases");
        int t = sc.nextInt();
        while (t != 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == ch) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
