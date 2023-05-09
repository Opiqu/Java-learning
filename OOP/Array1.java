import java.util.Arrays;
public class Array1 {
        public static void main(String[] args) {
        var scores = new int[10];
        var scores2 = scores;
            A1:
                {
                    for (var score : scores) {
                        System.out.printf("%2d", score);
                    }
                }
            System.out.println();
            A2:
            {
                Arrays.fill(scores, 60);//預設為60
                for (var score : scores) {
                    System.out.printf("%3d", score);
                }
            }
            System.out.println();
            A3:
            {
                scores[0] = 0;
                for (int sc : scores2) {
                    System.out.printf("%3d", sc);//標籤到同物件
                }
            }
        }
    }
