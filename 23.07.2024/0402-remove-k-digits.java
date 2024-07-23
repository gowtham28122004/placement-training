class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        int removed = 0;

        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (removed < k && !s.isEmpty() && s.peek() > c) {
                s.pop();
                removed++;
            }
            s.push(c);
        }

        // If we haven't removed k characters, remove from the end
        while (removed < k) {
            s.pop();
            removed++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        result.reverse();

        // Remove leading zeros
        int nonzeroIndex = 0;
        while (nonzeroIndex < result.length() && result.charAt(nonzeroIndex) == '0') {
            nonzeroIndex++;
        }
        
        result = new StringBuilder(result.substring(nonzeroIndex));

        // If the result is empty, return "0"
        return result.length() == 0 ? "0" : result.toString();
    }
}
