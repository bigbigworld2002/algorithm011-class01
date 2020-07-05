class IsAnagram{
    public boolean isAnagram(String s, String t) {
        //包含相同的字母和次数
        HashMap<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }

            if (map.get(c) > 0) {
                map.put(c, map.get(c) - 1);
                continue;
            }

            return false;
        }

        boolean result = true;
        for (Map.Entry<Character, Integer> x : map.entrySet()) {
            if (x.getValue() != 0) {
                result = false;
            }
        }

        return result;

    }
}