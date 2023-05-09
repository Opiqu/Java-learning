import java.util.Arrays;
public class ArrayCopy {
    public static void main(String[] args) {
        int[] scores1 = {88, 81, 74, 68, 78, 76, 77, 85, 95, 93};
        int[] scores2 = Arrays.copyOf(scores1, scores1.length*2);//增加長度 預設值為0

        for(var score : scores2) {
            System.out.printf("%3d", score);
        }
        System.out.println();

        scores2[0] = 99;
        //不影響scores1
        for(var score : scores1) {
            System.out.printf("%3d", score);
        }
    }
}
