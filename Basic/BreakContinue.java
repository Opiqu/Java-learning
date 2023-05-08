public class BreakContinue {
    public static void main(String[] args) {
        for(var i = 1;i < 5 ; i++){
            System.out.print(i);
        }
        System.out.println();

        //Break
        System.out.println("Break:");
        for(var i = 1;i < 5 ; i++){
            if (i == 3){
                break;
            }
            System.out.print(i);
        }
        System.out.println();

        //Continue
        System.out.println("Continue:");
        for(var i = 1;i < 5 ; i++){
            if (i == 3){
                continue;//跳過3
            }
            System.out.print(i);
        }
        System.out.println();


        Hello:{
            for(var i = 1;i < 5 ; i++){
                if (i == 3){
                    break Hello;//跳過3
                }
                System.out.print(i);
            }
        }
        System.out.println("Test over\n");

        Hello2://只能放在for迴圈
        for(var i = 1;i < 5 ; i++){
            if (i == 3){
                continue Hello2;//跳過3
            }
            System.out.print(i);
        }
    }

    }
