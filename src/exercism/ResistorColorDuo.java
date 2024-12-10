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
        
        if (firstDigit == -1) {
            throw new IllegalArgumentException("first color: colors[0] not found in colorList");
        } else if (secondDigit == -1){
            throw new IllegalArgumentException("second color: colors[1] not found in colorList");
        }

        return firstDigit * 10 + secondDigit; 
    }

    public static void main(String[] args) {
        ResistorColorDuo resistorColor = new ResistorColorDuo();
        String[] colorIn = {"brown", "green", "violet"};
        System.out.println(resistorColor.value(colorIn));
    }
}
