class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int nums3[] = new int[n];
        int index = 0;

        for (int i = 0; i < nums1.length; i++) {
            nums3[index++] = nums1[i];
        }

        for (int j = 0; j < nums2.length; j++) {
            nums3[index++] = nums2[j];
        }

        Arrays.sort(nums3);

        if (nums3.length % 2 == 0) {
            int mid1 = nums3[nums3.length / 2 - 1];
            int mid2 = nums3[nums3.length / 2];
            return (mid1 + mid2) / 2.0;
        } else {
            return nums3[nums3.length / 2];
        }
    }
}
