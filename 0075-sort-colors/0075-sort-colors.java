class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int noOfZero = 0, noOfOne = 0, noOfTwo = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZero++;
            else if (arr[i] == 1) noOfOne++;
            else if (arr[i] == 2) noOfTwo++;
        }

   
        for (int i = 0; i < n; i++) {
            if (i < noOfZero) arr[i] = 0;
            else if (i < noOfZero + noOfOne) arr[i] = 1;
            else arr[i] = 2;
        }
    }
}
