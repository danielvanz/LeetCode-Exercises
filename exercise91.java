public class exercise91 {
    public static int numDecodings(String s) {

        char[] message = s.toCharArray();
        int[] v = new int[s.length()];
        v[0] = 1;

        if (message[0] == '0') {
            return 0;
        }

        for (int i = 1; i < message.length; i++) {

            int temp = Integer.parseInt(s.substring(i - 1, i + 1));

            if (message[i - 1] == '0' || message[i] == '0' || temp > 26) {
                v[i] = v[i - 1];
            } else if (temp <= 26) {
                v[i] = v[i - 1] * 2;
            }
        }

        return v[v.length - 1];

    }

    public static void main(String[] args) {
        String s = "2342123412341234";
        System.out.println(numDecodings(s));
    }
}