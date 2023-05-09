public class Overload {
    private int a = 10;
    private String text = "n.a";

    Overload(int a){
        System.out.println("Overload1!");
    }
    Overload(String a, int B){
        System.out.println("Overload2!");
    }

    public static void main(String[] args) {
        Overload o1 = new Overload(1);
        Overload o2 = new Overload("we",6);
    }
}
