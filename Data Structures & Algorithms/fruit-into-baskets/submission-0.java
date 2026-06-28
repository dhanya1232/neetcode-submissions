class Solution {
    public int totalFruit(int[] fruits) {    //What is the longest continuous part that contains only 2 different numbers?
        int n = fruits.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(fruits[j]);

                if (set.size() > 2) break;

                max = Math.max(max, j - i + 1);
            }
        }

        return max;
        
    }
}