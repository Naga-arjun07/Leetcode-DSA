class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[^a-z]");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (String word : banned) {
            if (map.containsKey(word)) {
                map.remove(word);
            }
        }
        String res = "";
        for (String word : map.keySet()) {
            if (res.equals("") || map.get(word) > map.get(res))
                res = word;
        }
        return res;
    }
}