public class exercise38 {
    public static String countAndSay(int n) {

        String s = Integer.toString(n);
        char[] chars = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        int seq = 1;
        char c = chars[0];

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == c) {
                seq++;
            } else {
                builder.append(seq);
                builder.append(c);
                seq = 1;
                c = chars[i];
            }
        }

        builder.append(seq);
        builder.append(c);

        return builder.toString();

    }

    public static void main(String[] args) {
        int n = 3322251;
        System.out.println(countAndSay(n));
    }
}
