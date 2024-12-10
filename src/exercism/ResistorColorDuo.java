import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        if (colors.length < 2) {
            throw new IllegalArgumentException("At least two colors");
        }

        int firstDigit = -1;
        int secondDigit = -1;

        String[] COLOR_LIST = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < COLOR_LIST.length; i++) {
            if (COLOR_LIST[i].equals(colors[0])) {
                firstDigit = i;
            }
        }
        for (int i = 0; i < COLOR_LIST.length; i++) {
            if (COLOR_LIST[i].equals(colors[1])) {
                secondDigit = i;
            }
        }
        
        if (firstDigit == -1 && secondDigit == -1) {
            throw new IllegalArgumentException("First color: " + colors[0] + " and second color: " + colors[1] + " not found in " + Arrays.toString(COLOR_LIST));
        } else if (firstDigit == -1) {
            throw new IllegalArgumentException("First color: " + colors[0] + " not found in " + Arrays.toString(COLOR_LIST));
        } else if (secondDigit == -1) {
            throw new IllegalArgumentException("Second color: " + colors[1] + " not found in " + Arrays.toString(COLOR_LIST));
        }

        return firstDigit * 10 + secondDigit; 
    }

    public static void main(String[] args) {
        ResistorColorDuo resistorColor = new ResistorColorDuo();
        String[] colorInTest1 = {"brown", "green", "violet"};
        System.out.println(resistorColor.value(colorInTest1));
        String[] colorInTest2 = {"brown", "geen", "violet"};
        System.out.println(resistorColor.value(colorInTest2));
    }
}
