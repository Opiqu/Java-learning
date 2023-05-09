
    class Clothe {
        String color;
        char size;
        Clothe(String color, char size) {
            this.color = color;
            this.size = size;
        }
    }

    public class ShallowCopy {
        public static void main(String[] args) {
            Clothe[] c1 = {new Clothe("red", 'L'), new Clothe("blue", 'M')};
            var c2 = new Clothe[c1.length];

            for(var i = 0; i < c1.length; i++) {
                c2[i] = c1[i];
            }

            c1[0].color = "yellow";
            System.out.println(c2[0].color);//System.arraycopy() or Arrays.copyof()遇到class時皆為淺層複製。
        }
    }

