public class exercise11 {
    public static int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int max = 0;

        while (l != r) {
            int h = Math.min(height[l], height[r]);
            int length = r - l;
            if (h * length > max) {
                max = h * length;
            }

            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }

        return max;

    }

    public static void main(String[] args) {

        int[] a = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(a));
    }
}
