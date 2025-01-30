public class EverySecond {
    public static String everysec(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("You must enter at least 1 character.");
        } 
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {          
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(everysec("ABCDE")); // Expected output: "ACE";
            System.out.println(everysec("123456")); // Expected output: "135";
            System.out.println(everysec("")); // Will throw an exception;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
