class ResistorColor {    
    String[] colorNames = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        int code = -1;  
        for (int i = 0; i < colorNames.length; i++) {
            if (colorNames[i].equals(color)) {
                code = i;
            }
        }
        return code;
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
