class Clothes2{
    String color;
    char size;
    Clothes2(String color, char sizze){//this的用法
        this.color = color;
        size = sizze;
    }
}
public class OO2 {
    public static void main(String[] args) {
        var c1 = new Clothes2("Yellow",'M');
        var c2 = new Clothes2("Green",'L');
        System.out.printf("c1(%s, %c)%n",c1.color,c1.size);
        System.out.printf("c2(%s, %c)",c2.color,c2.size);
    }
}
