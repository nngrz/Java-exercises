public class SwitchExpr {
    public static void main(String[] args) {
        int i = 7;
        var res = switch (i) {
            case 1, 2, 3 -> "First quarter";
            case 4, 5, 6 -> "Second quarter";
            case 7, 8, 9 -> {
                System.out.println("And here a block...");
                System.out.println("still we need a value");
                yield "Third quarter";
            }
            case 10, 11, 12 -> "Forth quarter";
            default -> "Something wriong";
        };
        System.out.println("res = " + res);
    }
}