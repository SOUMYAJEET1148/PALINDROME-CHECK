import java.util.Scanner;

public class palindromecheck {
    public static void main(String[] args) {
        Scanner r2 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Any String");
            String str = r2.nextLine();
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    System.out.println("Not a Palindrome String");
                    System.out.println("---------------------");
                    break;
                } else {
                    System.out.println("Palindrome String");
                    System.out.println("-----------------");
                    break;
                }
            }
        }
    }
}