
class Solution {
    public int rowWithMax1s(int arr[][]) {
      int maxRowIndex = -1; // Initialize the index of the row with the most 1s
        int max = 0;          // Initialize the maximum count of 1s found so far

        for (int i = 0; i < arr.length; i++) {
            int c = 0; // Initialize the count of 1s for the current row
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    c++;
                }
            }
            if (c > max) {
                max = c;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }
}
