class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int writeIndex = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[writeIndex] = nums1[p1];
                p1--;
            } else {
                nums1[writeIndex] = nums2[p2];
                p2--;
            }
            writeIndex--;
        }

        while (p2 >= 0) {
            nums1[writeIndex] = nums2[p2];
            p2--;
            writeIndex--;
        }
    }
}
