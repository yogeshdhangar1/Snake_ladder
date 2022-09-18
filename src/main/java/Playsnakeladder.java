import java.util.Random;
public class Playsnakeladder {
    public static final int noplay = 1;
    public static final int snake = 2;
    public static final int ladder = 3;

    public static void main(String[] args) {
        int start = 0;
        while (start <= 100) {
            if (start == 100) {
                System.out.println("You Won");
                break;
            }
            int dice = (int) Math.floor(Math.random() * 10 % 6 + 1);
            int option = (int) Math.floor(Math.random() * 10 % 3 + 1);

            // case statement
            switch (option) {
                case 1:
                     if(start+dice<=100){
                    start = start+dice;
                }
                      break;
                case 2:
                    if(start-dice>=0){
                        start = start-dice;
                    }
                    break;
                case 3:
                    start= start+0;
            }
            System.out.println("Position of The player :"+start);
        }
    }
}

