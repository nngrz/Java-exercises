public class EverySecond {
    public static String everysec(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("You must enter at least 1 character");
        } 
        
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {          
            string.append(s.charAt(i));
        }
        return string.toString();
    }

    public static void main(String[] args) {
        System.out.println(everysec("ABCDE"));
        System.out.println(everysec("123456")); // Expected output: "135"
        System.out.println(everysec("")); // Will throw an exception
    }
}
