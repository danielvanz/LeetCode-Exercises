class exercise1342 {
    public int numberOfSteps(int num) {

        for (int i = 0;; i++) {

            if (num == 0) {
                return i;
            }

            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }

    }
}
