public class homeworkset5 {

    public static void seq(int[] A, int n, int l) {

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println();

        for (int i = 0; i < l; i++) {
            if (A[i] == n) {
                A[i] = 1;
            } else {
                A[i] += 1;
                seq(A, n, l);
                return;
            }
        }

    }

    public static void main(String[] args) {
        int[] A = new int[] { 1, 1, 1 };
        int n = 4;
        int l = 3;

        seq(A, n, l);

    }

}
