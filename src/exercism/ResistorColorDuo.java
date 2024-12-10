class ResistorColorDuo {
    int value(String[] colors) {
        if (colors.length < 2) {
            throw new IllegalArgumentException("At least two colors");
        }

        int firstDigit = -1;
        int secondDigit = -1;

        String[] colorList = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        for (int i = 0; i < colorList.length; i++) {
            if (colorList[i].equals(colors[0])) {
                firstDigit = i;
            }
        }
        for (int i = 0; i < colorList.length; i++) {
            if (colorList[i].equals(colors[1])) {
                secondDigit = i;
            }
        }

        if (firstDigit != -1 && secondDigit != -1) {
            return firstDigit*10 + secondDigit; 
        }
        throw new IllegalArgumentException("Enter a valid color.");
    }

    public static void main(String[] args) {
        ResistorColorDuo resistorColor = new ResistorColorDuo();
        String[] colorIn = {"brown", "green", "violet"};
        System.out.println(resistorColor.value(colorIn));
    }
}

