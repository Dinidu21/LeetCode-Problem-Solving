import java.util.Scanner;

public class ValidPalindrome125 {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        StringBuilder given = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                given.append(Character.toLowerCase(c));
            }
        }
        //System.out.println(given);
        StringBuilder ans = new StringBuilder();
        for (int i = given.toString().length()-1; i >= 0; i--) {
                ans.append(given.charAt(i));
        }
        //System.out.println(ans);
        return given.compareTo(ans) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean isPalindrome = isPalindrome(sc.nextLine());
        System.out.println(isPalindrome);

    }
}
