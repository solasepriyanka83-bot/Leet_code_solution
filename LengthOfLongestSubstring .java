public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            String current = "";

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (current.indexOf(ch) != -1) {
                    break;
                }

                current += ch;
                maxLength = Math.max(maxLength, current.length());
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + lengthOfLongestSubstring(s1));

        System.out.println("Input: " + s2);
        System.out.println("Output: " + lengthOfLongestSubstring(s2));

        System.out.println("Input: " + s3);
        System.out.println("Output: " + lengthOfLongestSubstring(s3));
    }
}
