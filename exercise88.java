public class exercise88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastIndex = m + n - 1;

        while (m > 0 && n > 0) {
            // System.out.println(m + " " + n);
            if (nums1[m - 1] < nums2[n - 1]) {
                nums1[lastIndex] = nums2[n - 1];
                n -= 1;
            } else {
                nums1[lastIndex] = nums1[m - 1];
                m -= 1;
            }
            lastIndex -= 1;
        }

        while (n > 0) {
            nums1[lastIndex] = nums2[n - 1];
            lastIndex = n - 2;
            n = n - 1;

        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }

    }

    public static void main(String[] args) {
        int[] testArray1 = new int[] { 4, 5, 6, 0, 0, 0 };
        int[] testArray2 = new int[] { 1, 2, 3 };

        merge(testArray1, 3, testArray2, 3);
    }
}
