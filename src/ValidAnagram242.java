import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }

        int [] al = new int[26];
        int [] als = new int[26];

        for(char c : s.toCharArray()){
            al[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            als[c - 'a']++;
        }

        return Arrays.equals(als,al);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isAnagram = isAnagram(sc.nextLine(),sc.nextLine());
        System.out.println(isAnagram);
    }
}
