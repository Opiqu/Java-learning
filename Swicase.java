public class Swicase {
    public static void main(String[] args) {
        var score = 52;
        var quo = score / 10;
        final String war = "爛";
        var level = switch (quo){
            case 10,9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> {
                String message = "E " + war;
                yield message;//做不只一件事，需用yield
            }
        };
        System.out.println("Level:"+level );
    }
}
