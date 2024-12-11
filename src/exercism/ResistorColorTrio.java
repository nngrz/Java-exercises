import java.util.Arrays;

class ResistorColorTrio {
    // If user input less than 3 colors, throw an exception
    String label(String[] colors) {
        if (colors.length < 3) {
            throw new IllegalArgumentException("User input is less than 3 colors");
        }

        int firstDigit = -1;
        int secondDigit = -1;
        int numberOfZero = -1;
        String[] COLOR_LIST = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        
        // Get first digit
        for (int i = 0; i < COLOR_LIST.length; i++) {
            if (COLOR_LIST[i].equals(colors[0])) {
                firstDigit = i;
            }
        }

        // Get second digit
        for (int i = 0; i < COLOR_LIST.length; i++) {
            if (COLOR_LIST[i].equals(colors[1])) {
                secondDigit = i;
            }
        }

        for (int i = 0; i < COLOR_LIST.length; i++) {
            if (COLOR_LIST[i].equals(colors[2])) {
                numberOfZero = i;
            }
        }

        // Check if user input match the given COLOR_LIST array
        if (firstDigit == -1 && secondDigit == -1) {
            throw new IllegalArgumentException("First color: " + colors[0] + " and second color: " + colors[1] + " not found in " + Arrays.toString(COLOR_LIST));
        } else if (firstDigit == -1) {
            throw new IllegalArgumentException("First color: " + colors[0] + " not found in " + Arrays.toString(COLOR_LIST));
        } else if (secondDigit == -1) {
            throw new IllegalArgumentException("Second color: " + colors[1] + " not found in " + Arrays.toString(COLOR_LIST));
        } else if (numberOfZero == -1) {
            throw new IllegalArgumentException("Third color: " + colors[2] + " not found in " + Arrays.toString(COLOR_LIST));
        }

        long result = (firstDigit * 10L + secondDigit) * (long) Math.pow(10, numberOfZero);
        if (result >= 1000000000) {
            return result / 1000000000 + " gigaohms";
        } else if (result >= 1000000) {
            return result / 1000000 + " megaohms";
        } else if (result >= 1000) {
            return result / 1000 + " kiloohms";
        } else {
            return result + " ohms";
        } 
    }

    public static void main(String[] args) {
        ResistorColorTrio resistorColorTrio = new ResistorColorTrio();
        // Test1: no zeros
        String[] colorInTest1 = {"orange", "orange", "black"};
        System.out.println(resistorColorTrio.label(colorInTest1));
        // Test2: 1 - 2 zeros
        String[] colorInTest2 = {"orange", "orange", "red"};
        System.out.println(resistorColorTrio.label(colorInTest2));
        // Test3: 3 - 5 zeros
        String[] colorInTest3 = {"orange", "orange", "orange"};
        System.out.println(resistorColorTrio.label(colorInTest3));
        // Test4: 6 - 8 zeros
        String[] colorInTest4 = {"orange", "orange", "violet"};
        System.out.println(resistorColorTrio.label(colorInTest4));
        // Test5: 9 zeros
        String[] colorInTest5 = {"orange", "orange", "white"};
        System.out.println(resistorColorTrio.label(colorInTest5));
        /*
        // Test6: user input less than 3 colors
        String[] colorInTest6 = {"orange", "orange"};
        System.out.println(resistorColorTrio.label(colorInTest6));
        */
        // Test7: third color not found
        String[] colorInTest7 = {"orange", "orange", "ddd"};
        System.out.println(resistorColorTrio.label(colorInTest7));
    }
}
