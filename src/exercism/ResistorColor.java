class ResistorColor {    
    String[] colorNames = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for (int i = 0; i < colorNames.length; i++) {
            if (colorNames[i].equals(color)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Enter a valid color.");
    }

    String[] colors() {
        return colorNames;
    }

    public static void main (String[] args) {
        ResistorColor rColor = new ResistorColor();
        System.out.println(rColor.colorCode("red"));
        for (String color : rColor.colors()){
            System.out.println(color);
        }
    }
}
