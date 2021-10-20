class Question6 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }

    public static String convert(String s, int numRows) {
        if (s != null) {
            if (s.length() == numRows) {
                return s;
            }
            if (s.length() > 0) {
                char[] arr = s.toCharArray();
                StringBuilder[] sb = new StringBuilder[numRows];
                int index = 0;
                for (int i = 0; i < sb.length; i++) {
                    sb[i] = new StringBuilder();
                }

                while (index < s.length()) {
                    for (int i = 0; i < sb.length && index < s.length(); i++) {
                        sb[i].append(arr[index++]);
                    }
                    for (int i = sb.length - 2; i > 0 && index < s.length(); i--) {
                        sb[i].append(arr[index++]);
                    }
                }
                StringBuilder result = new StringBuilder();
                for (StringBuilder str : sb) {
                    result.append(str);
                }
                return result.toString();

            } else
                return "";
        }

        return "";

    }
}