public class exercise557 {
    public String reverseWords(String s) {

        String[] strings = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {

            char[] chars = strings[i].toCharArray();

            for (int j = 0; j < chars.length; j++) {
                result.append(chars[chars.length - j - 1]);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}
