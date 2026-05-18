class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;

        for(int i = 0; i < flowerbed.length; i++) {

            // check current empty
            if(flowerbed[i] == 0) {

                // check left
                int left = (i == 0) ? 0 : flowerbed[i - 1];

                // check right
                int right = (i == flowerbed.length - 1)
                            ? 0
                            : flowerbed[i + 1];

                // both sides empty
                if(left == 0 && right == 0) {

                    flowerbed[i] = 1;
                    count++;
                }
            }
        }

        return count >= n;
    }
}