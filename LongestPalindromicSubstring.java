public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                String sub = s.substring(i, j);

                if (isPalindrome(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }

        return longest;
    }

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "babad";
        String s2 = "cbbd";

        System.out.println(longestPalindrome(s1));
        System.out.println(longestPalindrome(s2));
    }
}
