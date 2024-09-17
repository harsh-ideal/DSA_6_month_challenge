public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
       
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        
        String[] combinedWords = new String[words1.length + words2.length];
        System.arraycopy(words1, 0, combinedWords, 0, words1.length);
        System.arraycopy(words2, 0, combinedWords, words1.length, words2.length);

        List<String> uncommonWords = new ArrayList<>();

        for (String word : combinedWords) {
            if (countOccurrences(combinedWords, word) == 1) {
                uncommonWords.add(word);
            }
        }

        return uncommonWords.toArray(new String[0]);
    }

    private int countOccurrences(String[] words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }
}


Link:https://leetcode.com/problems/uncommon-words-from-two-sentences/?envType=daily-question&envId=2024-09-17