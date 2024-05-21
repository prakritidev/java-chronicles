package twopointer;

class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String input = "AABABBA";
        Integer result = getSolution(input, 2);
        System.out.println(result);
    }

    private static Integer getSolution(String s, int k) {
        int[] arr = new int[26];
        char[] ans = s.toCharArray();
        int left = 0;
        int max = 0;
        for (int right = 0; right < ans.length; right++) {
            arr[ans[right] - 'A']++;
            max = Math.max(max, arr[ans[right] - 'A']);

            while ((right - left + 1) - max > k) {   //main line...
                arr[ans[left++] - 'A']--;
            }
        }
        return ans.length - left;
    }
}

