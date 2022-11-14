public class nQueensProblem {
    void solve(int[] A, int n, int currentColumn) {
        if (currentColumn == n) {
            System.out.println(A);
        } else {
            for (int i = 0; i < n; i++) {
                A[i] = currentColumn;
                if (hasConflict(A) && i == n - 1) {
                    return; // Return?
                } else if (hasConflict(A)) {
                    continue;
                }
                solve(A, n, currentColumn++);
            }
        }
    }
}
