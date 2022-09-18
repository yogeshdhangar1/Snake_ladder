import java.util.Random;
public class Playsnakeladder {
    public static final int noplay = 1;
    public static final int snake = 2;
    public static final int ladder = 3;

    public static void main(String[] args) {
        int start = 0;
        while (start <= 100) {
            int dice = (int) Math.floor(Math.random() * 10 % 6 + 1);
            int option = (int) Math.floor(Math.random() * 10 % 3 + 1);

            if (start == 100) {
                System.out.println("You Won");
                break;
            }
            System.out.println("Option:"+option+"Dice:"+dice);
            // case statement
            switch (option) {
                case ladder:
                    if(start+dice<=100){
                       break;
                    }
                    start = start+dice;
                    break;
                case  snake:
                    if(start-dice<0){
                      break;
                    }
                    start = start-dice;
                    break;
                case noplay:
                    start = start+0;
                    break;
            }
            System.out.println("Position of the player:"+start);
        }
    }
}

