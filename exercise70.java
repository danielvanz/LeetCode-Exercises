public class exercise70 {
    public static int climbStairs(int n) {

        int[] pos = new int[n + 1];
        pos[0] = 1;
        pos[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            pos[i] = pos[i - 1] + pos[i - 2];
        }

        return pos[n];

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
