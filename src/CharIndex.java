public class CharIndex {
    
    static int indOf(String s, char c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
    
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(CharIndex.indOf("abcde", 'c'));
        System.out.println(CharIndex.indOf("abcde", 'f'));
    }
}
