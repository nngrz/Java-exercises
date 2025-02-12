public class FirstLastChars {

    public static String characters(String s, int n) {
        if (n > s.length()) {
            return null;
        }

        StringBuilder str = new StringBuilder();

        // print characters frontward
        for (int i = 0; i < n; i++) {
            str.append(s.charAt(i));
        }

        // print characters backward
        for (int j = s.length() - 1; j > s.length() - 1 - n; j--) {
            str.append(s.charAt(j));
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(FirstLastChars.characters("abcdef", 2));
        System.out.println(FirstLastChars.characters("AbdefGHI", 3));
        System.out.println(FirstLastChars.characters("AbdefGHI", 10));
        System.out.println(FirstLastChars.characters("AbdefGHI", 8));
    }
}
